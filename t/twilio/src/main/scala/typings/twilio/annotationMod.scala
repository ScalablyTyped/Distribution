package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object annotationMod {
  
  @JSImport("twilio/lib/rest/insights/v1/call/annotation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/insights/v1/call/annotation", "AnnotationContext")
  @js.native
  open class AnnotationContext protected () extends StObject {
    /**
      * Initialize the AnnotationContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param callSid - Call SID.
      */
    def this(version: typings.twilio.insightsV1Mod.^, callSid: String) = this()
    
    /**
      * fetch a AnnotationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AnnotationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AnnotationInstance, Any]): js.Promise[AnnotationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a AnnotationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AnnotationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ AnnotationInstance, Any]): js.Promise[AnnotationInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AnnotationInstance, Any]
    ): js.Promise[AnnotationInstance] = js.native
    def update(opts: AnnotationInstanceUpdateOptions): js.Promise[AnnotationInstance] = js.native
    def update(
      opts: AnnotationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AnnotationInstance, Any]
    ): js.Promise[AnnotationInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/insights/v1/call/annotation", "AnnotationInstance")
  @js.native
  open class AnnotationInstance protected () extends SerializableClass {
    /**
      * Initialize the AnnotationContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param callSid - Call SID.
      */
    def this(version: typings.twilio.insightsV1Mod.^, payload: AnnotationPayload, callSid: String) = this()
    
    /* private */ var _proxy: AnnotationContext = js.native
    
    var accountSid: String = js.native
    
    var answeredBy: AnnotationAnsweredBy = js.native
    
    var callScore: Double = js.native
    
    var callSid: String = js.native
    
    var comment: String = js.native
    
    var connectivityIssue: AnnotationConnectivityIssue = js.native
    
    /**
      * fetch a AnnotationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AnnotationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AnnotationInstance] = js.native
    
    var incident: String = js.native
    
    var qualityIssues: js.Array[String] = js.native
    
    var spam: Boolean = js.native
    
    /**
      * update a AnnotationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AnnotationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AnnotationInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AnnotationInstance] = js.native
    def update(opts: AnnotationInstanceUpdateOptions): js.Promise[AnnotationInstance] = js.native
    def update(
      opts: AnnotationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[AnnotationInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AnnotationList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param callSid - Call SID.
    */
  inline def AnnotationList(version: typings.twilio.insightsV1Mod.^, callSid: String): AnnotationListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AnnotationList")(version.asInstanceOf[js.Any], callSid.asInstanceOf[js.Any])).asInstanceOf[AnnotationListInstance]
  
  @JSImport("twilio/lib/rest/insights/v1/call/annotation", "AnnotationPage")
  @js.native
  open class AnnotationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.insightsV1Mod.^, 
          AnnotationPayload, 
          AnnotationResource, 
          AnnotationInstance
        ] {
    /**
      * Initialize the AnnotationPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.insightsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AnnotationSolution
    ) = this()
    
    /**
      * Build an instance of AnnotationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AnnotationPayload): AnnotationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.unknown_answered_by
    - typings.twilio.twilioStrings.human
    - typings.twilio.twilioStrings.machine
  */
  trait AnnotationAnsweredBy extends StObject
  object AnnotationAnsweredBy {
    
    inline def human: typings.twilio.twilioStrings.human = "human".asInstanceOf[typings.twilio.twilioStrings.human]
    
    inline def machine: typings.twilio.twilioStrings.machine = "machine".asInstanceOf[typings.twilio.twilioStrings.machine]
    
    inline def unknown_answered_by: typings.twilio.twilioStrings.unknown_answered_by = "unknown_answered_by".asInstanceOf[typings.twilio.twilioStrings.unknown_answered_by]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.unknown_connectivity_issue
    - typings.twilio.twilioStrings.no_connectivity_issue
    - typings.twilio.twilioStrings.invalid_number
    - typings.twilio.twilioStrings.caller_id
    - typings.twilio.twilioStrings.dropped_call
    - typings.twilio.twilioStrings.number_reachability
  */
  trait AnnotationConnectivityIssue extends StObject
  object AnnotationConnectivityIssue {
    
    inline def caller_id: typings.twilio.twilioStrings.caller_id = "caller_id".asInstanceOf[typings.twilio.twilioStrings.caller_id]
    
    inline def dropped_call: typings.twilio.twilioStrings.dropped_call = "dropped_call".asInstanceOf[typings.twilio.twilioStrings.dropped_call]
    
    inline def invalid_number: typings.twilio.twilioStrings.invalid_number = "invalid_number".asInstanceOf[typings.twilio.twilioStrings.invalid_number]
    
    inline def no_connectivity_issue: typings.twilio.twilioStrings.no_connectivity_issue = "no_connectivity_issue".asInstanceOf[typings.twilio.twilioStrings.no_connectivity_issue]
    
    inline def number_reachability: typings.twilio.twilioStrings.number_reachability = "number_reachability".asInstanceOf[typings.twilio.twilioStrings.number_reachability]
    
    inline def unknown_connectivity_issue: typings.twilio.twilioStrings.unknown_connectivity_issue = "unknown_connectivity_issue".asInstanceOf[typings.twilio.twilioStrings.unknown_connectivity_issue]
  }
  
  /**
    * Options to pass to update
    *
    * @property answeredBy - Indicates the answering entity as determined by Answering Machine Detection.
    * @property callScore - Call Score
    * @property comment - User comments
    * @property connectivityIssue - Indicates if the call had any connectivity issue
    * @property incident - Call tag for incidents or support ticket
    * @property qualityIssues - Indicates if the call had audio quality issues.
    * @property spam - Call spam indicator
    */
  trait AnnotationInstanceUpdateOptions extends StObject {
    
    var answeredBy: js.UndefOr[AnnotationAnsweredBy] = js.undefined
    
    var callScore: js.UndefOr[Double] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    var connectivityIssue: js.UndefOr[AnnotationConnectivityIssue] = js.undefined
    
    var incident: js.UndefOr[String] = js.undefined
    
    var qualityIssues: js.UndefOr[String] = js.undefined
    
    var spam: js.UndefOr[Boolean] = js.undefined
  }
  object AnnotationInstanceUpdateOptions {
    
    inline def apply(): AnnotationInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationInstanceUpdateOptions]
    }
    
    extension [Self <: AnnotationInstanceUpdateOptions](x: Self) {
      
      inline def setAnsweredBy(value: AnnotationAnsweredBy): Self = StObject.set(x, "answeredBy", value.asInstanceOf[js.Any])
      
      inline def setAnsweredByUndefined: Self = StObject.set(x, "answeredBy", js.undefined)
      
      inline def setCallScore(value: Double): Self = StObject.set(x, "callScore", value.asInstanceOf[js.Any])
      
      inline def setCallScoreUndefined: Self = StObject.set(x, "callScore", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setConnectivityIssue(value: AnnotationConnectivityIssue): Self = StObject.set(x, "connectivityIssue", value.asInstanceOf[js.Any])
      
      inline def setConnectivityIssueUndefined: Self = StObject.set(x, "connectivityIssue", js.undefined)
      
      inline def setIncident(value: String): Self = StObject.set(x, "incident", value.asInstanceOf[js.Any])
      
      inline def setIncidentUndefined: Self = StObject.set(x, "incident", js.undefined)
      
      inline def setQualityIssues(value: String): Self = StObject.set(x, "qualityIssues", value.asInstanceOf[js.Any])
      
      inline def setQualityIssuesUndefined: Self = StObject.set(x, "qualityIssues", js.undefined)
      
      inline def setSpam(value: Boolean): Self = StObject.set(x, "spam", value.asInstanceOf[js.Any])
      
      inline def setSpamUndefined: Self = StObject.set(x, "spam", js.undefined)
    }
  }
  
  @js.native
  trait AnnotationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AnnotationContext = js.native
    
    /**
      * Constructs a annotation
      */
    def get(): AnnotationContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait AnnotationPayload
    extends StObject
       with AnnotationResource
       with TwilioResponsePayload
  object AnnotationPayload {
    
    inline def apply(
      account_sid: String,
      answered_by: AnnotationAnsweredBy,
      call_score: Double,
      call_sid: String,
      comment: String,
      connectivity_issue: AnnotationConnectivityIssue,
      first_page_uri: String,
      incident: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      quality_issues: js.Array[String],
      spam: Boolean,
      uri: String,
      url: String
    ): AnnotationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], answered_by = answered_by.asInstanceOf[js.Any], call_score = call_score.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], connectivity_issue = connectivity_issue.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], incident = incident.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], quality_issues = quality_issues.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationPayload]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.unknown_quality_issue
    - typings.twilio.twilioStrings.no_quality_issue
    - typings.twilio.twilioStrings.low_volume
    - typings.twilio.twilioStrings.choppy_robotic
    - typings.twilio.twilioStrings.echo
    - typings.twilio.twilioStrings.dtmf
    - typings.twilio.twilioStrings.latency
    - typings.twilio.twilioStrings.owa
    - typings.twilio.twilioStrings.static_noise
  */
  trait AnnotationQualityIssues extends StObject
  object AnnotationQualityIssues {
    
    inline def choppy_robotic: typings.twilio.twilioStrings.choppy_robotic = "choppy_robotic".asInstanceOf[typings.twilio.twilioStrings.choppy_robotic]
    
    inline def dtmf: typings.twilio.twilioStrings.dtmf = "dtmf".asInstanceOf[typings.twilio.twilioStrings.dtmf]
    
    inline def echo: typings.twilio.twilioStrings.echo = "echo".asInstanceOf[typings.twilio.twilioStrings.echo]
    
    inline def latency: typings.twilio.twilioStrings.latency = "latency".asInstanceOf[typings.twilio.twilioStrings.latency]
    
    inline def low_volume: typings.twilio.twilioStrings.low_volume = "low_volume".asInstanceOf[typings.twilio.twilioStrings.low_volume]
    
    inline def no_quality_issue: typings.twilio.twilioStrings.no_quality_issue = "no_quality_issue".asInstanceOf[typings.twilio.twilioStrings.no_quality_issue]
    
    inline def owa: typings.twilio.twilioStrings.owa = "owa".asInstanceOf[typings.twilio.twilioStrings.owa]
    
    inline def static_noise: typings.twilio.twilioStrings.static_noise = "static_noise".asInstanceOf[typings.twilio.twilioStrings.static_noise]
    
    inline def unknown_quality_issue: typings.twilio.twilioStrings.unknown_quality_issue = "unknown_quality_issue".asInstanceOf[typings.twilio.twilioStrings.unknown_quality_issue]
  }
  
  trait AnnotationResource extends StObject {
    
    var account_sid: String
    
    var answered_by: AnnotationAnsweredBy
    
    var call_score: Double
    
    var call_sid: String
    
    var comment: String
    
    var connectivity_issue: AnnotationConnectivityIssue
    
    var incident: String
    
    var quality_issues: js.Array[String]
    
    var spam: Boolean
    
    var url: String
  }
  object AnnotationResource {
    
    inline def apply(
      account_sid: String,
      answered_by: AnnotationAnsweredBy,
      call_score: Double,
      call_sid: String,
      comment: String,
      connectivity_issue: AnnotationConnectivityIssue,
      incident: String,
      quality_issues: js.Array[String],
      spam: Boolean,
      url: String
    ): AnnotationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], answered_by = answered_by.asInstanceOf[js.Any], call_score = call_score.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], connectivity_issue = connectivity_issue.asInstanceOf[js.Any], incident = incident.asInstanceOf[js.Any], quality_issues = quality_issues.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationResource]
    }
    
    extension [Self <: AnnotationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAnswered_by(value: AnnotationAnsweredBy): Self = StObject.set(x, "answered_by", value.asInstanceOf[js.Any])
      
      inline def setCall_score(value: Double): Self = StObject.set(x, "call_score", value.asInstanceOf[js.Any])
      
      inline def setCall_sid(value: String): Self = StObject.set(x, "call_sid", value.asInstanceOf[js.Any])
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setConnectivity_issue(value: AnnotationConnectivityIssue): Self = StObject.set(x, "connectivity_issue", value.asInstanceOf[js.Any])
      
      inline def setIncident(value: String): Self = StObject.set(x, "incident", value.asInstanceOf[js.Any])
      
      inline def setQuality_issues(value: js.Array[String]): Self = StObject.set(x, "quality_issues", value.asInstanceOf[js.Any])
      
      inline def setQuality_issuesVarargs(value: String*): Self = StObject.set(x, "quality_issues", js.Array(value*))
      
      inline def setSpam(value: Boolean): Self = StObject.set(x, "spam", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnnotationSolution extends StObject {
    
    var callSid: js.UndefOr[String] = js.undefined
  }
  object AnnotationSolution {
    
    inline def apply(): AnnotationSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationSolution]
    }
    
    extension [Self <: AnnotationSolution](x: Self) {
      
      inline def setCallSid(value: String): Self = StObject.set(x, "callSid", value.asInstanceOf[js.Any])
      
      inline def setCallSidUndefined: Self = StObject.set(x, "callSid", js.undefined)
    }
  }
}
