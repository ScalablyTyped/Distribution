package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.active_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object billingPeriodMod {
  
  @JSImport("twilio/lib/rest/supersim/v1/sim/billingPeriod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/supersim/v1/sim/billingPeriod", "BillingPeriodInstance")
  @js.native
  open class BillingPeriodInstance protected () extends SerializableClass {
    /**
      * Initialize the BillingPeriodContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param simSid - The SID of the Super SIM the Billing Period belongs to
      */
    def this(version: typings.twilio.supersimV1Mod.^, payload: BillingPeriodPayload, simSid: String) = this()
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var endTime: js.Date = js.native
    
    var periodType: BillingPeriodBpType = js.native
    
    var sid: String = js.native
    
    var simSid: String = js.native
    
    var startTime: js.Date = js.native
  }
  
  /**
    * Initialize the BillingPeriodList
    *
    * @param version - Version of the resource
    * @param simSid - The SID of the Super SIM the Billing Period belongs to
    */
  inline def BillingPeriodList(version: typings.twilio.supersimV1Mod.^, simSid: String): BillingPeriodListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("BillingPeriodList")(version.asInstanceOf[js.Any], simSid.asInstanceOf[js.Any])).asInstanceOf[BillingPeriodListInstance]
  
  @JSImport("twilio/lib/rest/supersim/v1/sim/billingPeriod", "BillingPeriodPage")
  @js.native
  open class BillingPeriodPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.supersimV1Mod.^, 
          BillingPeriodPayload, 
          BillingPeriodResource, 
          BillingPeriodInstance
        ] {
    /**
      * Initialize the BillingPeriodPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.supersimV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: BillingPeriodSolution
    ) = this()
    
    /**
      * Build an instance of BillingPeriodInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: BillingPeriodPayload): BillingPeriodInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.ready
    - typings.twilio.twilioStrings.active_
  */
  trait BillingPeriodBpType extends StObject
  object BillingPeriodBpType {
    
    inline def active: active_ = "active".asInstanceOf[active_]
    
    inline def ready: typings.twilio.twilioStrings.ready = "ready".asInstanceOf[typings.twilio.twilioStrings.ready]
  }
  
  @js.native
  trait BillingPeriodListInstance extends StObject {
    
    /**
      * Streams BillingPeriodInstance records from the API.
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
          /* item */ BillingPeriodInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ BillingPeriodInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: BillingPeriodListInstanceEachOptions): Unit = js.native
    def each(
      opts: BillingPeriodListInstanceEachOptions,
      callback: js.Function2[
          /* item */ BillingPeriodInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of BillingPeriodInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[BillingPeriodPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ BillingPeriodPage, Any]): js.Promise[BillingPeriodPage] = js.native
    def getPage(targetUrl: String): js.Promise[BillingPeriodPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BillingPeriodPage, Any]
    ): js.Promise[BillingPeriodPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BillingPeriodPage, Any]
    ): js.Promise[BillingPeriodPage] = js.native
    
    /**
      * Lists BillingPeriodInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[BillingPeriodInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BillingPeriodInstance], Any]
    ): js.Promise[js.Array[BillingPeriodInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BillingPeriodInstance], Any]
    ): js.Promise[js.Array[BillingPeriodInstance]] = js.native
    def list(opts: BillingPeriodListInstanceOptions): js.Promise[js.Array[BillingPeriodInstance]] = js.native
    def list(
      opts: BillingPeriodListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BillingPeriodInstance], Any]
    ): js.Promise[js.Array[BillingPeriodInstance]] = js.native
    
    /**
      * Retrieve a single page of BillingPeriodInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[BillingPeriodPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ BillingPeriodPage, Any]): js.Promise[BillingPeriodPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BillingPeriodPage, Any]
    ): js.Promise[BillingPeriodPage] = js.native
    def page(opts: BillingPeriodListInstancePageOptions): js.Promise[BillingPeriodPage] = js.native
    def page(
      opts: BillingPeriodListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BillingPeriodPage, Any]
    ): js.Promise[BillingPeriodPage] = js.native
    
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
  trait BillingPeriodListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ BillingPeriodInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object BillingPeriodListInstanceEachOptions {
    
    inline def apply(): BillingPeriodListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingPeriodListInstanceEachOptions]
    }
    
    extension [Self <: BillingPeriodListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ BillingPeriodInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait BillingPeriodListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object BillingPeriodListInstanceOptions {
    
    inline def apply(): BillingPeriodListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingPeriodListInstanceOptions]
    }
    
    extension [Self <: BillingPeriodListInstanceOptions](x: Self) {
      
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
  trait BillingPeriodListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object BillingPeriodListInstancePageOptions {
    
    inline def apply(): BillingPeriodListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingPeriodListInstancePageOptions]
    }
    
    extension [Self <: BillingPeriodListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait BillingPeriodPayload
    extends StObject
       with BillingPeriodResource
       with TwilioResponsePayload
  object BillingPeriodPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      end_time: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      period_type: BillingPeriodBpType,
      previous_page_uri: String,
      sid: String,
      sim_sid: String,
      start_time: js.Date,
      uri: String
    ): BillingPeriodPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], period_type = period_type.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[BillingPeriodPayload]
    }
  }
  
  trait BillingPeriodResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var end_time: js.Date
    
    var period_type: BillingPeriodBpType
    
    var sid: String
    
    var sim_sid: String
    
    var start_time: js.Date
  }
  object BillingPeriodResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      end_time: js.Date,
      period_type: BillingPeriodBpType,
      sid: String,
      sim_sid: String,
      start_time: js.Date
    ): BillingPeriodResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], period_type = period_type.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
      __obj.asInstanceOf[BillingPeriodResource]
    }
    
    extension [Self <: BillingPeriodResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEnd_time(value: js.Date): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
      
      inline def setPeriod_type(value: BillingPeriodBpType): Self = StObject.set(x, "period_type", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSim_sid(value: String): Self = StObject.set(x, "sim_sid", value.asInstanceOf[js.Any])
      
      inline def setStart_time(value: js.Date): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    }
  }
  
  trait BillingPeriodSolution extends StObject {
    
    var simSid: js.UndefOr[String] = js.undefined
  }
  object BillingPeriodSolution {
    
    inline def apply(): BillingPeriodSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingPeriodSolution]
    }
    
    extension [Self <: BillingPeriodSolution](x: Self) {
      
      inline def setSimSid(value: String): Self = StObject.set(x, "simSid", value.asInstanceOf[js.Any])
      
      inline def setSimSidUndefined: Self = StObject.set(x, "simSid", js.undefined)
    }
  }
}
