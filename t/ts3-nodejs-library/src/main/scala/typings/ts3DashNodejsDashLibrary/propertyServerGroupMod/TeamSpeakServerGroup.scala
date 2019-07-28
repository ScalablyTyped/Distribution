package typings.ts3DashNodejsDashLibrary.propertyServerGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamSpeakServerGroup
  extends typings.ts3DashNodejsDashLibrary.propertyAbstractMod.^ {
  var iconid: String = js.native
  var nMemberAddp: String = js.native
  var nMemberRemovep: String = js.native
  var nModifyp: String = js.native
  var name: String = js.native
  var namemode: String = js.native
  var savedb: String = js.native
  var sgid: Double = js.native
  var sortid: String = js.native
  var `type`: String = js.native
  /**
    * Adds a client to the server group. Please note that a client cannot be added to default groups or template groups.
    * @param - The Client Database ID which should be added to the Group
    */
  def addClient(cldbid: Double): js.Promise[_] = js.native
  /**
    * Adds a specified permissions to the server group. A permission can be specified by permid or permsid.
    * @param - The permid or permsid
    * @param - Value of the Permission
    * @param - Whether the skip flag should be set Defaults to 0.
    * @param - Whether the negate flag should be set. Defaults to 0.
    */
  def addPerm(perm: String, value: Double): js.Promise[_] = js.native
  def addPerm(perm: String, value: Double, skip: Double): js.Promise[_] = js.native
  def addPerm(perm: String, value: Double, skip: Double, negate: Double): js.Promise[_] = js.native
  def addPerm(perm: Double, value: Double): js.Promise[_] = js.native
  def addPerm(perm: Double, value: Double, skip: Double): js.Promise[_] = js.native
  def addPerm(perm: Double, value: Double, skip: Double, negate: Double): js.Promise[_] = js.native
  /**
    * Displays the IDs of all clients currently residing in the server group.
    */
  def clientList(): js.Promise[_] = js.native
  /**
    * Creates a copy of the server group specified with ssgid. If tsgid is set to 0, the server will create a new group.
    * To overwrite an existing group, simply set tsgid to the ID of a designated target group. If a target group is set, the name parameter will be ignored.
    * @param - The Target Group, 0 to create a new Group. Defaults to 0.
    * @param - The Type of the Group (0 = Query Group | 1 = Normal Group)
    * @param - Name of the Group. Defaults to false.
    */
  def copy(): js.Promise[_] = js.native
  def copy(tsgid: Double): js.Promise[_] = js.native
  def copy(tsgid: Double, `type`: Double): js.Promise[_] = js.native
  def copy(tsgid: Double, `type`: Double, name: String): js.Promise[_] = js.native
  def copy(tsgid: Double, `type`: Double, name: Boolean): js.Promise[_] = js.native
  /**
    * Deletes the server group. If force is set to 1, the server group will be deleted even if there are clients within.
    * @param - If set to 1 the ServerGroup will be deleted even when Clients are in it
    */
  def del(force: Double): js.Promise[_] = js.native
  /**
    * Removes a client specified with cldbid from the server group.
    * @param - The Client Database ID which should be removed from the Group
    */
  def delClient(cldbid: Double): js.Promise[_] = js.native
  /**
    * Removes a set of specified permissions from the server group. A permission can be specified by permid or permsid.
    * @param - The permid or permsid
    */
  def delPerm(perm: String): js.Promise[_] = js.native
  def delPerm(perm: Double): js.Promise[_] = js.native
  /**
    * Returns a Buffer with the Icon of the Server Group
    * @returns promise with the binary data of the ServerGroup Icon
    */
  def getIcon(): js.Promise[_] = js.native
  /**
    * Gets the Icon Name of the Server Group
    */
  def getIconName(): js.Promise[_] = js.native
  /**
    * Returns the Server Group ID
    */
  def getSGID(): Double = js.native
  /**
    * Displays a list of permissions assigned to the server group specified with sgid.
    * @param - If the permsid option is set to true the output will contain the permission names. Defaults to false.
    */
  def permList(): js.Promise[_] = js.native
  def permList(permsid: Boolean): js.Promise[_] = js.native
  /**
    * Changes the name of the server group
    * @param - Name of the Group
    */
  def rename(name: String): js.Promise[_] = js.native
}

