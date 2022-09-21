package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restoreAssistantMod {
  
  @JSImport("twilio/lib/rest/autopilot/v1/restoreAssistant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/autopilot/v1/restoreAssistant", "RestoreAssistantInstance")
  @js.native
  open class RestoreAssistantInstance protected () extends SerializableClass {
    /**
      * Initialize the RestoreAssistantContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.autopilotV1Mod.^, payload: RestoreAssistantPayload) = this()
    
    var accountSid: String = js.native
    
    var callbackEvents: String = js.native
    
    var callbackUrl: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var developmentStage: String = js.native
    
    var friendlyName: String = js.native
    
    var latestModelBuildSid: String = js.native
    
    var logQueries: Boolean = js.native
    
    var needsModelBuild: Boolean = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
  }
  
  /**
    * Initialize the RestoreAssistantList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def RestoreAssistantList(version: typings.twilio.autopilotV1Mod.^): RestoreAssistantListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("RestoreAssistantList")(version.asInstanceOf[js.Any]).asInstanceOf[RestoreAssistantListInstance]
  
  @JSImport("twilio/lib/rest/autopilot/v1/restoreAssistant", "RestoreAssistantPage")
  @js.native
  open class RestoreAssistantPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.autopilotV1Mod.^, 
          RestoreAssistantPayload, 
          RestoreAssistantResource, 
          RestoreAssistantInstance
        ] {
    /**
      * Initialize the RestoreAssistantPage
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
      solution: RestoreAssistantSolution
    ) = this()
    
    /**
      * Build an instance of RestoreAssistantInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: RestoreAssistantPayload): RestoreAssistantInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait RestoreAssistantListInstance extends StObject {
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a RestoreAssistantInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: RestoreAssistantListInstanceUpdateOptions): js.Promise[RestoreAssistantInstance] = js.native
    def update(
      opts: RestoreAssistantListInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[RestoreAssistantInstance] = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property assistant - The unique string that identifies the resource
    */
  trait RestoreAssistantListInstanceUpdateOptions extends StObject {
    
    var assistant: String
  }
  object RestoreAssistantListInstanceUpdateOptions {
    
    inline def apply(assistant: String): RestoreAssistantListInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(assistant = assistant.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreAssistantListInstanceUpdateOptions]
    }
    
    extension [Self <: RestoreAssistantListInstanceUpdateOptions](x: Self) {
      
      inline def setAssistant(value: String): Self = StObject.set(x, "assistant", value.asInstanceOf[js.Any])
    }
  }
  
  trait RestoreAssistantPayload
    extends StObject
       with RestoreAssistantResource
       with TwilioResponsePayload
  object RestoreAssistantPayload {
    
    inline def apply(
      account_sid: String,
      callback_events: String,
      callback_url: String,
      date_created: js.Date,
      date_updated: js.Date,
      development_stage: String,
      first_page_uri: String,
      friendly_name: String,
      latest_model_build_sid: String,
      log_queries: Boolean,
      needs_model_build: Boolean,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      unique_name: String,
      uri: String
    ): RestoreAssistantPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], callback_events = callback_events.asInstanceOf[js.Any], callback_url = callback_url.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], development_stage = development_stage.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], latest_model_build_sid = latest_model_build_sid.asInstanceOf[js.Any], log_queries = log_queries.asInstanceOf[js.Any], needs_model_build = needs_model_build.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreAssistantPayload]
    }
  }
  
  trait RestoreAssistantResource extends StObject {
    
    var account_sid: String
    
    var callback_events: String
    
    var callback_url: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var development_stage: String
    
    var friendly_name: String
    
    var latest_model_build_sid: String
    
    var log_queries: Boolean
    
    var needs_model_build: Boolean
    
    var sid: String
    
    var unique_name: String
  }
  object RestoreAssistantResource {
    
    inline def apply(
      account_sid: String,
      callback_events: String,
      callback_url: String,
      date_created: js.Date,
      date_updated: js.Date,
      development_stage: String,
      friendly_name: String,
      latest_model_build_sid: String,
      log_queries: Boolean,
      needs_model_build: Boolean,
      sid: String,
      unique_name: String
    ): RestoreAssistantResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], callback_events = callback_events.asInstanceOf[js.Any], callback_url = callback_url.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], development_stage = development_stage.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], latest_model_build_sid = latest_model_build_sid.asInstanceOf[js.Any], log_queries = log_queries.asInstanceOf[js.Any], needs_model_build = needs_model_build.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreAssistantResource]
    }
    
    extension [Self <: RestoreAssistantResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCallback_events(value: String): Self = StObject.set(x, "callback_events", value.asInstanceOf[js.Any])
      
      inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDevelopment_stage(value: String): Self = StObject.set(x, "development_stage", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLatest_model_build_sid(value: String): Self = StObject.set(x, "latest_model_build_sid", value.asInstanceOf[js.Any])
      
      inline def setLog_queries(value: Boolean): Self = StObject.set(x, "log_queries", value.asInstanceOf[js.Any])
      
      inline def setNeeds_model_build(value: Boolean): Self = StObject.set(x, "needs_model_build", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RestoreAssistantSolution extends StObject
}
