package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.twilioStrings.completed_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conferenceRecordingMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/conference/recording", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/conference/recording", "RecordingContext")
  @js.native
  open class RecordingContext protected () extends StObject {
    /**
      * Initialize the RecordingContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param conferenceSid - Fetch by unique Conference SID for the recording
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, conferenceSid: String, sid: String) = this()
    
    /**
      * fetch a RecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RecordingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingInstance, Any]): js.Promise[RecordingInstance] = js.native
    
    /**
      * remove a RecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a RecordingInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: RecordingInstanceUpdateOptions): js.Promise[RecordingInstance] = js.native
    def update(
      opts: RecordingInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingInstance, Any]
    ): js.Promise[RecordingInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/conference/recording", "RecordingInstance")
  @js.native
  open class RecordingInstance protected () extends SerializableClass {
    /**
      * Initialize the RecordingContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param conferenceSid - The Conference SID that identifies the conference associated with the recording
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: RecordingPayload,
      accountSid: String,
      conferenceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: RecordingContext = js.native
    
    var accountSid: String = js.native
    
    var apiVersion: String = js.native
    
    var callSid: String = js.native
    
    var channels: Double = js.native
    
    var conferenceSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var duration: String = js.native
    
    var encryptionDetails: Any = js.native
    
    var errorCode: Double = js.native
    
    /**
      * fetch a RecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RecordingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RecordingInstance] = js.native
    
    var price: String = js.native
    
    var priceUnit: String = js.native
    
    /**
      * remove a RecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var source: RecordingSource = js.native
    
    var startTime: js.Date = js.native
    
    var status: RecordingStatus = js.native
    
    /**
      * update a RecordingInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: RecordingInstanceUpdateOptions): js.Promise[RecordingInstance] = js.native
    def update(
      opts: RecordingInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[RecordingInstance] = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the RecordingList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    * @param conferenceSid - The Conference SID that identifies the conference associated with the recording
    */
  inline def RecordingList(version: typings.twilio.v2010Mod.^, accountSid: String, conferenceSid: String): RecordingListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("RecordingList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], conferenceSid.asInstanceOf[js.Any])).asInstanceOf[RecordingListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/conference/recording", "RecordingPage")
  @js.native
  open class RecordingPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, RecordingPayload, RecordingResource, RecordingInstance] {
    /**
      * Initialize the RecordingPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: RecordingSolution
    ) = this()
    
    /**
      * Build an instance of RecordingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: RecordingPayload): RecordingInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property pauseBehavior - Whether to record during a pause
    * @property status - The new status of the recording
    */
  trait RecordingInstanceUpdateOptions extends StObject {
    
    var pauseBehavior: js.UndefOr[String] = js.undefined
    
    var status: RecordingStatus
  }
  object RecordingInstanceUpdateOptions {
    
    inline def apply(status: RecordingStatus): RecordingInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingInstanceUpdateOptions]
    }
    
    extension [Self <: RecordingInstanceUpdateOptions](x: Self) {
      
      inline def setPauseBehavior(value: String): Self = StObject.set(x, "pauseBehavior", value.asInstanceOf[js.Any])
      
      inline def setPauseBehaviorUndefined: Self = StObject.set(x, "pauseBehavior", js.undefined)
      
      inline def setStatus(value: RecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RecordingListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): RecordingContext = js.native
    
    /**
      * Streams RecordingInstance records from the API.
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
          /* item */ RecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ RecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: RecordingListInstanceEachOptions): Unit = js.native
    def each(
      opts: RecordingListInstanceEachOptions,
      callback: js.Function2[
          /* item */ RecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a recording
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): RecordingContext = js.native
    
    /**
      * Retrieve a single target page of RecordingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[RecordingPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingPage, Any]): js.Promise[RecordingPage] = js.native
    def getPage(targetUrl: String): js.Promise[RecordingPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingPage, Any]
    ): js.Promise[RecordingPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingPage, Any]
    ): js.Promise[RecordingPage] = js.native
    
    /**
      * Lists RecordingInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[RecordingInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RecordingInstance], Any]): js.Promise[js.Array[RecordingInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RecordingInstance], Any]
    ): js.Promise[js.Array[RecordingInstance]] = js.native
    def list(opts: RecordingListInstanceOptions): js.Promise[js.Array[RecordingInstance]] = js.native
    def list(
      opts: RecordingListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RecordingInstance], Any]
    ): js.Promise[js.Array[RecordingInstance]] = js.native
    
    /**
      * Retrieve a single page of RecordingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[RecordingPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingPage, Any]): js.Promise[RecordingPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingPage, Any]): js.Promise[RecordingPage] = js.native
    def page(opts: RecordingListInstancePageOptions): js.Promise[RecordingPage] = js.native
    def page(
      opts: RecordingListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingPage, Any]
    ): js.Promise[RecordingPage] = js.native
    
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
    * @property dateCreated - The `YYYY-MM-DD` value of the resources to read
    * @property dateCreatedAfter - The `YYYY-MM-DD` value of the resources to read
    * @property dateCreatedBefore - The `YYYY-MM-DD` value of the resources to read
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
  trait RecordingListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ RecordingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object RecordingListInstanceEachOptions {
    
    inline def apply(): RecordingListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingListInstanceEachOptions]
    }
    
    extension [Self <: RecordingListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ RecordingInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
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
    * @property dateCreated - The `YYYY-MM-DD` value of the resources to read
    * @property dateCreatedAfter - The `YYYY-MM-DD` value of the resources to read
    * @property dateCreatedBefore - The `YYYY-MM-DD` value of the resources to read
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
  trait RecordingListInstanceOptions extends StObject {
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object RecordingListInstanceOptions {
    
    inline def apply(): RecordingListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingListInstanceOptions]
    }
    
    extension [Self <: RecordingListInstanceOptions](x: Self) {
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property dateCreated - The `YYYY-MM-DD` value of the resources to read
    * @property dateCreatedAfter - The `YYYY-MM-DD` value of the resources to read
    * @property dateCreatedBefore - The `YYYY-MM-DD` value of the resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait RecordingListInstancePageOptions extends StObject {
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object RecordingListInstancePageOptions {
    
    inline def apply(): RecordingListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingListInstancePageOptions]
    }
    
    extension [Self <: RecordingListInstancePageOptions](x: Self) {
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait RecordingPayload
    extends StObject
       with RecordingResource {
    
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
  object RecordingPayload {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      call_sid: String,
      channels: Double,
      conference_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      duration: String,
      encryption_details: js.Object,
      error_code: Double,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      price: String,
      price_unit: String,
      sid: String,
      source: RecordingSource,
      start_time: js.Date,
      status: RecordingStatus,
      uri: String
    ): RecordingPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], conference_sid = conference_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], encryption_details = encryption_details.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_unit = price_unit.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingPayload]
    }
    
    extension [Self <: RecordingPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordingResource extends StObject {
    
    var account_sid: String
    
    var api_version: String
    
    var call_sid: String
    
    var channels: Double
    
    var conference_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var duration: String
    
    var encryption_details: js.Object
    
    var error_code: Double
    
    var price: String
    
    var price_unit: String
    
    var sid: String
    
    var source: RecordingSource
    
    var start_time: js.Date
    
    var status: RecordingStatus
    
    var uri: String
  }
  object RecordingResource {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      call_sid: String,
      channels: Double,
      conference_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      duration: String,
      encryption_details: js.Object,
      error_code: Double,
      price: String,
      price_unit: String,
      sid: String,
      source: RecordingSource,
      start_time: js.Date,
      status: RecordingStatus,
      uri: String
    ): RecordingResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], conference_sid = conference_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], encryption_details = encryption_details.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_unit = price_unit.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingResource]
    }
    
    extension [Self <: RecordingResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setCall_sid(value: String): Self = StObject.set(x, "call_sid", value.asInstanceOf[js.Any])
      
      inline def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setConference_sid(value: String): Self = StObject.set(x, "conference_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEncryption_details(value: js.Object): Self = StObject.set(x, "encryption_details", value.asInstanceOf[js.Any])
      
      inline def setError_code(value: Double): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPrice_unit(value: String): Self = StObject.set(x, "price_unit", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSource(value: RecordingSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStart_time(value: js.Date): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: RecordingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordingSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var conferenceSid: js.UndefOr[String] = js.undefined
  }
  object RecordingSolution {
    
    inline def apply(): RecordingSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingSolution]
    }
    
    extension [Self <: RecordingSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setConferenceSid(value: String): Self = StObject.set(x, "conferenceSid", value.asInstanceOf[js.Any])
      
      inline def setConferenceSidUndefined: Self = StObject.set(x, "conferenceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.DialVerb
    - typings.twilio.twilioStrings.Conference
    - typings.twilio.twilioStrings.OutboundAPI
    - typings.twilio.twilioStrings.Trunking
    - typings.twilio.twilioStrings.RecordVerb
    - typings.twilio.twilioStrings.StartCallRecordingAPI
    - typings.twilio.twilioStrings.StartConferenceRecordingAPI
  */
  trait RecordingSource extends StObject
  object RecordingSource {
    
    inline def Conference: typings.twilio.twilioStrings.Conference = "Conference".asInstanceOf[typings.twilio.twilioStrings.Conference]
    
    inline def DialVerb: typings.twilio.twilioStrings.DialVerb = "DialVerb".asInstanceOf[typings.twilio.twilioStrings.DialVerb]
    
    inline def OutboundAPI: typings.twilio.twilioStrings.OutboundAPI = "OutboundAPI".asInstanceOf[typings.twilio.twilioStrings.OutboundAPI]
    
    inline def RecordVerb: typings.twilio.twilioStrings.RecordVerb = "RecordVerb".asInstanceOf[typings.twilio.twilioStrings.RecordVerb]
    
    inline def StartCallRecordingAPI: typings.twilio.twilioStrings.StartCallRecordingAPI = "StartCallRecordingAPI".asInstanceOf[typings.twilio.twilioStrings.StartCallRecordingAPI]
    
    inline def StartConferenceRecordingAPI: typings.twilio.twilioStrings.StartConferenceRecordingAPI = "StartConferenceRecordingAPI".asInstanceOf[typings.twilio.twilioStrings.StartConferenceRecordingAPI]
    
    inline def Trunking: typings.twilio.twilioStrings.Trunking = "Trunking".asInstanceOf[typings.twilio.twilioStrings.Trunking]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`in-progress`
    - typings.twilio.twilioStrings.paused
    - typings.twilio.twilioStrings.stopped
    - typings.twilio.twilioStrings.processing
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.absent
  */
  trait RecordingStatus extends StObject
  object RecordingStatus {
    
    inline def absent: typings.twilio.twilioStrings.absent = "absent".asInstanceOf[typings.twilio.twilioStrings.absent]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def `in-progress`: typings.twilio.twilioStrings.`in-progress` = "in-progress".asInstanceOf[typings.twilio.twilioStrings.`in-progress`]
    
    inline def paused: typings.twilio.twilioStrings.paused = "paused".asInstanceOf[typings.twilio.twilioStrings.paused]
    
    inline def processing: typings.twilio.twilioStrings.processing = "processing".asInstanceOf[typings.twilio.twilioStrings.processing]
    
    inline def stopped: typings.twilio.twilioStrings.stopped = "stopped".asInstanceOf[typings.twilio.twilioStrings.stopped]
  }
}
