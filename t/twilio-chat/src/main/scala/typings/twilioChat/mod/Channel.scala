package typings.twilioChat.mod

import typings.std.FormData
import typings.twilioChat.mod.Channels.DataSource
import typings.twilioChat.twilioChatStrings.backwards
import typings.twilioChat.twilioChatStrings.forward
import typings.twilioReplayEventEmitter.mod.ReplayEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A channel represents a remote channel of communication between multiple Programmable Chat clients.
  */
@JSImport("twilio-chat", "Channel")
@js.native
open class Channel protected () extends ReplayEventEmitter[ChannelEvents] {
  /**
    * @internal
    */
  def this(
    descriptor: ChannelDescriptor,
    sid: String,
    links: ChannelLinks,
    configuration: Configuration,
    services: ChannelServices
  ) = this()
  
  /**
    * @internal
    */
  /* private */ var _onMessageAdded: Any = js.native
  
  /* private */ var _setLastConsumedMessageIndex: Any = js.native
  
  /**
    * Set channel status.
    * @internal
    */
  def _setStatus(status: ChannelStatus, source: DataSource): Unit = js.native
  
  /**
    * Update source of the channel.
    * @internal
    */
  def _statusSource(): DataSource = js.native
  
  /**
    * Load and subscribe to this channel and do not subscribe to its members and messages.
    * This or _subscribeStreams will need to be called before any events on channel will fire.
    * @internal
    */
  def _subscribe(): js.Promise[Any] = js.native
  
  /**
    * Load the attributes of this channel and instantiate its members and messages.
    * This or _subscribe will need to be called before any events on the channel will fire.
    * This will need to be called before any events on members or messages will fire
    * @internal
    */
  /* private */ var _subscribeStreams: Any = js.native
  
  /**
    * Stop listening for and firing events on this channel.
    * @internal
    */
  /* private */ var _unsubscribe: Any = js.native
  
  /**
    * Update the local channel object with new values.
    * @internal
    */
  def _update(update: Any): Unit = js.native
  
  /**
    * Add a member to the channel by its identity.
    * @param identity Identity of the Client to add.
    */
  def add(identity: String): js.Promise[Unit] = js.native
  
  /**
    * Advance the channel's last consumed message index to the current read horizon.
    * Rejects if the user is not a member of the channel.
    * Last consumed message index is updated only if the new index value is higher than the previous.
    * @param index Message index to advance to.
    * @return Resulting unread messages count in the channel.
    */
  def advanceLastConsumedMessageIndex(index: Double): js.Promise[Double] = js.native
  
  /**
    * Custom attributes of the channel.
    */
  def attributes: js.Object = js.native
  
  /* private */ val channelState: Any = js.native
  
  /* private */ val configuration: Any = js.native
  
  /**
    * Identity of the user that created this channel.
    */
  def createdBy: String = js.native
  
  /**
    * Date this channel was created on.
    */
  def dateCreated: Any = js.native
  
  /**
    * Date this channel was last updated on.
    */
  def dateUpdated: Any = js.native
  
  /**
    * Decline an invitation to the channel and unsubscribe from its events.
    */
  def decline(): js.Promise[Channel] = js.native
  
  /**
    * Delete the channel and unsubscribe from its events.
    */
  def delete(): js.Promise[Channel] = js.native
  
  /* private */ var entity: Any = js.native
  
  /* private */ var entityName: Any = js.native
  
  /* private */ var entityPromise: Any = js.native
  
  /**
    * Name of the channel.
    */
  def friendlyName: String = js.native
  
  /**
    * Get the custom attributes of this Channel.
    *
    * *Note: {@link Channel.attributes} will be empty for public channels until this function is called.*
    */
  def getAttributes(): js.Promise[Any] = js.native
  
  /**
    * Get a member by its identity.
    * @param identity Member identity.
    */
  def getMemberByIdentity(identity: String): js.Promise[Member] = js.native
  
  /**
    * Get a member by its SID.
    * @param memberSid Member SID.
    */
  def getMemberBySid(memberSid: String): js.Promise[Member] = js.native
  
  /**
    * Get a list of all the members who are joined to this channel.
    */
  def getMembers(): js.Promise[js.Array[Member]] = js.native
  
  /**
    * Get channel members count.
    *
    * This method is semi-realtime. This means that this data will be eventually correct,
    * but will also be possibly incorrect for a few seconds. The Programmable Chat system does not
    * provide real time events for counter values changes.
    *
    * This is useful for any UI badges, but it is not recommended to build any core application
    * logic based on these counters being accurate in real time.
    */
  def getMembersCount(): js.Promise[Double] = js.native
  
  /**
    * Return messages from the channel using the paginator interface.
    * @param pageSize Number of messages to return in a single chunk. Default is 30.
    * @param anchor Index of the newest message to fetch. Default is from the end.
    * @param direction Query direction. By default it queries backwards
    * from newer to older. The `"forward"` value will query in the opposite direction.
    * @return A page of messages.
    */
  def getMessages(): js.Promise[Paginator[Message]] = js.native
  def getMessages(pageSize: Double): js.Promise[Paginator[Message]] = js.native
  def getMessages(pageSize: Double, anchor: Double): js.Promise[Paginator[Message]] = js.native
  def getMessages(pageSize: Double, anchor: Double, direction: backwards | forward): js.Promise[Paginator[Message]] = js.native
  def getMessages(pageSize: Double, anchor: Unit, direction: backwards | forward): js.Promise[Paginator[Message]] = js.native
  def getMessages(pageSize: Unit, anchor: Double): js.Promise[Paginator[Message]] = js.native
  def getMessages(pageSize: Unit, anchor: Double, direction: backwards | forward): js.Promise[Paginator[Message]] = js.native
  def getMessages(pageSize: Unit, anchor: Unit, direction: backwards | forward): js.Promise[Paginator[Message]] = js.native
  
  /**
    * Get the total message count in the channel.
    *
    * This method is semi-realtime. This means that this data will be eventually correct,
    * but will also be possibly incorrect for a few seconds. The Programmable Chat system does not
    * provide real time events for counter values changes.
    *
    * This is useful for any UI badges, but it is not recommended to build any core application
    * logic based on these counters being accurate in real time.
    */
  def getMessagesCount(): js.Promise[Double] = js.native
  
  /**
    * Get unread messages count for the user if they are a member of this channel.
    * Rejects if the user is not a member of the channel.
    *
    * Use this method to obtain the number of unread messages together with
    * {@link Channel.updateLastConsumedMessageIndex} instead of relying on the
    * message indices which may have gaps. See {@link Message.index} for details.
    *
    * This method is semi-realtime. This means that this data will be eventually correct,
    * but will also be possibly incorrect for a few seconds. The Programmable Chat system does not
    * provide real time events for counter values changes.
    *
    * This is useful for any UI badges, but it is not recommended to build any core application
    * logic based on these counters being accurate in real time.
    */
  def getUnconsumedMessagesCount(): js.Promise[Double | Null] = js.native
  
  /**
    * Get user descriptors of this channel.
    */
  def getUserDescriptors(): js.Promise[Paginator[UserDescriptor]] = js.native
  
  /**
    * Invite a user to the channel by their identity.
    * @param identity Identity of the user.
    */
  def invite(identity: String): js.Promise[Unit] = js.native
  
  /**
    * Signifies whether the channel is private.
    */
  def isPrivate: Boolean = js.native
  
  /**
    * Join the channel and subscribe to its events.
    */
  def join(): js.Promise[Channel] = js.native
  
  /**
    * Index of the last message the user has read in this channel.
    */
  def lastConsumedMessageIndex: Double | Null = js.native
  
  /**
    * Last message sent to this channel.
    */
  def lastMessage: LastMessage = js.native
  
  /**
    * Leave the channel.
    */
  def leave(): js.Promise[Channel] = js.native
  
  val links: ChannelLinks = js.native
  
  /* private */ val members: Any = js.native
  
  /* private */ var membersEntity: Any = js.native
  
  /* private */ var messagesEntity: Any = js.native
  
  /**
    * User notification level for this channel.
    */
  def notificationLevel: NotificationLevel = js.native
  
  /**
    * Remove a member from the channel. When a string is passed as the argument, it will assume that the string is an identity.
    * @param member Identity or the member object to remove.
    */
  def removeMember(member: String): js.Promise[Unit] = js.native
  def removeMember(member: Member): js.Promise[Unit] = js.native
  
  /**
    * Send a message to the channel.
    * @param message Message body for the text message,
    * `FormData` or {@link Channel.MediaOptions) for media content. Sending FormData is supported only with the browser engine.
    * @param messageAttributes Attributes for the message.
    * @return Index of the new message.
    */
  def sendMessage(): js.Promise[Double] = js.native
  def sendMessage(message: String): js.Promise[Double] = js.native
  def sendMessage(message: String, messageAttributes: Any): js.Promise[Double] = js.native
  def sendMessage(message: Null, messageAttributes: Any): js.Promise[Double] = js.native
  def sendMessage(message: FormData): js.Promise[Double] = js.native
  def sendMessage(message: FormData, messageAttributes: Any): js.Promise[Double] = js.native
  def sendMessage(message: SendMediaOptions): js.Promise[Double] = js.native
  def sendMessage(message: SendMediaOptions, messageAttributes: Any): js.Promise[Double] = js.native
  
  /* private */ val services: Any = js.native
  
  /**
    * Set last consumed message index of the channel to the index of the last known message.
    * @return Resulting unread messages count in the channel.
    */
  def setAllMessagesConsumed(): js.Promise[Double] = js.native
  
  /**
    * Set all messages in the channel unread.
    * @return Resulting unread messages count in the channel.
    */
  def setNoMessagesConsumed(): js.Promise[Double] = js.native
  
  /**
    * Set user notification level for this channel.
    * @param notificationLevel New user notification level.
    */
  def setUserNotificationLevel(notificationLevel: NotificationLevel): js.Promise[Unit] = js.native
  
  /**
    * Unique system identifier of the channel.
    */
  val sid: String = js.native
  
  /**
    * State of the channel.
    */
  def state: js.UndefOr[ChannelState] = js.native
  
  /**
    * Delivery status of the channel.
    */
  def status: ChannelStatus = js.native
  
  /* private */ var statusSource: Any = js.native
  
  /**
    * MemberType of the channel.
    */
  def `type`: ChannelType0 = js.native
  
  /**
    * Send a notification to the server indicating that this client is currently typing in this channel.
    * Typing ended notification is sent after a while automatically, but by calling this method again you ensure that typing ended is not received.
    */
  def typing(): js.Promise[Unit] = js.native
  
  /**
    * Unique name of the channel.
    */
  def uniqueName: String = js.native
  
  /**
    * Update the attributes of the channel.
    * @param attributes New attributes.
    */
  def updateAttributes(attributes: Any): js.Promise[Channel] = js.native
  
  /**
    * Update the friendly name of the channel.
    * @param friendlyName New friendly name.
    */
  def updateFriendlyName(friendlyName: String): js.Promise[Channel] = js.native
  
  /**
    * Set the last consumed message index to the current read horizon.
    * @param index Message index to set as last consumed.
    * If null is provided, then the behavior is identical to {@link Channel.setNoMessagesConsumed}.
    * @returns Resulting unread messages count in the channel.
    */
  def updateLastConsumedMessageIndex(): js.Promise[Double] = js.native
  def updateLastConsumedMessageIndex(index: Double): js.Promise[Double] = js.native
  
  /**
    * Update the unique name of the channel.
    * @param uniqueName New unique name for the channel. Setting unique name to null removes it.
    */
  def updateUniqueName(): js.Promise[Channel] = js.native
  def updateUniqueName(uniqueName: String): js.Promise[Channel] = js.native
}
object Channel {
  
  @JSImport("twilio-chat", "Channel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fired when a member has joined the channel.
    *
    * Parameters:
    * 1. {@link Member} `member` - member that joined the channel
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Channel.memberJoined")
  @js.native
  val memberJoined: /* "memberJoined" */ String = js.native
  
  /**
    * Fired when a member has left the channel.
    *
    * Parameters:
    * 1. {@link Member} `member` - member that left the channel
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Channel.memberLeft")
  @js.native
  val memberLeft: /* "memberLeft" */ String = js.native
  
  /**
    * Fired when data of a member has been updated.
    *
    * Parameters:
    * 1. object `data` - info object provided with the event. It has the following properties:
    *     * {@link Member} `member` - member that has received the update
    *     * {@link MemberUpdateReason}[] `updateReasons` - array of reasons for update
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Channel.memberUpdated")
  @js.native
  val memberUpdated: /* "memberUpdated" */ String = js.native
  
  /**
    * Fired when a new message has been added to the channel.
    *
    * Parameters:
    * 1. {@link Message} `message` - message that has been added
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Channel.messageAdded")
  @js.native
  val messageAdded: /* "messageAdded" */ String = js.native
  
  /**
    * Fired when message is removed from the channel's message list.
    *
    * Parameters:
    * 1. {@link Message} `message` - message that has been removed
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Channel.messageRemoved")
  @js.native
  val messageRemoved: /* "messageRemoved" */ String = js.native
  
  /**
    * Fired when data of a message has been updated.
    *
    * Parameters:
    * 1. object `data` - info object provided with the event. It has the following properties:
    *     * {@link Message} `message` - message that has received the update
    *     * {@link MessageUpdateReason}[] `updateReasons` - array of reasons for update
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Channel.messageUpdated")
  @js.native
  val messageUpdated: /* "messageUpdated" */ String = js.native
  
  /* static member */
  @JSImport("twilio-chat", "Channel.preprocessUpdate")
  @js.native
  def preprocessUpdate: Any = js.native
  inline def preprocessUpdate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preprocessUpdate")(x.asInstanceOf[js.Any])
  
  /**
    * Fired when the channel was destroyed or the currently-logged-in user has left private channel.
    *
    * Parameters:
    * 1. {@link Channel} `channel` - channel that has been removed
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Channel.removed")
  @js.native
  val removed: /* "removed" */ String = js.native
  
  /**
    * Fired when a member has stopped typing.
    *
    * Parameters:
    * 1. {@link Member} `member` - the member that has stopped typing
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Channel.typingEnded")
  @js.native
  val typingEnded: /* "typingEnded" */ String = js.native
  
  /**
    * Fired when a member has started typing.
    *
    * Parameters:
    * 1. {@link Member} `member` - the member that has started typing
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Channel.typingStarted")
  @js.native
  val typingStarted: /* "typingStarted" */ String = js.native
  
  /**
    * Fired when the data of the message has been updated.
    *
    * Parameters:
    * 1. object `data` - info object provided with the event. It has the following properties:
    *     * {@link Channel} `channel` - channel that has received the update
    *     * {@link ChannelUpdateReason}[] `updateReasons` - array of reasons for update
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Channel.updated")
  @js.native
  val updated: /* "updated" */ String = js.native
}
