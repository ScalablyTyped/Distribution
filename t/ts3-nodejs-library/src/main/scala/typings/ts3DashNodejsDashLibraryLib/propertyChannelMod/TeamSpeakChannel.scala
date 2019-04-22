package typings
package ts3DashNodejsDashLibraryLib.propertyChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamSpeakChannel
  extends ts3DashNodejsDashLibraryLib.propertyAbstractMod.^ {
  /** Returns the Name of the channel */
  var name: java.lang.String = js.native
  /**
    * Deletes an existing channel by ID. If force is set to 1, the channel will be deleted even if there are clients within.
    * The clients will be kicked to the default channel with an appropriate reason message.
    * @param - If set to 1 the Channel will be deleted even when Clients are in it
    */
  def del(force: scala.Double): js.Promise[_] = js.native
  /**
    * Removes a set of specified permissions from a channel. Multiple permissions can be removed at once. A permission can be specified by permid or permsid.
    * @param - The permid or permsid
    */
  def delPerm(perm: java.lang.String): js.Promise[_] = js.native
  def delPerm(perm: scala.Double): js.Promise[_] = js.native
  /**
    * Changes a channels configuration using given properties.
    * Note that this command accepts multiple properties which means that you're able to change all settings of the channel specified with cid at once.
    * @param - The Properties of the Channel which should get changed
    */
  def edit(properties: js.Any): js.Promise[_] = js.native
  /**
    * Gets a List of Clients in the current Channel
    * @param - The Filter Object
    */
  def getClients(filter: js.Any): js.Promise[_] = js.native
  /**
    * Returns the ID of the Channel
    * @returns the Channels ID
    */
  def getID(): scala.Double = js.native
  /**
    * Returns a Buffer with the Icon of the Channel
    * @returns a Promise with the binary data of the Channel Icon
    */
  def getIcon(): js.Promise[_] = js.native
  /**
    * Gets the Icon Name of the Channel
    */
  def getIconName(): js.Promise[_] = js.native
  /**
    * Displays detailed configuration information about a channel including ID, topic, description, etc.
    */
  def getInfo(): js.Promise[_] = js.native
  /**
    * Moves a channel to a new parent channel with the ID cpid.
    * If order is specified, the channel will be sorted right under the channel with the specified ID.
    * If order is set to 0, the channel will be sorted right below the new parent.
    * @param - Channel Parent ID
    * @param - Channel Sort Order. Defaults to 0.
    */
  def move(cpid: scala.Double): js.Promise[_] = js.native
  def move(cpid: scala.Double, order: scala.Double): js.Promise[_] = js.native
  /**
    * Displays a list of permissions defined for a channel.
    * @param - Whether the Perm SID should be displayed aswell. Defaults to false.
    */
  def permList(): js.Promise[js.Array[_]] = js.native
  def permList(permsid: scala.Boolean): js.Promise[js.Array[_]] = js.native
  /**
    * Adds a set of specified permissions to a channel. Multiple permissions can be added by providing the two parameters of each permission.
    * A permission can be specified by permid or permsid.
    * @param - The permid or permsid
    * @param - The Value which should be set
    */
  def setPerm(perm: java.lang.String, value: scala.Double): js.Promise[_] = js.native
  def setPerm(perm: scala.Double, value: scala.Double): js.Promise[_] = js.native
}

