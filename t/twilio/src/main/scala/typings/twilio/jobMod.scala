package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.Failed_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobMod {
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export/job", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export/job", "JobContext")
  @js.native
  open class JobContext protected () extends StObject {
    /**
      * Initialize the JobContext
      *
      * @param version - Version of the resource
      * @param jobSid - The unique string that that we created to identify the Bulk Export job
      */
    def this(version: typings.twilio.bulkexportsV1Mod.^, jobSid: String) = this()
    
    /**
      * fetch a JobInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[JobInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ JobInstance, Any]): js.Promise[JobInstance] = js.native
    
    /**
      * remove a JobInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ JobInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export/job", "JobInstance")
  @js.native
  open class JobInstance protected () extends SerializableClass {
    /**
      * Initialize the JobContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param jobSid - The unique string that that we created to identify the Bulk Export job
      */
    def this(version: typings.twilio.bulkexportsV1Mod.^, payload: JobPayload, jobSid: String) = this()
    
    /* private */ var _proxy: JobContext = js.native
    
    var details: Any = js.native
    
    var email: String = js.native
    
    var endDay: String = js.native
    
    var estimatedCompletionTime: String = js.native
    
    /**
      * fetch a JobInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[JobInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[JobInstance] = js.native
    
    var friendlyName: String = js.native
    
    var jobQueuePosition: String = js.native
    
    var jobSid: String = js.native
    
    /**
      * remove a JobInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var resourceType: String = js.native
    
    var startDay: String = js.native
    
    var url: String = js.native
    
    var webhookMethod: String = js.native
    
    var webhookUrl: String = js.native
  }
  
  /**
    * Initialize the JobList
    *
    * @param version - Version of the resource
    */
  inline def JobList(version: typings.twilio.bulkexportsV1Mod.^): JobListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("JobList")(version.asInstanceOf[js.Any]).asInstanceOf[JobListInstance]
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export/job", "JobPage")
  @js.native
  open class JobPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.bulkexportsV1Mod.^, JobPayload, JobResource, JobInstance] {
    /**
      * Initialize the JobPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.bulkexportsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: JobSolution
    ) = this()
    
    /**
      * Build an instance of JobInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: JobPayload): JobInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait JobListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): JobContext = js.native
    
    /**
      * Constructs a job
      *
      * @param jobSid - The unique string that that we created to identify the Bulk Export job
      */
    def get(jobSid: String): JobContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait JobPayload
    extends StObject
       with JobResource
       with TwilioResponsePayload
  object JobPayload {
    
    inline def apply(
      details: js.Object,
      email: String,
      end_day: String,
      estimated_completion_time: String,
      first_page_uri: String,
      friendly_name: String,
      job_queue_position: String,
      job_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      resource_type: String,
      start_day: String,
      uri: String,
      url: String,
      webhook_method: String,
      webhook_url: String
    ): JobPayload = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], end_day = end_day.asInstanceOf[js.Any], estimated_completion_time = estimated_completion_time.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], job_queue_position = job_queue_position.asInstanceOf[js.Any], job_sid = job_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], start_day = start_day.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webhook_method = webhook_method.asInstanceOf[js.Any], webhook_url = webhook_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobPayload]
    }
  }
  
  trait JobResource extends StObject {
    
    var details: js.Object
    
    var email: String
    
    var end_day: String
    
    var estimated_completion_time: String
    
    var friendly_name: String
    
    var job_queue_position: String
    
    var job_sid: String
    
    var resource_type: String
    
    var start_day: String
    
    var url: String
    
    var webhook_method: String
    
    var webhook_url: String
  }
  object JobResource {
    
    inline def apply(
      details: js.Object,
      email: String,
      end_day: String,
      estimated_completion_time: String,
      friendly_name: String,
      job_queue_position: String,
      job_sid: String,
      resource_type: String,
      start_day: String,
      url: String,
      webhook_method: String,
      webhook_url: String
    ): JobResource = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], end_day = end_day.asInstanceOf[js.Any], estimated_completion_time = estimated_completion_time.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], job_queue_position = job_queue_position.asInstanceOf[js.Any], job_sid = job_sid.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], start_day = start_day.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webhook_method = webhook_method.asInstanceOf[js.Any], webhook_url = webhook_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobResource]
    }
    
    extension [Self <: JobResource](x: Self) {
      
      inline def setDetails(value: js.Object): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEnd_day(value: String): Self = StObject.set(x, "end_day", value.asInstanceOf[js.Any])
      
      inline def setEstimated_completion_time(value: String): Self = StObject.set(x, "estimated_completion_time", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setJob_queue_position(value: String): Self = StObject.set(x, "job_queue_position", value.asInstanceOf[js.Any])
      
      inline def setJob_sid(value: String): Self = StObject.set(x, "job_sid", value.asInstanceOf[js.Any])
      
      inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
      
      inline def setStart_day(value: String): Self = StObject.set(x, "start_day", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWebhook_method(value: String): Self = StObject.set(x, "webhook_method", value.asInstanceOf[js.Any])
      
      inline def setWebhook_url(value: String): Self = StObject.set(x, "webhook_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait JobSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.ErrorDuringRun
    - typings.twilio.twilioStrings.Submitted
    - typings.twilio.twilioStrings.Running
    - typings.twilio.twilioStrings.CompletedEmptyRecords
    - typings.twilio.twilioStrings.Completed
    - typings.twilio.twilioStrings.Failed_
    - typings.twilio.twilioStrings.RunningToBeDeleted
    - typings.twilio.twilioStrings.DeletedByUserRequest
  */
  trait JobStatus extends StObject
  object JobStatus {
    
    inline def Completed: typings.twilio.twilioStrings.Completed = "Completed".asInstanceOf[typings.twilio.twilioStrings.Completed]
    
    inline def CompletedEmptyRecords: typings.twilio.twilioStrings.CompletedEmptyRecords = "CompletedEmptyRecords".asInstanceOf[typings.twilio.twilioStrings.CompletedEmptyRecords]
    
    inline def DeletedByUserRequest: typings.twilio.twilioStrings.DeletedByUserRequest = "DeletedByUserRequest".asInstanceOf[typings.twilio.twilioStrings.DeletedByUserRequest]
    
    inline def ErrorDuringRun: typings.twilio.twilioStrings.ErrorDuringRun = "ErrorDuringRun".asInstanceOf[typings.twilio.twilioStrings.ErrorDuringRun]
    
    inline def Failed: Failed_ = "Failed".asInstanceOf[Failed_]
    
    inline def Running: typings.twilio.twilioStrings.Running = "Running".asInstanceOf[typings.twilio.twilioStrings.Running]
    
    inline def RunningToBeDeleted: typings.twilio.twilioStrings.RunningToBeDeleted = "RunningToBeDeleted".asInstanceOf[typings.twilio.twilioStrings.RunningToBeDeleted]
    
    inline def Submitted: typings.twilio.twilioStrings.Submitted = "Submitted".asInstanceOf[typings.twilio.twilioStrings.Submitted]
  }
}
