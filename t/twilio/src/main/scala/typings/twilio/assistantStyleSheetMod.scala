package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assistantStyleSheetMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/styleSheet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/styleSheet", "StyleSheetContext")
  @js.native
  open class StyleSheetContext protected () extends StObject {
    /**
      * Initialize the StyleSheetContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The unique ID of the Assistant
      */
    def this(version: typings.twilio.understandMod.^, assistantSid: String) = this()
    
    /**
      * fetch a StyleSheetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[StyleSheetInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ StyleSheetInstance, Any]): js.Promise[StyleSheetInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a StyleSheetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[StyleSheetInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ StyleSheetInstance, Any]): js.Promise[StyleSheetInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ StyleSheetInstance, Any]
    ): js.Promise[StyleSheetInstance] = js.native
    def update(opts: StyleSheetInstanceUpdateOptions): js.Promise[StyleSheetInstance] = js.native
    def update(
      opts: StyleSheetInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ StyleSheetInstance, Any]
    ): js.Promise[StyleSheetInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/styleSheet", "StyleSheetInstance")
  @js.native
  open class StyleSheetInstance protected () extends SerializableClass {
    /**
      * Initialize the StyleSheetContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param assistantSid - The unique ID of the Assistant
      */
    def this(version: typings.twilio.understandMod.^, payload: StyleSheetPayload, assistantSid: String) = this()
    
    /* private */ var _proxy: StyleSheetContext = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var data: Any = js.native
    
    /**
      * fetch a StyleSheetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[StyleSheetInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[StyleSheetInstance] = js.native
    
    /**
      * update a StyleSheetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[StyleSheetInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[StyleSheetInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[StyleSheetInstance] = js.native
    def update(opts: StyleSheetInstanceUpdateOptions): js.Promise[StyleSheetInstance] = js.native
    def update(
      opts: StyleSheetInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[StyleSheetInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the StyleSheetList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The unique ID of the Assistant
    */
  inline def StyleSheetList(version: typings.twilio.understandMod.^, assistantSid: String): StyleSheetListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("StyleSheetList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any])).asInstanceOf[StyleSheetListInstance]
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/styleSheet", "StyleSheetPage")
  @js.native
  open class StyleSheetPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.understandMod.^, 
          StyleSheetPayload, 
          StyleSheetResource, 
          StyleSheetInstance
        ] {
    /**
      * Initialize the StyleSheetPage
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
      solution: StyleSheetSolution
    ) = this()
    
    /**
      * Build an instance of StyleSheetInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: StyleSheetPayload): StyleSheetInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property styleSheet - The JSON Style sheet string
    */
  trait StyleSheetInstanceUpdateOptions extends StObject {
    
    var styleSheet: js.UndefOr[js.Object] = js.undefined
  }
  object StyleSheetInstanceUpdateOptions {
    
    inline def apply(): StyleSheetInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleSheetInstanceUpdateOptions]
    }
    
    extension [Self <: StyleSheetInstanceUpdateOptions](x: Self) {
      
      inline def setStyleSheet(value: js.Object): Self = StObject.set(x, "styleSheet", value.asInstanceOf[js.Any])
      
      inline def setStyleSheetUndefined: Self = StObject.set(x, "styleSheet", js.undefined)
    }
  }
  
  @js.native
  trait StyleSheetListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): StyleSheetContext = js.native
    
    /**
      * Constructs a style_sheet
      */
    def get(): StyleSheetContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait StyleSheetPayload
    extends StObject
       with StyleSheetResource
       with TwilioResponsePayload
  object StyleSheetPayload {
    
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
    ): StyleSheetPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSheetPayload]
    }
  }
  
  trait StyleSheetResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var data: js.Object
    
    var url: String
  }
  object StyleSheetResource {
    
    inline def apply(account_sid: String, assistant_sid: String, data: js.Object, url: String): StyleSheetResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSheetResource]
    }
    
    extension [Self <: StyleSheetResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyleSheetSolution extends StObject {
    
    var assistantSid: js.UndefOr[String] = js.undefined
  }
  object StyleSheetSolution {
    
    inline def apply(): StyleSheetSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleSheetSolution]
    }
    
    extension [Self <: StyleSheetSolution](x: Self) {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
    }
  }
}
