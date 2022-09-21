package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedbackMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/feedback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/feedback", "FeedbackContext")
  @js.native
  open class FeedbackContext protected () extends StObject {
    /**
      * Initialize the FeedbackContext
      *
      * @param version - Version of the resource
      * @param accountSid - The unique sid that identifies this account
      * @param callSid - The call sid that uniquely identifies the call
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, callSid: String) = this()
    
    /**
      * create a FeedbackInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: FeedbackInstanceCreateOptions): js.Promise[FeedbackInstance] = js.native
    def create(
      opts: FeedbackInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ FeedbackInstance, Any]
    ): js.Promise[FeedbackInstance] = js.native
    
    /**
      * fetch a FeedbackInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FeedbackInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FeedbackInstance, Any]): js.Promise[FeedbackInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a FeedbackInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[FeedbackInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ FeedbackInstance, Any]): js.Promise[FeedbackInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FeedbackInstance, Any]): js.Promise[FeedbackInstance] = js.native
    def update(opts: FeedbackInstanceUpdateOptions): js.Promise[FeedbackInstance] = js.native
    def update(
      opts: FeedbackInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FeedbackInstance, Any]
    ): js.Promise[FeedbackInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/feedback", "FeedbackInstance")
  @js.native
  open class FeedbackInstance protected () extends SerializableClass {
    /**
      * Initialize the FeedbackContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The unique sid that identifies this account
      * @param callSid - The unique string that identifies this resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: FeedbackPayload, accountSid: String, callSid: String) = this()
    
    /* private */ var _proxy: FeedbackContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * create a FeedbackInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: FeedbackInstanceCreateOptions): js.Promise[FeedbackInstance] = js.native
    def create(
      opts: FeedbackInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[FeedbackInstance] = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a FeedbackInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FeedbackInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FeedbackInstance] = js.native
    
    var issues: js.Array[FeedbackIssues] = js.native
    
    var qualityScore: Double = js.native
    
    var sid: String = js.native
    
    /**
      * update a FeedbackInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[FeedbackInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FeedbackInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FeedbackInstance] = js.native
    def update(opts: FeedbackInstanceUpdateOptions): js.Promise[FeedbackInstance] = js.native
    def update(
      opts: FeedbackInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[FeedbackInstance] = js.native
  }
  
  /**
    * Initialize the FeedbackList
    *
    * @param version - Version of the resource
    * @param accountSid - The unique sid that identifies this account
    * @param callSid - The unique string that identifies this resource
    */
  inline def FeedbackList(version: typings.twilio.v2010Mod.^, accountSid: String, callSid: String): FeedbackListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("FeedbackList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], callSid.asInstanceOf[js.Any])).asInstanceOf[FeedbackListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/feedback", "FeedbackPage")
  @js.native
  open class FeedbackPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, FeedbackPayload, FeedbackResource, FeedbackInstance] {
    /**
      * Initialize the FeedbackPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: FeedbackSolution
    ) = this()
    
    /**
      * Build an instance of FeedbackInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FeedbackPayload): FeedbackInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property issue - Issues experienced during the call
    * @property qualityScore - The call quality expressed as an integer from 1 to 5
    */
  trait FeedbackInstanceCreateOptions extends StObject {
    
    var issue: js.UndefOr[FeedbackIssues | js.Array[FeedbackIssues]] = js.undefined
    
    var qualityScore: Double
  }
  object FeedbackInstanceCreateOptions {
    
    inline def apply(qualityScore: Double): FeedbackInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(qualityScore = qualityScore.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedbackInstanceCreateOptions]
    }
    
    extension [Self <: FeedbackInstanceCreateOptions](x: Self) {
      
      inline def setIssue(value: FeedbackIssues | js.Array[FeedbackIssues]): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
      
      inline def setIssueVarargs(value: FeedbackIssues*): Self = StObject.set(x, "issue", js.Array(value*))
      
      inline def setQualityScore(value: Double): Self = StObject.set(x, "qualityScore", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to update
    *
    * @property issue - Issues experienced during the call
    * @property qualityScore - The call quality expressed as an integer from 1 to 5
    */
  trait FeedbackInstanceUpdateOptions extends StObject {
    
    var issue: js.UndefOr[FeedbackIssues | js.Array[FeedbackIssues]] = js.undefined
    
    var qualityScore: js.UndefOr[Double] = js.undefined
  }
  object FeedbackInstanceUpdateOptions {
    
    inline def apply(): FeedbackInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedbackInstanceUpdateOptions]
    }
    
    extension [Self <: FeedbackInstanceUpdateOptions](x: Self) {
      
      inline def setIssue(value: FeedbackIssues | js.Array[FeedbackIssues]): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
      
      inline def setIssueVarargs(value: FeedbackIssues*): Self = StObject.set(x, "issue", js.Array(value*))
      
      inline def setQualityScore(value: Double): Self = StObject.set(x, "qualityScore", value.asInstanceOf[js.Any])
      
      inline def setQualityScoreUndefined: Self = StObject.set(x, "qualityScore", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`audio-latency`
    - typings.twilio.twilioStrings.`digits-not-captured`
    - typings.twilio.twilioStrings.`dropped-call`
    - typings.twilio.twilioStrings.`imperfect-audio`
    - typings.twilio.twilioStrings.`incorrect-caller-id`
    - typings.twilio.twilioStrings.`one-way-audio`
    - typings.twilio.twilioStrings.`post-dial-delay`
    - typings.twilio.twilioStrings.`unsolicited-call`
  */
  trait FeedbackIssues extends StObject
  object FeedbackIssues {
    
    inline def `audio-latency`: typings.twilio.twilioStrings.`audio-latency` = "audio-latency".asInstanceOf[typings.twilio.twilioStrings.`audio-latency`]
    
    inline def `digits-not-captured`: typings.twilio.twilioStrings.`digits-not-captured` = "digits-not-captured".asInstanceOf[typings.twilio.twilioStrings.`digits-not-captured`]
    
    inline def `dropped-call`: typings.twilio.twilioStrings.`dropped-call` = "dropped-call".asInstanceOf[typings.twilio.twilioStrings.`dropped-call`]
    
    inline def `imperfect-audio`: typings.twilio.twilioStrings.`imperfect-audio` = "imperfect-audio".asInstanceOf[typings.twilio.twilioStrings.`imperfect-audio`]
    
    inline def `incorrect-caller-id`: typings.twilio.twilioStrings.`incorrect-caller-id` = "incorrect-caller-id".asInstanceOf[typings.twilio.twilioStrings.`incorrect-caller-id`]
    
    inline def `one-way-audio`: typings.twilio.twilioStrings.`one-way-audio` = "one-way-audio".asInstanceOf[typings.twilio.twilioStrings.`one-way-audio`]
    
    inline def `post-dial-delay`: typings.twilio.twilioStrings.`post-dial-delay` = "post-dial-delay".asInstanceOf[typings.twilio.twilioStrings.`post-dial-delay`]
    
    inline def `unsolicited-call`: typings.twilio.twilioStrings.`unsolicited-call` = "unsolicited-call".asInstanceOf[typings.twilio.twilioStrings.`unsolicited-call`]
  }
  
  @js.native
  trait FeedbackListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FeedbackContext = js.native
    
    /**
      * Constructs a feedback
      */
    def get(): FeedbackContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait FeedbackPayload
    extends StObject
       with FeedbackResource
       with TwilioResponsePayload
  object FeedbackPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      issues: js.Array[FeedbackIssues],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      quality_score: Double,
      sid: String,
      uri: String
    ): FeedbackPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], quality_score = quality_score.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedbackPayload]
    }
  }
  
  trait FeedbackResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var issues: js.Array[FeedbackIssues]
    
    var quality_score: Double
    
    var sid: String
  }
  object FeedbackResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      issues: js.Array[FeedbackIssues],
      quality_score: Double,
      sid: String
    ): FeedbackResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], quality_score = quality_score.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedbackResource]
    }
    
    extension [Self <: FeedbackResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setIssues(value: js.Array[FeedbackIssues]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setIssuesVarargs(value: FeedbackIssues*): Self = StObject.set(x, "issues", js.Array(value*))
      
      inline def setQuality_score(value: Double): Self = StObject.set(x, "quality_score", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeedbackSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var callSid: js.UndefOr[String] = js.undefined
  }
  object FeedbackSolution {
    
    inline def apply(): FeedbackSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedbackSolution]
    }
    
    extension [Self <: FeedbackSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setCallSid(value: String): Self = StObject.set(x, "callSid", value.asInstanceOf[js.Any])
      
      inline def setCallSidUndefined: Self = StObject.set(x, "callSid", js.undefined)
    }
  }
}
