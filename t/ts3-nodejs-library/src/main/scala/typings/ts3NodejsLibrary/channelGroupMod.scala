package typings.ts3NodejsLibrary

import typings.node.Buffer
import typings.ts3NodejsLibrary.abstractMod.Abstract
import typings.ts3NodejsLibrary.queryResponseMod.QueryResponseTypes
import typings.ts3NodejsLibrary.responseTypesMod.ChannelGroupClientList
import typings.ts3NodejsLibrary.responseTypesMod.ChannelGroupCopy
import typings.ts3NodejsLibrary.responseTypesMod.ChannelGroupList
import typings.ts3NodejsLibrary.responseTypesMod.PermList
import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/node/ChannelGroup", JSImport.Namespace)
@js.native
object channelGroupMod extends js.Object {
  @js.native
  class TeamSpeakChannelGroup protected () extends Abstract {
    def this(parent: TeamSpeak, list: ChannelGroupList) = this()
    /**
      * Adds a specified permissions to the channel group.
      * A permission can be specified by permid or permsid.
      * @param perm the permid or permsid
      * @param value value of the Permission
      * @param skip whether the skip flag should be set
      * @param negate whether the negate flag should be set
      */
    def addPerm(perm: String, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: String, value: Double, skip: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: String, value: Double, skip: Double, negate: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: Double, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: Double, value: Double, skip: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: Double, value: Double, skip: Double, negate: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def cgid: Double = js.native
    /**
      * returns the ids of all clients currently residing in the channelgroup
      * @param cid the channel id
      */
    def clientList(cid: Double): js.Promise[js.Array[ChannelGroupClientList]] = js.native
    /**
      * Creates a copy of the channel group. If tcgid is set to 0, the server will create a new group.
      * To overwrite an existing group, simply set tcgid to the ID of a designated target group.
      * If a target group is set, the name parameter will be ignored.
      * @param tcgid the target group, 0 to create a new group
      * @param type the type of the group (0 = Template Group | 1 = Normal Group)
      * @param name name of the group
      */
    def copy(tcgid: Double, `type`: Double, name: String): js.Promise[ChannelGroupCopy] = js.native
    /**
      * Deletes the channel group. If force is set to 1, the channel group will be deleted even if there are clients within.
      * @param force if set to 1 the channelgroup will be deleted even when clients are in it
      */
    def del(): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def del(force: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * Removes a set of specified permissions from the channel group.
      * A permission can be specified by permid or permsid.
      * @param perm the permid or permsid
      */
    def delPerm(perm: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def delPerm(perm: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /** returns a buffer with the icon of the channelgroup */
    def getIcon(): js.Promise[Buffer] = js.native
    /** gets the icon name of the channelgroup */
    def getIconName(): js.Promise[String] = js.native
    def iconid: Double = js.native
    def nMemberAddp: Double = js.native
    def nMemberRemovep: Double = js.native
    def nModifyp: Double = js.native
    def name: String = js.native
    def namemode: Double = js.native
    /**
      * returns a list of permissions assigned to the channel group specified with cgid.
      * @param permsid if the permsid option is set to true the output will contain the permission names
      */
    def permList(): js.Promise[js.Array[PermList]] = js.native
    def permList(permsid: Boolean): js.Promise[js.Array[PermList]] = js.native
    /**
      * changes the name of the channelgroup
      * @param name new name of the group
      */
    def rename(name: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def savedb: Double = js.native
    /**
      * sets the channel group of a client
      * @param cid the channel in which the client should be assigned the Group
      * @param cldbid the client database id which should be added to the Group
      */
    def setClient(cid: Double, cldbid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def sortid: Double = js.native
    def `type`: Double = js.native
  }
  
}

