package typings
package twilioDashChatLib.twilioDashChatMod

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
class Client protected ()
  extends nodeLib.eventsMod.EventEmitter {
  var channels: js.Any = js.native
  var channelsPromise: js.Any = js.native
  var config: js.Any = js.native
  var connectionState: twilioDashChatLib.twilioDashChatMod.ClientNs.ConnectionState = js.native
  var fpaToken: js.Any = js.native
  var initialize: js.Any = js.native
  var options: js.Any = js.native
  var parsePushNotification: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Client.parsePushNotification */ js.Any = js.native
  val reachabilityEnabled: scala.Boolean = js.native
  var services: js.Any = js.native
  var sessionPromise: js.Any = js.native
  var subscribeToPushNotifications: js.Any = js.native
  val token: java.lang.String = js.native
  var unsubscribeFromPushNotifications: js.Any = js.native
  val user: twilioDashChatLib.libUserMod.User = js.native
  val version: java.lang.String = js.native
  /**
    * Create a Channel on the server and subscribe to its events.
    * Default options are public Channel type with empty uniqueName and friendlyName.
    * @param {Client#CreateChannelOptions} [options] - Options for the Channel
    * @returns {Promise<Channel>}
    */
  def createChannel(): js.Promise[twilioDashChatLib.libDataChannelsMod.Channel] = js.native
  def createChannel(options: twilioDashChatLib.twilioDashChatMod.ClientNs.CreateChannelOptions): js.Promise[twilioDashChatLib.libDataChannelsMod.Channel] = js.native
  /**
    * Get a known Channel by its SID.
    * @param {String} channelSid - Channel sid
    * @returns {Promise<Channel>}
    */
  def getChannelBySid(channelSid: java.lang.String): js.Promise[twilioDashChatLib.libDataChannelsMod.Channel] = js.native
  /**
    * Get a known Channel by its unique identifier name.
    * @param {String} uniqueName - The unique identifier name of the Channel to get
    * @returns {Promise<Channel>}
    */
  def getChannelByUniqueName(uniqueName: java.lang.String): js.Promise[twilioDashChatLib.libDataChannelsMod.Channel] = js.native
  /**
    * Get array of Channels locally known to Client in provided sorting order.
    * Locally known channels are the ones created and/or joined during client runtime and currently logged in User subscribed Channels.
    * To ensure full list of subscribed Channels fetched - call the {@link Client#getSubscribedChannels} method
    * and fetch all pages with help of {@link Paginator#nextPage} method.
    * @param {Client#ChannelSortingOptions} [sortingOptions] - Options for the Channel sorting
    * @returns {Promise<Array<Channel>>}
    */
  def getLocalChannels(): js.Promise[js.Array[twilioDashChatLib.libDataChannelsMod.Channel]] = js.native
  def getLocalChannels(sortingOptions: twilioDashChatLib.twilioDashChatMod.ClientNs.ChannelSortingOptions): js.Promise[js.Array[twilioDashChatLib.libDataChannelsMod.Channel]] = js.native
  /**
    * Get the public channels directory content.
    * @returns {Promise<Paginator<ChannelDescriptor>>}
    */
  def getPublicChannelDescriptors(): js.Promise[
    twilioDashChatLib.libInterfacesPaginatorMod.Paginator[twilioDashChatLib.libChanneldescriptorMod.ChannelDescriptor]
  ] = js.native
  /**
    * Get the current list of all subscribed Channels.
    * @returns {Promise<Paginator<Channel>>}
    */
  def getSubscribedChannels(args: js.Any): js.Promise[
    twilioDashChatLib.libInterfacesPaginatorMod.Paginator[twilioDashChatLib.libDataChannelsMod.Channel]
  ] = js.native
  /**
    * @returns {Promise<Array<User>>} List of subscribed User objects
    */
  def getSubscribedUsers(): js.Promise[js.Array[twilioDashChatLib.libUserMod.User]] = js.native
  /**
    * Gets user for given identity, if it's in subscribed list - then return the user object from it,
    * if not - then subscribes and adds user to the subscribed list.
    * @param {String} identity - Identity of User
    * @returns {Promise<User>} Fully initialized user
    */
  def getUser(identity: java.lang.String): js.Promise[twilioDashChatLib.libUserMod.User] = js.native
  /**
    * Get the User's (created by, joined or invited to) channels directory content.
    * @returns {Promise<Paginator<ChannelDescriptor>>}
    */
  def getUserChannelDescriptors(): js.Promise[
    twilioDashChatLib.libInterfacesPaginatorMod.Paginator[twilioDashChatLib.libChanneldescriptorMod.ChannelDescriptor]
  ] = js.native
  /**
    * Gets user descriptor for given identity.
    * @param {String} identity - Identity of User
    * @returns {Promise<UserDescriptor>} User descriptor
    */
  def getUserDescriptor(identity: java.lang.String): js.Promise[twilioDashChatLib.libUserdescriptorMod.UserDescriptor] = js.native
  /**
    * Handle push notification payload parsing and emits event {@link Client#event:pushNotification} on this {@link Client} instance.
    * @param {Object} notificationPayload - Push notification payload
    * @returns {void|Error}
    */
  def handlePushNotification(notificationPayload: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Registers for push notifications.
    * @param {Client#NotificationsChannelType} channelType - 'gcm', 'apn' and 'fcm' are supported
    * @param {string} registrationId - Push notification id provided by platform
    * @returns {Promise<void>}
    */
  def setPushRegistrationId(
    channelType: twilioDashChatLib.twilioDashChatMod.ClientNs.NotificationsChannelType,
    registrationId: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  /**
    * Gracefully shutting down library instance.
    * @public
    * @returns {Promise<void>}
    */
  def shutdown(): js.Promise[scala.Unit] = js.native
  /**
    * Unregisters from push notifications.
    * @param {Client#NotificationsChannelType} channelType - 'gcm', 'apn' and 'fcm' are supported
    * @returns {Promise<void>}
    */
  def unsetPushRegistrationId(channelType: twilioDashChatLib.twilioDashChatMod.ClientNs.NotificationsChannelType): js.Promise[scala.Unit] = js.native
  /**
    * Update the token used by the Client and re-register with Programmable Chat services.
    * @param {String} token - Access token
    * @public
    * @returns {Promise<Client>}
    */
  def updateToken(token: java.lang.String): js.Promise[Client] = js.native
}

/* static members */
@JSImport("twilio-chat", "Client")
@js.native
object Client extends js.Object {
  var compareChannelsByLastMessage: js.Any = js.native
  var compareChannelsByStringProperty: js.Any = js.native
  var parsePushNotificationChatData: js.Any = js.native
  val supportedPushChannels: js.Any = js.native
  val supportedPushDataFields: js.Any = js.native
  val version: java.lang.String = js.native
  /**
    * Factory method to create Chat client instance.
    *
    * @param {String} token - Access token
    * @param {Client#ClientOptions} options - Options to customize the Client
    * @returns {Promise<Client>}
    */
  def create(token: java.lang.String): js.Promise[twilioDashChatLib.twilioDashChatMod.Client] = js.native
  def create(token: java.lang.String, options: twilioDashChatLib.twilioDashChatMod.ClientNs.Options): js.Promise[twilioDashChatLib.twilioDashChatMod.Client] = js.native
  /**
    * Static method for push notification payload parsing. Returns parsed push as {@link PushNotification} object
    * @param {Object} notificationPayload - Push notification payload
    * @returns {PushNotification|Error}
    */
  def parsePushNotification(notificationPayload: js.Any): twilioDashChatLib.libPushnotificationMod.PushNotification = js.native
}

