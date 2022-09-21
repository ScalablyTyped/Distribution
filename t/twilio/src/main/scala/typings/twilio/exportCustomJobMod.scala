package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.Failed_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportCustomJobMod {
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export/exportCustomJob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export/exportCustomJob", "ExportCustomJobInstance")
  @js.native
  open class ExportCustomJobInstance protected () extends SerializableClass {
    /**
      * Initialize the ExportCustomJobContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param resourceType - The type of communication – Messages, Calls, Conferences, and Participants
      */
    def this(version: typings.twilio.bulkexportsV1Mod.^, payload: ExportCustomJobPayload, resourceType: String) = this()
    
    var details: Any = js.native
    
    var email: String = js.native
    
    var endDay: String = js.native
    
    var estimatedCompletionTime: String = js.native
    
    var friendlyName: String = js.native
    
    var jobQueuePosition: String = js.native
    
    var jobSid: String = js.native
    
    var resourceType: String = js.native
    
    var startDay: String = js.native
    
    var webhookMethod: String = js.native
    
    var webhookUrl: String = js.native
  }
  
  /**
    * Initialize the ExportCustomJobList
    *
    * @param version - Version of the resource
    * @param resourceType - The type of communication – Messages, Calls, Conferences, and Participants
    */
  inline def ExportCustomJobList(version: typings.twilio.bulkexportsV1Mod.^, resourceType: String): ExportCustomJobListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ExportCustomJobList")(version.asInstanceOf[js.Any], resourceType.asInstanceOf[js.Any])).asInstanceOf[ExportCustomJobListInstance]
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export/exportCustomJob", "ExportCustomJobPage")
  @js.native
  open class ExportCustomJobPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.bulkexportsV1Mod.^, 
          ExportCustomJobPayload, 
          ExportCustomJobResource, 
          ExportCustomJobInstance
        ] {
    /**
      * Initialize the ExportCustomJobPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.bulkexportsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ExportCustomJobSolution
    ) = this()
    
    /**
      * Build an instance of ExportCustomJobInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ExportCustomJobPayload): ExportCustomJobInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ExportCustomJobListInstance extends StObject {
    
    /**
      * create a ExportCustomJobInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ExportCustomJobListInstanceCreateOptions): js.Promise[ExportCustomJobInstance] = js.native
    def create(
      opts: ExportCustomJobListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ExportCustomJobInstance, Any]
    ): js.Promise[ExportCustomJobInstance] = js.native
    
    /**
      * Streams ExportCustomJobInstance records from the API.
      *
      * This operation lazily loads records as efficiently as possible until the limit
      * is reached.
      *
      * The results are passed into the callback function, so this operation is memory
      * efficient.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ ExportCustomJobInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ExportCustomJobInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ExportCustomJobListInstanceEachOptions): Unit = js.native
    def each(
      opts: ExportCustomJobListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ExportCustomJobInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of ExportCustomJobInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ExportCustomJobPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExportCustomJobPage, Any]): js.Promise[ExportCustomJobPage] = js.native
    def getPage(targetUrl: String): js.Promise[ExportCustomJobPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExportCustomJobPage, Any]
    ): js.Promise[ExportCustomJobPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExportCustomJobPage, Any]
    ): js.Promise[ExportCustomJobPage] = js.native
    
    /**
      * Lists ExportCustomJobInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ExportCustomJobInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ExportCustomJobInstance], Any]
    ): js.Promise[js.Array[ExportCustomJobInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ExportCustomJobInstance], Any]
    ): js.Promise[js.Array[ExportCustomJobInstance]] = js.native
    def list(opts: ExportCustomJobListInstanceOptions): js.Promise[js.Array[ExportCustomJobInstance]] = js.native
    def list(
      opts: ExportCustomJobListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ExportCustomJobInstance], Any]
    ): js.Promise[js.Array[ExportCustomJobInstance]] = js.native
    
    /**
      * Retrieve a single page of ExportCustomJobInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ExportCustomJobPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExportCustomJobPage, Any]): js.Promise[ExportCustomJobPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExportCustomJobPage, Any]
    ): js.Promise[ExportCustomJobPage] = js.native
    def page(opts: ExportCustomJobListInstancePageOptions): js.Promise[ExportCustomJobPage] = js.native
    def page(
      opts: ExportCustomJobListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExportCustomJobPage, Any]
    ): js.Promise[ExportCustomJobPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property email - The optional email to send the completion notification to
    * @property endDay - The end day for the custom export specified as a string in the format of yyyy-mm-dd. End day is inclusive and must be 2 days earlier than the current UTC day.
    * @property friendlyName - The friendly name specified when creating the job
    * @property startDay - The start day for the custom export specified as a string in the format of yyyy-mm-dd
    * @property webhookMethod - This is the method used to call the webhook on completion of the job. If this is supplied, `WebhookUrl` must also be supplied.
    * @property webhookUrl - The optional webhook url called on completion of the job. If this is supplied, `WebhookMethod` must also be supplied.
    */
  trait ExportCustomJobListInstanceCreateOptions extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var endDay: String
    
    var friendlyName: String
    
    var startDay: String
    
    var webhookMethod: js.UndefOr[String] = js.undefined
    
    var webhookUrl: js.UndefOr[String] = js.undefined
  }
  object ExportCustomJobListInstanceCreateOptions {
    
    inline def apply(endDay: String, friendlyName: String, startDay: String): ExportCustomJobListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(endDay = endDay.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], startDay = startDay.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportCustomJobListInstanceCreateOptions]
    }
    
    extension [Self <: ExportCustomJobListInstanceCreateOptions](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setEndDay(value: String): Self = StObject.set(x, "endDay", value.asInstanceOf[js.Any])
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setStartDay(value: String): Self = StObject.set(x, "startDay", value.asInstanceOf[js.Any])
      
      inline def setWebhookMethod(value: String): Self = StObject.set(x, "webhookMethod", value.asInstanceOf[js.Any])
      
      inline def setWebhookMethodUndefined: Self = StObject.set(x, "webhookMethod", js.undefined)
      
      inline def setWebhookUrl(value: String): Self = StObject.set(x, "webhookUrl", value.asInstanceOf[js.Any])
      
      inline def setWebhookUrlUndefined: Self = StObject.set(x, "webhookUrl", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait ExportCustomJobListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ExportCustomJobInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ExportCustomJobListInstanceEachOptions {
    
    inline def apply(): ExportCustomJobListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportCustomJobListInstanceEachOptions]
    }
    
    extension [Self <: ExportCustomJobListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ExportCustomJobInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    */
  trait ExportCustomJobListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ExportCustomJobListInstanceOptions {
    
    inline def apply(): ExportCustomJobListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportCustomJobListInstanceOptions]
    }
    
    extension [Self <: ExportCustomJobListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait ExportCustomJobListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ExportCustomJobListInstancePageOptions {
    
    inline def apply(): ExportCustomJobListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportCustomJobListInstancePageOptions]
    }
    
    extension [Self <: ExportCustomJobListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ExportCustomJobPayload
    extends StObject
       with ExportCustomJobResource
       with TwilioResponsePayload
  object ExportCustomJobPayload {
    
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
      webhook_method: String,
      webhook_url: String
    ): ExportCustomJobPayload = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], end_day = end_day.asInstanceOf[js.Any], estimated_completion_time = estimated_completion_time.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], job_queue_position = job_queue_position.asInstanceOf[js.Any], job_sid = job_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], start_day = start_day.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], webhook_method = webhook_method.asInstanceOf[js.Any], webhook_url = webhook_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportCustomJobPayload]
    }
  }
  
  trait ExportCustomJobResource extends StObject {
    
    var details: js.Object
    
    var email: String
    
    var end_day: String
    
    var estimated_completion_time: String
    
    var friendly_name: String
    
    var job_queue_position: String
    
    var job_sid: String
    
    var resource_type: String
    
    var start_day: String
    
    var webhook_method: String
    
    var webhook_url: String
  }
  object ExportCustomJobResource {
    
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
      webhook_method: String,
      webhook_url: String
    ): ExportCustomJobResource = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], end_day = end_day.asInstanceOf[js.Any], estimated_completion_time = estimated_completion_time.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], job_queue_position = job_queue_position.asInstanceOf[js.Any], job_sid = job_sid.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], start_day = start_day.asInstanceOf[js.Any], webhook_method = webhook_method.asInstanceOf[js.Any], webhook_url = webhook_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportCustomJobResource]
    }
    
    extension [Self <: ExportCustomJobResource](x: Self) {
      
      inline def setDetails(value: js.Object): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEnd_day(value: String): Self = StObject.set(x, "end_day", value.asInstanceOf[js.Any])
      
      inline def setEstimated_completion_time(value: String): Self = StObject.set(x, "estimated_completion_time", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setJob_queue_position(value: String): Self = StObject.set(x, "job_queue_position", value.asInstanceOf[js.Any])
      
      inline def setJob_sid(value: String): Self = StObject.set(x, "job_sid", value.asInstanceOf[js.Any])
      
      inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
      
      inline def setStart_day(value: String): Self = StObject.set(x, "start_day", value.asInstanceOf[js.Any])
      
      inline def setWebhook_method(value: String): Self = StObject.set(x, "webhook_method", value.asInstanceOf[js.Any])
      
      inline def setWebhook_url(value: String): Self = StObject.set(x, "webhook_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExportCustomJobSolution extends StObject {
    
    var resourceType: js.UndefOr[String] = js.undefined
  }
  object ExportCustomJobSolution {
    
    inline def apply(): ExportCustomJobSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportCustomJobSolution]
    }
    
    extension [Self <: ExportCustomJobSolution](x: Self) {
      
      inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    }
  }
  
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
  trait ExportCustomJobStatus extends StObject
  object ExportCustomJobStatus {
    
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
