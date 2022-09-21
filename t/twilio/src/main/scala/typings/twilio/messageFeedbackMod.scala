package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageFeedbackMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/message/feedback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/message/feedback", "FeedbackInstance")
  @js.native
  open class FeedbackInstance protected () extends SerializableClass {
    /**
      * Initialize the FeedbackContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param messageSid - The SID of the Message resource for which the feedback was provided
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: FeedbackPayload,
      accountSid: String,
      messageSid: String
    ) = this()
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var messageSid: String = js.native
    
    var outcome: FeedbackOutcome = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the FeedbackList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    * @param messageSid - The SID of the Message resource for which the feedback was provided
    */
  inline def FeedbackList(version: typings.twilio.v2010Mod.^, accountSid: String, messageSid: String): FeedbackListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("FeedbackList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], messageSid.asInstanceOf[js.Any])).asInstanceOf[FeedbackListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/message/feedback", "FeedbackPage")
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
  
  @js.native
  trait FeedbackListInstance extends StObject {
    
    /**
      * create a FeedbackInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[FeedbackInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ FeedbackInstance, Any]): js.Promise[FeedbackInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ FeedbackInstance, Any]): js.Promise[FeedbackInstance] = js.native
    def create(opts: FeedbackListInstanceCreateOptions): js.Promise[FeedbackInstance] = js.native
    def create(
      opts: FeedbackListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ FeedbackInstance, Any]
    ): js.Promise[FeedbackInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property outcome - Whether the feedback has arrived
    */
  trait FeedbackListInstanceCreateOptions extends StObject {
    
    var outcome: js.UndefOr[FeedbackOutcome] = js.undefined
  }
  object FeedbackListInstanceCreateOptions {
    
    inline def apply(): FeedbackListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedbackListInstanceCreateOptions]
    }
    
    extension [Self <: FeedbackListInstanceCreateOptions](x: Self) {
      
      inline def setOutcome(value: FeedbackOutcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
      
      inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.confirmed
    - typings.twilio.twilioStrings.unconfirmed
  */
  trait FeedbackOutcome extends StObject
  object FeedbackOutcome {
    
    inline def confirmed: typings.twilio.twilioStrings.confirmed = "confirmed".asInstanceOf[typings.twilio.twilioStrings.confirmed]
    
    inline def unconfirmed: typings.twilio.twilioStrings.unconfirmed = "unconfirmed".asInstanceOf[typings.twilio.twilioStrings.unconfirmed]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait FeedbackPayload
    extends StObject
       with FeedbackResource {
    
    // DEPRECTATED: end: any;
    var first_page_uri: String
    
    var meta: js.UndefOr[Key] = js.undefined
    
    // DEPRECTATED: last_page_uri: string;
    var next_page_uri: String
    
    // DEPRECTATED: num_pages: number;
    var page: Double
    
    var page_size: Double
    
    var previous_page_uri: String
  }
  object FeedbackPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      message_sid: String,
      next_page_uri: String,
      outcome: FeedbackOutcome,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): FeedbackPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], message_sid = message_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedbackPayload]
    }
    
    extension [Self <: FeedbackPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeedbackResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var message_sid: String
    
    var outcome: FeedbackOutcome
    
    var uri: String
  }
  object FeedbackResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      message_sid: String,
      outcome: FeedbackOutcome,
      uri: String
    ): FeedbackResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], message_sid = message_sid.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedbackResource]
    }
    
    extension [Self <: FeedbackResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setMessage_sid(value: String): Self = StObject.set(x, "message_sid", value.asInstanceOf[js.Any])
      
      inline def setOutcome(value: FeedbackOutcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeedbackSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var messageSid: js.UndefOr[String] = js.undefined
  }
  object FeedbackSolution {
    
    inline def apply(): FeedbackSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedbackSolution]
    }
    
    extension [Self <: FeedbackSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setMessageSid(value: String): Self = StObject.set(x, "messageSid", value.asInstanceOf[js.Any])
      
      inline def setMessageSidUndefined: Self = StObject.set(x, "messageSid", js.undefined)
    }
  }
}
