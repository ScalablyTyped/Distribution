package typings.ts3NodejsLibrary

import typings.node.Buffer
import typings.ts3NodejsLibrary.abstractMod.Abstract
import typings.ts3NodejsLibrary.queryResponseMod.QueryResponseTypes
import typings.ts3NodejsLibrary.responseTypesMod.PermList
import typings.ts3NodejsLibrary.responseTypesMod.ServerGroupClientList
import typings.ts3NodejsLibrary.responseTypesMod.ServerGroupCopy
import typings.ts3NodejsLibrary.responseTypesMod.ServerGroupList
import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/node/ServerGroup", JSImport.Namespace)
@js.native
object serverGroupMod extends js.Object {
  @js.native
  class TeamSpeakServerGroup protected () extends Abstract {
    def this(parent: TeamSpeak, list: ServerGroupList) = this()
    /**
      * Adds a client to the server group. Please note that a client cannot be added to default groups or template groups.
      * @param cldbid the client database id which should be added to the Group
      */
    def addClient(cldbid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * Adds a specified permissions to the server group.
      * A permission can be specified by permid or permsid.
      * @param perm the permid or permsid
      * @param value value of the permission
      * @param skip whether the skip flag should be set
      * @param negate whether the negate flag should be set
      */
    def addPerm(perm: String, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: String, value: Double, skip: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: String, value: Double, skip: Double, negate: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: Double, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: Double, value: Double, skip: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: Double, value: Double, skip: Double, negate: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /** returns the ids of all clients currently residing in the server group */
    def clientList(): js.Promise[js.Array[ServerGroupClientList]] = js.native
    /**
      * Creates a copy of the server group specified with ssgid. If tsgid is set to 0, the server will create a new group.
      * To overwrite an existing group, simply set tsgid to the ID of a designated target group.
      * If a target group is set, the name parameter will be ignored.
      * @param tsgid the target group, 0 to create a new group
      * @param type type of the group (0 = Query Group | 1 = Normal Group)
      * @param name name of the group
      */
    def copy(tsgid: Double, `type`: Double, name: String): js.Promise[ServerGroupCopy] = js.native
    /**
      * Deletes the server group.
      * If force is set to 1, the server group will be deleted even if there are clients within.
      * @param force if set to 1 the servergroup will be deleted even when clients are in it
      */
    def del(): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def del(force: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * removes a client specified with cldbid from the servergroup
      * @param cldbid the client database id which should be removed from the group
      */
    def delClient(cldbid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * rmoves a set of specified permissions from the server group.
      * A permission can be specified by permid or permsid.
      * @param perm the permid or permsid
      */
    def delPerm(perm: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def delPerm(perm: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /** returns a buffer with the icon of the servergroup */
    def getIcon(): js.Promise[Buffer] = js.native
    /** gets the icon name of the servergroup */
    def getIconName(): js.Promise[String] = js.native
    def iconid(): Double = js.native
    def nMemberAddp(): Double = js.native
    def nMemberRemovep(): Double = js.native
    def nModifyp(): Double = js.native
    def name(): String = js.native
    def namemode(): Double = js.native
    /**
      * returns a list of permissions assigned to the server group specified with sgid
      * @param permsid if the permsid option is set to true the output will contain the permission names
      */
    def permList(permsid: Boolean): js.Promise[js.Array[PermList]] = js.native
    /**
      * changes the name of the server group
      * @param name new name of the group
      */
    def rename(name: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def savedb(): Double = js.native
    def sgid(): Double = js.native
    def sortid(): Double = js.native
    def `type`(): Double = js.native
  }
  
}

