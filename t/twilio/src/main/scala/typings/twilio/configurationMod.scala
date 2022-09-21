package typings.twilio

import typings.twilio.configurationWebhookMod.WebhookListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/configuration", "ConfigurationContext")
  @js.native
  open class ConfigurationContext protected () extends StObject {
    /**
      * Initialize the ConfigurationContext
      *
      * @param version - Version of the resource
      */
    def this(version: typings.twilio.conversationsV1Mod.^) = this()
    
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
  
  @JSImport("twilio/lib/rest/conversations/v1/configuration", "ConfigurationInstance")
  @js.native
  open class ConfigurationInstance protected () extends SerializableClass {
    /**
      * Initialize the ConfigurationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.conversationsV1Mod.^, payload: ConfigurationPayload) = this()
    
    /* private */ var _proxy: ConfigurationContext = js.native
    
    var accountSid: String = js.native
    
    var defaultChatServiceSid: String = js.native
    
    var defaultClosedTimer: String = js.native
    
    var defaultInactiveTimer: String = js.native
    
    var defaultMessagingServiceSid: String = js.native
    
    /**
      * fetch a ConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConfigurationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConfigurationInstance] = js.native
    
    var links: String = js.native
    
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
    */
  inline def ConfigurationList(version: typings.twilio.conversationsV1Mod.^): ConfigurationListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ConfigurationList")(version.asInstanceOf[js.Any]).asInstanceOf[ConfigurationListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/configuration", "ConfigurationPage")
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
    * @property defaultChatServiceSid - The SID of the default Conversation Service that every new conversation will be associated with.
    * @property defaultClosedTimer - Default ISO8601 duration when conversation will be switched to `closed` state.
    * @property defaultInactiveTimer - Default ISO8601 duration when conversation will be switched to `inactive` state.
    * @property defaultMessagingServiceSid - The SID of the default Messaging Service that every new conversation will be associated with.
    */
  trait ConfigurationInstanceUpdateOptions extends StObject {
    
    var defaultChatServiceSid: js.UndefOr[String] = js.undefined
    
    var defaultClosedTimer: js.UndefOr[String] = js.undefined
    
    var defaultInactiveTimer: js.UndefOr[String] = js.undefined
    
    var defaultMessagingServiceSid: js.UndefOr[String] = js.undefined
  }
  object ConfigurationInstanceUpdateOptions {
    
    inline def apply(): ConfigurationInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationInstanceUpdateOptions]
    }
    
    extension [Self <: ConfigurationInstanceUpdateOptions](x: Self) {
      
      inline def setDefaultChatServiceSid(value: String): Self = StObject.set(x, "defaultChatServiceSid", value.asInstanceOf[js.Any])
      
      inline def setDefaultChatServiceSidUndefined: Self = StObject.set(x, "defaultChatServiceSid", js.undefined)
      
      inline def setDefaultClosedTimer(value: String): Self = StObject.set(x, "defaultClosedTimer", value.asInstanceOf[js.Any])
      
      inline def setDefaultClosedTimerUndefined: Self = StObject.set(x, "defaultClosedTimer", js.undefined)
      
      inline def setDefaultInactiveTimer(value: String): Self = StObject.set(x, "defaultInactiveTimer", value.asInstanceOf[js.Any])
      
      inline def setDefaultInactiveTimerUndefined: Self = StObject.set(x, "defaultInactiveTimer", js.undefined)
      
      inline def setDefaultMessagingServiceSid(value: String): Self = StObject.set(x, "defaultMessagingServiceSid", value.asInstanceOf[js.Any])
      
      inline def setDefaultMessagingServiceSidUndefined: Self = StObject.set(x, "defaultMessagingServiceSid", js.undefined)
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
      account_sid: String,
      default_chat_service_sid: String,
      default_closed_timer: String,
      default_inactive_timer: String,
      default_messaging_service_sid: String,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String
    ): ConfigurationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], default_chat_service_sid = default_chat_service_sid.asInstanceOf[js.Any], default_closed_timer = default_closed_timer.asInstanceOf[js.Any], default_inactive_timer = default_inactive_timer.asInstanceOf[js.Any], default_messaging_service_sid = default_messaging_service_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationPayload]
    }
  }
  
  trait ConfigurationResource extends StObject {
    
    var account_sid: String
    
    var default_chat_service_sid: String
    
    var default_closed_timer: String
    
    var default_inactive_timer: String
    
    var default_messaging_service_sid: String
    
    var links: String
    
    var url: String
  }
  object ConfigurationResource {
    
    inline def apply(
      account_sid: String,
      default_chat_service_sid: String,
      default_closed_timer: String,
      default_inactive_timer: String,
      default_messaging_service_sid: String,
      links: String,
      url: String
    ): ConfigurationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], default_chat_service_sid = default_chat_service_sid.asInstanceOf[js.Any], default_closed_timer = default_closed_timer.asInstanceOf[js.Any], default_inactive_timer = default_inactive_timer.asInstanceOf[js.Any], default_messaging_service_sid = default_messaging_service_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationResource]
    }
    
    extension [Self <: ConfigurationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDefault_chat_service_sid(value: String): Self = StObject.set(x, "default_chat_service_sid", value.asInstanceOf[js.Any])
      
      inline def setDefault_closed_timer(value: String): Self = StObject.set(x, "default_closed_timer", value.asInstanceOf[js.Any])
      
      inline def setDefault_inactive_timer(value: String): Self = StObject.set(x, "default_inactive_timer", value.asInstanceOf[js.Any])
      
      inline def setDefault_messaging_service_sid(value: String): Self = StObject.set(x, "default_messaging_service_sid", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigurationSolution extends StObject
}
