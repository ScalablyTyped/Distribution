package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executionStepContextMod {
  
  @JSImport("twilio/lib/rest/studio/v1/flow/execution/executionStep/executionStepContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/studio/v1/flow/execution/executionStep/executionStepContext", "ExecutionStepContextContext")
  @js.native
  open class ExecutionStepContextContext protected () extends StObject {
    /**
      * Initialize the ExecutionStepContextContext
      *
      * @param version - Version of the resource
      * @param flowSid - The SID of the Flow
      * @param executionSid - The SID of the Execution
      * @param stepSid - Step SID
      */
    def this(version: typings.twilio.studioV1Mod.^, flowSid: String, executionSid: String, stepSid: String) = this()
    
    /**
      * fetch a ExecutionStepContextInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ExecutionStepContextInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionStepContextInstance, Any]): js.Promise[ExecutionStepContextInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/studio/v1/flow/execution/executionStep/executionStepContext", "ExecutionStepContextInstance")
  @js.native
  open class ExecutionStepContextInstance protected () extends SerializableClass {
    /**
      * Initialize the ExecutionStepContextContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param flowSid - The SID of the Flow
      * @param executionSid - The SID of the Execution
      * @param stepSid - Step SID
      */
    def this(
      version: typings.twilio.studioV1Mod.^,
      payload: ExecutionStepContextPayload,
      flowSid: String,
      executionSid: String,
      stepSid: String
    ) = this()
    
    /* private */ var _proxy: ExecutionStepContextContext = js.native
    
    var accountSid: String = js.native
    
    var context: Any = js.native
    
    var executionSid: String = js.native
    
    /**
      * fetch a ExecutionStepContextInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ExecutionStepContextInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ExecutionStepContextInstance] = js.native
    
    var flowSid: String = js.native
    
    var stepSid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ExecutionStepContextList
    *
    * @param version - Version of the resource
    * @param flowSid - The SID of the Flow
    * @param executionSid - The SID of the Execution
    * @param stepSid - Step SID
    */
  inline def ExecutionStepContextList(version: typings.twilio.studioV1Mod.^, flowSid: String, executionSid: String, stepSid: String): ExecutionStepContextListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ExecutionStepContextList")(version.asInstanceOf[js.Any], flowSid.asInstanceOf[js.Any], executionSid.asInstanceOf[js.Any], stepSid.asInstanceOf[js.Any])).asInstanceOf[ExecutionStepContextListInstance]
  
  @JSImport("twilio/lib/rest/studio/v1/flow/execution/executionStep/executionStepContext", "ExecutionStepContextPage")
  @js.native
  open class ExecutionStepContextPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.studioV1Mod.^, 
          ExecutionStepContextPayload, 
          ExecutionStepContextResource, 
          ExecutionStepContextInstance
        ] {
    /**
      * Initialize the ExecutionStepContextPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.studioV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ExecutionStepContextSolution
    ) = this()
    
    /**
      * Build an instance of ExecutionStepContextInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ExecutionStepContextPayload): ExecutionStepContextInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ExecutionStepContextListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ExecutionStepContextContext = js.native
    
    /**
      * Constructs a execution_step_context
      */
    def get(): ExecutionStepContextContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait ExecutionStepContextPayload
    extends StObject
       with ExecutionStepContextResource
       with TwilioResponsePayload
  object ExecutionStepContextPayload {
    
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
      step_sid: String,
      uri: String,
      url: String
    ): ExecutionStepContextPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], execution_sid = execution_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], step_sid = step_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionStepContextPayload]
    }
  }
  
  trait ExecutionStepContextResource extends StObject {
    
    var account_sid: String
    
    var context: js.Object
    
    var execution_sid: String
    
    var flow_sid: String
    
    var step_sid: String
    
    var url: String
  }
  object ExecutionStepContextResource {
    
    inline def apply(
      account_sid: String,
      context: js.Object,
      execution_sid: String,
      flow_sid: String,
      step_sid: String,
      url: String
    ): ExecutionStepContextResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], execution_sid = execution_sid.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], step_sid = step_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionStepContextResource]
    }
    
    extension [Self <: ExecutionStepContextResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setExecution_sid(value: String): Self = StObject.set(x, "execution_sid", value.asInstanceOf[js.Any])
      
      inline def setFlow_sid(value: String): Self = StObject.set(x, "flow_sid", value.asInstanceOf[js.Any])
      
      inline def setStep_sid(value: String): Self = StObject.set(x, "step_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecutionStepContextSolution extends StObject {
    
    var executionSid: js.UndefOr[String] = js.undefined
    
    var flowSid: js.UndefOr[String] = js.undefined
    
    var stepSid: js.UndefOr[String] = js.undefined
  }
  object ExecutionStepContextSolution {
    
    inline def apply(): ExecutionStepContextSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutionStepContextSolution]
    }
    
    extension [Self <: ExecutionStepContextSolution](x: Self) {
      
      inline def setExecutionSid(value: String): Self = StObject.set(x, "executionSid", value.asInstanceOf[js.Any])
      
      inline def setExecutionSidUndefined: Self = StObject.set(x, "executionSid", js.undefined)
      
      inline def setFlowSid(value: String): Self = StObject.set(x, "flowSid", value.asInstanceOf[js.Any])
      
      inline def setFlowSidUndefined: Self = StObject.set(x, "flowSid", js.undefined)
      
      inline def setStepSid(value: String): Self = StObject.set(x, "stepSid", value.asInstanceOf[js.Any])
      
      inline def setStepSidUndefined: Self = StObject.set(x, "stepSid", js.undefined)
    }
  }
}
