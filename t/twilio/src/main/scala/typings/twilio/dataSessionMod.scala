package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSessionMod {
  
  @JSImport("twilio/lib/rest/wireless/v1/sim/dataSession", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/wireless/v1/sim/dataSession", "DataSessionInstance")
  @js.native
  open class DataSessionInstance protected () extends SerializableClass {
    /**
      * Initialize the DataSessionContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param simSid - The SID of the Sim resource that the Data Session is for
      */
    def this(version: typings.twilio.wirelessV1Mod.^, payload: DataSessionPayload, simSid: String) = this()
    
    var accountSid: String = js.native
    
    var cellId: String = js.native
    
    var cellLocationEstimate: Any = js.native
    
    var end: js.Date = js.native
    
    var imei: String = js.native
    
    var lastUpdated: js.Date = js.native
    
    var operatorCountry: String = js.native
    
    var operatorMcc: String = js.native
    
    var operatorMnc: String = js.native
    
    var operatorName: String = js.native
    
    var packetsDownloaded: Double = js.native
    
    var packetsUploaded: Double = js.native
    
    var radioLink: String = js.native
    
    var sid: String = js.native
    
    var simSid: String = js.native
    
    var start: js.Date = js.native
  }
  
  /**
    * Initialize the DataSessionList
    *
    * @param version - Version of the resource
    * @param simSid - The SID of the Sim resource that the Data Session is for
    */
  inline def DataSessionList(version: typings.twilio.wirelessV1Mod.^, simSid: String): DataSessionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("DataSessionList")(version.asInstanceOf[js.Any], simSid.asInstanceOf[js.Any])).asInstanceOf[DataSessionListInstance]
  
  @JSImport("twilio/lib/rest/wireless/v1/sim/dataSession", "DataSessionPage")
  @js.native
  open class DataSessionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.wirelessV1Mod.^, 
          DataSessionPayload, 
          DataSessionResource, 
          DataSessionInstance
        ] {
    /**
      * Initialize the DataSessionPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.wirelessV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: DataSessionSolution
    ) = this()
    
    /**
      * Build an instance of DataSessionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DataSessionPayload): DataSessionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait DataSessionListInstance extends StObject {
    
    /**
      * Streams DataSessionInstance records from the API.
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
          /* item */ DataSessionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ DataSessionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: DataSessionListInstanceEachOptions): Unit = js.native
    def each(
      opts: DataSessionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DataSessionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of DataSessionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[DataSessionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ DataSessionPage, Any]): js.Promise[DataSessionPage] = js.native
    def getPage(targetUrl: String): js.Promise[DataSessionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DataSessionPage, Any]
    ): js.Promise[DataSessionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DataSessionPage, Any]
    ): js.Promise[DataSessionPage] = js.native
    
    /**
      * Lists DataSessionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DataSessionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DataSessionInstance], Any]
    ): js.Promise[js.Array[DataSessionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DataSessionInstance], Any]
    ): js.Promise[js.Array[DataSessionInstance]] = js.native
    def list(opts: DataSessionListInstanceOptions): js.Promise[js.Array[DataSessionInstance]] = js.native
    def list(
      opts: DataSessionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DataSessionInstance], Any]
    ): js.Promise[js.Array[DataSessionInstance]] = js.native
    
    /**
      * Retrieve a single page of DataSessionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[DataSessionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ DataSessionPage, Any]): js.Promise[DataSessionPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ DataSessionPage, Any]): js.Promise[DataSessionPage] = js.native
    def page(opts: DataSessionListInstancePageOptions): js.Promise[DataSessionPage] = js.native
    def page(
      opts: DataSessionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DataSessionPage, Any]
    ): js.Promise[DataSessionPage] = js.native
    
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
  trait DataSessionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DataSessionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DataSessionListInstanceEachOptions {
    
    inline def apply(): DataSessionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSessionListInstanceEachOptions]
    }
    
    extension [Self <: DataSessionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ DataSessionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait DataSessionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DataSessionListInstanceOptions {
    
    inline def apply(): DataSessionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSessionListInstanceOptions]
    }
    
    extension [Self <: DataSessionListInstanceOptions](x: Self) {
      
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
  trait DataSessionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object DataSessionListInstancePageOptions {
    
    inline def apply(): DataSessionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSessionListInstancePageOptions]
    }
    
    extension [Self <: DataSessionListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait DataSessionPayload
    extends StObject
       with DataSessionResource
       with TwilioResponsePayload
  object DataSessionPayload {
    
    inline def apply(
      account_sid: String,
      cell_id: String,
      cell_location_estimate: js.Object,
      end: js.Date,
      first_page_uri: String,
      imei: String,
      last_updated: js.Date,
      next_page_uri: String,
      operator_country: String,
      operator_mcc: String,
      operator_mnc: String,
      operator_name: String,
      packets_downloaded: Double,
      packets_uploaded: Double,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      radio_link: String,
      sid: String,
      sim_sid: String,
      start: js.Date,
      uri: String
    ): DataSessionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cell_id = cell_id.asInstanceOf[js.Any], cell_location_estimate = cell_location_estimate.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], imei = imei.asInstanceOf[js.Any], last_updated = last_updated.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], operator_country = operator_country.asInstanceOf[js.Any], operator_mcc = operator_mcc.asInstanceOf[js.Any], operator_mnc = operator_mnc.asInstanceOf[js.Any], operator_name = operator_name.asInstanceOf[js.Any], packets_downloaded = packets_downloaded.asInstanceOf[js.Any], packets_uploaded = packets_uploaded.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], radio_link = radio_link.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSessionPayload]
    }
  }
  
  trait DataSessionResource extends StObject {
    
    var account_sid: String
    
    var cell_id: String
    
    var cell_location_estimate: js.Object
    
    var end: js.Date
    
    var imei: String
    
    var last_updated: js.Date
    
    var operator_country: String
    
    var operator_mcc: String
    
    var operator_mnc: String
    
    var operator_name: String
    
    var packets_downloaded: Double
    
    var packets_uploaded: Double
    
    var radio_link: String
    
    var sid: String
    
    var sim_sid: String
    
    var start: js.Date
  }
  object DataSessionResource {
    
    inline def apply(
      account_sid: String,
      cell_id: String,
      cell_location_estimate: js.Object,
      end: js.Date,
      imei: String,
      last_updated: js.Date,
      operator_country: String,
      operator_mcc: String,
      operator_mnc: String,
      operator_name: String,
      packets_downloaded: Double,
      packets_uploaded: Double,
      radio_link: String,
      sid: String,
      sim_sid: String,
      start: js.Date
    ): DataSessionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cell_id = cell_id.asInstanceOf[js.Any], cell_location_estimate = cell_location_estimate.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], imei = imei.asInstanceOf[js.Any], last_updated = last_updated.asInstanceOf[js.Any], operator_country = operator_country.asInstanceOf[js.Any], operator_mcc = operator_mcc.asInstanceOf[js.Any], operator_mnc = operator_mnc.asInstanceOf[js.Any], operator_name = operator_name.asInstanceOf[js.Any], packets_downloaded = packets_downloaded.asInstanceOf[js.Any], packets_uploaded = packets_uploaded.asInstanceOf[js.Any], radio_link = radio_link.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSessionResource]
    }
    
    extension [Self <: DataSessionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCell_id(value: String): Self = StObject.set(x, "cell_id", value.asInstanceOf[js.Any])
      
      inline def setCell_location_estimate(value: js.Object): Self = StObject.set(x, "cell_location_estimate", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setImei(value: String): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
      
      inline def setLast_updated(value: js.Date): Self = StObject.set(x, "last_updated", value.asInstanceOf[js.Any])
      
      inline def setOperator_country(value: String): Self = StObject.set(x, "operator_country", value.asInstanceOf[js.Any])
      
      inline def setOperator_mcc(value: String): Self = StObject.set(x, "operator_mcc", value.asInstanceOf[js.Any])
      
      inline def setOperator_mnc(value: String): Self = StObject.set(x, "operator_mnc", value.asInstanceOf[js.Any])
      
      inline def setOperator_name(value: String): Self = StObject.set(x, "operator_name", value.asInstanceOf[js.Any])
      
      inline def setPackets_downloaded(value: Double): Self = StObject.set(x, "packets_downloaded", value.asInstanceOf[js.Any])
      
      inline def setPackets_uploaded(value: Double): Self = StObject.set(x, "packets_uploaded", value.asInstanceOf[js.Any])
      
      inline def setRadio_link(value: String): Self = StObject.set(x, "radio_link", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSim_sid(value: String): Self = StObject.set(x, "sim_sid", value.asInstanceOf[js.Any])
      
      inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataSessionSolution extends StObject {
    
    var simSid: js.UndefOr[String] = js.undefined
  }
  object DataSessionSolution {
    
    inline def apply(): DataSessionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSessionSolution]
    }
    
    extension [Self <: DataSessionSolution](x: Self) {
      
      inline def setSimSid(value: String): Self = StObject.set(x, "simSid", value.asInstanceOf[js.Any])
      
      inline def setSimSidUndefined: Self = StObject.set(x, "simSid", js.undefined)
    }
  }
}
