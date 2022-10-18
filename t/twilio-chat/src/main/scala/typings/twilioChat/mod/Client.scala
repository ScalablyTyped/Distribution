package typings.twilioChat.mod

import typings.twilioReplayEventEmitter.mod.ReplayEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client is the starting point to the Twilio Programmable Chat functionality.
  */
@js.native
trait Client extends ReplayEventEmitter[ClientEvents] {
  
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
