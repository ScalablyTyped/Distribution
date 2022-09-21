package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assistantInitiationActionsMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/assistantInitiationActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/assistantInitiationActions", "AssistantInitiationActionsContext")
  @js.native
  open class AssistantInitiationActionsContext protected () extends StObject {
    /**
      * Initialize the AssistantInitiationActionsContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The assistant_sid
      */
    def this(version: typings.twilio.understandMod.^, assistantSid: String) = this()
    
    /**
      * fetch a AssistantInitiationActionsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssistantInitiationActionsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantInitiationActionsInstance, Any]
    ): js.Promise[AssistantInitiationActionsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a AssistantInitiationActionsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AssistantInitiationActionsInstance] = js.native
    def update(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantInitiationActionsInstance, Any]
    ): js.Promise[AssistantInitiationActionsInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantInitiationActionsInstance, Any]
    ): js.Promise[AssistantInitiationActionsInstance] = js.native
    def update(opts: AssistantInitiationActionsInstanceUpdateOptions): js.Promise[AssistantInitiationActionsInstance] = js.native
    def update(
      opts: AssistantInitiationActionsInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssistantInitiationActionsInstance, Any]
    ): js.Promise[AssistantInitiationActionsInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/assistantInitiationActions", "AssistantInitiationActionsInstance")
  @js.native
  open class AssistantInitiationActionsInstance protected () extends SerializableClass {
    /**
      * Initialize the AssistantInitiationActionsContext
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
      version: typings.twilio.understandMod.^,
      payload: AssistantInitiationActionsPayload,
      assistantSid: String
    ) = this()
    
    /* private */ var _proxy: AssistantInitiationActionsContext = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var data: Any = js.native
    
    /**
      * fetch a AssistantInitiationActionsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssistantInitiationActionsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AssistantInitiationActionsInstance] = js.native
    
    /**
      * update a AssistantInitiationActionsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AssistantInitiationActionsInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AssistantInitiationActionsInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AssistantInitiationActionsInstance] = js.native
    def update(opts: AssistantInitiationActionsInstanceUpdateOptions): js.Promise[AssistantInitiationActionsInstance] = js.native
    def update(
      opts: AssistantInitiationActionsInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[AssistantInitiationActionsInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AssistantInitiationActionsList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The assistant_sid
    */
  inline def AssistantInitiationActionsList(version: typings.twilio.understandMod.^, assistantSid: String): AssistantInitiationActionsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AssistantInitiationActionsList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any])).asInstanceOf[AssistantInitiationActionsListInstance]
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/assistantInitiationActions", "AssistantInitiationActionsPage")
  @js.native
  open class AssistantInitiationActionsPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.understandMod.^, 
          AssistantInitiationActionsPayload, 
          AssistantInitiationActionsResource, 
          AssistantInitiationActionsInstance
        ] {
    /**
      * Initialize the AssistantInitiationActionsPage
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
      version: typings.twilio.understandMod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AssistantInitiationActionsSolution
    ) = this()
    
    /**
      * Build an instance of AssistantInitiationActionsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AssistantInitiationActionsPayload): AssistantInitiationActionsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property initiationActions - The initiation_actions
    */
  trait AssistantInitiationActionsInstanceUpdateOptions extends StObject {
    
    var initiationActions: js.UndefOr[js.Object] = js.undefined
  }
  object AssistantInitiationActionsInstanceUpdateOptions {
    
    inline def apply(): AssistantInitiationActionsInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssistantInitiationActionsInstanceUpdateOptions]
    }
    
    extension [Self <: AssistantInitiationActionsInstanceUpdateOptions](x: Self) {
      
      inline def setInitiationActions(value: js.Object): Self = StObject.set(x, "initiationActions", value.asInstanceOf[js.Any])
      
      inline def setInitiationActionsUndefined: Self = StObject.set(x, "initiationActions", js.undefined)
    }
  }
  
  @js.native
  trait AssistantInitiationActionsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AssistantInitiationActionsContext = js.native
    
    /**
      * Constructs a assistant_initiation_actions
      */
    def get(): AssistantInitiationActionsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait AssistantInitiationActionsPayload
    extends StObject
       with AssistantInitiationActionsResource
       with TwilioResponsePayload
  object AssistantInitiationActionsPayload {
    
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
    ): AssistantInitiationActionsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantInitiationActionsPayload]
    }
  }
  
  trait AssistantInitiationActionsResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var data: js.Object
    
    var url: String
  }
  object AssistantInitiationActionsResource {
    
    inline def apply(account_sid: String, assistant_sid: String, data: js.Object, url: String): AssistantInitiationActionsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssistantInitiationActionsResource]
    }
    
    extension [Self <: AssistantInitiationActionsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssistantInitiationActionsSolution extends StObject {
    
    var assistantSid: js.UndefOr[String] = js.undefined
  }
  object AssistantInitiationActionsSolution {
    
    inline def apply(): AssistantInitiationActionsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssistantInitiationActionsSolution]
    }
    
    extension [Self <: AssistantInitiationActionsSolution](x: Self) {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
    }
  }
}
