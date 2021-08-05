package typings.twilioChat

import typings.node.eventsMod.EventEmitter
import typings.std.Date
import typings.std.Error
import typings.twilioChat.channelMod.Channel
import typings.twilioChat.mediaMod.Media
import typings.twilioChat.memberMod.Member
import typings.twilioChat.messageMod.Message.Type
import typings.twilioChat.sessionMod.Session
import typings.twilioChat.sessionerrorMod.SessionError
import typings.twilioMcsClient.mod.McsClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  /**
    * @classdesc A Message represents a Message in a Channel.
    * @property {String} author - The name of the user that sent Message
    * @property {String} body - The body of the Message. Is null if Message is Media Message
    * @property {any} attributes - Message custom attributes
    * @property {Channel} channel - Channel Message belongs to
    * @property {Date} dateCreated - When Message was created
    * @property {Date} dateUpdated - When Message was updated
    * @property {Number} index - Index of Message in the Channel's messages list
    * @property {String} lastUpdatedBy - Identity of the last user that updated Message
    * @property {Media} media - Contains Media information (if present)
    * @property {String} memberSid - Authoring Member's server-assigned unique identifier
    * @property {String} sid - The server-assigned unique identifier for Message
    * @property {'text' | 'media' } type - Type of message: 'text' or 'media'
    * @fires Message#updated
    */
  @JSImport("twilio-chat/lib/message", "Message")
  @js.native
  class Message protected () extends EventEmitter {
    /**
      * The update reason for <code>updated</code> event emitted on Message
      * @typedef {('body' | 'lastUpdatedBy' | 'dateCreated' | 'dateUpdated' | 'attributes' | 'author')} Message#UpdateReason
      */
    def this(channel: Channel, services: MessageServices, index: Double, data: js.Any) = this()
    
    def _update(data: js.Any): Unit = js.native
    
    def attributes: js.Object = js.native
    
    def author: String = js.native
    
    def body: String = js.native
    
    val channel: Channel = js.native
    
    def dateCreated: Date = js.native
    
    def dateUpdated: Date = js.native
    
    /**
      * Get Member who is author of the Message
      * @returns {Promise<Member>}
      */
    def getMember(): js.Promise[Member] = js.native
    
    def index: Double = js.native
    
    def lastUpdatedBy: String = js.native
    
    def media: Media = js.native
    
    def memberSid: String = js.native
    
    /**
      * Remove the Message.
      * @returns {Promise<Message|SessionError>}
      */
    def remove(): js.Promise[Message | SessionError] = js.native
    
    /* private */ var services: js.Any = js.native
    
    def sid: String = js.native
    
    /* private */ var state: js.Any = js.native
    
    def `type`: Type = js.native
    
    /**
      * Edit message attributes.
      * @param {any} attributes new attributes for Message.
      * @returns {Promise<Message|Error|SessionError>}
      */
    def updateAttributes(attributes: js.Any): js.Promise[this.type] = js.native
    
    /**
      * Edit message body.
      * @param {String} body - new body of Message.
      * @returns {Promise<Message|Error|SessionError>}
      */
    def updateBody(body: String): js.Promise[Message | Error | SessionError] = js.native
  }
  object Message {
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.text
      - typings.twilioChat.twilioChatStrings.media
    */
    trait Type extends StObject
    object Type {
      
      inline def media: typings.twilioChat.twilioChatStrings.media = "media".asInstanceOf[typings.twilioChat.twilioChatStrings.media]
      
      inline def text: typings.twilioChat.twilioChatStrings.text = "text".asInstanceOf[typings.twilioChat.twilioChatStrings.text]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.body
      - typings.twilioChat.twilioChatStrings.lastUpdatedBy
      - typings.twilioChat.twilioChatStrings.dateCreated
      - typings.twilioChat.twilioChatStrings.dateUpdated
      - typings.twilioChat.twilioChatStrings.attributes
      - typings.twilioChat.twilioChatStrings.author
    */
    trait UpdateReason extends StObject
    object UpdateReason {
      
      inline def attributes: typings.twilioChat.twilioChatStrings.attributes = "attributes".asInstanceOf[typings.twilioChat.twilioChatStrings.attributes]
      
      inline def author: typings.twilioChat.twilioChatStrings.author = "author".asInstanceOf[typings.twilioChat.twilioChatStrings.author]
      
      inline def body: typings.twilioChat.twilioChatStrings.body = "body".asInstanceOf[typings.twilioChat.twilioChatStrings.body]
      
      inline def dateCreated: typings.twilioChat.twilioChatStrings.dateCreated = "dateCreated".asInstanceOf[typings.twilioChat.twilioChatStrings.dateCreated]
      
      inline def dateUpdated: typings.twilioChat.twilioChatStrings.dateUpdated = "dateUpdated".asInstanceOf[typings.twilioChat.twilioChatStrings.dateUpdated]
      
      inline def lastUpdatedBy: typings.twilioChat.twilioChatStrings.lastUpdatedBy = "lastUpdatedBy".asInstanceOf[typings.twilioChat.twilioChatStrings.lastUpdatedBy]
    }
    
    trait UpdatedEventArgs extends StObject {
      
      var message: Message
      
      var updateReasons: js.Array[UpdateReason]
    }
    object UpdatedEventArgs {
      
      inline def apply(message: Message, updateReasons: js.Array[UpdateReason]): UpdatedEventArgs = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], updateReasons = updateReasons.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdatedEventArgs]
      }
      
      extension [Self <: UpdatedEventArgs](x: Self) {
        
        inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setUpdateReasons(value: js.Array[UpdateReason]): Self = StObject.set(x, "updateReasons", value.asInstanceOf[js.Any])
        
        inline def setUpdateReasonsVarargs(value: UpdateReason*): Self = StObject.set(x, "updateReasons", js.Array(value :_*))
      }
    }
  }
  
  trait MessageServices extends StObject {
    
    var mcsClient: McsClient
    
    var session: Session
  }
  object MessageServices {
    
    inline def apply(mcsClient: McsClient, session: Session): MessageServices = {
      val __obj = js.Dynamic.literal(mcsClient = mcsClient.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageServices]
    }
    
    extension [Self <: MessageServices](x: Self) {
      
      inline def setMcsClient(value: McsClient): Self = StObject.set(x, "mcsClient", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
}
