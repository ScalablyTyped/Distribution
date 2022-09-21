package typings.twilio

import typings.twilio.executionStepExecutionStepContextMod.ExecutionStepContextContext
import typings.twilio.executionStepExecutionStepContextMod.ExecutionStepContextListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executionExecutionStepMod {
  
  @JSImport("twilio/lib/rest/studio/v2/flow/execution/executionStep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/studio/v2/flow/execution/executionStep", "ExecutionStepContext")
  @js.native
  open class ExecutionStepContext protected () extends StObject {
    /**
      * Initialize the ExecutionStepContext
      *
      * @param version - Version of the resource
      * @param flowSid - The SID of the Flow
      * @param executionSid - The SID of the Execution
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.studioV2Mod.^, flowSid: String, executionSid: String, sid: String) = this()
    
    /**
      * fetch a ExecutionStepInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ExecutionStepInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionStepInstance, Any]): js.Promise[ExecutionStepInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def stepContext(sid: String): ExecutionStepContextContext = js.native
    @JSName("stepContext")
    var stepContext_Original: ExecutionStepContextListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/studio/v2/flow/execution/executionStep", "ExecutionStepInstance")
  @js.native
  open class ExecutionStepInstance protected () extends SerializableClass {
    /**
      * Initialize the ExecutionStepContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param flowSid - The SID of the Flow
      * @param executionSid - The SID of the Execution
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.studioV2Mod.^,
      payload: ExecutionStepPayload,
      flowSid: String,
      executionSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: ExecutionStepContext = js.native
    
    var accountSid: String = js.native
    
    var context: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var executionSid: String = js.native
    
    /**
      * fetch a ExecutionStepInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ExecutionStepInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ExecutionStepInstance] = js.native
    
    var flowSid: String = js.native
    
    var links: String = js.native
    
    var name: String = js.native
    
    var sid: String = js.native
    
    /**
      * Access the stepContext
      */
    def stepContext(): ExecutionStepContextListInstance = js.native
    
    var transitionedFrom: String = js.native
    
    var transitionedTo: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ExecutionStepList
    *
    * @param version - Version of the resource
    * @param flowSid - The SID of the Flow
    * @param executionSid - The SID of the Execution
    */
  inline def ExecutionStepList(version: typings.twilio.studioV2Mod.^, flowSid: String, executionSid: String): ExecutionStepListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ExecutionStepList")(version.asInstanceOf[js.Any], flowSid.asInstanceOf[js.Any], executionSid.asInstanceOf[js.Any])).asInstanceOf[ExecutionStepListInstance]
  
  @JSImport("twilio/lib/rest/studio/v2/flow/execution/executionStep", "ExecutionStepPage")
  @js.native
  open class ExecutionStepPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.studioV2Mod.^, 
          ExecutionStepPayload, 
          ExecutionStepResource, 
          ExecutionStepInstance
        ] {
    /**
      * Initialize the ExecutionStepPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.studioV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ExecutionStepSolution
    ) = this()
    
    /**
      * Build an instance of ExecutionStepInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ExecutionStepPayload): ExecutionStepInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ExecutionStepListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ExecutionStepContext = js.native
    
    /**
      * Streams ExecutionStepInstance records from the API.
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
          /* item */ ExecutionStepInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ExecutionStepInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ExecutionStepListInstanceEachOptions): Unit = js.native
    def each(
      opts: ExecutionStepListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ExecutionStepInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a execution_step
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): ExecutionStepContext = js.native
    
    /**
      * Retrieve a single target page of ExecutionStepInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ExecutionStepPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionStepPage, Any]): js.Promise[ExecutionStepPage] = js.native
    def getPage(targetUrl: String): js.Promise[ExecutionStepPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionStepPage, Any]
    ): js.Promise[ExecutionStepPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionStepPage, Any]
    ): js.Promise[ExecutionStepPage] = js.native
    
    /**
      * Lists ExecutionStepInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ExecutionStepInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ExecutionStepInstance], Any]
    ): js.Promise[js.Array[ExecutionStepInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ExecutionStepInstance], Any]
    ): js.Promise[js.Array[ExecutionStepInstance]] = js.native
    def list(opts: ExecutionStepListInstanceOptions): js.Promise[js.Array[ExecutionStepInstance]] = js.native
    def list(
      opts: ExecutionStepListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ExecutionStepInstance], Any]
    ): js.Promise[js.Array[ExecutionStepInstance]] = js.native
    
    /**
      * Retrieve a single page of ExecutionStepInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ExecutionStepPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionStepPage, Any]): js.Promise[ExecutionStepPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionStepPage, Any]
    ): js.Promise[ExecutionStepPage] = js.native
    def page(opts: ExecutionStepListInstancePageOptions): js.Promise[ExecutionStepPage] = js.native
    def page(
      opts: ExecutionStepListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ExecutionStepPage, Any]
    ): js.Promise[ExecutionStepPage] = js.native
    
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
  trait ExecutionStepListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ExecutionStepInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ExecutionStepListInstanceEachOptions {
    
    inline def apply(): ExecutionStepListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutionStepListInstanceEachOptions]
    }
    
    extension [Self <: ExecutionStepListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ExecutionStepInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ExecutionStepListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ExecutionStepListInstanceOptions {
    
    inline def apply(): ExecutionStepListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutionStepListInstanceOptions]
    }
    
    extension [Self <: ExecutionStepListInstanceOptions](x: Self) {
      
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
  trait ExecutionStepListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ExecutionStepListInstancePageOptions {
    
    inline def apply(): ExecutionStepListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutionStepListInstancePageOptions]
    }
    
    extension [Self <: ExecutionStepListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ExecutionStepPayload
    extends StObject
       with ExecutionStepResource
       with TwilioResponsePayload
  object ExecutionStepPayload {
    
    inline def apply(
      account_sid: String,
      context: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      execution_sid: String,
      first_page_uri: String,
      flow_sid: String,
      links: String,
      name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      transitioned_from: String,
      transitioned_to: String,
      uri: String,
      url: String
    ): ExecutionStepPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], execution_sid = execution_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], transitioned_from = transitioned_from.asInstanceOf[js.Any], transitioned_to = transitioned_to.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionStepPayload]
    }
  }
  
  trait ExecutionStepResource extends StObject {
    
    var account_sid: String
    
    var context: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var execution_sid: String
    
    var flow_sid: String
    
    var links: String
    
    var name: String
    
    var sid: String
    
    var transitioned_from: String
    
    var transitioned_to: String
    
    var url: String
  }
  object ExecutionStepResource {
    
    inline def apply(
      account_sid: String,
      context: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      execution_sid: String,
      flow_sid: String,
      links: String,
      name: String,
      sid: String,
      transitioned_from: String,
      transitioned_to: String,
      url: String
    ): ExecutionStepResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], execution_sid = execution_sid.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], transitioned_from = transitioned_from.asInstanceOf[js.Any], transitioned_to = transitioned_to.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionStepResource]
    }
    
    extension [Self <: ExecutionStepResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setExecution_sid(value: String): Self = StObject.set(x, "execution_sid", value.asInstanceOf[js.Any])
      
      inline def setFlow_sid(value: String): Self = StObject.set(x, "flow_sid", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTransitioned_from(value: String): Self = StObject.set(x, "transitioned_from", value.asInstanceOf[js.Any])
      
      inline def setTransitioned_to(value: String): Self = StObject.set(x, "transitioned_to", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecutionStepSolution extends StObject {
    
    var executionSid: js.UndefOr[String] = js.undefined
    
    var flowSid: js.UndefOr[String] = js.undefined
  }
  object ExecutionStepSolution {
    
    inline def apply(): ExecutionStepSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutionStepSolution]
    }
    
    extension [Self <: ExecutionStepSolution](x: Self) {
      
      inline def setExecutionSid(value: String): Self = StObject.set(x, "executionSid", value.asInstanceOf[js.Any])
      
      inline def setExecutionSidUndefined: Self = StObject.set(x, "executionSid", js.undefined)
      
      inline def setFlowSid(value: String): Self = StObject.set(x, "flowSid", value.asInstanceOf[js.Any])
      
      inline def setFlowSidUndefined: Self = StObject.set(x, "flowSid", js.undefined)
    }
  }
}
