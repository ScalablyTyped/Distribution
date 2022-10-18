package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantDialogueMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/dialogue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/dialogue", "DialogueContext")
  @js.native
  open class DialogueContext protected () extends StObject {
    /**
      * Initialize the DialogueContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The assistant_sid
      * @param sid - The sid
      */
    def this(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String, sid: String) = this()
    
    /**
      * fetch a DialogueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DialogueInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ DialogueInstance, Any]): js.Promise[DialogueInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/dialogue", "DialogueInstance")
  @js.native
  open class DialogueInstance protected () extends SerializableClass {
    /**
      * Initialize the DialogueContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param assistantSid - The unique ID of the parent Assistant.
      * @param sid - The sid
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      payload: DialoguePayload,
      assistantSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: DialogueContext = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var data: Any = js.native
    
    /**
      * fetch a DialogueInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DialogueInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DialogueInstance] = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the DialogueList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The unique ID of the parent Assistant.
    */
  inline def DialogueList(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String): DialogueListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("DialogueList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any])).asInstanceOf[DialogueListInstance]
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/dialogue", "DialoguePage")
  @js.native
  open class DialoguePage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewUnderstandMod.^, 
          DialoguePayload, 
          DialogueResource, 
          DialogueInstance
        ] {
    /**
      * Initialize the DialoguePage
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
      solution: DialogueSolution
    ) = this()
    
    /**
      * Build an instance of DialogueInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DialoguePayload): DialogueInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait DialogueListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): DialogueContext = js.native
    
    /**
      * Constructs a dialogue
      *
      * @param sid - The sid
      */
    def get(sid: String): DialogueContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait DialoguePayload
    extends StObject
       with DialogueResource
       with TwilioResponsePayload
  object DialoguePayload {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      data: js.Object,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): DialoguePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialoguePayload]
    }
  }
  
  trait DialogueResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var data: js.Object
    
    var sid: String
    
    var url: String
  }
  object DialogueResource {
    
    inline def apply(account_sid: String, assistant_sid: String, data: js.Object, sid: String, url: String): DialogueResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogueResource]
    }
    
    extension [Self <: DialogueResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DialogueSolution extends StObject {
    
    var assistantSid: js.UndefOr[String] = js.undefined
  }
  object DialogueSolution {
    
    inline def apply(): DialogueSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogueSolution]
    }
    
    extension [Self <: DialogueSolution](x: Self) {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
    }
  }
}
