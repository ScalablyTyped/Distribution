package typings.twilioNotifications

import typings.loglevel.mod.LogLevelDesc
import typings.node.eventsMod.EventEmitter
import typings.twilsock.mod.TwilsockClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
    *
    * @event stateChanged channelType (registered|unregistered) -- coming from connector, i.e. it's per-connector type!
    * @event transportState Forwarded from Twilsock's stateChanged event.
    * @event message Routed from twilsock as a notification event.
    */
  @JSImport("@twilio/notifications", "Notifications")
  @js.native
  open class Notifications protected () extends Client {
    def this(token: String) = this()
    def this(token: String, options: ClientOptions) = this()
  }
  object Notifications {
    
    @JSImport("@twilio/notifications", "Notifications")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns platform string limited to max 128 chars
      */
    /* static member */
    @JSImport("@twilio/notifications", "Notifications._detectPlatform")
    @js.native
    def detectPlatform: Any = js.native
    
    inline def detectPlatform_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_detectPlatform")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilioNotifications.twilioNotificationsStrings.twilsock
    - typings.twilioNotifications.twilioNotificationsStrings.apn
    - typings.twilioNotifications.twilioNotificationsStrings.fcm
  */
  trait ChannelType extends StObject
  object ChannelType {
    
    inline def apn: typings.twilioNotifications.twilioNotificationsStrings.apn = "apn".asInstanceOf[typings.twilioNotifications.twilioNotificationsStrings.apn]
    
    inline def fcm: typings.twilioNotifications.twilioNotificationsStrings.fcm = "fcm".asInstanceOf[typings.twilioNotifications.twilioNotificationsStrings.fcm]
    
    inline def twilsock: typings.twilioNotifications.twilioNotificationsStrings.twilsock = "twilsock".asInstanceOf[typings.twilioNotifications.twilioNotificationsStrings.twilsock]
  }
  
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
    *
    * @event stateChanged channelType (registered|unregistered) -- coming from connector, i.e. it's per-connector type!
    * @event transportState Forwarded from Twilsock's stateChanged event.
    * @event message Routed from twilsock as a notification event.
    */
  @js.native
  trait Client extends EventEmitter {
    
    /**
      * @param {String} type Channel type
      * @throws {Error} Error with description
      */
    /* private */ var _connector: Any = js.native
    
    /**
      * Routes messages to the external subscribers
      */
    /* private */ var _routeMessage: Any = js.native
    
    /**
      * Commit all collected subscription changes as a batched update. This function tries to reduce
      * number of network calls necessary to update bindings status.
      */
    def commitChanges(): js.Promise[Unit] = js.native
    
    /* private */ val connectors: Any = js.native
    
    /**
      * Handle incoming push notification.
      * Client application should call this method when it receives push notifications and pass the received data.
      * @param {Object} message push message
      * @return {PushNotification} A reformatted payload with extracted message type.
      */
    def handlePushNotification(message: Any): PushNotification = js.native
    
    /**
      * Clear existing registrations directly using provided device token.
      * This is useful to ensure stopped subscriptions without resubscribing.
      *
      * This function goes completely beside the state machine and removes all registrations.
      * Use with caution: if it races with current state machine operations, madness will ensue.
      *
      * @param {ChannelType} channelType Channel type ('apn'/'fcm').
      * @param {string} registrationId Token received from FCM/APNS system on device.
      */
    def removeRegistrations(channelType: ChannelType, registrationId: String): js.Promise[Unit] = js.native
    
    /**
      * Set OS-provided APNS/FCM registration binding for the given channel type. Not used for 'twilsock'.
      *
      * You must call this function once you've received the ID of your device from the underlying OS.
      *
      * @param {ChannelType} channelType Channel type ('apn'/'fcm').
      * @param {string} pushRegistrationId Token received from FCM/APNS system on device.
      */
    def setPushRegistrationId(channelType: ChannelType, pushRegistrationId: String): Unit = js.native
    
    def shutdown(): js.Promise[Unit] = js.native
    
    /**
      * Subscribe to a given message type for a given channel type.
      *
      * Creates a subscriptions to receive incoming messages according to message type.
      * Subscription establishes a binding and you will receive a signal when a notification
      * of this type has been received by the library.
      *
      * Subscribed binding is preserved for 1 year, after which time it needs to be re-subscribed.
      * This is the responsibility of the client SDK.
      *
      * @param {ChannelType} channelType Supported are 'twilsock', 'apn' and 'fcm'
      * @param {string} messageType The type of message that you want to receive
      */
    def subscribe(channelType: ChannelType, messageType: String): Unit = js.native
    
    /* private */ val twilsock: Any = js.native
    
    /**
      * Unsubscribe from a given message type.
      *
      * Unsubscribing breaks a binding and you will not receive more notifications for this message type.
      * Please note that you have to call commitChanges() and receive a successful result before
      * the subscription is actually removed.
      *
      * @param {ChannelType} channelType Supported are 'twilsock', 'apn' and 'fcm'
      * @param {string} messageType The type of message that you don't want to receive anymore
      */
    def unsubscribe(channelType: ChannelType, messageType: String): Unit = js.native
    
    /**
      * Update subscription token. You must update the token when the old one expires.
      *
      * When you receive onTokenWillExpire event from twilsock, call this function with the new refreshed
      * token _after_ you have updated twilsock and other associated objects with the new token.
      *
      * @param {string} token Authentication token for registrations
      */
    def updateToken(token: String): Unit = js.native
  }
  
  trait ClientOptions extends StObject {
    
    var logLevel: js.UndefOr[LogLevelDesc] = js.undefined
    
    var minTokenRefreshInterval: js.UndefOr[Double] = js.undefined
    
    var notifications: js.UndefOr[NotificationOptions] = js.undefined
    
    var productId: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var twilsockClient: js.UndefOr[TwilsockClient] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setLogLevel(value: LogLevelDesc): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMinTokenRefreshInterval(value: Double): Self = StObject.set(x, "minTokenRefreshInterval", value.asInstanceOf[js.Any])
      
      inline def setMinTokenRefreshIntervalUndefined: Self = StObject.set(x, "minTokenRefreshInterval", js.undefined)
      
      inline def setNotifications(value: NotificationOptions): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setTwilsockClient(value: TwilsockClient): Self = StObject.set(x, "twilsockClient", value.asInstanceOf[js.Any])
      
      inline def setTwilsockClientUndefined: Self = StObject.set(x, "twilsockClient", js.undefined)
    }
  }
  
  trait NotificationOptions extends StObject {
    
    var ersUrl: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
  }
  object NotificationOptions {
    
    inline def apply(): NotificationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationOptions]
    }
    
    extension [Self <: NotificationOptions](x: Self) {
      
      inline def setErsUrl(value: String): Self = StObject.set(x, "ersUrl", value.asInstanceOf[js.Any])
      
      inline def setErsUrlUndefined: Self = StObject.set(x, "ersUrl", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  trait PushNotification extends StObject {
    
    var messageType: String
    
    var payload: Any
  }
  object PushNotification {
    
    inline def apply(messageType: String, payload: Any): PushNotification = {
      val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushNotification]
    }
    
    extension [Self <: PushNotification](x: Self) {
      
      inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
