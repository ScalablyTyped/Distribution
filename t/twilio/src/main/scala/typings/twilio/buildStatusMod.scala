package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildStatusMod {
  
  @JSImport("twilio/lib/rest/serverless/v1/service/build/buildStatus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/serverless/v1/service/build/buildStatus", "BuildStatusContext")
  @js.native
  open class BuildStatusContext protected () extends StObject {
    /**
      * Initialize the BuildStatusContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the Build resource from
      * @param sid - The SID of the Build resource to fetch
      */
    def this(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * fetch a BuildStatusInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BuildStatusInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ BuildStatusInstance, Any]): js.Promise[BuildStatusInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/serverless/v1/service/build/buildStatus", "BuildStatusInstance")
  @js.native
  open class BuildStatusInstance protected () extends SerializableClass {
    /**
      * Initialize the BuildStatusContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the Build resource is associated with
      * @param sid - The unique string that identifies the Build resource
      */
    def this(
      version: typings.twilio.serverlessV1Mod.^,
      payload: BuildStatusPayload,
      serviceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: BuildStatusContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * fetch a BuildStatusInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BuildStatusInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BuildStatusInstance] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var status: BuildStatusStatus = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the BuildStatusList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the Build resource is associated with
    * @param sid - The unique string that identifies the Build resource
    */
  inline def BuildStatusList(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, sid: String): BuildStatusListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildStatusList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], sid.asInstanceOf[js.Any])).asInstanceOf[BuildStatusListInstance]
  
  @JSImport("twilio/lib/rest/serverless/v1/service/build/buildStatus", "BuildStatusPage")
  @js.native
  open class BuildStatusPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.serverlessV1Mod.^, 
          BuildStatusPayload, 
          BuildStatusResource, 
          BuildStatusInstance
        ] {
    /**
      * Initialize the BuildStatusPage
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
      solution: BuildStatusSolution
    ) = this()
    
    /**
      * Build an instance of BuildStatusInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: BuildStatusPayload): BuildStatusInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait BuildStatusListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): BuildStatusContext = js.native
    
    /**
      * Constructs a build_status
      */
    def get(): BuildStatusContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait BuildStatusPayload
    extends StObject
       with BuildStatusResource
       with TwilioResponsePayload
  object BuildStatusPayload {
    
    inline def apply(
      account_sid: String,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      status: BuildStatusStatus,
      uri: String,
      url: String
    ): BuildStatusPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildStatusPayload]
    }
  }
  
  trait BuildStatusResource extends StObject {
    
    var account_sid: String
    
    var service_sid: String
    
    var sid: String
    
    var status: BuildStatusStatus
    
    var url: String
  }
  object BuildStatusResource {
    
    inline def apply(account_sid: String, service_sid: String, sid: String, status: BuildStatusStatus, url: String): BuildStatusResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildStatusResource]
    }
    
    extension [Self <: BuildStatusResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: BuildStatusStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait BuildStatusSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
    
    var sid: js.UndefOr[String] = js.undefined
  }
  object BuildStatusSolution {
    
    inline def apply(): BuildStatusSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildStatusSolution]
    }
    
    extension [Self <: BuildStatusSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.building
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.failed__
  */
  trait BuildStatusStatus extends StObject
  object BuildStatusStatus {
    
    inline def building: typings.twilio.twilioStrings.building = "building".asInstanceOf[typings.twilio.twilioStrings.building]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
  }
}
