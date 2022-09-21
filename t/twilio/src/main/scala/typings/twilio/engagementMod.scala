package typings.twilio

import typings.twilio.engagementContextMod.EngagementContextContext
import typings.twilio.engagementContextMod.EngagementContextListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.stepMod.StepContext
import typings.twilio.stepMod.StepListInstance
import typings.twilio.twilioStrings.active_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engagementMod {
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement", "EngagementContext")
  @js.native
  open class EngagementContext protected () extends StObject {
    /**
      * Initialize the EngagementContext
      *
      * @param version - Version of the resource
      * @param flowSid - Flow SID
      * @param sid - The SID of the Engagement resource to fetch
      */
    def this(version: typings.twilio.studioV1Mod.^, flowSid: String, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def engagementContext(sid: String): EngagementContextContext = js.native
    @JSName("engagementContext")
    var engagementContext_Original: EngagementContextListInstance = js.native
    
    /**
      * fetch a EngagementInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EngagementInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ EngagementInstance, Any]): js.Promise[EngagementInstance] = js.native
    
    /**
      * remove a EngagementInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ EngagementInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def steps(sid: String): StepContext = js.native
    @JSName("steps")
    var steps_Original: StepListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement", "EngagementInstance")
  @js.native
  open class EngagementInstance protected () extends SerializableClass {
    /**
      * Initialize the EngagementContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param flowSid - The SID of the Flow
      * @param sid - The SID of the Engagement resource to fetch
      */
    def this(version: typings.twilio.studioV1Mod.^, payload: EngagementPayload, flowSid: String, sid: String) = this()
    
    /* private */ var _proxy: EngagementContext = js.native
    
    var accountSid: String = js.native
    
    var contactChannelAddress: String = js.native
    
    var contactSid: String = js.native
    
    var context: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Access the engagementContext
      */
    def engagementContext(): EngagementContextListInstance = js.native
    
    /**
      * fetch a EngagementInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EngagementInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[EngagementInstance] = js.native
    
    var flowSid: String = js.native
    
    var links: String = js.native
    
    /**
      * remove a EngagementInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var status: EngagementStatus = js.native
    
    /**
      * Access the steps
      */
    def steps(): StepListInstance = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the EngagementList
    *
    * @param version - Version of the resource
    * @param flowSid - The SID of the Flow
    */
  inline def EngagementList(version: typings.twilio.studioV1Mod.^, flowSid: String): EngagementListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("EngagementList")(version.asInstanceOf[js.Any], flowSid.asInstanceOf[js.Any])).asInstanceOf[EngagementListInstance]
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement", "EngagementPage")
  @js.native
  open class EngagementPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.studioV1Mod.^, 
          EngagementPayload, 
          EngagementResource, 
          EngagementInstance
        ] {
    /**
      * Initialize the EngagementPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.studioV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: EngagementSolution
    ) = this()
    
    /**
      * Build an instance of EngagementInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: EngagementPayload): EngagementInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait EngagementListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): EngagementContext = js.native
    
    /**
      * create a EngagementInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: EngagementListInstanceCreateOptions): js.Promise[EngagementInstance] = js.native
    def create(
      opts: EngagementListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ EngagementInstance, Any]
    ): js.Promise[EngagementInstance] = js.native
    
    /**
      * Streams EngagementInstance records from the API.
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
          /* item */ EngagementInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ EngagementInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: EngagementListInstanceEachOptions): Unit = js.native
    def each(
      opts: EngagementListInstanceEachOptions,
      callback: js.Function2[
          /* item */ EngagementInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a engagement
      *
      * @param sid - The SID of the Engagement resource to fetch
      */
    def get(sid: String): EngagementContext = js.native
    
    /**
      * Retrieve a single target page of EngagementInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[EngagementPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ EngagementPage, Any]): js.Promise[EngagementPage] = js.native
    def getPage(targetUrl: String): js.Promise[EngagementPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EngagementPage, Any]
    ): js.Promise[EngagementPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EngagementPage, Any]
    ): js.Promise[EngagementPage] = js.native
    
    /**
      * Lists EngagementInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[EngagementInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EngagementInstance], Any]): js.Promise[js.Array[EngagementInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EngagementInstance], Any]
    ): js.Promise[js.Array[EngagementInstance]] = js.native
    def list(opts: EngagementListInstanceOptions): js.Promise[js.Array[EngagementInstance]] = js.native
    def list(
      opts: EngagementListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EngagementInstance], Any]
    ): js.Promise[js.Array[EngagementInstance]] = js.native
    
    /**
      * Retrieve a single page of EngagementInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[EngagementPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ EngagementPage, Any]): js.Promise[EngagementPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ EngagementPage, Any]): js.Promise[EngagementPage] = js.native
    def page(opts: EngagementListInstancePageOptions): js.Promise[EngagementPage] = js.native
    def page(
      opts: EngagementListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EngagementPage, Any]
    ): js.Promise[EngagementPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property from - The Twilio phone number to send messages or initiate calls from during the Flow Engagement
    * @property parameters - A JSON string we will add to your flow's context and that you can access as variables inside your flow
    * @property to - The Contact phone number to start a Studio Flow Engagement
    */
  trait EngagementListInstanceCreateOptions extends StObject {
    
    var from: String
    
    var parameters: js.UndefOr[js.Object] = js.undefined
    
    var to: String
  }
  object EngagementListInstanceCreateOptions {
    
    inline def apply(from: String, to: String): EngagementListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngagementListInstanceCreateOptions]
    }
    
    extension [Self <: EngagementListInstanceCreateOptions](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
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
  trait EngagementListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ EngagementInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EngagementListInstanceEachOptions {
    
    inline def apply(): EngagementListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EngagementListInstanceEachOptions]
    }
    
    extension [Self <: EngagementListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ EngagementInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait EngagementListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EngagementListInstanceOptions {
    
    inline def apply(): EngagementListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EngagementListInstanceOptions]
    }
    
    extension [Self <: EngagementListInstanceOptions](x: Self) {
      
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
  trait EngagementListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object EngagementListInstancePageOptions {
    
    inline def apply(): EngagementListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EngagementListInstancePageOptions]
    }
    
    extension [Self <: EngagementListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait EngagementPayload
    extends StObject
       with EngagementResource
       with TwilioResponsePayload
  object EngagementPayload {
    
    inline def apply(
      account_sid: String,
      contact_channel_address: String,
      contact_sid: String,
      context: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      flow_sid: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      status: EngagementStatus,
      uri: String,
      url: String
    ): EngagementPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], contact_channel_address = contact_channel_address.asInstanceOf[js.Any], contact_sid = contact_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngagementPayload]
    }
  }
  
  trait EngagementResource extends StObject {
    
    var account_sid: String
    
    var contact_channel_address: String
    
    var contact_sid: String
    
    var context: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var flow_sid: String
    
    var links: String
    
    var sid: String
    
    var status: EngagementStatus
    
    var url: String
  }
  object EngagementResource {
    
    inline def apply(
      account_sid: String,
      contact_channel_address: String,
      contact_sid: String,
      context: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      flow_sid: String,
      links: String,
      sid: String,
      status: EngagementStatus,
      url: String
    ): EngagementResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], contact_channel_address = contact_channel_address.asInstanceOf[js.Any], contact_sid = contact_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngagementResource]
    }
    
    extension [Self <: EngagementResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setContact_channel_address(value: String): Self = StObject.set(x, "contact_channel_address", value.asInstanceOf[js.Any])
      
      inline def setContact_sid(value: String): Self = StObject.set(x, "contact_sid", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFlow_sid(value: String): Self = StObject.set(x, "flow_sid", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: EngagementStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait EngagementSolution extends StObject {
    
    var flowSid: js.UndefOr[String] = js.undefined
  }
  object EngagementSolution {
    
    inline def apply(): EngagementSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EngagementSolution]
    }
    
    extension [Self <: EngagementSolution](x: Self) {
      
      inline def setFlowSid(value: String): Self = StObject.set(x, "flowSid", value.asInstanceOf[js.Any])
      
      inline def setFlowSidUndefined: Self = StObject.set(x, "flowSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.active_
    - typings.twilio.twilioStrings.ended
  */
  trait EngagementStatus extends StObject
  object EngagementStatus {
    
    inline def active: active_ = "active".asInstanceOf[active_]
    
    inline def ended: typings.twilio.twilioStrings.ended = "ended".asInstanceOf[typings.twilio.twilioStrings.ended]
  }
}
