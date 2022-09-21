package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepContextMod {
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement/step/stepContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement/step/stepContext", "StepContextContext")
  @js.native
  open class StepContextContext protected () extends StObject {
    /**
      * Initialize the StepContextContext
      *
      * @param version - Version of the resource
      * @param flowSid - The SID of the Flow
      * @param engagementSid - The SID of the Engagement
      * @param stepSid - Step SID
      */
    def this(version: typings.twilio.studioV1Mod.^, flowSid: String, engagementSid: String, stepSid: String) = this()
    
    /**
      * fetch a StepContextInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[StepContextInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ StepContextInstance, Any]): js.Promise[StepContextInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement/step/stepContext", "StepContextInstance")
  @js.native
  open class StepContextInstance protected () extends SerializableClass {
    /**
      * Initialize the StepContextContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param flowSid - The SID of the Flow
      * @param engagementSid - The SID of the Engagement
      * @param stepSid - Step SID
      */
    def this(
      version: typings.twilio.studioV1Mod.^,
      payload: StepContextPayload,
      flowSid: String,
      engagementSid: String,
      stepSid: String
    ) = this()
    
    /* private */ var _proxy: StepContextContext = js.native
    
    var accountSid: String = js.native
    
    var context: Any = js.native
    
    var engagementSid: String = js.native
    
    /**
      * fetch a StepContextInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[StepContextInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[StepContextInstance] = js.native
    
    var flowSid: String = js.native
    
    var stepSid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the StepContextList
    *
    * @param version - Version of the resource
    * @param flowSid - The SID of the Flow
    * @param engagementSid - The SID of the Engagement
    * @param stepSid - Step SID
    */
  inline def StepContextList(version: typings.twilio.studioV1Mod.^, flowSid: String, engagementSid: String, stepSid: String): StepContextListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("StepContextList")(version.asInstanceOf[js.Any], flowSid.asInstanceOf[js.Any], engagementSid.asInstanceOf[js.Any], stepSid.asInstanceOf[js.Any])).asInstanceOf[StepContextListInstance]
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement/step/stepContext", "StepContextPage")
  @js.native
  open class StepContextPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.studioV1Mod.^, 
          StepContextPayload, 
          StepContextResource, 
          StepContextInstance
        ] {
    /**
      * Initialize the StepContextPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.studioV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: StepContextSolution
    ) = this()
    
    /**
      * Build an instance of StepContextInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: StepContextPayload): StepContextInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait StepContextListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): StepContextContext = js.native
    
    /**
      * Constructs a step_context
      */
    def get(): StepContextContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait StepContextPayload
    extends StObject
       with StepContextResource
       with TwilioResponsePayload
  object StepContextPayload {
    
    inline def apply(
      account_sid: String,
      context: js.Object,
      engagement_sid: String,
      first_page_uri: String,
      flow_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      step_sid: String,
      uri: String,
      url: String
    ): StepContextPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], engagement_sid = engagement_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], step_sid = step_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepContextPayload]
    }
  }
  
  trait StepContextResource extends StObject {
    
    var account_sid: String
    
    var context: js.Object
    
    var engagement_sid: String
    
    var flow_sid: String
    
    var step_sid: String
    
    var url: String
  }
  object StepContextResource {
    
    inline def apply(
      account_sid: String,
      context: js.Object,
      engagement_sid: String,
      flow_sid: String,
      step_sid: String,
      url: String
    ): StepContextResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], engagement_sid = engagement_sid.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], step_sid = step_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepContextResource]
    }
    
    extension [Self <: StepContextResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setEngagement_sid(value: String): Self = StObject.set(x, "engagement_sid", value.asInstanceOf[js.Any])
      
      inline def setFlow_sid(value: String): Self = StObject.set(x, "flow_sid", value.asInstanceOf[js.Any])
      
      inline def setStep_sid(value: String): Self = StObject.set(x, "step_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait StepContextSolution extends StObject {
    
    var engagementSid: js.UndefOr[String] = js.undefined
    
    var flowSid: js.UndefOr[String] = js.undefined
    
    var stepSid: js.UndefOr[String] = js.undefined
  }
  object StepContextSolution {
    
    inline def apply(): StepContextSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepContextSolution]
    }
    
    extension [Self <: StepContextSolution](x: Self) {
      
      inline def setEngagementSid(value: String): Self = StObject.set(x, "engagementSid", value.asInstanceOf[js.Any])
      
      inline def setEngagementSidUndefined: Self = StObject.set(x, "engagementSid", js.undefined)
      
      inline def setFlowSid(value: String): Self = StObject.set(x, "flowSid", value.asInstanceOf[js.Any])
      
      inline def setFlowSidUndefined: Self = StObject.set(x, "flowSid", js.undefined)
      
      inline def setStepSid(value: String): Self = StObject.set(x, "stepSid", value.asInstanceOf[js.Any])
      
      inline def setStepSidUndefined: Self = StObject.set(x, "stepSid", js.undefined)
    }
  }
}
