package typings.twilioChat

import typings.node.eventsMod.EventEmitter
import typings.std.Date
import typings.twilioChat.memberMod.Member.Type
import typings.twilioChat.sessionMod.Session
import typings.twilioChat.userMod.User
import typings.twilioChat.userdescriptorMod.UserDescriptor
import typings.twilioChat.usersMod.Users
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memberMod {
  
  /**
    * @classdesc A Member represents a remote Client in a Channel.
    * @property {any} attributes - Object with custom attributes for Member
    * @property {Channel} channel - The Channel the remote Client is a Member of
    * @property {Date} dateCreated - The Date this Member was created
    * @property {Date} dateUpdated - The Date this Member was last updated
    * @property {String} identity - The identity of the remote Client
    * @property {Boolean} isTyping - Whether or not this Member is currently typing
    * @property {Number} lastConsumedMessageIndex - Latest consumed Message index by this Member.
    * Note that just retrieving messages on a client endpoint does not mean that messages are consumed/read,
    * please consider reading about [Consumption Horizon feature]{@link https://www.twilio.com/docs/api/chat/guides/consumption-horizon}
    * to find out how to mark messages as consumed.
    * @property {Date} lastConsumptionTimestamp - Date when Member has updated his consumption horizon
    * @property {String} sid - The server-assigned unique identifier for the Member
    * @property {Member#Type} type - The type of Member
    * @fires Member#typingEnded
    * @fires Member#typingStarted
    * @fires Member#updated
    */
  @JSImport("twilio-chat/lib/member", "Member")
  @js.native
  class Member protected () extends EventEmitter {
    /**
      * The update reason for <code>updated</code> event emitted on Member
      * @typedef {('attributes' | 'dateCreated' | 'dateUpdated' | 'roleSid' |
      'lastConsumedMessageIndex' | 'lastConsumptionTimestamp')} Member#UpdateReason
      */
    /**
      * The type of Member
      * @typedef {('chat' | 'sms' | 'whatsapp')} Member#Type
      */
    def this(services: MemberServices, channel: js.Any, data: MemberDescriptor, sid: String) = this()
    
    /**
      * Private method function used to stop typing indicator (with event emitting)
      * @private
      */
    def _endTyping(): Unit = js.native
    
    /**
      * Private method used to start or reset the typing indicator timeout (with event emitting)
      * @private
      */
    def _startTyping(timeout: js.Any): this.type = js.native
    
    /**
      * Private method function used update local object's property roleSid with new value
      * @private
      */
    def _update(data: js.Any): this.type = js.native
    
    def attributes: js.Object = js.native
    
    val channel: js.Any = js.native
    
    def dateCreated: Date = js.native
    
    def dateUpdated: Date = js.native
    
    /**
      * Gets User for this member and subscribes to it. Supported only for <code>chat</code> type of Members
      * @returns {Promise<User|Error>}
      */
    def getUser(): js.Promise[User] = js.native
    
    /**
      * Gets User Descriptor for this member. Supported only for <code>chat</code> type of Members
      * @returns {Promise<UserDescriptor|Error>}
      */
    def getUserDescriptor(): js.Promise[UserDescriptor] = js.native
    
    def identity: String = js.native
    
    def isTyping: Boolean = js.native
    
    def lastConsumedMessageIndex: Double = js.native
    
    def lastConsumptionTimestamp: Date = js.native
    
    /**
      * Remove Member from the Channel.
      * @returns {Promise<void|Error|SessionError>}
      */
    def remove(): js.Promise[js.Any] = js.native
    
    def roleSid: String = js.native
    
    var services: js.Any = js.native
    
    def sid: String = js.native
    
    var state: js.Any = js.native
    
    def `type`: Type = js.native
    
    /**
      * Edit member attributes.
      * @param {any} attributes new attributes for Member.
      * @returns {Promise<Member|Error|SessionError>}
      */
    def updateAttributes(attributes: js.Any): js.Promise[this.type] = js.native
  }
  object Member {
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.chat
      - typings.twilioChat.twilioChatStrings.sms
      - typings.twilioChat.twilioChatStrings.whatsapp
    */
    trait Type extends StObject
    object Type {
      
      @scala.inline
      def chat: typings.twilioChat.twilioChatStrings.chat = "chat".asInstanceOf[typings.twilioChat.twilioChatStrings.chat]
      
      @scala.inline
      def sms: typings.twilioChat.twilioChatStrings.sms = "sms".asInstanceOf[typings.twilioChat.twilioChatStrings.sms]
      
      @scala.inline
      def whatsapp: typings.twilioChat.twilioChatStrings.whatsapp = "whatsapp".asInstanceOf[typings.twilioChat.twilioChatStrings.whatsapp]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.attributes
      - typings.twilioChat.twilioChatStrings.dateCreated
      - typings.twilioChat.twilioChatStrings.dateUpdated
      - typings.twilioChat.twilioChatStrings.roleSid
      - typings.twilioChat.twilioChatStrings.lastConsumedMessageIndex
      - typings.twilioChat.twilioChatStrings.lastConsumptionTimestamp
    */
    trait UpdateReason extends StObject
    object UpdateReason {
      
      @scala.inline
      def attributes: typings.twilioChat.twilioChatStrings.attributes = "attributes".asInstanceOf[typings.twilioChat.twilioChatStrings.attributes]
      
      @scala.inline
      def dateCreated: typings.twilioChat.twilioChatStrings.dateCreated = "dateCreated".asInstanceOf[typings.twilioChat.twilioChatStrings.dateCreated]
      
      @scala.inline
      def dateUpdated: typings.twilioChat.twilioChatStrings.dateUpdated = "dateUpdated".asInstanceOf[typings.twilioChat.twilioChatStrings.dateUpdated]
      
      @scala.inline
      def lastConsumedMessageIndex: typings.twilioChat.twilioChatStrings.lastConsumedMessageIndex = "lastConsumedMessageIndex".asInstanceOf[typings.twilioChat.twilioChatStrings.lastConsumedMessageIndex]
      
      @scala.inline
      def lastConsumptionTimestamp: typings.twilioChat.twilioChatStrings.lastConsumptionTimestamp = "lastConsumptionTimestamp".asInstanceOf[typings.twilioChat.twilioChatStrings.lastConsumptionTimestamp]
      
      @scala.inline
      def roleSid: typings.twilioChat.twilioChatStrings.roleSid = "roleSid".asInstanceOf[typings.twilioChat.twilioChatStrings.roleSid]
    }
    
    trait UpdatedEventArgs extends StObject {
      
      var member: Member
      
      var updateReasons: js.Array[UpdateReason]
    }
    object UpdatedEventArgs {
      
      @scala.inline
      def apply(member: Member, updateReasons: js.Array[UpdateReason]): UpdatedEventArgs = {
        val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any], updateReasons = updateReasons.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdatedEventArgs]
      }
      
      @scala.inline
      implicit class UpdatedEventArgsMutableBuilder[Self <: UpdatedEventArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMember(value: Member): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateReasons(value: js.Array[UpdateReason]): Self = StObject.set(x, "updateReasons", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateReasonsVarargs(value: UpdateReason*): Self = StObject.set(x, "updateReasons", js.Array(value :_*))
      }
    }
  }
  
  trait MemberDescriptor extends StObject {
    
    var attributes: js.UndefOr[js.Object] = js.undefined
    
    var dateCreated: js.Any
    
    var dateUpdated: js.Any
    
    var identity: String
    
    var lastConsumedMessageIndex: Double
    
    var lastConsumptionTimestamp: Double
    
    var roleSid: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[Type] = js.undefined
    
    var userInfo: String
  }
  object MemberDescriptor {
    
    @scala.inline
    def apply(
      dateCreated: js.Any,
      dateUpdated: js.Any,
      identity: String,
      lastConsumedMessageIndex: Double,
      lastConsumptionTimestamp: Double,
      userInfo: String
    ): MemberDescriptor = {
      val __obj = js.Dynamic.literal(dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], lastConsumedMessageIndex = lastConsumedMessageIndex.asInstanceOf[js.Any], lastConsumptionTimestamp = lastConsumptionTimestamp.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberDescriptor]
    }
    
    @scala.inline
    implicit class MemberDescriptorMutableBuilder[Self <: MemberDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setDateCreated(value: js.Any): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUpdated(value: js.Any): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastConsumedMessageIndex(value: Double): Self = StObject.set(x, "lastConsumedMessageIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastConsumptionTimestamp(value: Double): Self = StObject.set(x, "lastConsumptionTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleSid(value: String): Self = StObject.set(x, "roleSid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleSidUndefined: Self = StObject.set(x, "roleSid", js.undefined)
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUserInfo(value: String): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait MemberServices extends StObject {
    
    var session: Session
    
    var users: Users
  }
  object MemberServices {
    
    @scala.inline
    def apply(session: Session, users: Users): MemberServices = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberServices]
    }
    
    @scala.inline
    implicit class MemberServicesMutableBuilder[Self <: MemberServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: Users): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
