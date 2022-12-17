package typings.twilioChat

import typings.twilioChat.mod.ChannelUpdateReason
import typings.twilioChat.mod.MemberUpdateReason
import typings.twilioChat.mod.MessageUpdateReason
import typings.twilioChat.mod.User
import typings.twilioChat.mod.UserUpdateReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Channel extends StObject {
    
    var channel: typings.twilioChat.mod.Channel
    
    var updateReasons: js.Array[ChannelUpdateReason]
  }
  object Channel {
    
    inline def apply(channel: typings.twilioChat.mod.Channel, updateReasons: js.Array[ChannelUpdateReason]): Channel = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], updateReasons = updateReasons.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    extension [Self <: Channel](x: Self) {
      
      inline def setChannel(value: typings.twilioChat.mod.Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setUpdateReasons(value: js.Array[ChannelUpdateReason]): Self = StObject.set(x, "updateReasons", value.asInstanceOf[js.Any])
      
      inline def setUpdateReasonsVarargs(value: ChannelUpdateReason*): Self = StObject.set(x, "updateReasons", js.Array(value*))
    }
  }
  
  trait Consumptionreportinterval extends StObject {
    
    var consumption_report_interval: String
    
    var http_cache_interval: String
    
    var my_conversations_page_size: Double
    
    var reachability_enabled: Boolean
    
    var user_infos_to_subscribe: Double
  }
  object Consumptionreportinterval {
    
    inline def apply(
      consumption_report_interval: String,
      http_cache_interval: String,
      my_conversations_page_size: Double,
      reachability_enabled: Boolean,
      user_infos_to_subscribe: Double
    ): Consumptionreportinterval = {
      val __obj = js.Dynamic.literal(consumption_report_interval = consumption_report_interval.asInstanceOf[js.Any], http_cache_interval = http_cache_interval.asInstanceOf[js.Any], my_conversations_page_size = my_conversations_page_size.asInstanceOf[js.Any], reachability_enabled = reachability_enabled.asInstanceOf[js.Any], user_infos_to_subscribe = user_infos_to_subscribe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Consumptionreportinterval]
    }
    
    extension [Self <: Consumptionreportinterval](x: Self) {
      
      inline def setConsumption_report_interval(value: String): Self = StObject.set(x, "consumption_report_interval", value.asInstanceOf[js.Any])
      
      inline def setHttp_cache_interval(value: String): Self = StObject.set(x, "http_cache_interval", value.asInstanceOf[js.Any])
      
      inline def setMy_conversations_page_size(value: Double): Self = StObject.set(x, "my_conversations_page_size", value.asInstanceOf[js.Any])
      
      inline def setReachability_enabled(value: Boolean): Self = StObject.set(x, "reachability_enabled", value.asInstanceOf[js.Any])
      
      inline def setUser_infos_to_subscribe(value: Double): Self = StObject.set(x, "user_infos_to_subscribe", value.asInstanceOf[js.Any])
    }
  }
  
  trait Conversations extends StObject {
    
    var conversations: String
    
    var current_user: String
    
    var media_service: String
    
    var messages_receipts: String
    
    var my_conversations: String
    
    var typing: String
    
    var users: String
  }
  object Conversations {
    
    inline def apply(
      conversations: String,
      current_user: String,
      media_service: String,
      messages_receipts: String,
      my_conversations: String,
      typing: String,
      users: String
    ): Conversations = {
      val __obj = js.Dynamic.literal(conversations = conversations.asInstanceOf[js.Any], current_user = current_user.asInstanceOf[js.Any], media_service = media_service.asInstanceOf[js.Any], messages_receipts = messages_receipts.asInstanceOf[js.Any], my_conversations = my_conversations.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[Conversations]
    }
    
    extension [Self <: Conversations](x: Self) {
      
      inline def setConversations(value: String): Self = StObject.set(x, "conversations", value.asInstanceOf[js.Any])
      
      inline def setCurrent_user(value: String): Self = StObject.set(x, "current_user", value.asInstanceOf[js.Any])
      
      inline def setMedia_service(value: String): Self = StObject.set(x, "media_service", value.asInstanceOf[js.Any])
      
      inline def setMessages_receipts(value: String): Self = StObject.set(x, "messages_receipts", value.asInstanceOf[js.Any])
      
      inline def setMy_conversations(value: String): Self = StObject.set(x, "my_conversations", value.asInstanceOf[js.Any])
      
      inline def setTyping(value: String): Self = StObject.set(x, "typing", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: String): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
  
  trait CurrentUser extends StObject {
    
    var conversations: String
    
    var currentUser: String
    
    var mediaService: String
    
    var messagesReceipts: String
    
    var myConversations: String
    
    var typing: String
    
    var users: String
  }
  object CurrentUser {
    
    inline def apply(
      conversations: String,
      currentUser: String,
      mediaService: String,
      messagesReceipts: String,
      myConversations: String,
      typing: String,
      users: String
    ): CurrentUser = {
      val __obj = js.Dynamic.literal(conversations = conversations.asInstanceOf[js.Any], currentUser = currentUser.asInstanceOf[js.Any], mediaService = mediaService.asInstanceOf[js.Any], messagesReceipts = messagesReceipts.asInstanceOf[js.Any], myConversations = myConversations.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentUser]
    }
    
    extension [Self <: CurrentUser](x: Self) {
      
      inline def setConversations(value: String): Self = StObject.set(x, "conversations", value.asInstanceOf[js.Any])
      
      inline def setCurrentUser(value: String): Self = StObject.set(x, "currentUser", value.asInstanceOf[js.Any])
      
      inline def setMediaService(value: String): Self = StObject.set(x, "mediaService", value.asInstanceOf[js.Any])
      
      inline def setMessagesReceipts(value: String): Self = StObject.set(x, "messagesReceipts", value.asInstanceOf[js.Any])
      
      inline def setMyConversations(value: String): Self = StObject.set(x, "myConversations", value.asInstanceOf[js.Any])
      
      inline def setTyping(value: String): Self = StObject.set(x, "typing", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: String): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorCode extends StObject {
    
    var errorCode: js.UndefOr[Double] = js.undefined
    
    var httpStatusCode: js.UndefOr[Double] = js.undefined
    
    var message: String
    
    var terminal: Boolean
  }
  object ErrorCode {
    
    inline def apply(message: String, terminal: Boolean): ErrorCode = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorCode]
    }
    
    extension [Self <: ErrorCode](x: Self) {
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setHttpStatusCode(value: Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
      
      inline def setHttpStatusCodeUndefined: Self = StObject.set(x, "httpStatusCode", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTerminal(value: Boolean): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
    }
  }
  
  trait Member extends StObject {
    
    var member: typings.twilioChat.mod.Member
    
    var updateReasons: js.Array[MemberUpdateReason]
  }
  object Member {
    
    inline def apply(member: typings.twilioChat.mod.Member, updateReasons: js.Array[MemberUpdateReason]): Member = {
      val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any], updateReasons = updateReasons.asInstanceOf[js.Any])
      __obj.asInstanceOf[Member]
    }
    
    extension [Self <: Member](x: Self) {
      
      inline def setMember(value: typings.twilioChat.mod.Member): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
      
      inline def setUpdateReasons(value: js.Array[MemberUpdateReason]): Self = StObject.set(x, "updateReasons", value.asInstanceOf[js.Any])
      
      inline def setUpdateReasonsVarargs(value: MemberUpdateReason*): Self = StObject.set(x, "updateReasons", js.Array(value*))
    }
  }
  
  trait Message extends StObject {
    
    var message: typings.twilioChat.mod.Message
    
    var updateReasons: js.Array[MessageUpdateReason]
  }
  object Message {
    
    inline def apply(message: typings.twilioChat.mod.Message, updateReasons: js.Array[MessageUpdateReason]): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], updateReasons = updateReasons.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: typings.twilioChat.mod.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setUpdateReasons(value: js.Array[MessageUpdateReason]): Self = StObject.set(x, "updateReasons", value.asInstanceOf[js.Any])
      
      inline def setUpdateReasonsVarargs(value: MessageUpdateReason*): Self = StObject.set(x, "updateReasons", js.Array(value*))
    }
  }
  
  trait Myconversations extends StObject {
    
    var my_conversations: String
    
    var my_user_info: String
  }
  object Myconversations {
    
    inline def apply(my_conversations: String, my_user_info: String): Myconversations = {
      val __obj = js.Dynamic.literal(my_conversations = my_conversations.asInstanceOf[js.Any], my_user_info = my_user_info.asInstanceOf[js.Any])
      __obj.asInstanceOf[Myconversations]
    }
    
    extension [Self <: Myconversations](x: Self) {
      
      inline def setMy_conversations(value: String): Self = StObject.set(x, "my_conversations", value.asInstanceOf[js.Any])
      
      inline def setMy_user_info(value: String): Self = StObject.set(x, "my_user_info", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateReasons extends StObject {
    
    var updateReasons: js.Array[UserUpdateReason]
    
    var user: User
  }
  object UpdateReasons {
    
    inline def apply(updateReasons: js.Array[UserUpdateReason], user: User): UpdateReasons = {
      val __obj = js.Dynamic.literal(updateReasons = updateReasons.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateReasons]
    }
    
    extension [Self <: UpdateReasons](x: Self) {
      
      inline def setUpdateReasons(value: js.Array[UserUpdateReason]): Self = StObject.set(x, "updateReasons", value.asInstanceOf[js.Any])
      
      inline def setUpdateReasonsVarargs(value: UserUpdateReason*): Self = StObject.set(x, "updateReasons", js.Array(value*))
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
