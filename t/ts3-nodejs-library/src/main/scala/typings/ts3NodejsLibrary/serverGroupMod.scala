package typings.ts3NodejsLibrary

import typings.node.Buffer
import typings.ts3NodejsLibrary.abstractMod.Abstract
import typings.ts3NodejsLibrary.anon.Sgid
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient.ClientType
import typings.ts3NodejsLibrary.permissionMod.Permission
import typings.ts3NodejsLibrary.permissionMod.Permission.PermType
import typings.ts3NodejsLibrary.responseTypesMod.ServerGroupClientEntry
import typings.ts3NodejsLibrary.responseTypesMod.ServerGroupCopy
import typings.ts3NodejsLibrary.responseTypesMod.ServerGroupEntry
import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/node/ServerGroup", JSImport.Namespace)
@js.native
object serverGroupMod extends js.Object {
  @js.native
  class TeamSpeakServerGroup protected () extends Abstract[ServerGroupEntry] {
    def this(parent: TeamSpeak, list: ServerGroupEntry) = this()
    /**
      * Adds a client to the server group. Please note that a client cannot be added to default groups or template groups.
      * @param client the client database id which should be added to the Group
      */
    def addClient(client: ClientType): js.Promise[js.Array[js.Any]] = js.native
    /**
      * Adds a specified permissions to the server group.
      * A permission can be specified by permid or permsid.
      * @param perm the permission object to set
      */
    def addPerm(perm: PermType): js.Promise[js.Array[js.Any]] = js.native
    /** returns the ids of all clients currently residing in the server group */
    def clientList(): js.Promise[js.Array[ServerGroupClientEntry]] = js.native
    /**
      * Creates a copy of the server group specified with ssgid. If tsgid is set to 0, the server will create a new group.
      * To overwrite an existing group, simply set tsgid to the ID of a designated target group.
      * If a target group is set, the name parameter will be ignored.
      * @param tsgid the target group, 0 to create a new group
      * @param type type of the group (0 = Query Group | 1 = Normal Group)
      * @param name name of the group
      */
    def copy(targetGroup: String, `type`: Double, name: String): js.Promise[ServerGroupCopy] = js.native
    def copy(targetGroup: TeamSpeakServerGroup, `type`: Double, name: String): js.Promise[ServerGroupCopy] = js.native
    /**
      * Adds a specified permissions to the server group.
      * A permission can be specified by permid or permsid.
      */
    def createPerm(): Permission[_] = js.native
    /**
      * Deletes the server group.
      * If force is set to 1, the server group will be deleted even if there are clients within.
      * @param force if set to 1 the servergroup will be deleted even when clients are in it
      */
    def del(): js.Promise[js.Array[js.Any]] = js.native
    def del(force: Boolean): js.Promise[js.Array[js.Any]] = js.native
    /**
      * removes a client specified with cldbid from the servergroup
      * @param client the client database id which should be removed from the group
      */
    def delClient(client: ClientType): js.Promise[js.Array[js.Any]] = js.native
    /**
      * rmoves a set of specified permissions from the server group.
      * A permission can be specified by permid or permsid.
      * @param perm the permid or permsid
      */
    def delPerm(perm: String): js.Promise[js.Array[js.Any]] = js.native
    def delPerm(perm: Double): js.Promise[js.Array[js.Any]] = js.native
    /** returns a buffer with the icon of the servergroup */
    def getIcon(): js.Promise[Buffer] = js.native
    /** gets the icon id of the servergroup */
    def getIconId(): js.Promise[Double] = js.native
    def iconid: String = js.native
    def nMemberAddp: Double = js.native
    def nMemberRemovep: Double = js.native
    def nModifyp: Double = js.native
    def name: String = js.native
    def namemode: Double = js.native
    /**
      * returns a list of permissions assigned to the server group specified with sgid
      * @param permsid if the permsid option is set to true the output will contain the permission names
      */
    def permList(permsid: Boolean): js.Promise[js.Array[Permission[Sgid]]] = js.native
    /**
      * changes the name of the server group
      * @param name new name of the group
      */
    def rename(name: String): js.Promise[js.Array[js.Any]] = js.native
    def savedb: Double = js.native
    def sgid: String = js.native
    def sortid: Double = js.native
    def `type`: Double = js.native
  }
  
  /* static members */
  @js.native
  object TeamSpeakServerGroup extends js.Object {
    /** retrieves the client id from a string or teamspeak client */
    def getId[T /* <: GroupType */](): js.UndefOr[String] = js.native
    def getId[T /* <: GroupType */](group: T): js.UndefOr[String] = js.native
    /** retrieves the clients from an array */
    def getMultipleIds(groups: MultiGroupType): js.Array[String] = js.native
    type GroupType = String | TeamSpeakServerGroup
    type MultiGroupType = (js.Array[String | TeamSpeakServerGroup]) | GroupType
  }
  
}

