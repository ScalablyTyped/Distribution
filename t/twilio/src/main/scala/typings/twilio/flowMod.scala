package typings.twilio

import typings.twilio.engagementMod.EngagementContext
import typings.twilio.engagementMod.EngagementListInstance
import typings.twilio.executionMod.ExecutionContext
import typings.twilio.executionMod.ExecutionListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowMod {
  
  @JSImport("twilio/lib/rest/studio/v1/flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/studio/v1/flow", "FlowContext")
  @js.native
  open class FlowContext protected () extends StObject {
    /**
      * Initialize the FlowContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.studioV1Mod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def engagements(sid: String): EngagementContext = js.native
    @JSName("engagements")
    var engagements_Original: EngagementListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def executions(sid: String): ExecutionContext = js.native
    @JSName("executions")
    var executions_Original: ExecutionListInstance = js.native
    
    /**
      * fetch a FlowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FlowInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowInstance, Any]): js.Promise[FlowInstance] = js.native
    
    /**
      * remove a FlowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/studio/v1/flow", "FlowInstance")
  @js.native
  open class FlowInstance protected () extends SerializableClass {
    /**
      * Initialize the FlowContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.studioV1Mod.^, payload: FlowPayload, sid: String) = this()
    
    /* private */ var _proxy: FlowContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Access the engagements
      */
    def engagements(): EngagementListInstance = js.native
    
    /**
      * Access the executions
      */
    def executions(): ExecutionListInstance = js.native
    
    /**
      * fetch a FlowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FlowInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FlowInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    /**
      * remove a FlowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var status: FlowStatus = js.native
    
    var url: String = js.native
    
    var version: Double = js.native
  }
  
  /**
    * Initialize the FlowList
    *
    * @param version - Version of the resource
    */
  inline def FlowList(version: typings.twilio.studioV1Mod.^): FlowListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("FlowList")(version.asInstanceOf[js.Any]).asInstanceOf[FlowListInstance]
  
  @JSImport("twilio/lib/rest/studio/v1/flow", "FlowPage")
  @js.native
  open class FlowPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.studioV1Mod.^, FlowPayload, FlowResource, FlowInstance] {
    /**
      * Initialize the FlowPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.studioV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: FlowSolution
    ) = this()
    
    /**
      * Build an instance of FlowInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FlowPayload): FlowInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait FlowListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FlowContext = js.native
    
    /**
      * Streams FlowInstance records from the API.
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
          /* item */ FlowInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ FlowInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: FlowListInstanceEachOptions): Unit = js.native
    def each(
      opts: FlowListInstanceEachOptions,
      callback: js.Function2[
          /* item */ FlowInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a flow
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): FlowContext = js.native
    
    /**
      * Retrieve a single target page of FlowInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[FlowPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowPage, Any]): js.Promise[FlowPage] = js.native
    def getPage(targetUrl: String): js.Promise[FlowPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowPage, Any]): js.Promise[FlowPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowPage, Any]): js.Promise[FlowPage] = js.native
    
    /**
      * Lists FlowInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[FlowInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FlowInstance], Any]): js.Promise[js.Array[FlowInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FlowInstance], Any]
    ): js.Promise[js.Array[FlowInstance]] = js.native
    def list(opts: FlowListInstanceOptions): js.Promise[js.Array[FlowInstance]] = js.native
    def list(
      opts: FlowListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FlowInstance], Any]
    ): js.Promise[js.Array[FlowInstance]] = js.native
    
    /**
      * Retrieve a single page of FlowInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[FlowPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowPage, Any]): js.Promise[FlowPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowPage, Any]): js.Promise[FlowPage] = js.native
    def page(opts: FlowListInstancePageOptions): js.Promise[FlowPage] = js.native
    def page(
      opts: FlowListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowPage, Any]
    ): js.Promise[FlowPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
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
  trait FlowListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ FlowInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FlowListInstanceEachOptions {
    
    inline def apply(): FlowListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowListInstanceEachOptions]
    }
    
    extension [Self <: FlowListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ FlowInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait FlowListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FlowListInstanceOptions {
    
    inline def apply(): FlowListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowListInstanceOptions]
    }
    
    extension [Self <: FlowListInstanceOptions](x: Self) {
      
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
  trait FlowListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object FlowListInstancePageOptions {
    
    inline def apply(): FlowListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowListInstancePageOptions]
    }
    
    extension [Self <: FlowListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait FlowPayload
    extends StObject
       with FlowResource
       with TwilioResponsePayload
  object FlowPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      status: FlowStatus,
      uri: String,
      url: String,
      version: Double
    ): FlowPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowPayload]
    }
  }
  
  trait FlowResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: String
    
    var sid: String
    
    var status: FlowStatus
    
    var url: String
    
    var version: Double
  }
  object FlowResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: String,
      sid: String,
      status: FlowStatus,
      url: String,
      version: Double
    ): FlowResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowResource]
    }
    
    extension [Self <: FlowResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: FlowStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.draft
    - typings.twilio.twilioStrings.published
  */
  trait FlowStatus extends StObject
  object FlowStatus {
    
    inline def draft: typings.twilio.twilioStrings.draft = "draft".asInstanceOf[typings.twilio.twilioStrings.draft]
    
    inline def published: typings.twilio.twilioStrings.published = "published".asInstanceOf[typings.twilio.twilioStrings.published]
  }
}
