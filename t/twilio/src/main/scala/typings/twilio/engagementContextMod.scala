package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engagementContextMod {
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement/engagementContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement/engagementContext", "EngagementContextContext")
  @js.native
  open class EngagementContextContext protected () extends StObject {
    /**
      * Initialize the EngagementContextContext
      *
      * @param version - Version of the resource
      * @param flowSid - Flow SID
      * @param engagementSid - Engagement SID
      */
    def this(version: typings.twilio.studioV1Mod.^, flowSid: String, engagementSid: String) = this()
    
    /**
      * fetch a EngagementContextInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EngagementContextInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ EngagementContextInstance, Any]): js.Promise[EngagementContextInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement/engagementContext", "EngagementContextInstance")
  @js.native
  open class EngagementContextInstance protected () extends SerializableClass {
    /**
      * Initialize the EngagementContextContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param flowSid - Flow SID
      * @param engagementSid - Engagement SID
      */
    def this(
      version: typings.twilio.studioV1Mod.^,
      payload: EngagementContextPayload,
      flowSid: String,
      engagementSid: String
    ) = this()
    
    /* private */ var _proxy: EngagementContextContext = js.native
    
    var accountSid: String = js.native
    
    var context: Any = js.native
    
    var engagementSid: String = js.native
    
    /**
      * fetch a EngagementContextInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EngagementContextInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[EngagementContextInstance] = js.native
    
    var flowSid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the EngagementContextList
    *
    * @param version - Version of the resource
    * @param flowSid - Flow SID
    * @param engagementSid - Engagement SID
    */
  inline def EngagementContextList(version: typings.twilio.studioV1Mod.^, flowSid: String, engagementSid: String): EngagementContextListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("EngagementContextList")(version.asInstanceOf[js.Any], flowSid.asInstanceOf[js.Any], engagementSid.asInstanceOf[js.Any])).asInstanceOf[EngagementContextListInstance]
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement/engagementContext", "EngagementContextPage")
  @js.native
  open class EngagementContextPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.studioV1Mod.^, 
          EngagementContextPayload, 
          EngagementContextResource, 
          EngagementContextInstance
        ] {
    /**
      * Initialize the EngagementContextPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.studioV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: EngagementContextSolution
    ) = this()
    
    /**
      * Build an instance of EngagementContextInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: EngagementContextPayload): EngagementContextInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait EngagementContextListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): EngagementContextContext = js.native
    
    /**
      * Constructs a engagement_context
      */
    def get(): EngagementContextContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait EngagementContextPayload
    extends StObject
       with EngagementContextResource
       with TwilioResponsePayload
  object EngagementContextPayload {
    
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
      uri: String,
      url: String
    ): EngagementContextPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], engagement_sid = engagement_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngagementContextPayload]
    }
  }
  
  trait EngagementContextResource extends StObject {
    
    var account_sid: String
    
    var context: js.Object
    
    var engagement_sid: String
    
    var flow_sid: String
    
    var url: String
  }
  object EngagementContextResource {
    
    inline def apply(account_sid: String, context: js.Object, engagement_sid: String, flow_sid: String, url: String): EngagementContextResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], engagement_sid = engagement_sid.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngagementContextResource]
    }
    
    extension [Self <: EngagementContextResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setEngagement_sid(value: String): Self = StObject.set(x, "engagement_sid", value.asInstanceOf[js.Any])
      
      inline def setFlow_sid(value: String): Self = StObject.set(x, "flow_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait EngagementContextSolution extends StObject {
    
    var engagementSid: js.UndefOr[String] = js.undefined
    
    var flowSid: js.UndefOr[String] = js.undefined
  }
  object EngagementContextSolution {
    
    inline def apply(): EngagementContextSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EngagementContextSolution]
    }
    
    extension [Self <: EngagementContextSolution](x: Self) {
      
      inline def setEngagementSid(value: String): Self = StObject.set(x, "engagementSid", value.asInstanceOf[js.Any])
      
      inline def setEngagementSidUndefined: Self = StObject.set(x, "engagementSid", js.undefined)
      
      inline def setFlowSid(value: String): Self = StObject.set(x, "flowSid", value.asInstanceOf[js.Any])
      
      inline def setFlowSidUndefined: Self = StObject.set(x, "flowSid", js.undefined)
    }
  }
}
