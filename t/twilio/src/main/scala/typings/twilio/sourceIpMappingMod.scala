package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceIpMappingMod {
  
  @JSImport("twilio/lib/rest/voice/v1/sourceIpMapping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/voice/v1/sourceIpMapping", "SourceIpMappingContext")
  @js.native
  open class SourceIpMappingContext protected () extends StObject {
    /**
      * Initialize the SourceIpMappingContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.voiceV1Mod.^, sid: String) = this()
    
    /**
      * fetch a SourceIpMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SourceIpMappingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SourceIpMappingInstance, Any]): js.Promise[SourceIpMappingInstance] = js.native
    
    /**
      * remove a SourceIpMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SourceIpMappingInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SourceIpMappingInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: SourceIpMappingInstanceUpdateOptions): js.Promise[SourceIpMappingInstance] = js.native
    def update(
      opts: SourceIpMappingInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SourceIpMappingInstance, Any]
    ): js.Promise[SourceIpMappingInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/voice/v1/sourceIpMapping", "SourceIpMappingInstance")
  @js.native
  open class SourceIpMappingInstance protected () extends SerializableClass {
    /**
      * Initialize the SourceIpMappingContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.voiceV1Mod.^, payload: SourceIpMappingPayload, sid: String) = this()
    
    /* private */ var _proxy: SourceIpMappingContext = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a SourceIpMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SourceIpMappingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SourceIpMappingInstance] = js.native
    
    var ipRecordSid: String = js.native
    
    /**
      * remove a SourceIpMappingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var sipDomainSid: String = js.native
    
    /**
      * update a SourceIpMappingInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: SourceIpMappingInstanceUpdateOptions): js.Promise[SourceIpMappingInstance] = js.native
    def update(
      opts: SourceIpMappingInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SourceIpMappingInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SourceIpMappingList
    *
    * @param version - Version of the resource
    */
  inline def SourceIpMappingList(version: typings.twilio.voiceV1Mod.^): SourceIpMappingListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("SourceIpMappingList")(version.asInstanceOf[js.Any]).asInstanceOf[SourceIpMappingListInstance]
  
  @JSImport("twilio/lib/rest/voice/v1/sourceIpMapping", "SourceIpMappingPage")
  @js.native
  open class SourceIpMappingPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.voiceV1Mod.^, 
          SourceIpMappingPayload, 
          SourceIpMappingResource, 
          SourceIpMappingInstance
        ] {
    /**
      * Initialize the SourceIpMappingPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.voiceV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SourceIpMappingSolution
    ) = this()
    
    /**
      * Build an instance of SourceIpMappingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SourceIpMappingPayload): SourceIpMappingInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property sipDomainSid - The unique string that identifies a SIP Domain
    */
  trait SourceIpMappingInstanceUpdateOptions extends StObject {
    
    var sipDomainSid: String
  }
  object SourceIpMappingInstanceUpdateOptions {
    
    inline def apply(sipDomainSid: String): SourceIpMappingInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(sipDomainSid = sipDomainSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceIpMappingInstanceUpdateOptions]
    }
    
    extension [Self <: SourceIpMappingInstanceUpdateOptions](x: Self) {
      
      inline def setSipDomainSid(value: String): Self = StObject.set(x, "sipDomainSid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SourceIpMappingListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SourceIpMappingContext = js.native
    
    /**
      * create a SourceIpMappingInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: SourceIpMappingListInstanceCreateOptions): js.Promise[SourceIpMappingInstance] = js.native
    def create(
      opts: SourceIpMappingListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SourceIpMappingInstance, Any]
    ): js.Promise[SourceIpMappingInstance] = js.native
    
    /**
      * Streams SourceIpMappingInstance records from the API.
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
          /* item */ SourceIpMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SourceIpMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SourceIpMappingListInstanceEachOptions): Unit = js.native
    def each(
      opts: SourceIpMappingListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SourceIpMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a source_ip_mapping
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): SourceIpMappingContext = js.native
    
    /**
      * Retrieve a single target page of SourceIpMappingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SourceIpMappingPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SourceIpMappingPage, Any]): js.Promise[SourceIpMappingPage] = js.native
    def getPage(targetUrl: String): js.Promise[SourceIpMappingPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SourceIpMappingPage, Any]
    ): js.Promise[SourceIpMappingPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SourceIpMappingPage, Any]
    ): js.Promise[SourceIpMappingPage] = js.native
    
    /**
      * Lists SourceIpMappingInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SourceIpMappingInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SourceIpMappingInstance], Any]
    ): js.Promise[js.Array[SourceIpMappingInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SourceIpMappingInstance], Any]
    ): js.Promise[js.Array[SourceIpMappingInstance]] = js.native
    def list(opts: SourceIpMappingListInstanceOptions): js.Promise[js.Array[SourceIpMappingInstance]] = js.native
    def list(
      opts: SourceIpMappingListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SourceIpMappingInstance], Any]
    ): js.Promise[js.Array[SourceIpMappingInstance]] = js.native
    
    /**
      * Retrieve a single page of SourceIpMappingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SourceIpMappingPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SourceIpMappingPage, Any]): js.Promise[SourceIpMappingPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SourceIpMappingPage, Any]
    ): js.Promise[SourceIpMappingPage] = js.native
    def page(opts: SourceIpMappingListInstancePageOptions): js.Promise[SourceIpMappingPage] = js.native
    def page(
      opts: SourceIpMappingListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SourceIpMappingPage, Any]
    ): js.Promise[SourceIpMappingPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property ipRecordSid - The unique string that identifies an IP Record
    * @property sipDomainSid - The unique string that identifies a SIP Domain
    */
  trait SourceIpMappingListInstanceCreateOptions extends StObject {
    
    var ipRecordSid: String
    
    var sipDomainSid: String
  }
  object SourceIpMappingListInstanceCreateOptions {
    
    inline def apply(ipRecordSid: String, sipDomainSid: String): SourceIpMappingListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(ipRecordSid = ipRecordSid.asInstanceOf[js.Any], sipDomainSid = sipDomainSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceIpMappingListInstanceCreateOptions]
    }
    
    extension [Self <: SourceIpMappingListInstanceCreateOptions](x: Self) {
      
      inline def setIpRecordSid(value: String): Self = StObject.set(x, "ipRecordSid", value.asInstanceOf[js.Any])
      
      inline def setSipDomainSid(value: String): Self = StObject.set(x, "sipDomainSid", value.asInstanceOf[js.Any])
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
  trait SourceIpMappingListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SourceIpMappingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SourceIpMappingListInstanceEachOptions {
    
    inline def apply(): SourceIpMappingListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceIpMappingListInstanceEachOptions]
    }
    
    extension [Self <: SourceIpMappingListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SourceIpMappingInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait SourceIpMappingListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SourceIpMappingListInstanceOptions {
    
    inline def apply(): SourceIpMappingListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceIpMappingListInstanceOptions]
    }
    
    extension [Self <: SourceIpMappingListInstanceOptions](x: Self) {
      
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
  trait SourceIpMappingListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SourceIpMappingListInstancePageOptions {
    
    inline def apply(): SourceIpMappingListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceIpMappingListInstancePageOptions]
    }
    
    extension [Self <: SourceIpMappingListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SourceIpMappingPayload
    extends StObject
       with SourceIpMappingResource
       with TwilioResponsePayload
  object SourceIpMappingPayload {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      ip_record_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      sip_domain_sid: String,
      uri: String,
      url: String
    ): SourceIpMappingPayload = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], ip_record_sid = ip_record_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sip_domain_sid = sip_domain_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceIpMappingPayload]
    }
  }
  
  trait SourceIpMappingResource extends StObject {
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var ip_record_sid: String
    
    var sid: String
    
    var sip_domain_sid: String
    
    var url: String
  }
  object SourceIpMappingResource {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      ip_record_sid: String,
      sid: String,
      sip_domain_sid: String,
      url: String
    ): SourceIpMappingResource = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], ip_record_sid = ip_record_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sip_domain_sid = sip_domain_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceIpMappingResource]
    }
    
    extension [Self <: SourceIpMappingResource](x: Self) {
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setIp_record_sid(value: String): Self = StObject.set(x, "ip_record_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSip_domain_sid(value: String): Self = StObject.set(x, "sip_domain_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceIpMappingSolution extends StObject
}
