package typings
package twilioDashNotificationsLib.libRegistrarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides an interface to the ERS registrar
  */
@JSImport("twilio-notifications/lib/registrar", "Registrar")
@js.native
class Registrar protected ()
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Creates the new instance of registrar client
    */
  def this(productId: java.lang.String, transport: js.Any, twilsock: js.Any, config: js.Any) = this()
  val config: js.Any = js.native
  val connectors: js.Any = js.native
  /**
    * Returns platform string limited to max 128 chars
    */
  var detectPlatform: js.Any = js.native
  /**
    * @param {String} type Channel type
    * @throws {Error} Error with description
    */
  def connector(`type`: twilioDashNotificationsLib.libConnectorMod.ChannelType): twilioDashNotificationsLib.libConnectorMod.Connector = js.native
  /**
    *  Sets notification ID.
    *  If new URI is different from previous, it triggers updating of registration for given channel
    *
    *  @param {string} channelType channel type (apn|gcm|fcm|twilsock)
    *  @param {string} notificationId The notification ID
    */
  def setNotificationId(
    channelType: twilioDashNotificationsLib.libConnectorMod.ChannelType,
    notificationId: java.lang.String
  ): scala.Unit = js.native
  /**
    * Subscribe for given type of message
    *
    * @param {String} messageType Message type identifier
    * @param {String} channelType Channel type, can be 'twilsock', 'gcm' or 'fcm'
    * @public
    */
  def subscribe(messageType: java.lang.String, channelType: twilioDashNotificationsLib.libConnectorMod.ChannelType): js.Promise[scala.Unit] = js.native
  /**
    * Remove subscription
    * @param {String} messageType Message type
    * @param {String} channelType Channel type (twilsock or gcm/fcm)
    */
  def unsubscribe(messageType: java.lang.String, channelType: twilioDashNotificationsLib.libConnectorMod.ChannelType): js.Promise[scala.Unit] = js.native
  def updateToken(token: java.lang.String): scala.Unit = js.native
}

