package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportConfigurationMod {
  
  @JSImport("twilio/lib/rest/bulkexports/v1/exportConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/bulkexports/v1/exportConfiguration", "ExportConfigurationContext")
  @js.native
  open class ExportConfigurationContext protected () extends StObject {
    /**
      * Initialize the ExportConfigurationContext
      *
      * @param version - Version of the resource
      * @param resourceType - The type of communication – Messages, Calls, Conferences, and Participants
      */
    def this(version: typings.twilio.bulkexportsV1Mod.^, resourceType: String) = this()
    
    /**
      * fetch a ExportConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ExportConfigurationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExportConfigurationInstance, Any]): js.Promise[ExportConfigurationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ExportConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ExportConfigurationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExportConfigurationInstance, Any]): js.Promise[ExportConfigurationInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExportConfigurationInstance, Any]
    ): js.Promise[ExportConfigurationInstance] = js.native
    def update(opts: ExportConfigurationInstanceUpdateOptions): js.Promise[ExportConfigurationInstance] = js.native
    def update(
      opts: ExportConfigurationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExportConfigurationInstance, Any]
    ): js.Promise[ExportConfigurationInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/bulkexports/v1/exportConfiguration", "ExportConfigurationInstance")
  @js.native
  open class ExportConfigurationInstance protected () extends SerializableClass {
    /**
      * Initialize the ExportConfigurationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param resourceType - The type of communication – Messages, Calls, Conferences, and Participants
      */
    def this(
      version: typings.twilio.bulkexportsV1Mod.^,
      payload: ExportConfigurationPayload,
      resourceType: String
    ) = this()
    
    /* private */ var _proxy: ExportConfigurationContext = js.native
    
    var enabled: Boolean = js.native
    
    /**
      * fetch a ExportConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ExportConfigurationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ExportConfigurationInstance] = js.native
    
    var resourceType: String = js.native
    
    /**
      * update a ExportConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ExportConfigurationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ExportConfigurationInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ExportConfigurationInstance] = js.native
    def update(opts: ExportConfigurationInstanceUpdateOptions): js.Promise[ExportConfigurationInstance] = js.native
    def update(
      opts: ExportConfigurationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ExportConfigurationInstance] = js.native
    
    var url: String = js.native
    
    var webhookMethod: String = js.native
    
    var webhookUrl: String = js.native
  }
  
  /**
    * Initialize the ExportConfigurationList
    *
    * @param version - Version of the resource
    */
  inline def ExportConfigurationList(version: typings.twilio.bulkexportsV1Mod.^): ExportConfigurationListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ExportConfigurationList")(version.asInstanceOf[js.Any]).asInstanceOf[ExportConfigurationListInstance]
  
  @JSImport("twilio/lib/rest/bulkexports/v1/exportConfiguration", "ExportConfigurationPage")
  @js.native
  open class ExportConfigurationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.bulkexportsV1Mod.^, 
          ExportConfigurationPayload, 
          ExportConfigurationResource, 
          ExportConfigurationInstance
        ] {
    /**
      * Initialize the ExportConfigurationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.bulkexportsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ExportConfigurationSolution
    ) = this()
    
    /**
      * Build an instance of ExportConfigurationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ExportConfigurationPayload): ExportConfigurationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property enabled - Whether files are automatically generated
    * @property webhookMethod - Whether to GET or POST to the webhook url
    * @property webhookUrl - URL targeted at export
    */
  trait ExportConfigurationInstanceUpdateOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var webhookMethod: js.UndefOr[String] = js.undefined
    
    var webhookUrl: js.UndefOr[String] = js.undefined
  }
  object ExportConfigurationInstanceUpdateOptions {
    
    inline def apply(): ExportConfigurationInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportConfigurationInstanceUpdateOptions]
    }
    
    extension [Self <: ExportConfigurationInstanceUpdateOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setWebhookMethod(value: String): Self = StObject.set(x, "webhookMethod", value.asInstanceOf[js.Any])
      
      inline def setWebhookMethodUndefined: Self = StObject.set(x, "webhookMethod", js.undefined)
      
      inline def setWebhookUrl(value: String): Self = StObject.set(x, "webhookUrl", value.asInstanceOf[js.Any])
      
      inline def setWebhookUrlUndefined: Self = StObject.set(x, "webhookUrl", js.undefined)
    }
  }
  
  @js.native
  trait ExportConfigurationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ExportConfigurationContext = js.native
    
    /**
      * Constructs a export_configuration
      *
      * @param resourceType - The type of communication – Messages, Calls, Conferences, and Participants
      */
    def get(resourceType: String): ExportConfigurationContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait ExportConfigurationPayload
    extends StObject
       with ExportConfigurationResource
       with TwilioResponsePayload
  object ExportConfigurationPayload {
    
    inline def apply(
      enabled: Boolean,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      resource_type: String,
      uri: String,
      url: String,
      webhook_method: String,
      webhook_url: String
    ): ExportConfigurationPayload = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webhook_method = webhook_method.asInstanceOf[js.Any], webhook_url = webhook_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportConfigurationPayload]
    }
  }
  
  trait ExportConfigurationResource extends StObject {
    
    var enabled: Boolean
    
    var resource_type: String
    
    var url: String
    
    var webhook_method: String
    
    var webhook_url: String
  }
  object ExportConfigurationResource {
    
    inline def apply(enabled: Boolean, resource_type: String, url: String, webhook_method: String, webhook_url: String): ExportConfigurationResource = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webhook_method = webhook_method.asInstanceOf[js.Any], webhook_url = webhook_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportConfigurationResource]
    }
    
    extension [Self <: ExportConfigurationResource](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWebhook_method(value: String): Self = StObject.set(x, "webhook_method", value.asInstanceOf[js.Any])
      
      inline def setWebhook_url(value: String): Self = StObject.set(x, "webhook_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExportConfigurationSolution extends StObject
}
