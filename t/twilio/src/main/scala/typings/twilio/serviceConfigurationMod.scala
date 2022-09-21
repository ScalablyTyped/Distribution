package typings.twilio

import typings.twilio.configurationNotificationMod.NotificationListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.serviceConfigurationWebhookMod.WebhookListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceConfigurationMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/service/configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/service/configuration", "ConfigurationContext")
  @js.native
  open class ConfigurationContext protected () extends StObject {
    /**
      * Initialize the ConfigurationContext
      *
      * @param version - Version of the resource
      * @param chatServiceSid - The SID of the Service configuration resource to fetch
      */
    def this(version: typings.twilio.conversationsV1Mod.^, chatServiceSid: String) = this()
    
    /**
      * fetch a ConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConfigurationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConfigurationInstance, Any]): js.Promise[ConfigurationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConfigurationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConfigurationInstance, Any]): js.Promise[ConfigurationInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConfigurationInstance, Any]
    ): js.Promise[ConfigurationInstance] = js.native
    def update(opts: ConfigurationInstanceUpdateOptions): js.Promise[ConfigurationInstance] = js.native
    def update(
      opts: ConfigurationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConfigurationInstance, Any]
    ): js.Promise[ConfigurationInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/conversations/v1/service/configuration", "ConfigurationInstance")
  @js.native
  open class ConfigurationInstance protected () extends SerializableClass {
    /**
      * Initialize the ConfigurationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param chatServiceSid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      payload: ConfigurationPayload,
      chatServiceSid: String
    ) = this()
    
    /* private */ var _proxy: ConfigurationContext = js.native
    
    var chatServiceSid: String = js.native
    
    var defaultChatServiceRoleSid: String = js.native
    
    var defaultConversationCreatorRoleSid: String = js.native
    
    var defaultConversationRoleSid: String = js.native
    
    /**
      * fetch a ConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConfigurationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConfigurationInstance] = js.native
    
    var links: String = js.native
    
    var reachabilityEnabled: Boolean = js.native
    
    /**
      * update a ConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConfigurationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConfigurationInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConfigurationInstance] = js.native
    def update(opts: ConfigurationInstanceUpdateOptions): js.Promise[ConfigurationInstance] = js.native
    def update(
      opts: ConfigurationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ConfigurationInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ConfigurationList
    *
    * @param version - Version of the resource
    * @param chatServiceSid - The unique string that identifies the resource
    */
  inline def ConfigurationList(version: typings.twilio.conversationsV1Mod.^, chatServiceSid: String): ConfigurationListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ConfigurationList")(version.asInstanceOf[js.Any], chatServiceSid.asInstanceOf[js.Any])).asInstanceOf[ConfigurationListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/service/configuration", "ConfigurationPage")
  @js.native
  open class ConfigurationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.conversationsV1Mod.^, 
          ConfigurationPayload, 
          ConfigurationResource, 
          ConfigurationInstance
        ] {
    /**
      * Initialize the ConfigurationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ConfigurationSolution
    ) = this()
    
    /**
      * Build an instance of ConfigurationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ConfigurationPayload): ConfigurationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property defaultChatServiceRoleSid - The service role assigned to users when they are added to the service
    * @property defaultConversationCreatorRoleSid - The role assigned to a conversation creator when they join a new conversation
    * @property defaultConversationRoleSid - The role assigned to users when they are added to a conversation
    * @property reachabilityEnabled - Whether the Reachability Indicator feature is enabled for this Conversations Service
    */
  trait ConfigurationInstanceUpdateOptions extends StObject {
    
    var defaultChatServiceRoleSid: js.UndefOr[String] = js.undefined
    
    var defaultConversationCreatorRoleSid: js.UndefOr[String] = js.undefined
    
    var defaultConversationRoleSid: js.UndefOr[String] = js.undefined
    
    var reachabilityEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigurationInstanceUpdateOptions {
    
    inline def apply(): ConfigurationInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationInstanceUpdateOptions]
    }
    
    extension [Self <: ConfigurationInstanceUpdateOptions](x: Self) {
      
      inline def setDefaultChatServiceRoleSid(value: String): Self = StObject.set(x, "defaultChatServiceRoleSid", value.asInstanceOf[js.Any])
      
      inline def setDefaultChatServiceRoleSidUndefined: Self = StObject.set(x, "defaultChatServiceRoleSid", js.undefined)
      
      inline def setDefaultConversationCreatorRoleSid(value: String): Self = StObject.set(x, "defaultConversationCreatorRoleSid", value.asInstanceOf[js.Any])
      
      inline def setDefaultConversationCreatorRoleSidUndefined: Self = StObject.set(x, "defaultConversationCreatorRoleSid", js.undefined)
      
      inline def setDefaultConversationRoleSid(value: String): Self = StObject.set(x, "defaultConversationRoleSid", value.asInstanceOf[js.Any])
      
      inline def setDefaultConversationRoleSidUndefined: Self = StObject.set(x, "defaultConversationRoleSid", js.undefined)
      
      inline def setReachabilityEnabled(value: Boolean): Self = StObject.set(x, "reachabilityEnabled", value.asInstanceOf[js.Any])
      
      inline def setReachabilityEnabledUndefined: Self = StObject.set(x, "reachabilityEnabled", js.undefined)
    }
  }
  
  @js.native
  trait ConfigurationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ConfigurationContext = js.native
    
    /**
      * Constructs a configuration
      */
    def get(): ConfigurationContext = js.native
    
    var notifications: js.UndefOr[NotificationListInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    var webhooks: js.UndefOr[WebhookListInstance] = js.native
  }
  
  trait ConfigurationPayload
    extends StObject
       with ConfigurationResource
       with TwilioResponsePayload
  object ConfigurationPayload {
    
    inline def apply(
      chat_service_sid: String,
      default_chat_service_role_sid: String,
      default_conversation_creator_role_sid: String,
      default_conversation_role_sid: String,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      reachability_enabled: Boolean,
      uri: String,
      url: String
    ): ConfigurationPayload = {
      val __obj = js.Dynamic.literal(chat_service_sid = chat_service_sid.asInstanceOf[js.Any], default_chat_service_role_sid = default_chat_service_role_sid.asInstanceOf[js.Any], default_conversation_creator_role_sid = default_conversation_creator_role_sid.asInstanceOf[js.Any], default_conversation_role_sid = default_conversation_role_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], reachability_enabled = reachability_enabled.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationPayload]
    }
  }
  
  trait ConfigurationResource extends StObject {
    
    var chat_service_sid: String
    
    var default_chat_service_role_sid: String
    
    var default_conversation_creator_role_sid: String
    
    var default_conversation_role_sid: String
    
    var links: String
    
    var reachability_enabled: Boolean
    
    var url: String
  }
  object ConfigurationResource {
    
    inline def apply(
      chat_service_sid: String,
      default_chat_service_role_sid: String,
      default_conversation_creator_role_sid: String,
      default_conversation_role_sid: String,
      links: String,
      reachability_enabled: Boolean,
      url: String
    ): ConfigurationResource = {
      val __obj = js.Dynamic.literal(chat_service_sid = chat_service_sid.asInstanceOf[js.Any], default_chat_service_role_sid = default_chat_service_role_sid.asInstanceOf[js.Any], default_conversation_creator_role_sid = default_conversation_creator_role_sid.asInstanceOf[js.Any], default_conversation_role_sid = default_conversation_role_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], reachability_enabled = reachability_enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationResource]
    }
    
    extension [Self <: ConfigurationResource](x: Self) {
      
      inline def setChat_service_sid(value: String): Self = StObject.set(x, "chat_service_sid", value.asInstanceOf[js.Any])
      
      inline def setDefault_chat_service_role_sid(value: String): Self = StObject.set(x, "default_chat_service_role_sid", value.asInstanceOf[js.Any])
      
      inline def setDefault_conversation_creator_role_sid(value: String): Self = StObject.set(x, "default_conversation_creator_role_sid", value.asInstanceOf[js.Any])
      
      inline def setDefault_conversation_role_sid(value: String): Self = StObject.set(x, "default_conversation_role_sid", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setReachability_enabled(value: Boolean): Self = StObject.set(x, "reachability_enabled", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigurationSolution extends StObject {
    
    var chatServiceSid: js.UndefOr[String] = js.undefined
  }
  object ConfigurationSolution {
    
    inline def apply(): ConfigurationSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationSolution]
    }
    
    extension [Self <: ConfigurationSolution](x: Self) {
      
      inline def setChatServiceSid(value: String): Self = StObject.set(x, "chatServiceSid", value.asInstanceOf[js.Any])
      
      inline def setChatServiceSidUndefined: Self = StObject.set(x, "chatServiceSid", js.undefined)
    }
  }
}
