package typings.twilioChat

import typings.node.eventsMod.EventEmitter
import typings.twilioChat.channeldescriptorMod.ChannelDescriptor
import typings.twilioChat.channelsMod.Channel
import typings.twilioChat.mod.Client.ChannelSortingOptions
import typings.twilioChat.mod.Client.ConnectionState
import typings.twilioChat.mod.Client.CreateChannelOptions
import typings.twilioChat.mod.Client.NotificationsChannelType
import typings.twilioChat.mod.Client.Options
import typings.twilioChat.paginatorMod.Paginator
import typings.twilioChat.pushnotificationMod.PushNotification.Descriptor
import typings.twilioChat.transportMod.Transport
import typings.twilioChat.userMod.UserServices
import typings.twilioChat.userdescriptorMod.UserDescriptor
import typings.twilioNotifications.connectorMod.ChannelType
import typings.twilioNotifications.mod.Notifications
import typings.twilioSync.mod.SyncClient
import typings.twilsock.mod.Twilsock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A Client is a starting point to access Twilio Programmable Chat functionality.
    *
    * @property {Client#ConnectionState} connectionState - Client connection state
    * @property {Boolean} reachabilityEnabled - Client reachability state
    * @property {User} user - Information for logged in user
    * @property {String} version - Current version of Chat client
    *
    * @fires Client#connectionError
    * @fires Client#connectionStateChanged
    * @fires Client#channelAdded
    * @fires Client#channelInvited
    * @fires Client#channelJoined
    * @fires Client#channelLeft
    * @fires Client#channelRemoved
    * @fires Client#channelUpdated
    * @fires Client#memberJoined
    * @fires Client#memberLeft
    * @fires Client#memberUpdated
    * @fires Client#messageAdded
    * @fires Client#messageRemoved
    * @fires Client#messageUpdated
    * @fires Client#pushNotification
    * @fires Client#tokenAboutToExpire
    * @fires Client#tokenExpired
    * @fires Client#typingEnded
    * @fires Client#typingStarted
    * @fires Client#userSubscribed
    * @fires Client#userUnsubscribed
    * @fires Client#userUpdated
    */
  @JSImport("twilio-chat", JSImport.Default)
  @js.native
  /**
    * These options can be passed to Client constructor.
    * @typedef {Object} Client#ClientOptions
    * @property {String} [logLevel='error'] - The level of logging to enable. Valid options
    *   (from strictest to broadest): ['silent', 'error', 'warn', 'info', 'debug', 'trace']
    */
  /**
    * These options can be passed to {@link Client#createChannel}.
    * @typedef {Object} Client#CreateChannelOptions
    * @property {any} [attributes] - Any custom attributes to attach to the Channel
    * @property {String} [friendlyName] - The non-unique display name of the Channel
    * @property {Boolean} [isPrivate] - Whether or not this Channel should be visible to uninvited Clients
    * @property {String} [uniqueName] - The unique identity name of the Channel
    */
  /**
    * Connection state of Client.
    * @typedef {('connecting'|'connected'|'disconnecting'|'disconnected'|'denied')} Client#ConnectionState
    */
  /**
    * Notifications channel type.
    * @typedef {('gcm'|'fcm'|'apn')} Client#NotificationsChannelType
    */
  /**
    * These options can be passed to {@link Client#getLocalChannels}.
    * @typedef {Object} Client#ChannelSortingOptions
    * @property {('lastMessage'|'friendlyName'|'uniqueName')} criteria - Sorting criteria for Channels array
    * @property {('ascending'|'descending')} [order] - Sorting order. If not present, then default is <code>ascending</code>
    */
  class default protected () extends Client
  object default {
    
    @JSImport("twilio-chat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("twilio-chat", "default.compareChannelsByLastMessage")
    @js.native
    def compareChannelsByLastMessage: js.Any = js.native
    @scala.inline
    def compareChannelsByLastMessage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareChannelsByLastMessage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("twilio-chat", "default.compareChannelsByStringProperty")
    @js.native
    def compareChannelsByStringProperty: js.Any = js.native
    @scala.inline
    def compareChannelsByStringProperty_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareChannelsByStringProperty")(x.asInstanceOf[js.Any])
    
    /**
      * Factory method to create Chat client instance.
      *
      * @param {String} token - Access token
      * @param {Client#ClientOptions} options - Options to customize the Client
      * @returns {Promise<Client>}
      */
    /* static member */
    @JSImport("twilio-chat", "default.create")
    @js.native
    def create(token: String): js.Promise[Client] = js.native
    @JSImport("twilio-chat", "default.create")
    @js.native
    def create(token: String, options: Options): js.Promise[Client] = js.native
    
    /**
      * Static method for push notification payload parsing. Returns parsed push as {@link PushNotification} object
      * @param {Object} notificationPayload - Push notification payload
      * @returns {PushNotification|Error}
      */
    /* static member */
    @JSImport("twilio-chat", "default.parsePushNotification")
    @js.native
    def parsePushNotification(notificationPayload: js.Any): typings.twilioChat.pushnotificationMod.PushNotification = js.native
    
    /* static member */
    @JSImport("twilio-chat", "default.parsePushNotificationChatData")
    @js.native
    def parsePushNotificationChatData: js.Any = js.native
    @scala.inline
    def parsePushNotificationChatData_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsePushNotificationChatData")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("twilio-chat", "default.supportedPushChannels")
    @js.native
    val supportedPushChannels: js.Any = js.native
    
    /* static member */
    @JSImport("twilio-chat", "default.supportedPushDataFields")
    @js.native
    val supportedPushDataFields: js.Any = js.native
    
    /* static member */
    @JSImport("twilio-chat", "default.version")
    @js.native
    val version: String = js.native
  }
  
  /**
    * A Client is a starting point to access Twilio Programmable Chat functionality.
    *
    * @property {Client#ConnectionState} connectionState - Client connection state
    * @property {Boolean} reachabilityEnabled - Client reachability state
    * @property {User} user - Information for logged in user
    * @property {String} version - Current version of Chat client
    *
    * @fires Client#connectionError
    * @fires Client#connectionStateChanged
    * @fires Client#channelAdded
    * @fires Client#channelInvited
    * @fires Client#channelJoined
    * @fires Client#channelLeft
    * @fires Client#channelRemoved
    * @fires Client#channelUpdated
    * @fires Client#memberJoined
    * @fires Client#memberLeft
    * @fires Client#memberUpdated
    * @fires Client#messageAdded
    * @fires Client#messageRemoved
    * @fires Client#messageUpdated
    * @fires Client#pushNotification
    * @fires Client#tokenAboutToExpire
    * @fires Client#tokenExpired
    * @fires Client#typingEnded
    * @fires Client#typingStarted
    * @fires Client#userSubscribed
    * @fires Client#userUnsubscribed
    * @fires Client#userUpdated
    */
  @JSImport("twilio-chat", "Client")
  @js.native
  /**
    * These options can be passed to Client constructor.
    * @typedef {Object} Client#ClientOptions
    * @property {String} [logLevel='error'] - The level of logging to enable. Valid options
    *   (from strictest to broadest): ['silent', 'error', 'warn', 'info', 'debug', 'trace']
    */
  /**
    * These options can be passed to {@link Client#createChannel}.
    * @typedef {Object} Client#CreateChannelOptions
    * @property {any} [attributes] - Any custom attributes to attach to the Channel
    * @property {String} [friendlyName] - The non-unique display name of the Channel
    * @property {Boolean} [isPrivate] - Whether or not this Channel should be visible to uninvited Clients
    * @property {String} [uniqueName] - The unique identity name of the Channel
    */
  /**
    * Connection state of Client.
    * @typedef {('connecting'|'connected'|'disconnecting'|'disconnected'|'denied')} Client#ConnectionState
    */
  /**
    * Notifications channel type.
    * @typedef {('gcm'|'fcm'|'apn')} Client#NotificationsChannelType
    */
  /**
    * These options can be passed to {@link Client#getLocalChannels}.
    * @typedef {Object} Client#ChannelSortingOptions
    * @property {('lastMessage'|'friendlyName'|'uniqueName')} criteria - Sorting criteria for Channels array
    * @property {('ascending'|'descending')} [order] - Sorting order. If not present, then default is <code>ascending</code>
    */
  class Client protected () extends EventEmitter {
    
    var channels: js.Any = js.native
    
    var channelsPromise: js.Any = js.native
    
    var config: js.Any = js.native
    
    var connectionState: ConnectionState = js.native
    
    /**
      * Create a Channel on the server and subscribe to its events.
      * Default options are public Channel type with empty uniqueName and friendlyName.
      * @param {Client#CreateChannelOptions} [options] - Options for the Channel
      * @returns {Promise<Channel>}
      */
    def createChannel(): js.Promise[Channel] = js.native
    def createChannel(options: CreateChannelOptions): js.Promise[Channel] = js.native
    
    var fpaToken: js.Any = js.native
    
    /**
      * Get a known Channel by its SID.
      * @param {String} channelSid - Channel sid
      * @returns {Promise<Channel>}
      */
    def getChannelBySid(channelSid: String): js.Promise[Channel] = js.native
    
    /**
      * Get a known Channel by its unique identifier name.
      * @param {String} uniqueName - The unique identifier name of the Channel to get
      * @returns {Promise<Channel>}
      */
    def getChannelByUniqueName(uniqueName: String): js.Promise[Channel] = js.native
    
    /**
      * Get array of Channels locally known to Client in provided sorting order.
      * Locally known channels are the ones created and/or joined during client runtime and currently logged in User subscribed Channels.
      * To ensure full list of subscribed Channels fetched - call the {@link Client#getSubscribedChannels} method
      * and fetch all pages with help of {@link Paginator#nextPage} method.
      * @param {Client#ChannelSortingOptions} [sortingOptions] - Options for the Channel sorting
      * @returns {Promise<Array<Channel>>}
      */
    def getLocalChannels(): js.Promise[js.Array[Channel]] = js.native
    def getLocalChannels(sortingOptions: ChannelSortingOptions): js.Promise[js.Array[Channel]] = js.native
    
    /**
      * Get the public channels directory content.
      * @returns {Promise<Paginator<ChannelDescriptor>>}
      */
    def getPublicChannelDescriptors(): js.Promise[Paginator[ChannelDescriptor]] = js.native
    
    /**
      * Get the current list of all subscribed Channels.
      * @returns {Promise<Paginator<Channel>>}
      */
    def getSubscribedChannels(): js.Promise[Paginator[Channel]] = js.native
    def getSubscribedChannels(args: js.Any): js.Promise[Paginator[Channel]] = js.native
    
    /**
      * @returns {Promise<Array<User>>} List of subscribed User objects
      */
    def getSubscribedUsers(): js.Promise[js.Array[typings.twilioChat.userMod.User]] = js.native
    
    /**
      * Gets user for given identity, if it's in subscribed list - then return the user object from it,
      * if not - then subscribes and adds user to the subscribed list.
      * @param {String} identity - Identity of User
      * @returns {Promise<User>} Fully initialized user
      */
    def getUser(identity: String): js.Promise[typings.twilioChat.userMod.User] = js.native
    
    /**
      * Get the User's (created by, joined or invited to) channels directory content.
      * @returns {Promise<Paginator<ChannelDescriptor>>}
      */
    def getUserChannelDescriptors(): js.Promise[Paginator[ChannelDescriptor]] = js.native
    
    /**
      * Gets user descriptor for given identity.
      * @param {String} identity - Identity of User
      * @returns {Promise<UserDescriptor>} User descriptor
      */
    def getUserDescriptor(identity: String): js.Promise[UserDescriptor] = js.native
    
    /**
      * Handle push notification payload parsing and emits event {@link Client#event:pushNotification} on this {@link Client} instance.
      * @param {Object} notificationPayload - Push notification payload
      * @returns {void|Error}
      */
    def handlePushNotification(notificationPayload: js.Any): js.Promise[Unit] = js.native
    
    var initialize: js.Any = js.native
    
    var options: js.Any = js.native
    
    def parsePushNotification(notificationPayload: js.Any): typings.twilioChat.pushnotificationMod.PushNotification = js.native
    @JSName("parsePushNotification")
    var parsePushNotification_Original: js.Function1[
        /* notificationPayload */ js.Any, 
        typings.twilioChat.pushnotificationMod.PushNotification
      ] = js.native
    
    def reachabilityEnabled: Boolean = js.native
    
    var services: js.Any = js.native
    
    var sessionPromise: js.Any = js.native
    
    /**
      * Registers for push notifications.
      * @param {Client#NotificationsChannelType} channelType - 'gcm', 'apn' and 'fcm' are supported
      * @param {string} registrationId - Push notification id provided by platform
      * @returns {Promise<void>}
      */
    def setPushRegistrationId(channelType: NotificationsChannelType, registrationId: String): js.Promise[Unit] = js.native
    
    /**
      * Gracefully shutting down library instance.
      * @public
      * @returns {Promise<void>}
      */
    def shutdown(): js.Promise[Unit] = js.native
    
    var subscribeToPushNotifications: js.Any = js.native
    
    def token: String = js.native
    
    /**
      * Unregisters from push notifications.
      * @param {Client#NotificationsChannelType} channelType - 'gcm', 'apn' and 'fcm' are supported
      * @returns {Promise<void>}
      */
    def unsetPushRegistrationId(channelType: NotificationsChannelType): js.Promise[Unit] = js.native
    
    var unsubscribeFromPushNotifications: js.Any = js.native
    
    /**
      * Update the token used by the Client and re-register with Programmable Chat services.
      * @param {String} token - Access token
      * @public
      * @returns {Promise<Client>}
      */
    def updateToken(token: String): js.Promise[Client] = js.native
    
    def user: typings.twilioChat.userMod.User = js.native
    
    val version: String = js.native
  }
  object Client {
    
    @JSImport("twilio-chat", "Client")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("twilio-chat", "Client.compareChannelsByLastMessage")
    @js.native
    def compareChannelsByLastMessage: js.Any = js.native
    @scala.inline
    def compareChannelsByLastMessage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareChannelsByLastMessage")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("twilio-chat", "Client.compareChannelsByStringProperty")
    @js.native
    def compareChannelsByStringProperty: js.Any = js.native
    @scala.inline
    def compareChannelsByStringProperty_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareChannelsByStringProperty")(x.asInstanceOf[js.Any])
    
    /**
      * Factory method to create Chat client instance.
      *
      * @param {String} token - Access token
      * @param {Client#ClientOptions} options - Options to customize the Client
      * @returns {Promise<Client>}
      */
    /* static member */
    @JSImport("twilio-chat", "Client.create")
    @js.native
    def create(token: String): js.Promise[Client] = js.native
    @JSImport("twilio-chat", "Client.create")
    @js.native
    def create(token: String, options: Options): js.Promise[Client] = js.native
    
    /**
      * Static method for push notification payload parsing. Returns parsed push as {@link PushNotification} object
      * @param {Object} notificationPayload - Push notification payload
      * @returns {PushNotification|Error}
      */
    /* static member */
    @JSImport("twilio-chat", "Client.parsePushNotification")
    @js.native
    def parsePushNotification(notificationPayload: js.Any): typings.twilioChat.pushnotificationMod.PushNotification = js.native
    
    /* static member */
    @JSImport("twilio-chat", "Client.parsePushNotificationChatData")
    @js.native
    def parsePushNotificationChatData: js.Any = js.native
    @scala.inline
    def parsePushNotificationChatData_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsePushNotificationChatData")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("twilio-chat", "Client.supportedPushChannels")
    @js.native
    val supportedPushChannels: js.Any = js.native
    
    /* static member */
    @JSImport("twilio-chat", "Client.supportedPushDataFields")
    @js.native
    val supportedPushDataFields: js.Any = js.native
    
    /* static member */
    @JSImport("twilio-chat", "Client.version")
    @js.native
    val version: String = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.lastMessage
      - typings.twilioChat.twilioChatStrings.friendlyName
      - typings.twilioChat.twilioChatStrings.uniqueName
    */
    trait ChannelSortingCriteria extends StObject
    object ChannelSortingCriteria {
      
      @scala.inline
      def friendlyName: typings.twilioChat.twilioChatStrings.friendlyName = "friendlyName".asInstanceOf[typings.twilioChat.twilioChatStrings.friendlyName]
      
      @scala.inline
      def lastMessage: typings.twilioChat.twilioChatStrings.lastMessage = "lastMessage".asInstanceOf[typings.twilioChat.twilioChatStrings.lastMessage]
      
      @scala.inline
      def uniqueName: typings.twilioChat.twilioChatStrings.uniqueName = "uniqueName".asInstanceOf[typings.twilioChat.twilioChatStrings.uniqueName]
    }
    
    @js.native
    trait ChannelSortingOptions extends StObject {
      
      var criteria: ChannelSortingCriteria = js.native
      
      var order: js.UndefOr[ChannelSortingOrder] = js.native
    }
    object ChannelSortingOptions {
      
      @scala.inline
      def apply(criteria: ChannelSortingCriteria): ChannelSortingOptions = {
        val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any])
        __obj.asInstanceOf[ChannelSortingOptions]
      }
      
      @scala.inline
      implicit class ChannelSortingOptionsMutableBuilder[Self <: ChannelSortingOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCriteria(value: ChannelSortingCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrder(value: ChannelSortingOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.ascending
      - typings.twilioChat.twilioChatStrings.descending
    */
    trait ChannelSortingOrder extends StObject
    object ChannelSortingOrder {
      
      @scala.inline
      def ascending: typings.twilioChat.twilioChatStrings.ascending = "ascending".asInstanceOf[typings.twilioChat.twilioChatStrings.ascending]
      
      @scala.inline
      def descending: typings.twilioChat.twilioChatStrings.descending = "descending".asInstanceOf[typings.twilioChat.twilioChatStrings.descending]
    }
    
    type ConnectionState = typings.twilioNotifications.clientMod.ConnectionState
    
    @js.native
    trait CreateChannelOptions extends StObject {
      
      var attributes: js.UndefOr[js.Object] = js.native
      
      var friendlyName: js.UndefOr[String] = js.native
      
      var isPrivate: js.UndefOr[Boolean] = js.native
      
      var uniqueName: js.UndefOr[String] = js.native
    }
    object CreateChannelOptions {
      
      @scala.inline
      def apply(): CreateChannelOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateChannelOptions]
      }
      
      @scala.inline
      implicit class CreateChannelOptionsMutableBuilder[Self <: CreateChannelOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
        
        @scala.inline
        def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
        
        @scala.inline
        def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsPrivateUndefined: Self = StObject.set(x, "isPrivate", js.undefined)
        
        @scala.inline
        def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.trace
      - typings.twilioChat.twilioChatStrings.debug
      - typings.twilioChat.twilioChatStrings.info
      - typings.twilioChat.twilioChatStrings.warn
      - typings.twilioChat.twilioChatStrings.error
      - typings.twilioChat.twilioChatStrings.silent
      - scala.Null
    */
    type LogLevel = _LogLevel | Null
    
    type NotificationsChannelType = ChannelType
    
    @js.native
    trait Options extends StObject {
      
      var Chat: js.UndefOr[js.Any] = js.native
      
      var Notification: js.UndefOr[js.Any] = js.native
      
      var Sync: js.UndefOr[js.Any] = js.native
      
      var Twilsock: js.UndefOr[js.Any] = js.native
      
      var backoffConfigOverride: js.UndefOr[js.Any] = js.native
      
      var clientMetadata: js.UndefOr[js.Any] = js.native
      
      var consumptionReportIntervalOverride: js.UndefOr[String] = js.native
      
      var httpCacheIntervalOverride: js.UndefOr[String] = js.native
      
      var logLevel: js.UndefOr[LogLevel] = js.native
      
      var notificationsClient: js.UndefOr[Notifications] = js.native
      
      var productId: js.UndefOr[String] = js.native
      
      var region: js.UndefOr[String] = js.native
      
      var retryWhenThrottledOverride: js.UndefOr[Boolean] = js.native
      
      var syncClient: js.UndefOr[SyncClient] = js.native
      
      var transport: js.UndefOr[Transport] = js.native
      
      var twilsockClient: js.UndefOr[Twilsock] = js.native
      
      var typingIndicatorTimeoutOverride: js.UndefOr[Double] = js.native
      
      var userInfosToSubscribeOverride: js.UndefOr[Double] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBackoffConfigOverride(value: js.Any): Self = StObject.set(x, "backoffConfigOverride", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackoffConfigOverrideUndefined: Self = StObject.set(x, "backoffConfigOverride", js.undefined)
        
        @scala.inline
        def setChat(value: js.Any): Self = StObject.set(x, "Chat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChatUndefined: Self = StObject.set(x, "Chat", js.undefined)
        
        @scala.inline
        def setClientMetadata(value: js.Any): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
        
        @scala.inline
        def setConsumptionReportIntervalOverride(value: String): Self = StObject.set(x, "consumptionReportIntervalOverride", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConsumptionReportIntervalOverrideUndefined: Self = StObject.set(x, "consumptionReportIntervalOverride", js.undefined)
        
        @scala.inline
        def setHttpCacheIntervalOverride(value: String): Self = StObject.set(x, "httpCacheIntervalOverride", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpCacheIntervalOverrideUndefined: Self = StObject.set(x, "httpCacheIntervalOverride", js.undefined)
        
        @scala.inline
        def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLogLevelNull: Self = StObject.set(x, "logLevel", null)
        
        @scala.inline
        def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
        
        @scala.inline
        def setNotification(value: js.Any): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
        
        @scala.inline
        def setNotificationsClient(value: Notifications): Self = StObject.set(x, "notificationsClient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotificationsClientUndefined: Self = StObject.set(x, "notificationsClient", js.undefined)
        
        @scala.inline
        def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        @scala.inline
        def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
        
        @scala.inline
        def setRetryWhenThrottledOverride(value: Boolean): Self = StObject.set(x, "retryWhenThrottledOverride", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRetryWhenThrottledOverrideUndefined: Self = StObject.set(x, "retryWhenThrottledOverride", js.undefined)
        
        @scala.inline
        def setSync(value: js.Any): Self = StObject.set(x, "Sync", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSyncClient(value: SyncClient): Self = StObject.set(x, "syncClient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSyncClientUndefined: Self = StObject.set(x, "syncClient", js.undefined)
        
        @scala.inline
        def setSyncUndefined: Self = StObject.set(x, "Sync", js.undefined)
        
        @scala.inline
        def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
        
        @scala.inline
        def setTwilsock(value: js.Any): Self = StObject.set(x, "Twilsock", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTwilsockClient(value: Twilsock): Self = StObject.set(x, "twilsockClient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTwilsockClientUndefined: Self = StObject.set(x, "twilsockClient", js.undefined)
        
        @scala.inline
        def setTwilsockUndefined: Self = StObject.set(x, "Twilsock", js.undefined)
        
        @scala.inline
        def setTypingIndicatorTimeoutOverride(value: Double): Self = StObject.set(x, "typingIndicatorTimeoutOverride", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypingIndicatorTimeoutOverrideUndefined: Self = StObject.set(x, "typingIndicatorTimeoutOverride", js.undefined)
        
        @scala.inline
        def setUserInfosToSubscribeOverride(value: Double): Self = StObject.set(x, "userInfosToSubscribeOverride", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserInfosToSubscribeOverrideUndefined: Self = StObject.set(x, "userInfosToSubscribeOverride", js.undefined)
      }
    }
    
    trait _LogLevel extends StObject
  }
  
  /**
    * @classdesc Push notification representation within Chat Client
    * @property {String} [action] - Notification action (`click_action` in FCM/GCM terms and `category` in APN terms)
    * @property {Number} [badge] - Number for the badge
    * @property {String} body - Notification text
    * @property {PushNotification#ChatData} data - Additional Chat data
    * @property {String} [sound] - Notification sound
    * @property {String} [title] - Notification title
    * @property {PushNotification#NotificationType} type - Notification type
    */
  @JSImport("twilio-chat", "PushNotification")
  @js.native
  class PushNotification protected ()
    extends typings.twilioChat.pushnotificationMod.PushNotification {
    /**
      * Chat push notification type
      * @typedef {('twilio.channel.new_message' | 'twilio.channel.added_to_channel'
      | 'twilio.channel.invited_to_channel'  | 'twilio.channel.removed_from_channel')} PushNotification#NotificationType
      */
    /**
      * Additional Chat data for given Push Notification
      * @typedef {Object} PushNotification#ChatData
      * @property {String} [channelSid] - SID of Channel
      * @property {Number} [messageIndex] - Index of Message in Channel
      * @property {String} [messageSid] - SID of Message
      */
    /**
      * @param {PushNotification.Descriptor} data - initial data for PushNotification
      */
    def this(data: Descriptor) = this()
  }
  
  /**
    * @classdesc Extended user information.
    * Note that <code>online</code> and <code>notifiable</code> properties are eligible
    * to use only if reachability function is enabled.
    * You may check if it is enabled by reading value of {@link Client}'s <code>reachabilityEnabled</code> property.
    *
    * @property {String} identity - User identity
    * @property {String} friendlyName - User friendly name, null if not set
    * @property {any} attributes - Object with custom attributes for user
    * @property {Boolean} online - User real-time channel connection status
    * @property {Boolean} notifiable - User push notification registration status
    *
    * @fires User#updated
    * @fires User#userSubscribed
    * @fires User#userUnsubscribed
    *
    * @constructor
    * @param {String} identity - Identity of user
    * @param {String} entityId - id of user's object
    * @param {Object} datasync - datasync service
    * @param {Object} session - session service
    */
  @JSImport("twilio-chat", "User")
  @js.native
  class User protected ()
    extends typings.twilioChat.userMod.User {
    /**
      * The update reason for <code>updated</code> event emitted on User
      * @typedef {('friendlyName' | 'attributes' | 'online' | 'notifiable')} User#UpdateReason
      */
    def this(identity: String, entityName: String, services: UserServices) = this()
  }
}
