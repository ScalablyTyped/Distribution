package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.stepContextMod.StepContextContext
import typings.twilio.stepContextMod.StepContextListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepMod {
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement/step", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement/step", "StepContext")
  @js.native
  open class StepContext protected () extends StObject {
    /**
      * Initialize the StepContext
      *
      * @param version - Version of the resource
      * @param flowSid - The SID of the Flow
      * @param engagementSid - The SID of the Engagement
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.studioV1Mod.^, flowSid: String, engagementSid: String, sid: String) = this()
    
    /**
      * fetch a StepInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[StepInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ StepInstance, Any]): js.Promise[StepInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def stepContext(sid: String): StepContextContext = js.native
    @JSName("stepContext")
    var stepContext_Original: StepContextListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement/step", "StepInstance")
  @js.native
  open class StepInstance protected () extends SerializableClass {
    /**
      * Initialize the StepContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param flowSid - The SID of the Flow
      * @param engagementSid - The SID of the Engagement
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(
      version: typings.twilio.studioV1Mod.^,
      payload: StepPayload,
      flowSid: String,
      engagementSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: StepContext = js.native
    
    var accountSid: String = js.native
    
    var context: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var engagementSid: String = js.native
    
    /**
      * fetch a StepInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[StepInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[StepInstance] = js.native
    
    var flowSid: String = js.native
    
    var links: String = js.native
    
    var name: String = js.native
    
    var sid: String = js.native
    
    /**
      * Access the stepContext
      */
    def stepContext(): StepContextListInstance = js.native
    
    var transitionedFrom: String = js.native
    
    var transitionedTo: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the StepList
    *
    * @param version - Version of the resource
    * @param flowSid - The SID of the Flow
    * @param engagementSid - The SID of the Engagement
    */
  inline def StepList(version: typings.twilio.studioV1Mod.^, flowSid: String, engagementSid: String): StepListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("StepList")(version.asInstanceOf[js.Any], flowSid.asInstanceOf[js.Any], engagementSid.asInstanceOf[js.Any])).asInstanceOf[StepListInstance]
  
  @JSImport("twilio/lib/rest/studio/v1/flow/engagement/step", "StepPage")
  @js.native
  open class StepPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.studioV1Mod.^, StepPayload, StepResource, StepInstance] {
    /**
      * Initialize the StepPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.studioV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: StepSolution
    ) = this()
    
    /**
      * Build an instance of StepInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: StepPayload): StepInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait StepListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): StepContext = js.native
    
    /**
      * Streams StepInstance records from the API.
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
          /* item */ StepInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ StepInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: StepListInstanceEachOptions): Unit = js.native
    def each(
      opts: StepListInstanceEachOptions,
      callback: js.Function2[
          /* item */ StepInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a step
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): StepContext = js.native
    
    /**
      * Retrieve a single target page of StepInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[StepPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ StepPage, Any]): js.Promise[StepPage] = js.native
    def getPage(targetUrl: String): js.Promise[StepPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ StepPage, Any]): js.Promise[StepPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ StepPage, Any]): js.Promise[StepPage] = js.native
    
    /**
      * Lists StepInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[StepInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[StepInstance], Any]): js.Promise[js.Array[StepInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[StepInstance], Any]
    ): js.Promise[js.Array[StepInstance]] = js.native
    def list(opts: StepListInstanceOptions): js.Promise[js.Array[StepInstance]] = js.native
    def list(
      opts: StepListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[StepInstance], Any]
    ): js.Promise[js.Array[StepInstance]] = js.native
    
    /**
      * Retrieve a single page of StepInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[StepPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ StepPage, Any]): js.Promise[StepPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ StepPage, Any]): js.Promise[StepPage] = js.native
    def page(opts: StepListInstancePageOptions): js.Promise[StepPage] = js.native
    def page(
      opts: StepListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ StepPage, Any]
    ): js.Promise[StepPage] = js.native
    
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
  trait StepListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ StepInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object StepListInstanceEachOptions {
    
    inline def apply(): StepListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepListInstanceEachOptions]
    }
    
    extension [Self <: StepListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ StepInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait StepListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object StepListInstanceOptions {
    
    inline def apply(): StepListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepListInstanceOptions]
    }
    
    extension [Self <: StepListInstanceOptions](x: Self) {
      
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
  trait StepListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object StepListInstancePageOptions {
    
    inline def apply(): StepListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepListInstancePageOptions]
    }
    
    extension [Self <: StepListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait StepPayload
    extends StObject
       with StepResource
       with TwilioResponsePayload
  object StepPayload {
    
    inline def apply(
      account_sid: String,
      context: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      engagement_sid: String,
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
    ): StepPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], engagement_sid = engagement_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], transitioned_from = transitioned_from.asInstanceOf[js.Any], transitioned_to = transitioned_to.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepPayload]
    }
  }
  
  trait StepResource extends StObject {
    
    var account_sid: String
    
    var context: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var engagement_sid: String
    
    var flow_sid: String
    
    var links: String
    
    var name: String
    
    var sid: String
    
    var transitioned_from: String
    
    var transitioned_to: String
    
    var url: String
  }
  object StepResource {
    
    inline def apply(
      account_sid: String,
      context: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      engagement_sid: String,
      flow_sid: String,
      links: String,
      name: String,
      sid: String,
      transitioned_from: String,
      transitioned_to: String,
      url: String
    ): StepResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], engagement_sid = engagement_sid.asInstanceOf[js.Any], flow_sid = flow_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], transitioned_from = transitioned_from.asInstanceOf[js.Any], transitioned_to = transitioned_to.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepResource]
    }
    
    extension [Self <: StepResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEngagement_sid(value: String): Self = StObject.set(x, "engagement_sid", value.asInstanceOf[js.Any])
      
      inline def setFlow_sid(value: String): Self = StObject.set(x, "flow_sid", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTransitioned_from(value: String): Self = StObject.set(x, "transitioned_from", value.asInstanceOf[js.Any])
      
      inline def setTransitioned_to(value: String): Self = StObject.set(x, "transitioned_to", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait StepSolution extends StObject {
    
    var engagementSid: js.UndefOr[String] = js.undefined
    
    var flowSid: js.UndefOr[String] = js.undefined
  }
  object StepSolution {
    
    inline def apply(): StepSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepSolution]
    }
    
    extension [Self <: StepSolution](x: Self) {
      
      inline def setEngagementSid(value: String): Self = StObject.set(x, "engagementSid", value.asInstanceOf[js.Any])
      
      inline def setEngagementSidUndefined: Self = StObject.set(x, "engagementSid", js.undefined)
      
      inline def setFlowSid(value: String): Self = StObject.set(x, "flowSid", value.asInstanceOf[js.Any])
      
      inline def setFlowSidUndefined: Self = StObject.set(x, "flowSid", js.undefined)
    }
  }
}
