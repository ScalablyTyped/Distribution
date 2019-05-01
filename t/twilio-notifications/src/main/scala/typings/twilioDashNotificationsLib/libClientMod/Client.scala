package typings
package twilioDashNotificationsLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @alias Notifications
  * @classdesc The helper library for the notification service.
  * Provides high level api for creating and managing notification subscriptions and receiving messages
  * Creates the instance of Notification helper library
  *
  * @constructor
  * @param {string} token - Twilio access token
  * @param {Notifications#ClientOptions} options - Options to customize client behavior
  */
@JSImport("twilio-notifications/lib/client", "Client")
@js.native
class Client protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(token: java.lang.String) = this()
  def this(token: java.lang.String, options: js.Any) = this()
  var _onNeedReliableTransport: js.Any = js.native
  var _onRegistrationStateChange: js.Any = js.native
  var _onTransportStateChange: js.Any = js.native
  /**
    * Routes messages to the external subscribers
    * @private
    */
  var _routeMessage: js.Any = js.native
  var _updateTransportState: js.Any = js.native
  val connectionState: ConnectionState = js.native
  val registrar: js.Any = js.native
  val reliableTransportState: js.Any = js.native
  var services: js.Any = js.native
  /**
    * Handle incoming push notification.
    * Client application should call this method when it receives push notifications and pass the received data
    * @param {Object} message push message
    * @return {PushNotification}
    */
  def handlePushNotification(message: js.Any): PushNotification = js.native
  /**
    * Set APN/GCM/FCM token to enable application register for a push messages
    * @param {string} gcmToken/fcmToken Token received from GCM/FCM system
    */
  def setPushRegistrationId(
    registrationId: java.lang.String,
    channelType: twilioDashNotificationsLib.libConnectorMod.ChannelType
  ): scala.Unit = js.native
  /**
    * Adds the subscription for the given message type
    * @param {string} messageType The type of message that you want to receive
    * @param {string} channelType. Supported are 'twilsock', 'gcm' and 'fcm'
    */
  def subscribe(messageType: java.lang.String): js.Promise[scala.Unit] = js.native
  def subscribe(messageType: java.lang.String, channelType: twilioDashNotificationsLib.libConnectorMod.ChannelType): js.Promise[scala.Unit] = js.native
  /**
    * Remove the subscription for the particular message type
    * @param {string} messageType The type of message that you don't want to receive anymore
    * @param {string} channelType. Supported are 'twilsock', 'gcm' and 'fcm'
    */
  def unsubscribe(messageType: java.lang.String): js.Promise[scala.Unit] = js.native
  def unsubscribe(messageType: java.lang.String, channelType: twilioDashNotificationsLib.libConnectorMod.ChannelType): js.Promise[scala.Unit] = js.native
  /**
    * Updates auth token for registration
    * @param {string} token Authentication token for registrations
    */
  def updateToken(token: java.lang.String): js.Promise[scala.Unit] = js.native
}

