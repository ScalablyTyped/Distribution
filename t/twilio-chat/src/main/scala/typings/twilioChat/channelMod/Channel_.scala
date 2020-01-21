package typings.twilioChat.channelMod

import typings.node.eventsMod.EventEmitter
import typings.std.FormData
import typings.twilioChat.channelMod.Channel.LastMessage
import typings.twilioChat.channelMod.Channel.NotificationLevel
import typings.twilioChat.channelMod.Channel.SendMediaOptions
import typings.twilioChat.channelMod.Channel.Status
import typings.twilioChat.channelMod.Channel.Type
import typings.twilioChat.channelsMod.Channels.DataSource
import typings.twilioChat.memberMod.Member
import typings.twilioChat.messageMod.Message
import typings.twilioChat.paginatorMod.Paginator
import typings.twilioChat.userdescriptorMod.UserDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc A Channel represents a remote channel of communication between multiple Programmable Chat Clients
  * @property {Object} attributes - The Channel's custom attributes
  * @property {String} createdBy - The identity of the User that created this Channel
  * @property {Date} dateCreated - The Date this Channel was created
  * @property {Date} dateUpdated - The Date this Channel was last updated
  * @property {String} friendlyName - The Channel's name
  * @property {Boolean} isPrivate - Whether the channel is private (as opposed to public)
  * @property {Number} lastConsumedMessageIndex - Index of the last Message the User has consumed in this Channel
  * @property {Channel#LastMessage} lastMessage - Last Message sent to this Channel
  * @property {Channel#NotificationLevel} notificationLevel - User Notification level for this Channel
  * @property {String} sid - The Channel's unique system identifier
  * @property {Channel#Status} status - The Channel's status
  * @property {Channel#Type} type - The Channel's type
  * @property {String} uniqueName - The Channel's unique name (tag)
  * @fires Channel#memberJoined
  * @fires Channel#memberLeft
  * @fires Channel#memberUpdated
  * @fires Channel#messageAdded
  * @fires Channel#messageRemoved
  * @fires Channel#messageUpdated
  * @fires Channel#typingEnded
  * @fires Channel#typingStarted
  * @fires Channel#updated
  * @fires Channel#removed
  */
@JSImport("twilio-chat/lib/channel", "Channel")
@js.native
class Channel_ protected () extends EventEmitter {
  /**
    * These options can be passed to {@link Channel#sendMessage}.
    * @typedef {Object} Channel#SendMediaOptions
    * @property {String} contentType - content type of media
    * @property {String | Buffer} media - content to post
    */
  /**
    * The update reason for <code>updated</code> event emitted on Channel
    * @typedef {('attributes' | 'createdBy' | 'dateCreated' | 'dateUpdated' |
    'friendlyName' | 'lastConsumedMessageIndex' | 'status' | 'uniqueName' | 'lastMessage' |
    'notificationLevel' )} Channel#UpdateReason
    */
  /**
    * The status of the Channel, relative to the Client: whether the Channel
    * is <code>known</code> to local Client, Client is <code>invited</code> to or
    * is <code>joined</code> to this Channel
    * @typedef {('unknown' | 'known' | 'invited' | 'joined')} Channel#Status
    */
  /**
    * The type of Channel (<code>public</code> or <code>private</code>).
    * @typedef {('public' | 'private')} Channel#Type
    */
  /**
    * The User's Notification level for Channel, determines whether the currently logged-in User will receive
    * pushes for events in this Channel. Can be either <code>muted</code> or <code>default</code>,
    * where <code>default</code> defers to global Service push configuration.
    * @typedef {('default' | 'muted')} Channel#NotificationLevel
    */
  def this(services: ChannelServices, descriptor: ChannelDescriptor, sid: String) = this()
  /**
    * @private
    */
  var _onMessageAdded: js.Any = js.native
  var entity: js.Any = js.native
  var entityName: js.Any = js.native
  var entityPromise: js.Any = js.native
  var members: js.Any = js.native
  var membersEntity: js.Any = js.native
  var messagesEntity: js.Any = js.native
  var services: js.Any = js.native
  val sid: String = js.native
  var state: js.Any = js.native
  var statusSource: js.Any = js.native
  /**
    * Set channel status
    * @private
    */
  def _setStatus(status: Status, source: DataSource): Unit = js.native
  /**
    * If channel's status update source
    * @private
    * @return {Channels.DataSource}
    */
  def _statusSource(): DataSource = js.native
  /**
    * The Channel's last message's information.
    * @typedef {Object} Channel#LastMessage
    * @property {Number} index - Message's index
    * @property {Date} timestamp - Message's creation timestamp
    */
  /**
    * Load and Subscribe to this Channel and do not subscribe to its Members and Messages.
    * This or _subscribeStreams will need to be called before any events on Channel will fire.
    * @returns {Promise}
    * @private
    */
  def _subscribe(): js.Promise[_] = js.native
  /**
    * Load the attributes of this Channel and instantiate its Members and Messages.
    * This or _subscribe will need to be called before any events on Channel will fire.
    * This will need to be called before any events on Members or Messages will fire
    * @returns {Promise}
    * @private
    */
  def _subscribeStreams(): js.Promise[Unit] = js.native
  /**
    * Stop listening for and firing events on this Channel.
    * @returns {Promise}
    * @private
    */
  def _unsubscribe(): js.Promise[js.Tuple2[Unit, _]] = js.native
  /**
    * Updates local channel object with new values
    * @private
    */
  def _update(update: js.Any): Unit = js.native
  /**
    * Add a participant to the Channel by its Identity.
    * @param {String} identity - Identity of the Client to add
    * @returns {Promise<void|Error|SessionError>}
    */
  def add(identity: String): js.Promise[js.Object] = js.native
  /**
    * Advance last consumed Channel's Message index to current consumption horizon.
    * Rejects if User is not Member of Channel.
    * Last consumed Message index is updated only if new index value is higher than previous.
    * @param {Number} index - Message index to advance to as last read
    * @returns {Promise<number|Error|SessionError>} resulting unread messages count in the channel
    */
  def advanceLastConsumedMessageIndex(index: Double): js.Promise[Double] = js.native
  def attributes(): js.Object = js.native
  def createdBy(): String = js.native
  def dateCreated(): js.Any = js.native
  def dateUpdated(): js.Any = js.native
  /**
    * Decline an invitation to the Channel and unsubscribe from its events.
    * @returns {Promise<Channel|SessionError>}
    */
  def decline(): js.Promise[Channel] = js.native
  /**
    * Delete the Channel and unsubscribe from its events.
    * @returns {Promise<Channel|SessionError>}
    */
  def delete(): js.Promise[Channel] = js.native
  def friendlyName(): String = js.native
  /**
    * Get the custom attributes of this Channel.<br/>
    *
    * <i>NOTE: {@link Channel}'s <code>attributes</code> property will be empty for public channels until this function is called.</i>
    * @returns {Promise<Object>}
    */
  def getAttributes(): js.Promise[js.Object] = js.native
  /**
    * Get a Member by its identity.
    * @param {String} identity - Member identity
    * @returns {Promise<Member>}
    */
  def getMemberByIdentity(identity: String): js.Promise[Member] = js.native
  /**
    * Get a Member by its SID.
    * @param {String} memberSid - Member sid
    * @returns {Promise<Member>}
    */
  def getMemberBySid(memberSid: String): js.Promise[Member] = js.native
  /**
    * Get a list of all Members joined to this Channel.
    * @returns {Promise<Array<Member>>}
    */
  def getMembers(): js.Promise[js.Array[Member]] = js.native
  /**
    * Get channel members count.
    * <br/>
    * This method is semi-realtime. This means that this data will be eventually correct,
    * but will also possibly be incorrect for a few seconds. The Chat system does not
    * provide real time events for counter values changes.
    * <br/>
    * So this is quite useful for any UI badges, but is not recommended
    * to build any core application logic based on these counters being accurate in real time.
    * @returns {Promise<number|Error>}
    */
  def getMembersCount(): js.Promise[Double] = js.native
  /**
    * Returns messages from channel using paginator interface.
    * @param {Number} [pageSize=30] Number of messages to return in single chunk
    * @param {Number} [anchor] - Index of newest Message to fetch. From the end by default
    * @param {String} [direction=backwards] - Query direction. By default it query backwards
    *                                         from newer to older. 'forward' will query in opposite direction
    * @returns {Promise<Paginator<Message>>} page of messages
    */
  def getMessages(): js.Promise[Paginator[Message]] = js.native
  def getMessages(pageSize: Double): js.Promise[Paginator[Message]] = js.native
  def getMessages(pageSize: Double, anchor: Double): js.Promise[Paginator[Message]] = js.native
  def getMessages(pageSize: Double, anchor: Double, direction: String): js.Promise[Paginator[Message]] = js.native
  /**
    * Get total message count in a channel.
    * <br/>
    * This method is semi-realtime. This means that this data will be eventually correct,
    * but will also possibly be incorrect for a few seconds. The Chat system does not
    * provide real time events for counter values changes.
    * <br/>
    * So this is quite useful for any UI badges, but is not recommended
    * to build any core application logic based on these counters being accurate in real time.
    * @returns {Promise<number|Error>}
    */
  def getMessagesCount(): js.Promise[Double] = js.native
  /**
    * Get unconsumed messages count for User if he is Member of this Channel.
    * Rejects if User is not Member of Channel.
    * <br/>
    * This method is semi-realtime. This means that this data will be eventually correct,
    * but will also possibly be incorrect for a few seconds. The Chat system does not
    * provide real time events for counter values changes.
    * <br/>
    * So this is quite useful for any “unread messages count” badges, but is not recommended
    * to build any core application logic based on these counters being accurate in real time.
    * @returns {Promise<number|Error>}
    */
  def getUnconsumedMessagesCount(): js.Promise[Double] = js.native
  /**
    * Gets User Descriptors for this channel.
    * @returns {Promise<Paginator<UserDescriptor>>}
    */
  def getUserDescriptors(): js.Promise[Paginator[UserDescriptor]] = js.native
  /**
    * Invite a user to the Channel by their Identity.
    * @param {String} identity - Identity of the user to invite
    * @returns {Promise<void|Error|SessionError>}
    */
  def invite(identity: String): js.Promise[Unit] = js.native
  def isPrivate(): Boolean = js.native
  /**
    * Join the Channel and subscribe to its events.
    * @returns {Promise<Channel|SessionError>}
    */
  def join(): js.Promise[Channel] = js.native
  def lastConsumedMessageIndex(): Double = js.native
  def lastMessage(): LastMessage = js.native
  /**
    * Leave the Channel.
    * @returns {Promise<Channel|SessionError>}
    */
  def leave(): js.Promise[Channel] = js.native
  def notificationLevel(): NotificationLevel = js.native
  /**
    * Remove a Member from the Channel.
    * @param {String} member - identity of member to remove
    * @returns {Promise<void|Error|SessionError>}
    */
  def removeMember(member: js.Any): js.Promise[Unit] = js.native
  /**
    * Send a Message in the Channel.
    * @param {String | FormData | Channel#SendMediaOptions} message - The message body for text message,
    * FormData or MediaOptions for media content. Sending FormData supported only with browser engine
    * @param {Object} messageAttributes - attributes for the message
    * @returns {Promise<number|Error|SessionError>} new Message's index in the Channel's messages list
    */
  def sendMessage(message: String): js.Promise[Double] = js.native
  def sendMessage(message: String, messageAttributes: js.Object): js.Promise[Double] = js.native
  def sendMessage(message: FormData): js.Promise[Double] = js.native
  def sendMessage(message: FormData, messageAttributes: js.Object): js.Promise[Double] = js.native
  def sendMessage(message: SendMediaOptions): js.Promise[Double] = js.native
  def sendMessage(message: SendMediaOptions, messageAttributes: js.Object): js.Promise[Double] = js.native
  /**
    * Set last consumed Channel's Message index to last known Message's index in this Channel.
    * @returns {Promise<number|SessionError>} resulting unread messages count in the channel
    */
  def setAllMessagesConsumed(): js.Promise[Double] = js.native
  /**
    * Set all messages in the channel unread.
    * @returns {Promise<number|SessionError>} resulting unread messages count in the channel
    */
  def setNoMessagesConsumed(): js.Promise[Double] = js.native
  /**
    * Set User Notification level for this channel.
    * @param {Channel#NotificationLevel} notificationLevel - The new user notification level
    * @returns {Promise<void|Error|SessionError>}
    */
  def setUserNotificationLevel(notificationLevel: NotificationLevel): js.Promise[Unit] = js.native
  def status(): Status = js.native
  def `type`(): Type = js.native
  /**
    * Send a notification to the server indicating that this Client is currently typing in this Channel.
    * Typing ended notification is sent after a while automatically, but by calling again this method you ensure typing ended is not received.
    * @returns {Promise<void|SessionError>}
    */
  def typing(): js.Any = js.native
  def uniqueName(): String = js.native
  /**
    * Update the Channel's attributes.
    * @param {Object} attributes - The new attributes object
    * @returns {Promise<Channel|Error|SessionError>}
    */
  def updateAttributes(attributes: js.Object): js.Promise[this.type] = js.native
  /**
    * Update the Channel's friendlyName.
    * @param {String} name - The new Channel friendlyName
    * @returns {Promise<Channel|SessionError>}
    */
  def updateFriendlyName(name: String): js.Promise[this.type] = js.native
  /**
    * Set last consumed Channel's Message index to current consumption horizon.
    * @param {Number|null} index - Message index to set as last read.
    * If null provided, then the behavior is identical to {@link Channel#setNoMessagesConsumed}
    * @returns {Promise<number|Error|SessionError>} resulting unread messages count in the channel
    */
  def updateLastConsumedMessageIndex(index: Double): js.Promise[Double] = js.native
  /**
    * Update the Channel's unique name.
    * @param {String} uniqueName - The new Channel uniqueName
    * @returns {Promise<Channel|SessionError>}
    */
  def updateUniqueName(uniqueName: String): js.Promise[Channel] = js.native
}

