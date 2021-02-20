package typings.twilioChat

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Date
import typings.std.FormData
import typings.twilioChat.anon.Current
import typings.twilioChat.channelMod.Channel.LastMessage
import typings.twilioChat.channelMod.Channel.NotificationLevel
import typings.twilioChat.channelMod.Channel.SendMediaOptions
import typings.twilioChat.channelMod.Channel.State
import typings.twilioChat.channelMod.Channel.Status
import typings.twilioChat.channelMod.Channel.Type
import typings.twilioChat.channelsMod.Channels.DataSource
import typings.twilioChat.consumptionhorizonMod.ConsumptionHorizon
import typings.twilioChat.memberMod.Member
import typings.twilioChat.messageMod.Message
import typings.twilioChat.networkMod.Network
import typings.twilioChat.paginatorMod.Paginator
import typings.twilioChat.sessionMod.Session
import typings.twilioChat.typingindicatorMod.TypingIndicator
import typings.twilioChat.userdescriptorMod.UserDescriptor
import typings.twilioChat.usersMod.Users
import typings.twilioMcsClient.mod.McsClient
import typings.twilioSync.mod.SyncClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMod {
  
  /**
    * @classdesc A Channel represents a remote channel of communication between multiple Programmable Chat Clients
    * @property {any} attributes - The Channel's custom attributes
    * @property {String} createdBy - The identity of the User that created this Channel
    * @property {Date} dateCreated - The Date this Channel was created
    * @property {Date} dateUpdated - The Date this Channel was last updated
    * @property {String} friendlyName - The Channel's name
    * @property {Boolean} isPrivate - Whether the channel is private (as opposed to public)
    * @property {Number} lastConsumedMessageIndex - Index of the last Message the User has consumed in this Channel
    * @property {Channel#LastMessage} lastMessage - Last Message sent to this Channel
    * @property {Channel#NotificationLevel} notificationLevel - User Notification level for this Channel
    * @property {String} sid - The Channel's unique system identifier
    * @property {Channel#State} state - The Channel's state
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
  class Channel protected () extends EventEmitter {
    /**
      * These options can be passed to {@link Channel#sendMessage}.
      * @typedef {Object} Channel#SendMediaOptions
      * @property {String} contentType - content type of media
      * @property {String | Buffer} media - content to post
      */
    /**
      * The update reason for <code>updated</code> event emitted on Channel
      * @typedef {('attributes' | 'createdBy' | 'dateCreated' | 'dateUpdated' |
      'friendlyName' | 'lastConsumedMessageIndex' | 'state' | 'status' | 'uniqueName' | 'lastMessage' |
      'notificationLevel' )} Channel#UpdateReason
      */
    /**
      * The status of the Channel, relative to the Client: whether the Channel
      * is <code>notParticipating</code> to local Client, Client is <code>invited</code> to or
      * is <code>joined</code> to this Channel
      * @typedef {('unknown' | 'notParticipating' | 'invited' | 'joined')} Channel#Status
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
    /**
      * The Channel's state. Set to undefined if the channel is not a conversation.
      * @typedef {Object | undefined} Channel#State
      * @property {('active' | 'inactive' | 'closed')} current - the current state
      * @property {Date} dateUpdated - date at which the latest channel state update happened
      */
    def this(services: ChannelServices, descriptor: ChannelDescriptor, sid: String) = this()
    
    /**
      * @private
      */
    var _onMessageAdded: js.Any = js.native
    
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
      * @property {Date} dateCreated - Message's creation date
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
    
    def attributes: js.Object = js.native
    
    var channelState: js.Any = js.native
    
    def createdBy: String = js.native
    
    def dateCreated: js.Any = js.native
    
    def dateUpdated: js.Any = js.native
    
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
    
    var entity: js.Any = js.native
    
    var entityName: js.Any = js.native
    
    var entityPromise: js.Any = js.native
    
    def friendlyName: String = js.native
    
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
    def getMessages(pageSize: js.UndefOr[scala.Nothing], anchor: js.UndefOr[scala.Nothing], direction: String): js.Promise[Paginator[Message]] = js.native
    def getMessages(pageSize: js.UndefOr[scala.Nothing], anchor: Double): js.Promise[Paginator[Message]] = js.native
    def getMessages(pageSize: js.UndefOr[scala.Nothing], anchor: Double, direction: String): js.Promise[Paginator[Message]] = js.native
    def getMessages(pageSize: Double): js.Promise[Paginator[Message]] = js.native
    def getMessages(pageSize: Double, anchor: js.UndefOr[scala.Nothing], direction: String): js.Promise[Paginator[Message]] = js.native
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
    
    def isPrivate: Boolean = js.native
    
    /**
      * Join the Channel and subscribe to its events.
      * @returns {Promise<Channel|SessionError>}
      */
    def join(): js.Promise[Channel] = js.native
    
    def lastConsumedMessageIndex: Double = js.native
    
    def lastMessage: LastMessage = js.native
    
    /**
      * Leave the Channel.
      * @returns {Promise<Channel|SessionError>}
      */
    def leave(): js.Promise[Channel] = js.native
    
    var members: js.Any = js.native
    
    var membersEntity: js.Any = js.native
    
    var messagesEntity: js.Any = js.native
    
    def notificationLevel: NotificationLevel = js.native
    
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
      * @param {any} messageAttributes - attributes for the message
      * @returns {Promise<number|Error|SessionError>} new Message's index in the Channel's messages list
      */
    def sendMessage(message: String): js.Promise[Double] = js.native
    def sendMessage(message: String, messageAttributes: js.Any): js.Promise[Double] = js.native
    def sendMessage(message: FormData): js.Promise[Double] = js.native
    def sendMessage(message: FormData, messageAttributes: js.Any): js.Promise[Double] = js.native
    def sendMessage(message: SendMediaOptions): js.Promise[Double] = js.native
    def sendMessage(message: SendMediaOptions, messageAttributes: js.Any): js.Promise[Double] = js.native
    
    var services: js.Any = js.native
    
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
    
    val sid: String = js.native
    
    def state: State = js.native
    
    def status: Status = js.native
    
    var statusSource: js.Any = js.native
    
    def `type`: Type = js.native
    
    /**
      * Send a notification to the server indicating that this Client is currently typing in this Channel.
      * Typing ended notification is sent after a while automatically, but by calling again this method you ensure typing ended is not received.
      * @returns {Promise<void|SessionError>}
      */
    def typing(): js.Any = js.native
    
    def uniqueName: String = js.native
    
    /**
      * Update the Channel's attributes.
      * @param {any} attributes new attributes for Channel.
      * @returns {Promise<Channel|Error|SessionError>}
      */
    def updateAttributes(attributes: js.Any): js.Promise[this.type] = js.native
    
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
  object Channel {
    
    @JSImport("twilio-chat/lib/channel", "Channel")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("twilio-chat/lib/channel", "Channel.preprocessUpdate")
    @js.native
    def preprocessUpdate: js.Any = js.native
    @scala.inline
    def preprocessUpdate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preprocessUpdate")(x.asInstanceOf[js.Any])
    
    @js.native
    trait LastMessage extends StObject {
      
      var dateCreated: js.UndefOr[Date] = js.native
      
      var index: js.UndefOr[Double] = js.native
    }
    object LastMessage {
      
      @scala.inline
      def apply(): LastMessage = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LastMessage]
      }
      
      @scala.inline
      implicit class LastMessageMutableBuilder[Self <: LastMessage] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDateCreated(value: Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.default
      - typings.twilioChat.twilioChatStrings.muted
    */
    trait NotificationLevel extends StObject
    object NotificationLevel {
      
      @scala.inline
      def default: typings.twilioChat.twilioChatStrings.default = "default".asInstanceOf[typings.twilioChat.twilioChatStrings.default]
      
      @scala.inline
      def muted: typings.twilioChat.twilioChatStrings.muted = "muted".asInstanceOf[typings.twilioChat.twilioChatStrings.muted]
    }
    
    @js.native
    trait SendMediaOptions extends StObject {
      
      var contentType: String = js.native
      
      var media: String | Buffer = js.native
    }
    object SendMediaOptions {
      
      @scala.inline
      def apply(contentType: String, media: String | Buffer): SendMediaOptions = {
        val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
        __obj.asInstanceOf[SendMediaOptions]
      }
      
      @scala.inline
      implicit class SendMediaOptionsMutableBuilder[Self <: SendMediaOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMedia(value: String | Buffer): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      }
    }
    
    type State = js.UndefOr[Current]
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.unknown
      - typings.twilioChat.twilioChatStrings.notParticipating
      - typings.twilioChat.twilioChatStrings.invited
      - typings.twilioChat.twilioChatStrings.joined
    */
    trait Status extends StObject
    object Status {
      
      @scala.inline
      def invited: typings.twilioChat.twilioChatStrings.invited = "invited".asInstanceOf[typings.twilioChat.twilioChatStrings.invited]
      
      @scala.inline
      def joined: typings.twilioChat.twilioChatStrings.joined = "joined".asInstanceOf[typings.twilioChat.twilioChatStrings.joined]
      
      @scala.inline
      def notParticipating: typings.twilioChat.twilioChatStrings.notParticipating = "notParticipating".asInstanceOf[typings.twilioChat.twilioChatStrings.notParticipating]
      
      @scala.inline
      def unknown: typings.twilioChat.twilioChatStrings.unknown = "unknown".asInstanceOf[typings.twilioChat.twilioChatStrings.unknown]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.public
      - typings.twilioChat.twilioChatStrings.`private`
    */
    trait Type extends StObject
    object Type {
      
      @scala.inline
      def `private`: typings.twilioChat.twilioChatStrings.`private` = "private".asInstanceOf[typings.twilioChat.twilioChatStrings.`private`]
      
      @scala.inline
      def public: typings.twilioChat.twilioChatStrings.public = "public".asInstanceOf[typings.twilioChat.twilioChatStrings.public]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.attributes
      - typings.twilioChat.twilioChatStrings.createdBy
      - typings.twilioChat.twilioChatStrings.dateCreated
      - typings.twilioChat.twilioChatStrings.dateUpdated
      - typings.twilioChat.twilioChatStrings.friendlyName
      - typings.twilioChat.twilioChatStrings.lastConsumedMessageIndex
      - typings.twilioChat.twilioChatStrings.state
      - typings.twilioChat.twilioChatStrings.status
      - typings.twilioChat.twilioChatStrings.uniqueName
      - typings.twilioChat.twilioChatStrings.lastMessage
      - typings.twilioChat.twilioChatStrings.notificationLevel
    */
    trait UpdateReason extends StObject
    object UpdateReason {
      
      @scala.inline
      def attributes: typings.twilioChat.twilioChatStrings.attributes = "attributes".asInstanceOf[typings.twilioChat.twilioChatStrings.attributes]
      
      @scala.inline
      def createdBy: typings.twilioChat.twilioChatStrings.createdBy = "createdBy".asInstanceOf[typings.twilioChat.twilioChatStrings.createdBy]
      
      @scala.inline
      def dateCreated: typings.twilioChat.twilioChatStrings.dateCreated = "dateCreated".asInstanceOf[typings.twilioChat.twilioChatStrings.dateCreated]
      
      @scala.inline
      def dateUpdated: typings.twilioChat.twilioChatStrings.dateUpdated = "dateUpdated".asInstanceOf[typings.twilioChat.twilioChatStrings.dateUpdated]
      
      @scala.inline
      def friendlyName: typings.twilioChat.twilioChatStrings.friendlyName = "friendlyName".asInstanceOf[typings.twilioChat.twilioChatStrings.friendlyName]
      
      @scala.inline
      def lastConsumedMessageIndex: typings.twilioChat.twilioChatStrings.lastConsumedMessageIndex = "lastConsumedMessageIndex".asInstanceOf[typings.twilioChat.twilioChatStrings.lastConsumedMessageIndex]
      
      @scala.inline
      def lastMessage: typings.twilioChat.twilioChatStrings.lastMessage = "lastMessage".asInstanceOf[typings.twilioChat.twilioChatStrings.lastMessage]
      
      @scala.inline
      def notificationLevel: typings.twilioChat.twilioChatStrings.notificationLevel = "notificationLevel".asInstanceOf[typings.twilioChat.twilioChatStrings.notificationLevel]
      
      @scala.inline
      def state: typings.twilioChat.twilioChatStrings.state = "state".asInstanceOf[typings.twilioChat.twilioChatStrings.state]
      
      @scala.inline
      def status: typings.twilioChat.twilioChatStrings.status = "status".asInstanceOf[typings.twilioChat.twilioChatStrings.status]
      
      @scala.inline
      def uniqueName: typings.twilioChat.twilioChatStrings.uniqueName = "uniqueName".asInstanceOf[typings.twilioChat.twilioChatStrings.uniqueName]
    }
    
    @js.native
    trait UpdatedEventArgs extends StObject {
      
      var channel: Channel = js.native
      
      var updateReasons: js.Array[UpdateReason] = js.native
    }
    object UpdatedEventArgs {
      
      @scala.inline
      def apply(channel: Channel, updateReasons: js.Array[UpdateReason]): UpdatedEventArgs = {
        val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], updateReasons = updateReasons.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdatedEventArgs]
      }
      
      @scala.inline
      implicit class UpdatedEventArgsMutableBuilder[Self <: UpdatedEventArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateReasons(value: js.Array[UpdateReason]): Self = StObject.set(x, "updateReasons", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateReasonsVarargs(value: UpdateReason*): Self = StObject.set(x, "updateReasons", js.Array(value :_*))
      }
    }
  }
  
  @js.native
  trait ChannelDescriptor extends StObject {
    
    var attributes: js.Any = js.native
    
    var channel: String = js.native
    
    var createdBy: js.UndefOr[String] = js.native
    
    var dateCreated: js.Any = js.native
    
    var dateUpdated: js.Any = js.native
    
    var entityName: String = js.native
    
    var friendlyName: String = js.native
    
    var lastConsumedMessageIndex: Double = js.native
    
    var notificationLevel: js.UndefOr[NotificationLevel] = js.native
    
    var `type`: Type = js.native
    
    var uniqueName: String = js.native
  }
  object ChannelDescriptor {
    
    @scala.inline
    def apply(
      attributes: js.Any,
      channel: String,
      dateCreated: js.Any,
      dateUpdated: js.Any,
      entityName: String,
      friendlyName: String,
      lastConsumedMessageIndex: Double,
      `type`: Type,
      uniqueName: String
    ): ChannelDescriptor = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], entityName = entityName.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], lastConsumedMessageIndex = lastConsumedMessageIndex.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelDescriptor]
    }
    
    @scala.inline
    implicit class ChannelDescriptorMutableBuilder[Self <: ChannelDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
      
      @scala.inline
      def setDateCreated(value: js.Any): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUpdated(value: js.Any): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastConsumedMessageIndex(value: Double): Self = StObject.set(x, "lastConsumedMessageIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationLevel(value: NotificationLevel): Self = StObject.set(x, "notificationLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationLevelUndefined: Self = StObject.set(x, "notificationLevel", js.undefined)
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ChannelServices extends StObject {
    
    var consumptionHorizon: ConsumptionHorizon = js.native
    
    var mcsClient: McsClient = js.native
    
    var network: Network = js.native
    
    var session: Session = js.native
    
    var syncClient: SyncClient = js.native
    
    var typingIndicator: TypingIndicator = js.native
    
    var users: Users = js.native
  }
  object ChannelServices {
    
    @scala.inline
    def apply(
      consumptionHorizon: ConsumptionHorizon,
      mcsClient: McsClient,
      network: Network,
      session: Session,
      syncClient: SyncClient,
      typingIndicator: TypingIndicator,
      users: Users
    ): ChannelServices = {
      val __obj = js.Dynamic.literal(consumptionHorizon = consumptionHorizon.asInstanceOf[js.Any], mcsClient = mcsClient.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any], typingIndicator = typingIndicator.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelServices]
    }
    
    @scala.inline
    implicit class ChannelServicesMutableBuilder[Self <: ChannelServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumptionHorizon(value: ConsumptionHorizon): Self = StObject.set(x, "consumptionHorizon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMcsClient(value: McsClient): Self = StObject.set(x, "mcsClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncClient(value: SyncClient): Self = StObject.set(x, "syncClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypingIndicator(value: TypingIndicator): Self = StObject.set(x, "typingIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: Users): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
