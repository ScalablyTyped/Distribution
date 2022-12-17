package typings.twilioChat.mod

import typings.twilioReplayEventEmitter.mod.ReplayEventEmitter
import typings.twilsock.mod.InitRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client is the starting point to the Twilio Programmable Chat functionality.
  */
@JSImport("twilio-chat", "Client")
@js.native
open class Client protected () extends ReplayEventEmitter[ClientEvents] {
  /**
    * Returned client instance is not yet fully initialized. Calling any operations will block until it is.
    * Use connection events to monitor when client becomes fully available (connectionStateChanged with state
    * 'connected') or not available (connectionStateChange with state 'denied', event tokenExpired, event connectionError).
    *
    * @param fpaToken Access token
    * @param options Options to customize the Client
    * @returns A not yet fully-initialized client.
    */
  def this(fpaToken: String) = this()
  def this(fpaToken: String, options: ClientOptions) = this()
  
  // @todo make private?
  /* private */ var _ensureReady: Any = js.native
  
  /* private */ var _initialize: Any = js.native
  
  /* private */ val _myself: Any = js.native
  
  /* private */ var _rejectEnsureReady: Any = js.native
  
  /* private */ var _resolveEnsureReady: Any = js.native
  
  /* private */ var _subscribeToPushNotifications: Any = js.native
  
  /* private */ var _unsubscribeFromPushNotifications: Any = js.native
  
  /* private */ var channels: Any = js.native
  
  /* private */ var channelsPromise: Any = js.native
  
  /* private */ var configuration: Any = js.native
  
  /* private */ var configurationPromise: Any = js.native
  
  /**
    * Client connection state.
    */
  var connectionState: ConnectionState = js.native
  
  /**
    * Create a channel on the server and subscribe to its events.
    * The default is a public channel with an empty friendly name.
    * @param options Options for the channel.
    */
  def createChannel(): js.Promise[Channel] = js.native
  def createChannel(options: CreateChannelOptions): js.Promise[Channel] = js.native
  
  /* private */ var fpaToken: Any = js.native
  
  /**
    * Get a known channel by its SID.
    * @param channelSid Channel sid
    */
  def getChannelBySid(channelSid: String): js.Promise[Channel] = js.native
  
  /**
    * Get a known channel by its unique identifier name.
    * @param uniqueName The unique identifier name of the channel.
    */
  def getChannelByUniqueName(uniqueName: String): js.Promise[Channel] = js.native
  
  /**
    * Get an array of channels that are locally known to the client in the provided sorting order.
    * Locally known channels are the ones that are created and/or joined during the client runtime
    * and all the subscribed channel of the currently-logged-in user.
    * To ensure that the full list of the subscribed channels has fetched, call the
    * {@link Client.getSubscribedChannels} method
    * and fetch all the pages with the help of the {@link RestPaginator.nextPage} method.
    * @param sortingOptions Sorting options.
    */
  def getLocalChannels(): js.Promise[js.Array[Channel]] = js.native
  def getLocalChannels(sortingOptions: ChannelSortingOptions): js.Promise[js.Array[Channel]] = js.native
  
  /**
    * Get the content of the public channels directory.
    */
  def getPublicChannelDescriptors(): js.Promise[Paginator[ChannelDescriptor0]] = js.native
  
  /**
    * Get the current list of all the subscribed channels.
    */
  def getSubscribedChannels(): js.Promise[Paginator[Channel]] = js.native
  def getSubscribedChannels(args: Any): js.Promise[Paginator[Channel]] = js.native
  
  /**
    * Get a list of subscribed user objects.
    */
  def getSubscribedUsers(): js.Promise[js.Array[User]] = js.native
  
  /**
    * Gets a user with the given identity. If it's in the subscribed list, then return the user object from it;
    * if not, then subscribe and add user to the subscribed list.
    * @param identity Identity of the user.
    * @returns A fully initialized user.
    */
  def getUser(identity: String): js.Promise[User] = js.native
  
  /**
    * Get the content of the channels directory of the user (created by, joined or invited to).
    */
  def getUserChannelDescriptors(): js.Promise[Paginator[ChannelDescriptor0]] = js.native
  
  /**
    * Gets the user descriptor for given identity.
    * @param identity Identity of the user.
    * @returns The user descriptor.
    */
  def getUserDescriptor(identity: String): js.Promise[UserDescriptor] = js.native
  
  /**
    * Handle push notification payload parsing and emit the {@link Client.pushNotification} event on this {@link Client} instance.
    * @param notificationPayload Push notification payload
    */
  def handlePushNotification(notificationPayload: Any): js.Promise[Unit] = js.native
  
  /* private */ val options: Any = js.native
  
  def parsePushNotification(notificationPayload: Any): PushNotification = js.native
  @JSName("parsePushNotification")
  var parsePushNotification_Original: js.Function1[/* notificationPayload */ Any, PushNotification] = js.native
  
  /**
    * Client reachability state. Throws if accessed before the client
    * initialization was completed.
    */
  def reachabilityEnabled: Boolean = js.native
  
  /* private */ val services: Any = js.native
  
  /**
    * Register for push notifications.
    * @param channelType Channel type.
    * @param registrationId Push notification ID provided by the platform.
    */
  def setPushRegistrationId(channelType: NotificationsChannelType, registrationId: String): js.Promise[Unit] = js.native
  
  /**
    * Gracefully shut down the client.
    */
  def shutdown(): js.Promise[Unit] = js.native
  
  def token: String = js.native
  
  /**
    * Unregister from push notifications.
    * @param channelType Channel type.
    */
  def unsetPushRegistrationId(channelType: NotificationsChannelType): js.Promise[Unit] = js.native
  
  /**
    * Update the token used by the client and re-register with the Programmable Chat services.
    * @param token New access token.
    */
  def updateToken(token: String): js.Promise[Client] = js.native
  
  /**
    * Information of the logged-in user. Before client initialization, returns an
    * uninitialized user. Will trigger a {@link Client.userUpdated} event after
    * initialization.
    */
  def user: User = js.native
  
  /**
    * Current version of the Chat client.
    */
  val version: String = js.native
}
object Client {
  
  @JSImport("twilio-chat", "Client")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fired when a channel becomes visible to the client. The event is also triggered when the client creates a new channel.
    * Fired for all channels client has joined.
    *
    * Parameters:
    * 1. {@link Channel} `channel` - the channel in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.channelAdded")
  @js.native
  val channelAdded: /* "channelAdded" */ String = js.native
  
  /**
    * Fired when the client gets invited to a channel.
    *
    * Parameters:
    * 1. {@link Channel} `channel` - the channel in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.channelInvited")
  @js.native
  val channelInvited: /* "channelInvited" */ String = js.native
  
  /**
    * Fired when the client joins a channel.
    *
    * Parameters:
    * 1. {@link Channel} `channel` - the channel in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.channelJoined")
  @js.native
  val channelJoined: /* "channelJoined" */ String = js.native
  
  /**
    * Fired when the client leaves a channel.
    *
    * Parameters:
    * 1. {@link Channel} `channel` - the channel in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.channelLeft")
  @js.native
  val channelLeft: /* "channelLeft" */ String = js.native
  
  /**
    * Fired when a channel is no longer visible to the client.
    *
    * Parameters:
    * 1. {@link Channel} `channel` - the channel in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.channelRemoved")
  @js.native
  val channelRemoved: /* "channelRemoved" */ String = js.native
  
  /**
    * Fired when the attributes or the metadata of a channel have been updated.
    * During channel's {@link Client.constructor| creation and initialization}, this event might be fired multiple times
    * for same joined or created channel as new data is arriving from different sources.
    *
    * Parameters:
    * 1. object `data` - info object provided with the event. It has the following properties:
    *     * {@link Channel} `channel` - the channel in question
    *     * {@link ChannelUpdateReason}[] `updateReasons` - array of reasons for the update
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.channelUpdated")
  @js.native
  val channelUpdated: /* "channelUpdated" */ String = js.native
  
  /* static member */
  @JSImport("twilio-chat", "Client.compareChannelsByLastMessage")
  @js.native
  def compareChannelsByLastMessage: Any = js.native
  inline def compareChannelsByLastMessage_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareChannelsByLastMessage")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("twilio-chat", "Client.compareChannelsByStringProperty")
  @js.native
  def compareChannelsByStringProperty: Any = js.native
  inline def compareChannelsByStringProperty_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareChannelsByStringProperty")(x.asInstanceOf[js.Any])
  
  /**
    * Fired when the connection is interrupted for an unexpected reason.
    *
    * Parameters:
    * 1. object `data` - info object provided with the event. It has the following properties:
    *     * boolean `terminal` - Twilsock will stop connection attempts if true
    *     * string `message` - the error message of the root cause
    *     * number? `httpStatusCode` - http status code if available
    *     * number? `errorCode` - Twilio public error code if available
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.connectionError")
  @js.native
  val connectionError: /* "connectionError" */ String = js.native
  
  /**
    * Fired when the connection state of the client has been changed.
    *
    * Parameters:
    * 1. {@link ConnectionState} `connectionState` - the updated connection state
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.connectionStateChanged")
  @js.native
  val connectionStateChanged: /* "connectionStateChanged" */ String = js.native
  
  /**
    * @deprecated Call constructor directly.
    *
    * Factory method to create Chat client instance.
    *
    * The factory method will automatically trigger connection.
    * Do not use it if you need finer-grained control.
    *
    * @param token Access token.
    * @param options Options to customize the client.
    * @returns Returns a fully initialized client.
    */
  /* static member */
  inline def create(token: String): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(token.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
  inline def create(token: String, options: ClientOptions): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  
  /**
    * Fired when a member has joined a channel.
    *
    * Parameters:
    * 1. {@link Member} `member` - the member in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.memberJoined")
  @js.native
  val memberJoined: /* "memberJoined" */ String = js.native
  
  /**
    * Fired when a member has left a channel.
    *
    * Parameters:
    * 1. {@link Member} `member` - the member in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.memberLeft")
  @js.native
  val memberLeft: /* "memberLeft" */ String = js.native
  
  /**
    * Fired when a member's fields have been updated.
    *
    * Parameters:
    * 1. object `data` - info object provided with the event. It has the following properties:
    *     * {@link Member} `member` - the member in question
    *     * {@link MemberUpdateReason}[] `updateReasons` - array of reasons for the update
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.memberUpdated")
  @js.native
  val memberUpdated: /* "memberUpdated" */ String = js.native
  
  /**
    * Fired when a new message has been added to the channel on the server.
    *
    * Parameters:
    * 1. {@link Message} `message` - the message in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.messageAdded")
  @js.native
  val messageAdded: /* "messageAdded" */ String = js.native
  
  /**
    * Fired when a message is removed from the message list of a channel.
    *
    * Parameters:
    * 1. {@link Message} `message` - the message in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.messageRemoved")
  @js.native
  val messageRemoved: /* "messageRemoved" */ String = js.native
  
  /**
    * Fired when the fields of an existing message are updated with new values.
    *
    * Parameters:
    * 1. object `data` - info object provided with the event. It has the following properties:
    *     * {@link Message} `message` - the message in question
    *     * {@link MessageUpdateReason}[] `updateReasons` - array of reasons for the update
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.messageUpdated")
  @js.native
  val messageUpdated: /* "messageUpdated" */ String = js.native
  
  /**
    * Static method for push notification payload parsing. Returns parsed push as a {@link PushNotification} object.
    * @param notificationPayload Push notification payload.
    */
  /* static member */
  inline def parsePushNotification(notificationPayload: Any): PushNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePushNotification")(notificationPayload.asInstanceOf[js.Any]).asInstanceOf[PushNotification]
  
  /* static member */
  @JSImport("twilio-chat", "Client.parsePushNotificationChatData")
  @js.native
  def parsePushNotificationChatData: Any = js.native
  inline def parsePushNotificationChatData_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsePushNotificationChatData")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def populateInitRegistrations(reg: InitRegistration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("populateInitRegistrations")(reg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Fired when the client has received (and parsed) a push notification via one of the push channels (apn or fcm).
    *
    * Parameters:
    * 1. {@link PushNotification} `pushNotification` - the push notification in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.pushNotification")
  @js.native
  val pushNotification: /* "pushNotification" */ String = js.native
  
  /**
    * Fired when the state of the client has been changed.
    *
    * Parameters:
    * 1. {@link State} `state` - the new client state
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.stateChanged")
  @js.native
  val stateChanged: /* "stateChanged" */ String = js.native
  
  /* static member */
  @JSImport("twilio-chat", "Client.supportedPushChannels")
  @js.native
  val supportedPushChannels: Any = js.native
  
  /* static member */
  @JSImport("twilio-chat", "Client.supportedPushDataFields")
  @js.native
  val supportedPushDataFields: Any = js.native
  
  /**
    * Fired when the token is about to expire and needs to be updated.
    *
    * * Parameters:
    * 1. number `ttl` - token's time to live
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.tokenAboutToExpire")
  @js.native
  val tokenAboutToExpire: /* "tokenAboutToExpire" */ String = js.native
  
  /**
    * Fired when the token has expired.
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.tokenExpired")
  @js.native
  val tokenExpired: /* "tokenExpired" */ String = js.native
  
  /**
    * Fired when a member has stopped typing.
    *
    * Parameters:
    * 1. {@link Member} `member` - the member in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.typingEnded")
  @js.native
  val typingEnded: /* "typingEnded" */ String = js.native
  
  /**
    * Fired when a member has started typing.
    *
    * Parameters:
    * 1. {@link Member} `member` - the member in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.typingStarted")
  @js.native
  val typingStarted: /* "typingStarted" */ String = js.native
  
  /**
    * Fired when the client has subscribed to a user.
    *
    * Parameters:
    * 1. {@link User} `user` - the user in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.userSubscribed")
  @js.native
  val userSubscribed: /* "userSubscribed" */ String = js.native
  
  /**
    * Fired when the client has unsubscribed from a user.
    *
    * Parameters:
    * 1. {@link User} `user` - the user in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.userUnsubscribed")
  @js.native
  val userUnsubscribed: /* "userUnsubscribed" */ String = js.native
  
  /**
    * Fired when the properties or the reachability status of a user have been updated.
    *
    * Parameters:
    * 1. object `data` - info object provided with the event. It has the following properties:
    *     * {@link User} `user` - the user in question
    *     * {@link UserUpdateReason}[] `updateReasons` - array of reasons for the update
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Client.userUpdated")
  @js.native
  val userUpdated: /* "userUpdated" */ String = js.native
  
  /**
    * Current version of the Chat client.
    */
  /* static member */
  @JSImport("twilio-chat", "Client.version")
  @js.native
  val version: String = js.native
}
