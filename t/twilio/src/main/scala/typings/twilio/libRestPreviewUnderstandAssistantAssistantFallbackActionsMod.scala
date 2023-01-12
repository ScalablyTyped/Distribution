package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantAssistantFallbackActionsMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/assistantFallbackActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/assistantFallbackActions", "AssistantFallbackActionsContext")
  @js.native
  open class AssistantFallbackActionsContext protected () extends StObject {
    /**
      * Initialize the AssistantFallbackActionsContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The assistant_sid
      */
    def this(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String) = this()
    
    /**
      * fetch a AssistantFallbackActionsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssistantFallbackActionsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantFallbackActionsInstance, Any]
    ): js.Promise[AssistantFallbackActionsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a AssistantFallbackActionsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AssistantFallbackActionsInstance] = js.native
    def update(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantFallbackActionsInstance, Any]
    ): js.Promise[AssistantFallbackActionsInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantFallbackActionsInstance, Any]
    ): js.Promise[AssistantFallbackActionsInstance] = js.native
    def update(opts: AssistantFallbackActionsInstanceUpdateOptions): js.Promise[AssistantFallbackActionsInstance] = js.native
    def update(
      opts: AssistantFallbackActionsInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantFallbackActionsInstance, Any]
    ): js.Promise[AssistantFallbackActionsInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/assistantFallbackActions", "AssistantFallbackActionsInstance")
  @js.native
  open class AssistantFallbackActionsInstance protected () extends SerializableClass {
    /**
      * Initialize the AssistantFallbackActionsContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param assistantSid - The assistant_sid
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      payload: AssistantFallbackActionsPayload,
      assistantSid: String
    ) = this()
    
    /* private */ var _proxy: AssistantFallbackActionsContext = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var data: Any = js.native
    
    /**
      * fetch a AssistantFallbackActionsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssistantFallbackActionsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AssistantFallbackActionsInstance] = js.native
    
    /**
      * update a AssistantFallbackActionsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AssistantFallbackActionsInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AssistantFallbackActionsInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AssistantFallbackActionsInstance] = js.native
    def update(opts: AssistantFallbackActionsInstanceUpdateOptions): js.Promise[AssistantFallbackActionsInstance] = js.native
    def update(
      opts: AssistantFallbackActionsInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[AssistantFallbackActionsInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AssistantFallbackActionsList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The assistant_sid
    */
  inline def AssistantFallbackActionsList(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String): AssistantFallbackActionsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AssistantFallbackActionsList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any])).asInstanceOf[AssistantFallbackActionsListInstance]
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/assistantFallbackActions", "AssistantFallbackActionsPage")
  @js.native
  open class AssistantFallbackActionsPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewUnderstandMod.^, 
          AssistantFallbackActionsPayload, 
          AssistantFallbackActionsResource, 
          AssistantFallbackActionsInstance
        ] {
    /**
      * Initialize the AssistantFallbackActionsPage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      response: typings.twilio.libHttpResponseMod.^[String],
      solution: AssistantFallbackActionsSolution
    ) = this()
    
    /**
      * Build an instance of AssistantFallbackActionsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AssistantFallbackActionsPayload): AssistantFallbackActionsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property fallbackActions - The fallback_actions
    */
  trait AssistantFallbackActionsInstanceUpdateOptions extends StObject {
    
    var fallbackActions: js.UndefOr[js.Object] = js.undefined
  }
  object AssistantFallbackActionsInstanceUpdateOptions {
    
    inline def apply(): AssistantFallbackActionsInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssistantFallbackActionsInstanceUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantFallbackActionsInstanceUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setFallbackActions(value: js.Object): Self = StObject.set(x, "fallbackActions", value.asInstanceOf[js.Any])
      
      inline def setFallbackActionsUndefined: Self = StObject.set(x, "fallbackActions", js.undefined)
    }
  }
  
  @js.native
  trait AssistantFallbackActionsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AssistantFallbackActionsContext = js.native
    
    /**
      * Constructs a assistant_fallback_actions
      */
    def get(): AssistantFallbackActionsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait AssistantFallbackActionsPayload
    extends StObject
       with AssistantFallbackActionsResource
       with TwilioResponsePayload
  object AssistantFallbackActionsPayload {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      data: js.Object,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String
    ): AssistantFallbackActionsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantFallbackActionsPayload]
    }
  }
  
  trait AssistantFallbackActionsResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var data: js.Object
    
    var url: String
  }
  object AssistantFallbackActionsResource {
    
    inline def apply(account_sid: String, assistant_sid: String, data: js.Object, url: String): AssistantFallbackActionsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantFallbackActionsResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantFallbackActionsResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssistantFallbackActionsSolution extends StObject {
    
    var assistantSid: js.UndefOr[String] = js.undefined
  }
  object AssistantFallbackActionsSolution {
    
    inline def apply(): AssistantFallbackActionsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssistantFallbackActionsSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssistantFallbackActionsSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
    }
  }
}
