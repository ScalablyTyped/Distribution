package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.streamMessageMod.StreamMessageListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncStreamMod {
  
  @JSImport("twilio/lib/rest/sync/v1/service/syncStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/sync/v1/service/syncStream", "SyncStreamContext")
  @js.native
  open class SyncStreamContext protected () extends StObject {
    /**
      * Initialize the SyncStreamContext
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Sync Service with the Sync Stream resource to fetch
      * @param sid - The SID of the Stream resource to fetch
      */
    def this(version: typings.twilio.syncV1Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * fetch a SyncStreamInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncStreamInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncStreamInstance, Any]): js.Promise[SyncStreamInstance] = js.native
    
    /**
      * remove a SyncStreamInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncStreamInstance, Any]): js.Promise[Boolean] = js.native
    
    var streamMessages: StreamMessageListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SyncStreamInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SyncStreamInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncStreamInstance, Any]): js.Promise[SyncStreamInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncStreamInstance, Any]
    ): js.Promise[SyncStreamInstance] = js.native
    def update(opts: SyncStreamInstanceUpdateOptions): js.Promise[SyncStreamInstance] = js.native
    def update(
      opts: SyncStreamInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncStreamInstance, Any]
    ): js.Promise[SyncStreamInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/sync/v1/service/syncStream", "SyncStreamInstance")
  @js.native
  open class SyncStreamInstance protected () extends SerializableClass {
    /**
      * Initialize the SyncStreamContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Sync Service that the resource is associated with
      * @param sid - The SID of the Stream resource to fetch
      */
    def this(version: typings.twilio.syncV1Mod.^, payload: SyncStreamPayload, serviceSid: String, sid: String) = this()
    
    /* private */ var _proxy: SyncStreamContext = js.native
    
    var accountSid: String = js.native
    
    var createdBy: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateExpires: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a SyncStreamInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SyncStreamInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SyncStreamInstance] = js.native
    
    var links: String = js.native
    
    /**
      * remove a SyncStreamInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    /**
      * Access the streamMessages
      */
    def streamMessages(): StreamMessageListInstance = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a SyncStreamInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SyncStreamInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SyncStreamInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SyncStreamInstance] = js.native
    def update(opts: SyncStreamInstanceUpdateOptions): js.Promise[SyncStreamInstance] = js.native
    def update(
      opts: SyncStreamInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SyncStreamInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SyncStreamList
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Sync Service that the resource is associated with
    */
  inline def SyncStreamList(version: typings.twilio.syncV1Mod.^, serviceSid: String): SyncStreamListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncStreamList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[SyncStreamListInstance]
  
  @JSImport("twilio/lib/rest/sync/v1/service/syncStream", "SyncStreamPage")
  @js.native
  open class SyncStreamPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.syncV1Mod.^, SyncStreamPayload, SyncStreamResource, SyncStreamInstance] {
    /**
      * Initialize the SyncStreamPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.syncV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SyncStreamSolution
    ) = this()
    
    /**
      * Build an instance of SyncStreamInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SyncStreamPayload): SyncStreamInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property ttl - How long, in seconds, before the Stream expires and is deleted
    */
  trait SyncStreamInstanceUpdateOptions extends StObject {
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object SyncStreamInstanceUpdateOptions {
    
    inline def apply(): SyncStreamInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncStreamInstanceUpdateOptions]
    }
    
    extension [Self <: SyncStreamInstanceUpdateOptions](x: Self) {
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  @js.native
  trait SyncStreamListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SyncStreamContext = js.native
    
    /**
      * create a SyncStreamInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[SyncStreamInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ SyncStreamInstance, Any]): js.Promise[SyncStreamInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SyncStreamInstance, Any]
    ): js.Promise[SyncStreamInstance] = js.native
    def create(opts: SyncStreamListInstanceCreateOptions): js.Promise[SyncStreamInstance] = js.native
    def create(
      opts: SyncStreamListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SyncStreamInstance, Any]
    ): js.Promise[SyncStreamInstance] = js.native
    
    /**
      * Streams SyncStreamInstance records from the API.
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
          /* item */ SyncStreamInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SyncStreamInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SyncStreamListInstanceEachOptions): Unit = js.native
    def each(
      opts: SyncStreamListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SyncStreamInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a sync_stream
      *
      * @param sid - The SID of the Stream resource to fetch
      */
    def get(sid: String): SyncStreamContext = js.native
    
    /**
      * Retrieve a single target page of SyncStreamInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SyncStreamPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncStreamPage, Any]): js.Promise[SyncStreamPage] = js.native
    def getPage(targetUrl: String): js.Promise[SyncStreamPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncStreamPage, Any]
    ): js.Promise[SyncStreamPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncStreamPage, Any]
    ): js.Promise[SyncStreamPage] = js.native
    
    /**
      * Lists SyncStreamInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SyncStreamInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncStreamInstance], Any]): js.Promise[js.Array[SyncStreamInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncStreamInstance], Any]
    ): js.Promise[js.Array[SyncStreamInstance]] = js.native
    def list(opts: SyncStreamListInstanceOptions): js.Promise[js.Array[SyncStreamInstance]] = js.native
    def list(
      opts: SyncStreamListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SyncStreamInstance], Any]
    ): js.Promise[js.Array[SyncStreamInstance]] = js.native
    
    /**
      * Retrieve a single page of SyncStreamInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SyncStreamPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncStreamPage, Any]): js.Promise[SyncStreamPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncStreamPage, Any]): js.Promise[SyncStreamPage] = js.native
    def page(opts: SyncStreamListInstancePageOptions): js.Promise[SyncStreamPage] = js.native
    def page(
      opts: SyncStreamListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SyncStreamPage, Any]
    ): js.Promise[SyncStreamPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property ttl - How long, in seconds, before the Stream expires and is deleted
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    */
  trait SyncStreamListInstanceCreateOptions extends StObject {
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object SyncStreamListInstanceCreateOptions {
    
    inline def apply(): SyncStreamListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncStreamListInstanceCreateOptions]
    }
    
    extension [Self <: SyncStreamListInstanceCreateOptions](x: Self) {
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
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
  trait SyncStreamListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SyncStreamInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncStreamListInstanceEachOptions {
    
    inline def apply(): SyncStreamListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncStreamListInstanceEachOptions]
    }
    
    extension [Self <: SyncStreamListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SyncStreamInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait SyncStreamListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SyncStreamListInstanceOptions {
    
    inline def apply(): SyncStreamListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncStreamListInstanceOptions]
    }
    
    extension [Self <: SyncStreamListInstanceOptions](x: Self) {
      
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
  trait SyncStreamListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SyncStreamListInstancePageOptions {
    
    inline def apply(): SyncStreamListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncStreamListInstancePageOptions]
    }
    
    extension [Self <: SyncStreamListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SyncStreamPayload
    extends StObject
       with SyncStreamResource
       with TwilioResponsePayload
  object SyncStreamPayload {
    
    inline def apply(
      account_sid: String,
      created_by: String,
      date_created: js.Date,
      date_expires: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): SyncStreamPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_expires = date_expires.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncStreamPayload]
    }
  }
  
  trait SyncStreamResource extends StObject {
    
    var account_sid: String
    
    var created_by: String
    
    var date_created: js.Date
    
    var date_expires: js.Date
    
    var date_updated: js.Date
    
    var links: String
    
    var service_sid: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object SyncStreamResource {
    
    inline def apply(
      account_sid: String,
      created_by: String,
      date_created: js.Date,
      date_expires: js.Date,
      date_updated: js.Date,
      links: String,
      service_sid: String,
      sid: String,
      unique_name: String,
      url: String
    ): SyncStreamResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_expires = date_expires.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncStreamResource]
    }
    
    extension [Self <: SyncStreamResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_expires(value: js.Date): Self = StObject.set(x, "date_expires", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncStreamSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object SyncStreamSolution {
    
    inline def apply(): SyncStreamSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncStreamSolution]
    }
    
    extension [Self <: SyncStreamSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
