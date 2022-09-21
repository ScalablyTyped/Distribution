package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionVersionContentMod {
  
  @JSImport("twilio/lib/rest/serverless/v1/service/function/functionVersion/functionVersionContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/serverless/v1/service/function/functionVersion/functionVersionContent", "FunctionVersionContentContext")
  @js.native
  open class FunctionVersionContentContext protected () extends StObject {
    /**
      * Initialize the FunctionVersionContentContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the Function Version content from
      * @param functionSid - The SID of the Function that is the parent of the Function Version content to fetch
      * @param sid - The SID that identifies the Function Version content to fetch
      */
    def this(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, functionSid: String, sid: String) = this()
    
    /**
      * fetch a FunctionVersionContentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FunctionVersionContentInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FunctionVersionContentInstance, Any]
    ): js.Promise[FunctionVersionContentInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/serverless/v1/service/function/functionVersion/functionVersionContent", "FunctionVersionContentInstance")
  @js.native
  open class FunctionVersionContentInstance protected () extends SerializableClass {
    /**
      * Initialize the FunctionVersionContentContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the Function Version resource is associated with
      * @param functionSid - The SID of the Function that is the parent of the Function Version
      * @param sid - The unique string that identifies the Function Version resource
      */
    def this(
      version: typings.twilio.serverlessV1Mod.^,
      payload: FunctionVersionContentPayload,
      serviceSid: String,
      functionSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: FunctionVersionContentContext = js.native
    
    var accountSid: String = js.native
    
    var content: String = js.native
    
    /**
      * fetch a FunctionVersionContentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FunctionVersionContentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FunctionVersionContentInstance] = js.native
    
    var functionSid: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the FunctionVersionContentList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the Function Version resource is associated with
    * @param functionSid - The SID of the Function that is the parent of the Function Version
    * @param sid - The unique string that identifies the Function Version resource
    */
  inline def FunctionVersionContentList(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, functionSid: String, sid: String): FunctionVersionContentListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("FunctionVersionContentList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], functionSid.asInstanceOf[js.Any], sid.asInstanceOf[js.Any])).asInstanceOf[FunctionVersionContentListInstance]
  
  @JSImport("twilio/lib/rest/serverless/v1/service/function/functionVersion/functionVersionContent", "FunctionVersionContentPage")
  @js.native
  open class FunctionVersionContentPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.serverlessV1Mod.^, 
          FunctionVersionContentPayload, 
          FunctionVersionContentResource, 
          FunctionVersionContentInstance
        ] {
    /**
      * Initialize the FunctionVersionContentPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.serverlessV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: FunctionVersionContentSolution
    ) = this()
    
    /**
      * Build an instance of FunctionVersionContentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FunctionVersionContentPayload): FunctionVersionContentInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait FunctionVersionContentListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FunctionVersionContentContext = js.native
    
    /**
      * Constructs a function_version_content
      */
    def get(): FunctionVersionContentContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait FunctionVersionContentPayload
    extends StObject
       with FunctionVersionContentResource
       with TwilioResponsePayload
  object FunctionVersionContentPayload {
    
    inline def apply(
      account_sid: String,
      content: String,
      first_page_uri: String,
      function_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String
    ): FunctionVersionContentPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], function_sid = function_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionVersionContentPayload]
    }
  }
  
  trait FunctionVersionContentResource extends StObject {
    
    var account_sid: String
    
    var content: String
    
    var function_sid: String
    
    var service_sid: String
    
    var sid: String
    
    var url: String
  }
  object FunctionVersionContentResource {
    
    inline def apply(
      account_sid: String,
      content: String,
      function_sid: String,
      service_sid: String,
      sid: String,
      url: String
    ): FunctionVersionContentResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], function_sid = function_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionVersionContentResource]
    }
    
    extension [Self <: FunctionVersionContentResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFunction_sid(value: String): Self = StObject.set(x, "function_sid", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionVersionContentSolution extends StObject {
    
    var functionSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
    
    var sid: js.UndefOr[String] = js.undefined
  }
  object FunctionVersionContentSolution {
    
    inline def apply(): FunctionVersionContentSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionVersionContentSolution]
    }
    
    extension [Self <: FunctionVersionContentSolution](x: Self) {
      
      inline def setFunctionSid(value: String): Self = StObject.set(x, "functionSid", value.asInstanceOf[js.Any])
      
      inline def setFunctionSidUndefined: Self = StObject.set(x, "functionSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    }
  }
}
