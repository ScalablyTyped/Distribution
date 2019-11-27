package typings.twilioDashChat.twilioDashChatMod

import typings.node.eventsMod.EventEmitter
import typings.twilioDashChat.libChanneldescriptorMod.ChannelDescriptor
import typings.twilioDashChat.libDataChannelsMod.Channel
import typings.twilioDashChat.libInterfacesPaginatorMod.Paginator
import typings.twilioDashChat.libUserdescriptorMod.UserDescriptor
import typings.twilioDashChat.twilioDashChatMod.Client.ChannelSortingOptions
import typings.twilioDashChat.twilioDashChatMod.Client.ConnectionState
import typings.twilioDashChat.twilioDashChatMod.Client.CreateChannelOptions
import typings.twilioDashChat.twilioDashChatMod.Client.NotificationsChannelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  * @property {Object} [attributes] - Any custom attributes to attach to the Channel
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
class Client_ protected () extends EventEmitter {
  var channels: js.Any = js.native
  var channelsPromise: js.Any = js.native
  var config: js.Any = js.native
  var connectionState: ConnectionState = js.native
  var fpaToken: js.Any = js.native
  var initialize: js.Any = js.native
  var options: js.Any = js.native
  var parsePushNotification: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Client.parsePushNotification */ js.Any = js.native
  var services: js.Any = js.native
  var sessionPromise: js.Any = js.native
  var subscribeToPushNotifications: js.Any = js.native
  var unsubscribeFromPushNotifications: js.Any = js.native
  val version: String = js.native
  /**
    * Create a Channel on the server and subscribe to its events.
    * Default options are public Channel type with empty uniqueName and friendlyName.
    * @param {Client#CreateChannelOptions} [options] - Options for the Channel
    * @returns {Promise<Channel>}
    */
  def createChannel(): js.Promise[Channel] = js.native
  def createChannel(options: CreateChannelOptions): js.Promise[Channel] = js.native
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
  def getSubscribedUsers(): js.Promise[js.Array[typings.twilioDashChat.libUserMod.User]] = js.native
  /**
    * Gets user for given identity, if it's in subscribed list - then return the user object from it,
    * if not - then subscribes and adds user to the subscribed list.
    * @param {String} identity - Identity of User
    * @returns {Promise<User>} Fully initialized user
    */
  def getUser(identity: String): js.Promise[typings.twilioDashChat.libUserMod.User] = js.native
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
  def reachabilityEnabled(): Boolean = js.native
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
  def token(): String = js.native
  /**
    * Unregisters from push notifications.
    * @param {Client#NotificationsChannelType} channelType - 'gcm', 'apn' and 'fcm' are supported
    * @returns {Promise<void>}
    */
  def unsetPushRegistrationId(channelType: NotificationsChannelType): js.Promise[Unit] = js.native
  /**
    * Update the token used by the Client and re-register with Programmable Chat services.
    * @param {String} token - Access token
    * @public
    * @returns {Promise<Client>}
    */
  def updateToken(token: String): js.Promise[Client] = js.native
  def user(): typings.twilioDashChat.libUserMod.User = js.native
}

