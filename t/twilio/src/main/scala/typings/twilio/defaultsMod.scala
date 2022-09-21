package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultsMod {
  
  @JSImport("twilio/lib/rest/autopilot/v1/assistant/defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/autopilot/v1/assistant/defaults", "DefaultsContext")
  @js.native
  open class DefaultsContext protected () extends StObject {
    /**
      * Initialize the DefaultsContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The SID of the Assistant that is the parent of the resource to fetch
      */
    def this(version: typings.twilio.autopilotV1Mod.^, assistantSid: String) = this()
    
    /**
      * fetch a DefaultsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DefaultsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ DefaultsInstance, Any]): js.Promise[DefaultsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a DefaultsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[DefaultsInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ DefaultsInstance, Any]): js.Promise[DefaultsInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ DefaultsInstance, Any]): js.Promise[DefaultsInstance] = js.native
    def update(opts: DefaultsInstanceUpdateOptions): js.Promise[DefaultsInstance] = js.native
    def update(
      opts: DefaultsInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DefaultsInstance, Any]
    ): js.Promise[DefaultsInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/autopilot/v1/assistant/defaults", "DefaultsInstance")
  @js.native
  open class DefaultsInstance protected () extends SerializableClass {
    /**
      * Initialize the DefaultsContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param assistantSid - The SID of the Assistant that is the parent of the resource
      */
    def this(version: typings.twilio.autopilotV1Mod.^, payload: DefaultsPayload, assistantSid: String) = this()
    
    /* private */ var _proxy: DefaultsContext = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var data: Any = js.native
    
    /**
      * fetch a DefaultsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DefaultsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DefaultsInstance] = js.native
    
    /**
      * update a DefaultsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[DefaultsInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DefaultsInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DefaultsInstance] = js.native
    def update(opts: DefaultsInstanceUpdateOptions): js.Promise[DefaultsInstance] = js.native
    def update(
      opts: DefaultsInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[DefaultsInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the DefaultsList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The SID of the Assistant that is the parent of the resource
    */
  inline def DefaultsList(version: typings.twilio.autopilotV1Mod.^, assistantSid: String): DefaultsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("DefaultsList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any])).asInstanceOf[DefaultsListInstance]
  
  @JSImport("twilio/lib/rest/autopilot/v1/assistant/defaults", "DefaultsPage")
  @js.native
  open class DefaultsPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.autopilotV1Mod.^, DefaultsPayload, DefaultsResource, DefaultsInstance] {
    /**
      * Initialize the DefaultsPage
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
      version: typings.twilio.autopilotV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: DefaultsSolution
    ) = this()
    
    /**
      * Build an instance of DefaultsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DefaultsPayload): DefaultsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property defaults - A JSON string that describes the default task links.
    */
  trait DefaultsInstanceUpdateOptions extends StObject {
    
    var defaults: js.UndefOr[js.Object] = js.undefined
  }
  object DefaultsInstanceUpdateOptions {
    
    inline def apply(): DefaultsInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultsInstanceUpdateOptions]
    }
    
    extension [Self <: DefaultsInstanceUpdateOptions](x: Self) {
      
      inline def setDefaults(value: js.Object): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    }
  }
  
  @js.native
  trait DefaultsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): DefaultsContext = js.native
    
    /**
      * Constructs a defaults
      */
    def get(): DefaultsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait DefaultsPayload
    extends StObject
       with DefaultsResource
       with TwilioResponsePayload
  object DefaultsPayload {
    
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
    ): DefaultsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultsPayload]
    }
  }
  
  trait DefaultsResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var data: js.Object
    
    var url: String
  }
  object DefaultsResource {
    
    inline def apply(account_sid: String, assistant_sid: String, data: js.Object, url: String): DefaultsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultsResource]
    }
    
    extension [Self <: DefaultsResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultsSolution extends StObject {
    
    var assistantSid: js.UndefOr[String] = js.undefined
  }
  object DefaultsSolution {
    
    inline def apply(): DefaultsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultsSolution]
    }
    
    extension [Self <: DefaultsSolution](x: Self) {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
    }
  }
}
