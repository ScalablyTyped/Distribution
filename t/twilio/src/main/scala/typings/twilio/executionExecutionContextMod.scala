package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executionExecutionContextMod {
  
  @JSImport("twilio/lib/rest/studio/v2/flow/execution/executionContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/studio/v2/flow/execution/executionContext", "ExecutionContextContext")
  @js.native
  open class ExecutionContextContext protected () extends StObject {
    /**
      * Initialize the ExecutionContextContext
      *
      * @param version - Version of the resource
      * @param flowSid - The SID of the Flow
      * @param executionSid - The SID of the Execution
      */
    def this(version: typings.twilio.studioV2Mod.^, flowSid: String, executionSid: String) = this()
    
    /**
      * fetch a ExecutionContextInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ExecutionContextInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionContextInstance, Any]): js.Promise[ExecutionContextInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/studio/v2/flow/execution/executionContext", "ExecutionContextInstance")
  @js.native
  open class ExecutionContextInstance protected () extends SerializableClass {
    /**
      * Initialize the ExecutionContextContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param flowSid - The SID of the Flow
      * @param executionSid - The SID of the Execution
      */
    def this(
      version: typings.twilio.studioV2Mod.^,
      payload: ExecutionContextPayload,
      flowSid: String,
      executionSid: String
    ) = this()
    
    /* private */ var _proxy: ExecutionContextContext = js.native
    
    var accountSid: String = js.native
    
    var context: Any = js.native
    
    var executionSid: String = js.native
    
    /**
      * fetch a ExecutionContextInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ExecutionContextInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ExecutionContextInstance] = js.native
    
    var flowSid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ExecutionContextList
    *
    * @param version - Version of the resource
    * @param flowSid - The SID of the Flow
    * @param executionSid - The SID of the Execution
    */
  inline def ExecutionContextList(version: typings.twilio.studioV2Mod.^, flowSid: String, executionSid: String): ExecutionContextListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ExecutionContextList")(version.asInstanceOf[js.Any], flowSid.asInstanceOf[js.Any], executionSid.asInstanceOf[js.Any])).asInstanceOf[ExecutionContextListInstance]
  
  @JSImport("twilio/lib/rest/studio/v2/flow/execution/executionContext", "ExecutionContextPage")
  @js.native
  open class ExecutionContextPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.studioV2Mod.^, 
          ExecutionContextPayload, 
          ExecutionContextResource, 
          ExecutionContextInstance
        ] {
    /**
      * Initialize the ExecutionContextPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.studioV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ExecutionContextSolution
    ) = this()
    
    /**
      * Build an instance of ExecutionContextInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ExecutionContextPayload): ExecutionContextInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ExecutionContextListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ExecutionContextContext = js.native
    
    /**
      * Constructs a execution_context
      */
    def get(): ExecutionContextContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait ExecutionContextPayload
    extends StObject
       with ExecutionContextResource
       with TwilioResponsePayload
  object ExecutionContextPayload {
    
    inline def apply(
      account_sid: String,
      context: js.Object,
      execution_sid: String,
      first_page_uri: String,
      flow_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String
    ): ExecutionContextPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], execution_sid = execution_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionContextPayload]
    }
  }
  
  trait ExecutionContextResource extends StObject {
    
    var account_sid: String
    
    var context: js.Object
    
    var execution_sid: String
    
    var flow_sid: String
    
    var url: String
  }
  object ExecutionContextResource {
    
    inline def apply(account_sid: String, context: js.Object, execution_sid: String, flow_sid: String, url: String): ExecutionContextResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], execution_sid = execution_sid.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionContextResource]
    }
    
    extension [Self <: ExecutionContextResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setExecution_sid(value: String): Self = StObject.set(x, "execution_sid", value.asInstanceOf[js.Any])
      
      inline def setFlow_sid(value: String): Self = StObject.set(x, "flow_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecutionContextSolution extends StObject {
    
    var executionSid: js.UndefOr[String] = js.undefined
    
    var flowSid: js.UndefOr[String] = js.undefined
  }
  object ExecutionContextSolution {
    
    inline def apply(): ExecutionContextSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutionContextSolution]
    }
    
    extension [Self <: ExecutionContextSolution](x: Self) {
      
      inline def setExecutionSid(value: String): Self = StObject.set(x, "executionSid", value.asInstanceOf[js.Any])
      
      inline def setExecutionSidUndefined: Self = StObject.set(x, "executionSid", js.undefined)
      
      inline def setFlowSid(value: String): Self = StObject.set(x, "flowSid", value.asInstanceOf[js.Any])
      
      inline def setFlowSidUndefined: Self = StObject.set(x, "flowSid", js.undefined)
    }
  }
}
