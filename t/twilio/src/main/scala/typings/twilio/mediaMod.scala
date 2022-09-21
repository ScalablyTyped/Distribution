package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/message/media", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/message/media", "MediaContext")
  @js.native
  open class MediaContext protected () extends StObject {
    /**
      * Initialize the MediaContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource(s) to fetch
      * @param messageSid - The SID of the Message resource that this Media resource belongs to
      * @param sid - The unique string that identifies this resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, messageSid: String, sid: String) = this()
    
    /**
      * fetch a MediaInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MediaInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaInstance, Any]): js.Promise[MediaInstance] = js.native
    
    /**
      * remove a MediaInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/message/media", "MediaInstance")
  @js.native
  open class MediaInstance protected () extends SerializableClass {
    /**
      * Initialize the MediaContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created this resource
      * @param messageSid - The unique string that identifies the resource
      * @param sid - The unique string that identifies this resource
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: MediaPayload,
      accountSid: String,
      messageSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: MediaContext = js.native
    
    var accountSid: String = js.native
    
    var contentType: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a MediaInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MediaInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MediaInstance] = js.native
    
    var parentSid: String = js.native
    
    /**
      * remove a MediaInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the MediaList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created this resource
    * @param messageSid - The unique string that identifies the resource
    */
  inline def MediaList(version: typings.twilio.v2010Mod.^, accountSid: String, messageSid: String): MediaListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("MediaList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], messageSid.asInstanceOf[js.Any])).asInstanceOf[MediaListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/message/media", "MediaPage")
  @js.native
  open class MediaPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, MediaPayload, MediaResource, MediaInstance] {
    /**
      * Initialize the MediaPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: MediaSolution
    ) = this()
    
    /**
      * Build an instance of MediaInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: MediaPayload): MediaInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait MediaListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): MediaContext = js.native
    
    /**
      * Streams MediaInstance records from the API.
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
          /* item */ MediaInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ MediaInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: MediaListInstanceEachOptions): Unit = js.native
    def each(
      opts: MediaListInstanceEachOptions,
      callback: js.Function2[
          /* item */ MediaInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a media
      *
      * @param sid - The unique string that identifies this resource
      */
    def get(sid: String): MediaContext = js.native
    
    /**
      * Retrieve a single target page of MediaInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[MediaPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaPage, Any]): js.Promise[MediaPage] = js.native
    def getPage(targetUrl: String): js.Promise[MediaPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaPage, Any]): js.Promise[MediaPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaPage, Any]): js.Promise[MediaPage] = js.native
    
    /**
      * Lists MediaInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[MediaInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MediaInstance], Any]): js.Promise[js.Array[MediaInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MediaInstance], Any]
    ): js.Promise[js.Array[MediaInstance]] = js.native
    def list(opts: MediaListInstanceOptions): js.Promise[js.Array[MediaInstance]] = js.native
    def list(
      opts: MediaListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MediaInstance], Any]
    ): js.Promise[js.Array[MediaInstance]] = js.native
    
    /**
      * Retrieve a single page of MediaInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[MediaPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaPage, Any]): js.Promise[MediaPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaPage, Any]): js.Promise[MediaPage] = js.native
    def page(opts: MediaListInstancePageOptions): js.Promise[MediaPage] = js.native
    def page(
      opts: MediaListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MediaPage, Any]
    ): js.Promise[MediaPage] = js.native
    
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
    * @property dateCreated - Only include media that was created on this date
    * @property dateCreatedAfter - Only include media that was created on this date
    * @property dateCreatedBefore - Only include media that was created on this date
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
  trait MediaListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ MediaInstance, 
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
  object MediaListInstanceEachOptions {
    
    inline def apply(): MediaListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaListInstanceEachOptions]
    }
    
    extension [Self <: MediaListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ MediaInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
    * @property dateCreated - Only include media that was created on this date
    * @property dateCreatedAfter - Only include media that was created on this date
    * @property dateCreatedBefore - Only include media that was created on this date
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
  trait MediaListInstanceOptions extends StObject {
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object MediaListInstanceOptions {
    
    inline def apply(): MediaListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaListInstanceOptions]
    }
    
    extension [Self <: MediaListInstanceOptions](x: Self) {
      
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
    * @property dateCreated - Only include media that was created on this date
    * @property dateCreatedAfter - Only include media that was created on this date
    * @property dateCreatedBefore - Only include media that was created on this date
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait MediaListInstancePageOptions extends StObject {
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object MediaListInstancePageOptions {
    
    inline def apply(): MediaListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaListInstancePageOptions]
    }
    
    extension [Self <: MediaListInstancePageOptions](x: Self) {
      
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
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait MediaPayload
    extends StObject
       with MediaResource {
    
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
  object MediaPayload {
    
    inline def apply(
      account_sid: String,
      content_type: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      parent_sid: String,
      previous_page_uri: String,
      sid: String,
      uri: String
    ): MediaPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], parent_sid = parent_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaPayload]
    }
    
    extension [Self <: MediaPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaResource extends StObject {
    
    var account_sid: String
    
    var content_type: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var parent_sid: String
    
    var sid: String
    
    var uri: String
  }
  object MediaResource {
    
    inline def apply(
      account_sid: String,
      content_type: String,
      date_created: js.Date,
      date_updated: js.Date,
      parent_sid: String,
      sid: String,
      uri: String
    ): MediaResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], parent_sid = parent_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaResource]
    }
    
    extension [Self <: MediaResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setParent_sid(value: String): Self = StObject.set(x, "parent_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var messageSid: js.UndefOr[String] = js.undefined
  }
  object MediaSolution {
    
    inline def apply(): MediaSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaSolution]
    }
    
    extension [Self <: MediaSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setMessageSid(value: String): Self = StObject.set(x, "messageSid", value.asInstanceOf[js.Any])
      
      inline def setMessageSidUndefined: Self = StObject.set(x, "messageSid", js.undefined)
    }
  }
}
