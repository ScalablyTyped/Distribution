package typings.ts3DashNodejsDashLibrary.propertyChannelMod

import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryNumbers.`0`
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamSpeakChannel
  extends typings.ts3DashNodejsDashLibrary.propertyAbstractMod.^ {
  var cid: Double = js.native
  var codec: Double = js.native
  var codecQuality: Double = js.native
  var flagDefault: `0` | `1` = js.native
  var flagPassword: `0` | `1` = js.native
  var flagPermanent: `0` | `1` = js.native
  var flagSemiPermanent: `0` | `1` = js.native
  var iconId: Double = js.native
  var maxclients: Double = js.native
  var maxfamilyclients: Double = js.native
  var name: String = js.native
  var neededSubscribePower: Double = js.native
  var neededTalkPower: Double = js.native
  var order: Double = js.native
  var pid: Double = js.native
  var secondsEmpty: Double = js.native
  var topic: js.UndefOr[Double] = js.native
  var totalClients: Double = js.native
  var totalClientsFamily: Double = js.native
  /**
    * Deletes an existing channel by ID. If force is set to 1, the channel will be deleted even if there are clients within.
    * The clients will be kicked to the default channel with an appropriate reason message.
    * @param - If set to 1 the Channel will be deleted even when Clients are in it
    */
  def del(force: Double): js.Promise[_] = js.native
  /**
    * Removes a set of specified permissions from a channel. Multiple permissions can be removed at once. A permission can be specified by permid or permsid.
    * @param - The permid or permsid
    */
  def delPerm(perm: String): js.Promise[_] = js.native
  def delPerm(perm: Double): js.Promise[_] = js.native
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
  def getID(): Double = js.native
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
  def move(cpid: Double): js.Promise[_] = js.native
  def move(cpid: Double, order: Double): js.Promise[_] = js.native
  /**
    * Displays a list of permissions defined for a channel.
    * @param - Whether the Perm SID should be displayed aswell. Defaults to false.
    */
  def permList(): js.Promise[js.Array[_]] = js.native
  def permList(permsid: Boolean): js.Promise[js.Array[_]] = js.native
  /**
    * Adds a set of specified permissions to a channel. Multiple permissions can be added by providing the two parameters of each permission.
    * A permission can be specified by permid or permsid.
    * @param - The permid or permsid
    * @param - The Value which should be set
    */
  def setPerm(perm: String, value: Double): js.Promise[_] = js.native
  def setPerm(perm: Double, value: Double): js.Promise[_] = js.native
}

