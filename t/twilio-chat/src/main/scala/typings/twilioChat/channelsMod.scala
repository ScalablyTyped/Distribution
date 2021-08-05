package typings.twilioChat

import typings.node.eventsMod.EventEmitter
import typings.std.Map
import typings.twilioChat.channelMod.ChannelDescriptor
import typings.twilioChat.channelMod.ChannelServices
import typings.twilioChat.consumptionhorizonMod.ConsumptionHorizon
import typings.twilioChat.deferredMod.Deferred
import typings.twilioChat.networkMod.Network
import typings.twilioChat.sessionMod.Session
import typings.twilioChat.synclistMod.SyncList
import typings.twilioChat.typingindicatorMod.TypingIndicator
import typings.twilioChat.usersMod.Users
import typings.twilioMcsClient.mod.McsClient
import typings.twilioSync.mod.SyncClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelsMod {
  
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
  @JSImport("twilio-chat/lib/data/channels", "Channel")
  @js.native
  class Channel protected ()
    extends typings.twilioChat.channelMod.Channel {
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
  }
  object Channel {
    
    @JSImport("twilio-chat/lib/data/channels", "Channel")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("twilio-chat/lib/data/channels", "Channel.preprocessUpdate")
    @js.native
    def preprocessUpdate: js.Any = js.native
    inline def preprocessUpdate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preprocessUpdate")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Represents channels collection
    * {@see Channel}
    */
  @JSImport("twilio-chat/lib/data/channels", "Channels")
  @js.native
  class Channels protected () extends EventEmitter {
    def this(services: ChannelsServices) = this()
    
    /* private */ var _wrapPaginator: js.Any = js.native
    
    /**
      * Add channel to server
      * @private
      * @returns {Promise<Channel|SessionError>} Channel
      */
    def addChannel(options: js.Any): js.Promise[typings.twilioChat.channelMod.Channel] = js.native
    
    val channels: Map[String, typings.twilioChat.channelMod.Channel] = js.native
    
    /**
      * Fetch channels list and instantiate all necessary objects
      */
    def fetchChannels(): Unit = js.native
    
    def getChannel(sid: String): js.Promise[typings.twilioChat.channelMod.Channel] = js.native
    
    def getChannels(args: js.Any): js.Promise[js.Any] = js.native
    
    /* private */ var getMap: js.Any = js.native
    
    /* private */ var onChannelRemoved: js.Any = js.native
    
    def pushChannel(descriptor: typings.twilioChat.channeldescriptorMod.ChannelDescriptor): js.Promise[typings.twilioChat.channelMod.Channel] = js.native
    
    /* private */ var registerForEvents: js.Any = js.native
    
    /* private */ var services: js.Any = js.native
    
    /* private */ var syncListFetched: js.Any = js.native
    
    val syncListRead: Deferred[Boolean] = js.native
    
    /* private */ val thumbstones: js.Any = js.native
    
    /* private */ var upsertChannel: js.Any = js.native
  }
  object Channels {
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.sync
      - typings.twilioChat.twilioChatStrings.chat
      - typings.twilioChat.twilioChatStrings.synclist
    */
    trait DataSource extends StObject
    object DataSource {
      
      inline def chat: typings.twilioChat.twilioChatStrings.chat = "chat".asInstanceOf[typings.twilioChat.twilioChatStrings.chat]
      
      inline def sync: typings.twilioChat.twilioChatStrings.sync = "sync".asInstanceOf[typings.twilioChat.twilioChatStrings.sync]
      
      inline def synclist: typings.twilioChat.twilioChatStrings.synclist = "synclist".asInstanceOf[typings.twilioChat.twilioChatStrings.synclist]
    }
  }
  
  trait ChannelsServices extends StObject {
    
    var consumptionHorizon: ConsumptionHorizon
    
    var mcsClient: McsClient
    
    var network: Network
    
    var session: Session
    
    var syncClient: SyncClient
    
    var syncList: SyncList
    
    var typingIndicator: TypingIndicator
    
    var users: Users
  }
  object ChannelsServices {
    
    inline def apply(
      consumptionHorizon: ConsumptionHorizon,
      mcsClient: McsClient,
      network: Network,
      session: Session,
      syncClient: SyncClient,
      syncList: SyncList,
      typingIndicator: TypingIndicator,
      users: Users
    ): ChannelsServices = {
      val __obj = js.Dynamic.literal(consumptionHorizon = consumptionHorizon.asInstanceOf[js.Any], mcsClient = mcsClient.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any], syncList = syncList.asInstanceOf[js.Any], typingIndicator = typingIndicator.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelsServices]
    }
    
    extension [Self <: ChannelsServices](x: Self) {
      
      inline def setConsumptionHorizon(value: ConsumptionHorizon): Self = StObject.set(x, "consumptionHorizon", value.asInstanceOf[js.Any])
      
      inline def setMcsClient(value: McsClient): Self = StObject.set(x, "mcsClient", value.asInstanceOf[js.Any])
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSyncClient(value: SyncClient): Self = StObject.set(x, "syncClient", value.asInstanceOf[js.Any])
      
      inline def setSyncList(value: SyncList): Self = StObject.set(x, "syncList", value.asInstanceOf[js.Any])
      
      inline def setTypingIndicator(value: TypingIndicator): Self = StObject.set(x, "typingIndicator", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: Users): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
