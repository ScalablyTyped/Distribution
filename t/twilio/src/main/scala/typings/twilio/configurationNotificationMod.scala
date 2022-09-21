package typings.twilio

import typings.twilio.anon.Sound
import typings.twilio.anon.Template
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationNotificationMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/service/configuration/notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/service/configuration/notification", "NotificationContext")
  @js.native
  open class NotificationContext protected () extends StObject {
    /**
      * Initialize the NotificationContext
      *
      * @param version - Version of the resource
      * @param chatServiceSid - The SID of the Conversation Service that the Configuration applies to.
      */
    def this(version: typings.twilio.conversationsV1Mod.^, chatServiceSid: String) = this()
    
    /**
      * fetch a NotificationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NotificationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ NotificationInstance, Any]): js.Promise[NotificationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a NotificationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[NotificationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ NotificationInstance, Any]): js.Promise[NotificationInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NotificationInstance, Any]
    ): js.Promise[NotificationInstance] = js.native
    def update(opts: NotificationInstanceUpdateOptions): js.Promise[NotificationInstance] = js.native
    def update(
      opts: NotificationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NotificationInstance, Any]
    ): js.Promise[NotificationInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/conversations/v1/service/configuration/notification", "NotificationInstance")
  @js.native
  open class NotificationInstance protected () extends SerializableClass {
    /**
      * Initialize the NotificationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param chatServiceSid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.conversationsV1Mod.^, payload: NotificationPayload, chatServiceSid: String) = this()
    
    /* private */ var _proxy: NotificationContext = js.native
    
    var accountSid: String = js.native
    
    var addedToConversation: Any = js.native
    
    var chatServiceSid: String = js.native
    
    /**
      * fetch a NotificationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NotificationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[NotificationInstance] = js.native
    
    var logEnabled: Boolean = js.native
    
    var newMessage: Any = js.native
    
    var removedFromConversation: Any = js.native
    
    /**
      * update a NotificationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[NotificationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[NotificationInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[NotificationInstance] = js.native
    def update(opts: NotificationInstanceUpdateOptions): js.Promise[NotificationInstance] = js.native
    def update(
      opts: NotificationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[NotificationInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the NotificationList
    *
    * @param version - Version of the resource
    * @param chatServiceSid - The unique string that identifies the resource
    */
  inline def NotificationList(version: typings.twilio.conversationsV1Mod.^, chatServiceSid: String): NotificationListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("NotificationList")(version.asInstanceOf[js.Any], chatServiceSid.asInstanceOf[js.Any])).asInstanceOf[NotificationListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/service/configuration/notification", "NotificationPage")
  @js.native
  open class NotificationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.conversationsV1Mod.^, 
          NotificationPayload, 
          NotificationResource, 
          NotificationInstance
        ] {
    /**
      * Initialize the NotificationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: NotificationSolution
    ) = this()
    
    /**
      * Build an instance of NotificationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: NotificationPayload): NotificationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property addedToConversation.enabled - Whether to send a notification when a participant is added to a conversation.
    * @property addedToConversation.sound - The name of the sound to play when a participant is added to a conversation.
    * @property addedToConversation.template - The template to use to create the notification text displayed when a participant is added to a conversation.
    * @property logEnabled - Weather the notification logging is enabled.
    * @property newMessage.badgeCountEnabled - Whether the new message badge is enabled.
    * @property newMessage.enabled - Whether to send a notification when a new message is added to a conversation.
    * @property newMessage.sound - The name of the sound to play when a new message is added to a conversation.
    * @property newMessage.template - The template to use to create the notification text displayed when a new message is added to a conversation.
    * @property newMessage.withMedia.enabled - Whether to send a notification when a new message with media/file attachments is added to a conversation.
    * @property newMessage.withMedia.template - The template to use to create the notification text displayed when a new message with media/file attachments is added to a conversation.
    * @property removedFromConversation.enabled - Whether to send a notification to a user when they are removed from a conversation.
    * @property removedFromConversation.sound - The name of the sound to play to a user when they are removed from a conversation.
    * @property removedFromConversation.template - The template to use to create the notification text displayed to a user when they are removed.
    */
  trait NotificationInstanceUpdateOptions extends StObject {
    
    var addedToConversation: js.UndefOr[Sound] = js.undefined
    
    var logEnabled: js.UndefOr[Boolean] = js.undefined
    
    var newMessage: js.UndefOr[Template] = js.undefined
    
    var removedFromConversation: js.UndefOr[Sound] = js.undefined
  }
  object NotificationInstanceUpdateOptions {
    
    inline def apply(): NotificationInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationInstanceUpdateOptions]
    }
    
    extension [Self <: NotificationInstanceUpdateOptions](x: Self) {
      
      inline def setAddedToConversation(value: Sound): Self = StObject.set(x, "addedToConversation", value.asInstanceOf[js.Any])
      
      inline def setAddedToConversationUndefined: Self = StObject.set(x, "addedToConversation", js.undefined)
      
      inline def setLogEnabled(value: Boolean): Self = StObject.set(x, "logEnabled", value.asInstanceOf[js.Any])
      
      inline def setLogEnabledUndefined: Self = StObject.set(x, "logEnabled", js.undefined)
      
      inline def setNewMessage(value: Template): Self = StObject.set(x, "newMessage", value.asInstanceOf[js.Any])
      
      inline def setNewMessageUndefined: Self = StObject.set(x, "newMessage", js.undefined)
      
      inline def setRemovedFromConversation(value: Sound): Self = StObject.set(x, "removedFromConversation", value.asInstanceOf[js.Any])
      
      inline def setRemovedFromConversationUndefined: Self = StObject.set(x, "removedFromConversation", js.undefined)
    }
  }
  
  @js.native
  trait NotificationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): NotificationContext = js.native
    
    /**
      * Constructs a notification
      */
    def get(): NotificationContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait NotificationPayload
    extends StObject
       with NotificationResource
       with TwilioResponsePayload
  object NotificationPayload {
    
    inline def apply(
      account_sid: String,
      added_to_conversation: js.Object,
      chat_service_sid: String,
      first_page_uri: String,
      log_enabled: Boolean,
      new_message: js.Object,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      removed_from_conversation: js.Object,
      uri: String,
      url: String
    ): NotificationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], added_to_conversation = added_to_conversation.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], log_enabled = log_enabled.asInstanceOf[js.Any], new_message = new_message.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], removed_from_conversation = removed_from_conversation.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationPayload]
    }
  }
  
  trait NotificationResource extends StObject {
    
    var account_sid: String
    
    var added_to_conversation: js.Object
    
    var chat_service_sid: String
    
    var log_enabled: Boolean
    
    var new_message: js.Object
    
    var removed_from_conversation: js.Object
    
    var url: String
  }
  object NotificationResource {
    
    inline def apply(
      account_sid: String,
      added_to_conversation: js.Object,
      chat_service_sid: String,
      log_enabled: Boolean,
      new_message: js.Object,
      removed_from_conversation: js.Object,
      url: String
    ): NotificationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], added_to_conversation = added_to_conversation.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], log_enabled = log_enabled.asInstanceOf[js.Any], new_message = new_message.asInstanceOf[js.Any], removed_from_conversation = removed_from_conversation.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationResource]
    }
    
    extension [Self <: NotificationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAdded_to_conversation(value: js.Object): Self = StObject.set(x, "added_to_conversation", value.asInstanceOf[js.Any])
      
      inline def setChat_service_sid(value: String): Self = StObject.set(x, "chat_service_sid", value.asInstanceOf[js.Any])
      
      inline def setLog_enabled(value: Boolean): Self = StObject.set(x, "log_enabled", value.asInstanceOf[js.Any])
      
      inline def setNew_message(value: js.Object): Self = StObject.set(x, "new_message", value.asInstanceOf[js.Any])
      
      inline def setRemoved_from_conversation(value: js.Object): Self = StObject.set(x, "removed_from_conversation", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationSolution extends StObject {
    
    var chatServiceSid: js.UndefOr[String] = js.undefined
  }
  object NotificationSolution {
    
    inline def apply(): NotificationSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationSolution]
    }
    
    extension [Self <: NotificationSolution](x: Self) {
      
      inline def setChatServiceSid(value: String): Self = StObject.set(x, "chatServiceSid", value.asInstanceOf[js.Any])
      
      inline def setChatServiceSidUndefined: Self = StObject.set(x, "chatServiceSid", js.undefined)
    }
  }
}
