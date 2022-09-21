package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1UsageRecordMod {
  
  @JSImport("twilio/lib/rest/wireless/v1/usageRecord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/wireless/v1/usageRecord", "UsageRecordInstance")
  @js.native
  open class UsageRecordInstance protected () extends SerializableClass {
    /**
      * Initialize the UsageRecordContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.wirelessV1Mod.^, payload: UsageRecordPayload) = this()
    
    var accountSid: String = js.native
    
    var commands: Any = js.native
    
    var data: Any = js.native
    
    var period: Any = js.native
  }
  
  /**
    * Initialize the UsageRecordList
    *
    * @param version - Version of the resource
    */
  inline def UsageRecordList(version: typings.twilio.wirelessV1Mod.^): UsageRecordListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("UsageRecordList")(version.asInstanceOf[js.Any]).asInstanceOf[UsageRecordListInstance]
  
  @JSImport("twilio/lib/rest/wireless/v1/usageRecord", "UsageRecordPage")
  @js.native
  open class UsageRecordPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.wirelessV1Mod.^, 
          UsageRecordPayload, 
          UsageRecordResource, 
          UsageRecordInstance
        ] {
    /**
      * Initialize the UsageRecordPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.wirelessV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: UsageRecordSolution
    ) = this()
    
    /**
      * Build an instance of UsageRecordInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: UsageRecordPayload): UsageRecordInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.hourly
    - typings.twilio.twilioStrings.daily
    - typings.twilio.twilioStrings.all
  */
  trait UsageRecordGranularity extends StObject
  object UsageRecordGranularity {
    
    inline def all: typings.twilio.twilioStrings.all = "all".asInstanceOf[typings.twilio.twilioStrings.all]
    
    inline def daily: typings.twilio.twilioStrings.daily = "daily".asInstanceOf[typings.twilio.twilioStrings.daily]
    
    inline def hourly: typings.twilio.twilioStrings.hourly = "hourly".asInstanceOf[typings.twilio.twilioStrings.hourly]
  }
  
  @js.native
  trait UsageRecordListInstance extends StObject {
    
    /**
      * Streams UsageRecordInstance records from the API.
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
          /* item */ UsageRecordInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ UsageRecordInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: UsageRecordListInstanceEachOptions): Unit = js.native
    def each(
      opts: UsageRecordListInstanceEachOptions,
      callback: js.Function2[
          /* item */ UsageRecordInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of UsageRecordInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[UsageRecordPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ UsageRecordPage, Any]): js.Promise[UsageRecordPage] = js.native
    def getPage(targetUrl: String): js.Promise[UsageRecordPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UsageRecordPage, Any]
    ): js.Promise[UsageRecordPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UsageRecordPage, Any]
    ): js.Promise[UsageRecordPage] = js.native
    
    /**
      * Lists UsageRecordInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[UsageRecordInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UsageRecordInstance], Any]
    ): js.Promise[js.Array[UsageRecordInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UsageRecordInstance], Any]
    ): js.Promise[js.Array[UsageRecordInstance]] = js.native
    def list(opts: UsageRecordListInstanceOptions): js.Promise[js.Array[UsageRecordInstance]] = js.native
    def list(
      opts: UsageRecordListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UsageRecordInstance], Any]
    ): js.Promise[js.Array[UsageRecordInstance]] = js.native
    
    /**
      * Retrieve a single page of UsageRecordInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[UsageRecordPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ UsageRecordPage, Any]): js.Promise[UsageRecordPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ UsageRecordPage, Any]): js.Promise[UsageRecordPage] = js.native
    def page(opts: UsageRecordListInstancePageOptions): js.Promise[UsageRecordPage] = js.native
    def page(
      opts: UsageRecordListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UsageRecordPage, Any]
    ): js.Promise[UsageRecordPage] = js.native
    
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
    * @property end - Only include usage that has occurred on or before this date
    * @property granularity - The time-based grouping that results are aggregated by
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
    * @property start - Only include usage that has occurred on or after this date
    */
  trait UsageRecordListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ UsageRecordInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var end: js.UndefOr[js.Date] = js.undefined
    
    var granularity: js.UndefOr[UsageRecordGranularity] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[js.Date] = js.undefined
  }
  object UsageRecordListInstanceEachOptions {
    
    inline def apply(): UsageRecordListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsageRecordListInstanceEachOptions]
    }
    
    extension [Self <: UsageRecordListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ UsageRecordInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setGranularity(value: UsageRecordGranularity): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
      
      inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property end - Only include usage that has occurred on or before this date
    * @property granularity - The time-based grouping that results are aggregated by
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
    * @property start - Only include usage that has occurred on or after this date
    */
  trait UsageRecordListInstanceOptions extends StObject {
    
    var end: js.UndefOr[js.Date] = js.undefined
    
    var granularity: js.UndefOr[UsageRecordGranularity] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[js.Date] = js.undefined
  }
  object UsageRecordListInstanceOptions {
    
    inline def apply(): UsageRecordListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsageRecordListInstanceOptions]
    }
    
    extension [Self <: UsageRecordListInstanceOptions](x: Self) {
      
      inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setGranularity(value: UsageRecordGranularity): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
      
      inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property end - Only include usage that has occurred on or before this date
    * @property granularity - The time-based grouping that results are aggregated by
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property start - Only include usage that has occurred on or after this date
    */
  trait UsageRecordListInstancePageOptions extends StObject {
    
    var end: js.UndefOr[js.Date] = js.undefined
    
    var granularity: js.UndefOr[UsageRecordGranularity] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var start: js.UndefOr[js.Date] = js.undefined
  }
  object UsageRecordListInstancePageOptions {
    
    inline def apply(): UsageRecordListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsageRecordListInstancePageOptions]
    }
    
    extension [Self <: UsageRecordListInstancePageOptions](x: Self) {
      
      inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setGranularity(value: UsageRecordGranularity): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
      
      inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait UsageRecordPayload
    extends StObject
       with UsageRecordResource
       with TwilioResponsePayload
  object UsageRecordPayload {
    
    inline def apply(
      account_sid: String,
      commands: js.Object,
      data: js.Object,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      period: js.Object,
      previous_page_uri: String,
      uri: String
    ): UsageRecordPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageRecordPayload]
    }
  }
  
  trait UsageRecordResource extends StObject {
    
    var account_sid: String
    
    var commands: js.Object
    
    var data: js.Object
    
    var period: js.Object
  }
  object UsageRecordResource {
    
    inline def apply(account_sid: String, commands: js.Object, data: js.Object, period: js.Object): UsageRecordResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageRecordResource]
    }
    
    extension [Self <: UsageRecordResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCommands(value: js.Object): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPeriod(value: js.Object): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsageRecordSolution extends StObject
}
