package typings.twilio

import typings.twilio.executionContextMod.ExecutionContextContext
import typings.twilio.executionContextMod.ExecutionContextListInstance
import typings.twilio.executionStepMod.ExecutionStepContext
import typings.twilio.executionStepMod.ExecutionStepListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.active_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executionMod {
  
  @JSImport("twilio/lib/rest/studio/v1/flow/execution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/studio/v1/flow/execution", "ExecutionContext")
  @js.native
  open class ExecutionContext protected () extends StObject {
    /**
      * Initialize the ExecutionContext
      *
      * @param version - Version of the resource
      * @param flowSid - The SID of the Flow
      * @param sid - The SID of the Execution resource to fetch
      */
    def this(version: typings.twilio.studioV1Mod.^, flowSid: String, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def executionContext(sid: String): ExecutionContextContext = js.native
    @JSName("executionContext")
    var executionContext_Original: ExecutionContextListInstance = js.native
    
    /**
      * fetch a ExecutionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ExecutionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionInstance, Any]): js.Promise[ExecutionInstance] = js.native
    
    /**
      * remove a ExecutionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def steps(sid: String): ExecutionStepContext = js.native
    @JSName("steps")
    var steps_Original: ExecutionStepListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ExecutionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: ExecutionInstanceUpdateOptions): js.Promise[ExecutionInstance] = js.native
    def update(
      opts: ExecutionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionInstance, Any]
    ): js.Promise[ExecutionInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/studio/v1/flow/execution", "ExecutionInstance")
  @js.native
  open class ExecutionInstance protected () extends SerializableClass {
    /**
      * Initialize the ExecutionContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param flowSid - The SID of the Flow
      * @param sid - The SID of the Execution resource to fetch
      */
    def this(version: typings.twilio.studioV1Mod.^, payload: ExecutionPayload, flowSid: String, sid: String) = this()
    
    /* private */ var _proxy: ExecutionContext = js.native
    
    var accountSid: String = js.native
    
    var contactChannelAddress: String = js.native
    
    var contactSid: String = js.native
    
    var context: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Access the executionContext
      */
    def executionContext(): ExecutionContextListInstance = js.native
    
    /**
      * fetch a ExecutionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ExecutionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ExecutionInstance] = js.native
    
    var flowSid: String = js.native
    
    var links: String = js.native
    
    /**
      * remove a ExecutionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var status: ExecutionStatus = js.native
    
    /**
      * Access the steps
      */
    def steps(): ExecutionStepListInstance = js.native
    
    /**
      * update a ExecutionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: ExecutionInstanceUpdateOptions): js.Promise[ExecutionInstance] = js.native
    def update(
      opts: ExecutionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ExecutionInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ExecutionList
    *
    * @param version - Version of the resource
    * @param flowSid - The SID of the Flow
    */
  inline def ExecutionList(version: typings.twilio.studioV1Mod.^, flowSid: String): ExecutionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ExecutionList")(version.asInstanceOf[js.Any], flowSid.asInstanceOf[js.Any])).asInstanceOf[ExecutionListInstance]
  
  @JSImport("twilio/lib/rest/studio/v1/flow/execution", "ExecutionPage")
  @js.native
  open class ExecutionPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.studioV1Mod.^, ExecutionPayload, ExecutionResource, ExecutionInstance] {
    /**
      * Initialize the ExecutionPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.studioV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ExecutionSolution
    ) = this()
    
    /**
      * Build an instance of ExecutionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ExecutionPayload): ExecutionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property status - The status of the Execution
    */
  trait ExecutionInstanceUpdateOptions extends StObject {
    
    var status: ExecutionStatus
  }
  object ExecutionInstanceUpdateOptions {
    
    inline def apply(status: ExecutionStatus): ExecutionInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionInstanceUpdateOptions]
    }
    
    extension [Self <: ExecutionInstanceUpdateOptions](x: Self) {
      
      inline def setStatus(value: ExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExecutionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ExecutionContext = js.native
    
    /**
      * create a ExecutionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ExecutionListInstanceCreateOptions): js.Promise[ExecutionInstance] = js.native
    def create(
      opts: ExecutionListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ExecutionInstance, Any]
    ): js.Promise[ExecutionInstance] = js.native
    
    /**
      * Streams ExecutionInstance records from the API.
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
          /* item */ ExecutionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ExecutionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ExecutionListInstanceEachOptions): Unit = js.native
    def each(
      opts: ExecutionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ExecutionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a execution
      *
      * @param sid - The SID of the Execution resource to fetch
      */
    def get(sid: String): ExecutionContext = js.native
    
    /**
      * Retrieve a single target page of ExecutionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ExecutionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionPage, Any]): js.Promise[ExecutionPage] = js.native
    def getPage(targetUrl: String): js.Promise[ExecutionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionPage, Any]
    ): js.Promise[ExecutionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionPage, Any]
    ): js.Promise[ExecutionPage] = js.native
    
    /**
      * Lists ExecutionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ExecutionInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ExecutionInstance], Any]): js.Promise[js.Array[ExecutionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ExecutionInstance], Any]
    ): js.Promise[js.Array[ExecutionInstance]] = js.native
    def list(opts: ExecutionListInstanceOptions): js.Promise[js.Array[ExecutionInstance]] = js.native
    def list(
      opts: ExecutionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ExecutionInstance], Any]
    ): js.Promise[js.Array[ExecutionInstance]] = js.native
    
    /**
      * Retrieve a single page of ExecutionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ExecutionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionPage, Any]): js.Promise[ExecutionPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionPage, Any]): js.Promise[ExecutionPage] = js.native
    def page(opts: ExecutionListInstancePageOptions): js.Promise[ExecutionPage] = js.native
    def page(
      opts: ExecutionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionPage, Any]
    ): js.Promise[ExecutionPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property from - The Twilio phone number or Messaging Service SID to send messages or initiate calls from during the Flow Execution
    * @property parameters - JSON data that will be added to the Flow's context
    * @property to - The Contact phone number to start a Studio Flow Execution
    */
  trait ExecutionListInstanceCreateOptions extends StObject {
    
    var from: String
    
    var parameters: js.UndefOr[js.Object] = js.undefined
    
    var to: String
  }
  object ExecutionListInstanceCreateOptions {
    
    inline def apply(from: String, to: String): ExecutionListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionListInstanceCreateOptions]
    }
    
    extension [Self <: ExecutionListInstanceCreateOptions](x: Self) {
      
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
    * @property dateCreatedFrom - Only show Executions that started on or after this ISO 8601 date-time
    * @property dateCreatedTo - Only show Executions that started before this ISO 8601 date-time
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
  trait ExecutionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ExecutionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var dateCreatedFrom: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedTo: js.UndefOr[js.Date] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ExecutionListInstanceEachOptions {
    
    inline def apply(): ExecutionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutionListInstanceEachOptions]
    }
    
    extension [Self <: ExecutionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ExecutionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDateCreatedFrom(value: js.Date): Self = StObject.set(x, "dateCreatedFrom", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedFromUndefined: Self = StObject.set(x, "dateCreatedFrom", js.undefined)
      
      inline def setDateCreatedTo(value: js.Date): Self = StObject.set(x, "dateCreatedTo", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedToUndefined: Self = StObject.set(x, "dateCreatedTo", js.undefined)
      
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
    * @property dateCreatedFrom - Only show Executions that started on or after this ISO 8601 date-time
    * @property dateCreatedTo - Only show Executions that started before this ISO 8601 date-time
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
  trait ExecutionListInstanceOptions extends StObject {
    
    var dateCreatedFrom: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedTo: js.UndefOr[js.Date] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ExecutionListInstanceOptions {
    
    inline def apply(): ExecutionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutionListInstanceOptions]
    }
    
    extension [Self <: ExecutionListInstanceOptions](x: Self) {
      
      inline def setDateCreatedFrom(value: js.Date): Self = StObject.set(x, "dateCreatedFrom", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedFromUndefined: Self = StObject.set(x, "dateCreatedFrom", js.undefined)
      
      inline def setDateCreatedTo(value: js.Date): Self = StObject.set(x, "dateCreatedTo", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedToUndefined: Self = StObject.set(x, "dateCreatedTo", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property dateCreatedFrom - Only show Executions that started on or after this ISO 8601 date-time
    * @property dateCreatedTo - Only show Executions that started before this ISO 8601 date-time
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait ExecutionListInstancePageOptions extends StObject {
    
    var dateCreatedFrom: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedTo: js.UndefOr[js.Date] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ExecutionListInstancePageOptions {
    
    inline def apply(): ExecutionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutionListInstancePageOptions]
    }
    
    extension [Self <: ExecutionListInstancePageOptions](x: Self) {
      
      inline def setDateCreatedFrom(value: js.Date): Self = StObject.set(x, "dateCreatedFrom", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedFromUndefined: Self = StObject.set(x, "dateCreatedFrom", js.undefined)
      
      inline def setDateCreatedTo(value: js.Date): Self = StObject.set(x, "dateCreatedTo", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedToUndefined: Self = StObject.set(x, "dateCreatedTo", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ExecutionPayload
    extends StObject
       with ExecutionResource
       with TwilioResponsePayload
  object ExecutionPayload {
    
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
      status: ExecutionStatus,
      uri: String,
      url: String
    ): ExecutionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], contact_channel_address = contact_channel_address.asInstanceOf[js.Any], contact_sid = contact_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionPayload]
    }
  }
  
  trait ExecutionResource extends StObject {
    
    var account_sid: String
    
    var contact_channel_address: String
    
    var contact_sid: String
    
    var context: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var flow_sid: String
    
    var links: String
    
    var sid: String
    
    var status: ExecutionStatus
    
    var url: String
  }
  object ExecutionResource {
    
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
      status: ExecutionStatus,
      url: String
    ): ExecutionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], contact_channel_address = contact_channel_address.asInstanceOf[js.Any], contact_sid = contact_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionResource]
    }
    
    extension [Self <: ExecutionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setContact_channel_address(value: String): Self = StObject.set(x, "contact_channel_address", value.asInstanceOf[js.Any])
      
      inline def setContact_sid(value: String): Self = StObject.set(x, "contact_sid", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFlow_sid(value: String): Self = StObject.set(x, "flow_sid", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecutionSolution extends StObject {
    
    var flowSid: js.UndefOr[String] = js.undefined
  }
  object ExecutionSolution {
    
    inline def apply(): ExecutionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutionSolution]
    }
    
    extension [Self <: ExecutionSolution](x: Self) {
      
      inline def setFlowSid(value: String): Self = StObject.set(x, "flowSid", value.asInstanceOf[js.Any])
      
      inline def setFlowSidUndefined: Self = StObject.set(x, "flowSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.active_
    - typings.twilio.twilioStrings.ended
  */
  trait ExecutionStatus extends StObject
  object ExecutionStatus {
    
    inline def active: active_ = "active".asInstanceOf[active_]
    
    inline def ended: typings.twilio.twilioStrings.ended = "ended".asInstanceOf[typings.twilio.twilioStrings.ended]
  }
}
