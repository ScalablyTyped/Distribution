package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usageRecordMod {
  
  @JSImport("twilio/lib/rest/supersim/v1/usageRecord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/supersim/v1/usageRecord", "UsageRecordInstance")
  @js.native
  open class UsageRecordInstance protected () extends SerializableClass {
    /**
      * Initialize the UsageRecordContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.supersimV1Mod.^, payload: UsageRecordPayload) = this()
    
    var accountSid: String = js.native
    
    var billedUnit: String = js.native
    
    var dataDownload: Double = js.native
    
    var dataTotal: Double = js.native
    
    var dataTotalBilled: Double = js.native
    
    var dataUpload: Double = js.native
    
    var fleetSid: String = js.native
    
    var isoCountry: String = js.native
    
    var networkSid: String = js.native
    
    var period: Any = js.native
    
    var simSid: String = js.native
  }
  
  /**
    * Initialize the UsageRecordList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def UsageRecordList(version: typings.twilio.supersimV1Mod.^): UsageRecordListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("UsageRecordList")(version.asInstanceOf[js.Any]).asInstanceOf[UsageRecordListInstance]
  
  @JSImport("twilio/lib/rest/supersim/v1/usageRecord", "UsageRecordPage")
  @js.native
  open class UsageRecordPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.supersimV1Mod.^, 
          UsageRecordPayload, 
          UsageRecordResource, 
          UsageRecordInstance
        ] {
    /**
      * Initialize the UsageRecordPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.supersimV1Mod.^,
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
    - typings.twilio.twilioStrings.hour
    - typings.twilio.twilioStrings.day
    - typings.twilio.twilioStrings.all
  */
  trait UsageRecordGranularity extends StObject
  object UsageRecordGranularity {
    
    inline def all: typings.twilio.twilioStrings.all = "all".asInstanceOf[typings.twilio.twilioStrings.all]
    
    inline def day: typings.twilio.twilioStrings.day = "day".asInstanceOf[typings.twilio.twilioStrings.day]
    
    inline def hour: typings.twilio.twilioStrings.hour = "hour".asInstanceOf[typings.twilio.twilioStrings.hour]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.sim
    - typings.twilio.twilioStrings.fleet
    - typings.twilio.twilioStrings.network
    - typings.twilio.twilioStrings.isoCountry
  */
  trait UsageRecordGroup extends StObject
  object UsageRecordGroup {
    
    inline def fleet: typings.twilio.twilioStrings.fleet = "fleet".asInstanceOf[typings.twilio.twilioStrings.fleet]
    
    inline def isoCountry: typings.twilio.twilioStrings.isoCountry = "isoCountry".asInstanceOf[typings.twilio.twilioStrings.isoCountry]
    
    inline def network: typings.twilio.twilioStrings.network = "network".asInstanceOf[typings.twilio.twilioStrings.network]
    
    inline def sim: typings.twilio.twilioStrings.sim = "sim".asInstanceOf[typings.twilio.twilioStrings.sim]
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
    * @property endTime - Only include usage that occurred before this time (exclusive).
    * @property fleet - SID or unique name of a Fleet resource. Only show UsageRecords representing usage for Super SIMs belonging to this Fleet resource at the time the usage occurred.
    * @property granularity - Time-based grouping that UsageRecords should be aggregated by. Can be: `hour`, `day`, or `all`. Default is `all`.
    * @property group - Dimension over which to aggregate usage records.
    * @property isoCountry - Alpha-2 ISO Country Code. Only show UsageRecords representing usage in this country.
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property network - SID of a Network resource. Only show UsageRecords representing usage on this network.
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property sim - SID or unique name of a Sim resource. Only show UsageRecords representing usage incurred by this Super SIM.
    * @property startTime - Only include usage that occurred at or after this time.
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
    
    var endTime: js.UndefOr[js.Date] = js.undefined
    
    var fleet: js.UndefOr[String] = js.undefined
    
    var granularity: js.UndefOr[UsageRecordGranularity] = js.undefined
    
    var group: js.UndefOr[UsageRecordGroup] = js.undefined
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var network: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var startTime: js.UndefOr[js.Date] = js.undefined
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
      
      inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setFleet(value: String): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
      
      inline def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
      
      inline def setGranularity(value: UsageRecordGranularity): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
      
      inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
      
      inline def setGroup(value: UsageRecordGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property endTime - Only include usage that occurred before this time (exclusive).
    * @property fleet - SID or unique name of a Fleet resource. Only show UsageRecords representing usage for Super SIMs belonging to this Fleet resource at the time the usage occurred.
    * @property granularity - Time-based grouping that UsageRecords should be aggregated by. Can be: `hour`, `day`, or `all`. Default is `all`.
    * @property group - Dimension over which to aggregate usage records.
    * @property isoCountry - Alpha-2 ISO Country Code. Only show UsageRecords representing usage in this country.
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property network - SID of a Network resource. Only show UsageRecords representing usage on this network.
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property sim - SID or unique name of a Sim resource. Only show UsageRecords representing usage incurred by this Super SIM.
    * @property startTime - Only include usage that occurred at or after this time.
    */
  trait UsageRecordListInstanceOptions extends StObject {
    
    var endTime: js.UndefOr[js.Date] = js.undefined
    
    var fleet: js.UndefOr[String] = js.undefined
    
    var granularity: js.UndefOr[UsageRecordGranularity] = js.undefined
    
    var group: js.UndefOr[UsageRecordGroup] = js.undefined
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var network: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var startTime: js.UndefOr[js.Date] = js.undefined
  }
  object UsageRecordListInstanceOptions {
    
    inline def apply(): UsageRecordListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsageRecordListInstanceOptions]
    }
    
    extension [Self <: UsageRecordListInstanceOptions](x: Self) {
      
      inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setFleet(value: String): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
      
      inline def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
      
      inline def setGranularity(value: UsageRecordGranularity): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
      
      inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
      
      inline def setGroup(value: UsageRecordGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property endTime - Only include usage that occurred before this time (exclusive).
    * @property fleet - SID or unique name of a Fleet resource. Only show UsageRecords representing usage for Super SIMs belonging to this Fleet resource at the time the usage occurred.
    * @property granularity - Time-based grouping that UsageRecords should be aggregated by. Can be: `hour`, `day`, or `all`. Default is `all`.
    * @property group - Dimension over which to aggregate usage records.
    * @property isoCountry - Alpha-2 ISO Country Code. Only show UsageRecords representing usage in this country.
    * @property network - SID of a Network resource. Only show UsageRecords representing usage on this network.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property sim - SID or unique name of a Sim resource. Only show UsageRecords representing usage incurred by this Super SIM.
    * @property startTime - Only include usage that occurred at or after this time.
    */
  trait UsageRecordListInstancePageOptions extends StObject {
    
    var endTime: js.UndefOr[js.Date] = js.undefined
    
    var fleet: js.UndefOr[String] = js.undefined
    
    var granularity: js.UndefOr[UsageRecordGranularity] = js.undefined
    
    var group: js.UndefOr[UsageRecordGroup] = js.undefined
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var network: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var startTime: js.UndefOr[js.Date] = js.undefined
  }
  object UsageRecordListInstancePageOptions {
    
    inline def apply(): UsageRecordListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsageRecordListInstancePageOptions]
    }
    
    extension [Self <: UsageRecordListInstancePageOptions](x: Self) {
      
      inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setFleet(value: String): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
      
      inline def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
      
      inline def setGranularity(value: UsageRecordGranularity): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
      
      inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
      
      inline def setGroup(value: UsageRecordGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
  
  trait UsageRecordPayload
    extends StObject
       with UsageRecordResource
       with TwilioResponsePayload
  object UsageRecordPayload {
    
    inline def apply(
      account_sid: String,
      billed_unit: String,
      data_download: Double,
      data_total: Double,
      data_total_billed: Double,
      data_upload: Double,
      first_page_uri: String,
      fleet_sid: String,
      iso_country: String,
      network_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      period: js.Object,
      previous_page_uri: String,
      sim_sid: String,
      uri: String
    ): UsageRecordPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], billed_unit = billed_unit.asInstanceOf[js.Any], data_download = data_download.asInstanceOf[js.Any], data_total = data_total.asInstanceOf[js.Any], data_total_billed = data_total_billed.asInstanceOf[js.Any], data_upload = data_upload.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], fleet_sid = fleet_sid.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], network_sid = network_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageRecordPayload]
    }
  }
  
  trait UsageRecordResource extends StObject {
    
    var account_sid: String
    
    var billed_unit: String
    
    var data_download: Double
    
    var data_total: Double
    
    var data_total_billed: Double
    
    var data_upload: Double
    
    var fleet_sid: String
    
    var iso_country: String
    
    var network_sid: String
    
    var period: js.Object
    
    var sim_sid: String
  }
  object UsageRecordResource {
    
    inline def apply(
      account_sid: String,
      billed_unit: String,
      data_download: Double,
      data_total: Double,
      data_total_billed: Double,
      data_upload: Double,
      fleet_sid: String,
      iso_country: String,
      network_sid: String,
      period: js.Object,
      sim_sid: String
    ): UsageRecordResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], billed_unit = billed_unit.asInstanceOf[js.Any], data_download = data_download.asInstanceOf[js.Any], data_total = data_total.asInstanceOf[js.Any], data_total_billed = data_total_billed.asInstanceOf[js.Any], data_upload = data_upload.asInstanceOf[js.Any], fleet_sid = fleet_sid.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], network_sid = network_sid.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageRecordResource]
    }
    
    extension [Self <: UsageRecordResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBilled_unit(value: String): Self = StObject.set(x, "billed_unit", value.asInstanceOf[js.Any])
      
      inline def setData_download(value: Double): Self = StObject.set(x, "data_download", value.asInstanceOf[js.Any])
      
      inline def setData_total(value: Double): Self = StObject.set(x, "data_total", value.asInstanceOf[js.Any])
      
      inline def setData_total_billed(value: Double): Self = StObject.set(x, "data_total_billed", value.asInstanceOf[js.Any])
      
      inline def setData_upload(value: Double): Self = StObject.set(x, "data_upload", value.asInstanceOf[js.Any])
      
      inline def setFleet_sid(value: String): Self = StObject.set(x, "fleet_sid", value.asInstanceOf[js.Any])
      
      inline def setIso_country(value: String): Self = StObject.set(x, "iso_country", value.asInstanceOf[js.Any])
      
      inline def setNetwork_sid(value: String): Self = StObject.set(x, "network_sid", value.asInstanceOf[js.Any])
      
      inline def setPeriod(value: js.Object): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setSim_sid(value: String): Self = StObject.set(x, "sim_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsageRecordSolution extends StObject
  
  type UsageRecordSortBy = time
}
