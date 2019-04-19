package typings
package ts3DashNodejsDashLibraryLib.propertyChannelGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamSpeakChannelGroup
  extends ts3DashNodejsDashLibraryLib.propertyAbstractMod.^ {
  /**
    * Adds a specified permissions to the channel group. A permission can be specified by permid or permsid.
    * @param - The permid or permsid
    * @param - Value of the Permission
    * @param - Whether the skip flag should be set. Defaults to 0.
    * @param - Whether the negate flag should be set. DEfaults to 0.
    */
  def addPerm(perm: java.lang.String, value: scala.Double): js.Promise[_] = js.native
  def addPerm(perm: java.lang.String, value: scala.Double, skip: scala.Double): js.Promise[_] = js.native
  def addPerm(perm: java.lang.String, value: scala.Double, skip: scala.Double, negate: scala.Double): js.Promise[_] = js.native
  def addPerm(perm: scala.Double, value: scala.Double): js.Promise[_] = js.native
  def addPerm(perm: scala.Double, value: scala.Double, skip: scala.Double): js.Promise[_] = js.native
  def addPerm(perm: scala.Double, value: scala.Double, skip: scala.Double, negate: scala.Double): js.Promise[_] = js.native
  /**
    * Displays the IDs of all clients currently residing in the channel group.
    * @param - The Channel ID
    */
  def clientList(): js.Promise[_] = js.native
  def clientList(cid: scala.Double): js.Promise[_] = js.native
  /**
    * Creates a copy of the channel group. If tcgid is set to 0, the server will create a new group.
    * To overwrite an existing group, simply set tcgid to the ID of a designated target group.
    * If a target group is set, the name parameter will be ignored.
    * @param - The Target Group, 0 to create a new Group. Defaults to 0.
    * @param - The Type of the Group (0 = Template Group | 1 = Normal Group)
    * @param - Name of the Group. Defaults to false.
    */
  def copy(): js.Promise[_] = js.native
  def copy(tcgid: scala.Double): js.Promise[_] = js.native
  def copy(tcgid: scala.Double, `type`: scala.Double): js.Promise[_] = js.native
  def copy(tcgid: scala.Double, `type`: scala.Double, name: java.lang.String): js.Promise[_] = js.native
  def copy(tcgid: scala.Double, `type`: scala.Double, name: scala.Boolean): js.Promise[_] = js.native
  /**
    * Deletes the channel group. If force is set to 1, the channel group will be deleted even if there are clients within.
    * @param - If set to 1 the Channel Group will be deleted even when Clients are in it. Defaults to 0.
    */
  def del(): js.Promise[_] = js.native
  def del(force: scala.Double): js.Promise[_] = js.native
  /**
    * Removes a set of specified permissions from the channel group. A permission can be specified by permid or permsid.
    * @param - The permid or permsid
    */
  def delPerm(perm: java.lang.String): js.Promise[_] = js.native
  def delPerm(perm: scala.Double): js.Promise[_] = js.native
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
  def permList(permsid: scala.Boolean): js.Promise[js.Array[_]] = js.native
  /**
    * Changes the name of the channel group
    * @param - Name of the Group
    */
  def rename(name: java.lang.String): js.Promise[_] = js.native
  /**
    * Sets the channel group of a client
    * @param - The Channel in which the Client should be assigned the Group
    * @param - The Client Database ID which should be added to the Group
    */
  def setClient(cid: scala.Double, cldbid: scala.Double): js.Promise[_] = js.native
}

