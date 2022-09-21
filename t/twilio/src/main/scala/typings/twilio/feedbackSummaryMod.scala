package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedbackSummaryMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/feedbackSummary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/feedbackSummary", "FeedbackSummaryContext")
  @js.native
  open class FeedbackSummaryContext protected () extends StObject {
    /**
      * Initialize the FeedbackSummaryContext
      *
      * @param version - Version of the resource
      * @param accountSid - The unique sid that identifies this account
      * @param sid - A string that uniquely identifies this feedback summary resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * fetch a FeedbackSummaryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FeedbackSummaryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FeedbackSummaryInstance, Any]): js.Promise[FeedbackSummaryInstance] = js.native
    
    /**
      * remove a FeedbackSummaryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ FeedbackSummaryInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/feedbackSummary", "FeedbackSummaryInstance")
  @js.native
  open class FeedbackSummaryInstance protected () extends SerializableClass {
    /**
      * Initialize the FeedbackSummaryContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created this resource
      * @param sid - A string that uniquely identifies this feedback summary resource
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: FeedbackSummaryPayload,
      accountSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: FeedbackSummaryContext = js.native
    
    var accountSid: String = js.native
    
    var callCount: Double = js.native
    
    var callFeedbackCount: Double = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var endDate: js.Date = js.native
    
    /**
      * fetch a FeedbackSummaryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FeedbackSummaryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FeedbackSummaryInstance] = js.native
    
    var includeSubaccounts: Boolean = js.native
    
    var issues: js.Array[js.Object] = js.native
    
    var qualityScoreAverage: Double = js.native
    
    var qualityScoreMedian: Double = js.native
    
    var qualityScoreStandardDeviation: Double = js.native
    
    /**
      * remove a FeedbackSummaryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var startDate: js.Date = js.native
    
    var status: FeedbackSummaryStatus = js.native
  }
  
  /**
    * Initialize the FeedbackSummaryList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created this resource
    */
  inline def FeedbackSummaryList(version: typings.twilio.v2010Mod.^, accountSid: String): FeedbackSummaryListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("FeedbackSummaryList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[FeedbackSummaryListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/feedbackSummary", "FeedbackSummaryPage")
  @js.native
  open class FeedbackSummaryPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          FeedbackSummaryPayload, 
          FeedbackSummaryResource, 
          FeedbackSummaryInstance
        ] {
    /**
      * Initialize the FeedbackSummaryPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: FeedbackSummarySolution
    ) = this()
    
    /**
      * Build an instance of FeedbackSummaryInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FeedbackSummaryPayload): FeedbackSummaryInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait FeedbackSummaryListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FeedbackSummaryContext = js.native
    
    /**
      * create a FeedbackSummaryInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: FeedbackSummaryListInstanceCreateOptions): js.Promise[FeedbackSummaryInstance] = js.native
    def create(
      opts: FeedbackSummaryListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ FeedbackSummaryInstance, Any]
    ): js.Promise[FeedbackSummaryInstance] = js.native
    
    /**
      * Constructs a feedback_summary
      *
      * @param sid - A string that uniquely identifies this feedback summary resource
      */
    def get(sid: String): FeedbackSummaryContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property endDate - Only include feedback given on or before this date
    * @property includeSubaccounts - `true` includes feedback from the specified account and its subaccounts
    * @property startDate - Only include feedback given on or after this date
    * @property statusCallback - The URL that we will request when the feedback summary is complete
    * @property statusCallbackMethod - The HTTP method we use to make requests to the StatusCallback URL
    */
  trait FeedbackSummaryListInstanceCreateOptions extends StObject {
    
    var endDate: js.Date
    
    var includeSubaccounts: js.UndefOr[Boolean] = js.undefined
    
    var startDate: js.Date
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
  }
  object FeedbackSummaryListInstanceCreateOptions {
    
    inline def apply(endDate: js.Date, startDate: js.Date): FeedbackSummaryListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedbackSummaryListInstanceCreateOptions]
    }
    
    extension [Self <: FeedbackSummaryListInstanceCreateOptions](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setIncludeSubaccounts(value: Boolean): Self = StObject.set(x, "includeSubaccounts", value.asInstanceOf[js.Any])
      
      inline def setIncludeSubaccountsUndefined: Self = StObject.set(x, "includeSubaccounts", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
    }
  }
  
  trait FeedbackSummaryPayload
    extends StObject
       with FeedbackSummaryResource
       with TwilioResponsePayload
  object FeedbackSummaryPayload {
    
    inline def apply(
      account_sid: String,
      call_count: Double,
      call_feedback_count: Double,
      date_created: js.Date,
      date_updated: js.Date,
      end_date: js.Date,
      first_page_uri: String,
      include_subaccounts: Boolean,
      issues: js.Array[js.Object],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      quality_score_average: Double,
      quality_score_median: Double,
      quality_score_standard_deviation: Double,
      sid: String,
      start_date: js.Date,
      status: FeedbackSummaryStatus,
      uri: String
    ): FeedbackSummaryPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_count = call_count.asInstanceOf[js.Any], call_feedback_count = call_feedback_count.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], end_date = end_date.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], include_subaccounts = include_subaccounts.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], quality_score_average = quality_score_average.asInstanceOf[js.Any], quality_score_median = quality_score_median.asInstanceOf[js.Any], quality_score_standard_deviation = quality_score_standard_deviation.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], start_date = start_date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedbackSummaryPayload]
    }
  }
  
  trait FeedbackSummaryResource extends StObject {
    
    var account_sid: String
    
    var call_count: Double
    
    var call_feedback_count: Double
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var end_date: js.Date
    
    var include_subaccounts: Boolean
    
    var issues: js.Array[js.Object]
    
    var quality_score_average: Double
    
    var quality_score_median: Double
    
    var quality_score_standard_deviation: Double
    
    var sid: String
    
    var start_date: js.Date
    
    var status: FeedbackSummaryStatus
  }
  object FeedbackSummaryResource {
    
    inline def apply(
      account_sid: String,
      call_count: Double,
      call_feedback_count: Double,
      date_created: js.Date,
      date_updated: js.Date,
      end_date: js.Date,
      include_subaccounts: Boolean,
      issues: js.Array[js.Object],
      quality_score_average: Double,
      quality_score_median: Double,
      quality_score_standard_deviation: Double,
      sid: String,
      start_date: js.Date,
      status: FeedbackSummaryStatus
    ): FeedbackSummaryResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_count = call_count.asInstanceOf[js.Any], call_feedback_count = call_feedback_count.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], end_date = end_date.asInstanceOf[js.Any], include_subaccounts = include_subaccounts.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], quality_score_average = quality_score_average.asInstanceOf[js.Any], quality_score_median = quality_score_median.asInstanceOf[js.Any], quality_score_standard_deviation = quality_score_standard_deviation.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], start_date = start_date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedbackSummaryResource]
    }
    
    extension [Self <: FeedbackSummaryResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_count(value: Double): Self = StObject.set(x, "call_count", value.asInstanceOf[js.Any])
      
      inline def setCall_feedback_count(value: Double): Self = StObject.set(x, "call_feedback_count", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEnd_date(value: js.Date): Self = StObject.set(x, "end_date", value.asInstanceOf[js.Any])
      
      inline def setInclude_subaccounts(value: Boolean): Self = StObject.set(x, "include_subaccounts", value.asInstanceOf[js.Any])
      
      inline def setIssues(value: js.Array[js.Object]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setIssuesVarargs(value: js.Object*): Self = StObject.set(x, "issues", js.Array(value*))
      
      inline def setQuality_score_average(value: Double): Self = StObject.set(x, "quality_score_average", value.asInstanceOf[js.Any])
      
      inline def setQuality_score_median(value: Double): Self = StObject.set(x, "quality_score_median", value.asInstanceOf[js.Any])
      
      inline def setQuality_score_standard_deviation(value: Double): Self = StObject.set(x, "quality_score_standard_deviation", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStart_date(value: js.Date): Self = StObject.set(x, "start_date", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: FeedbackSummaryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeedbackSummarySolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object FeedbackSummarySolution {
    
    inline def apply(): FeedbackSummarySolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedbackSummarySolution]
    }
    
    extension [Self <: FeedbackSummarySolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.queued
    - typings.twilio.twilioStrings.`in-progress`
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.failed__
  */
  trait FeedbackSummaryStatus extends StObject
  object FeedbackSummaryStatus {
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def `in-progress`: typings.twilio.twilioStrings.`in-progress` = "in-progress".asInstanceOf[typings.twilio.twilioStrings.`in-progress`]
    
    inline def queued: typings.twilio.twilioStrings.queued = "queued".asInstanceOf[typings.twilio.twilioStrings.queued]
  }
}
