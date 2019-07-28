package typings.ts3DashNodejsDashLibrary.propertyChannelGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamSpeakChannelGroup
  extends typings.ts3DashNodejsDashLibrary.propertyAbstractMod.^ {
  var cgid: Double = js.native
  var iconid: String = js.native
  var nMemberAddp: String = js.native
  var nMemberRemovep: String = js.native
  var nModifyp: String = js.native
  var name: String = js.native
  var namemode: String = js.native
  var savedb: String = js.native
  var sortid: String = js.native
  var `type`: String = js.native
  /**
    * Adds a specified permissions to the channel group. A permission can be specified by permid or permsid.
    * @param - The permid or permsid
    * @param - Value of the Permission
    * @param - Whether the skip flag should be set. Defaults to 0.
    * @param - Whether the negate flag should be set. DEfaults to 0.
    */
  def addPerm(perm: String, value: Double): js.Promise[_] = js.native
  def addPerm(perm: String, value: Double, skip: Double): js.Promise[_] = js.native
  def addPerm(perm: String, value: Double, skip: Double, negate: Double): js.Promise[_] = js.native
  def addPerm(perm: Double, value: Double): js.Promise[_] = js.native
  def addPerm(perm: Double, value: Double, skip: Double): js.Promise[_] = js.native
  def addPerm(perm: Double, value: Double, skip: Double, negate: Double): js.Promise[_] = js.native
  /**
    * Displays the IDs of all clients currently residing in the channel group.
    * @param - The Channel ID
    */
  def clientList(): js.Promise[_] = js.native
  def clientList(cid: Double): js.Promise[_] = js.native
  /**
    * Creates a copy of the channel group. If tcgid is set to 0, the server will create a new group.
    * To overwrite an existing group, simply set tcgid to the ID of a designated target group.
    * If a target group is set, the name parameter will be ignored.
    * @param - The Target Group, 0 to create a new Group. Defaults to 0.
    * @param - The Type of the Group (0 = Template Group | 1 = Normal Group)
    * @param - Name of the Group. Defaults to false.
    */
  def copy(): js.Promise[_] = js.native
  def copy(tcgid: Double): js.Promise[_] = js.native
  def copy(tcgid: Double, `type`: Double): js.Promise[_] = js.native
  def copy(tcgid: Double, `type`: Double, name: String): js.Promise[_] = js.native
  def copy(tcgid: Double, `type`: Double, name: Boolean): js.Promise[_] = js.native
  /**
    * Deletes the channel group. If force is set to 1, the channel group will be deleted even if there are clients within.
    * @param - If set to 1 the Channel Group will be deleted even when Clients are in it. Defaults to 0.
    */
  def del(): js.Promise[_] = js.native
  def del(force: Double): js.Promise[_] = js.native
  /**
    * Removes a set of specified permissions from the channel group. A permission can be specified by permid or permsid.
    * @param - The permid or permsid
    */
  def delPerm(perm: String): js.Promise[_] = js.native
  def delPerm(perm: Double): js.Promise[_] = js.native
  /**
    * Returns a Buffer with the Icon of the Channel Group
    * @returns a Promise with the binary data of the ChannelGroup Icon
    */
  def getIcon(): js.Promise[_] = js.native
  /**
    * Gets the Icon Name of the Channel Group
    */
  def getIconName(): js.Promise[_] = js.native
  /**
    * Displays a list of permissions assigned to the channel group specified with cgid.
    * @param - If the permsid option is set to true the output will contain the permission names. Defaults to false.
    */
  def permList(): js.Promise[js.Array[_]] = js.native
  def permList(permsid: Boolean): js.Promise[js.Array[_]] = js.native
  /**
    * Changes the name of the channel group
    * @param - Name of the Group
    */
  def rename(name: String): js.Promise[_] = js.native
  /**
    * Sets the channel group of a client
    * @param - The Channel in which the Client should be assigned the Group
    * @param - The Client Database ID which should be added to the Group
    */
  def setClient(cid: Double, cldbid: Double): js.Promise[_] = js.native
}

