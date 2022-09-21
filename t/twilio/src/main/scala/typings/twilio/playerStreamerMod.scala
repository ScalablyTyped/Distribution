package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.playbackGrantMod.PlaybackGrantContext
import typings.twilio.playbackGrantMod.PlaybackGrantListInstance
import typings.twilio.twilioStrings.asc_
import typings.twilio.twilioStrings.desc_
import typings.twilio.twilioStrings.ended
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playerStreamerMod {
  
  @JSImport("twilio/lib/rest/media/v1/playerStreamer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/media/v1/playerStreamer", "PlayerStreamerContext")
  @js.native
  open class PlayerStreamerContext protected () extends StObject {
    /**
      * Initialize the PlayerStreamerContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.mediaV1Mod.^, sid: String) = this()
    
    /**
      * fetch a PlayerStreamerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PlayerStreamerInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ PlayerStreamerInstance, Any]): js.Promise[PlayerStreamerInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def playbackGrant(sid: String): PlaybackGrantContext = js.native
    @JSName("playbackGrant")
    var playbackGrant_Original: PlaybackGrantListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a PlayerStreamerInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: PlayerStreamerInstanceUpdateOptions): js.Promise[PlayerStreamerInstance] = js.native
    def update(
      opts: PlayerStreamerInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PlayerStreamerInstance, Any]
    ): js.Promise[PlayerStreamerInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/media/v1/playerStreamer", "PlayerStreamerInstance")
  @js.native
  open class PlayerStreamerInstance protected () extends SerializableClass {
    /**
      * Initialize the PlayerStreamerContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.mediaV1Mod.^, payload: PlayerStreamerPayload, sid: String) = this()
    
    /* private */ var _proxy: PlayerStreamerContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var endedReason: PlayerStreamerEndedReason = js.native
    
    /**
      * fetch a PlayerStreamerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PlayerStreamerInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PlayerStreamerInstance] = js.native
    
    var links: String = js.native
    
    var maxDuration: Double = js.native
    
    /**
      * Access the playbackGrant
      */
    def playbackGrant(): PlaybackGrantListInstance = js.native
    
    var sid: String = js.native
    
    var status: PlayerStreamerStatus = js.native
    
    var statusCallback: String = js.native
    
    var statusCallbackMethod: String = js.native
    
    /**
      * update a PlayerStreamerInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: PlayerStreamerInstanceUpdateOptions): js.Promise[PlayerStreamerInstance] = js.native
    def update(
      opts: PlayerStreamerInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[PlayerStreamerInstance] = js.native
    
    var url: String = js.native
    
    var video: Boolean = js.native
  }
  
  /**
    * Initialize the PlayerStreamerList
    *
    * @param version - Version of the resource
    */
  inline def PlayerStreamerList(version: typings.twilio.mediaV1Mod.^): PlayerStreamerListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("PlayerStreamerList")(version.asInstanceOf[js.Any]).asInstanceOf[PlayerStreamerListInstance]
  
  @JSImport("twilio/lib/rest/media/v1/playerStreamer", "PlayerStreamerPage")
  @js.native
  open class PlayerStreamerPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.mediaV1Mod.^, 
          PlayerStreamerPayload, 
          PlayerStreamerResource, 
          PlayerStreamerInstance
        ] {
    /**
      * Initialize the PlayerStreamerPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.mediaV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: PlayerStreamerSolution
    ) = this()
    
    /**
      * Build an instance of PlayerStreamerInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: PlayerStreamerPayload): PlayerStreamerInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`ended-via-api`
    - typings.twilio.twilioStrings.`max-duration-exceeded`
    - typings.twilio.twilioStrings.`stream-disconnected-by-source`
    - typings.twilio.twilioStrings.`unexpected-failure`
  */
  trait PlayerStreamerEndedReason extends StObject
  object PlayerStreamerEndedReason {
    
    inline def `ended-via-api`: typings.twilio.twilioStrings.`ended-via-api` = "ended-via-api".asInstanceOf[typings.twilio.twilioStrings.`ended-via-api`]
    
    inline def `max-duration-exceeded`: typings.twilio.twilioStrings.`max-duration-exceeded` = "max-duration-exceeded".asInstanceOf[typings.twilio.twilioStrings.`max-duration-exceeded`]
    
    inline def `stream-disconnected-by-source`: typings.twilio.twilioStrings.`stream-disconnected-by-source` = "stream-disconnected-by-source".asInstanceOf[typings.twilio.twilioStrings.`stream-disconnected-by-source`]
    
    inline def `unexpected-failure`: typings.twilio.twilioStrings.`unexpected-failure` = "unexpected-failure".asInstanceOf[typings.twilio.twilioStrings.`unexpected-failure`]
  }
  
  /**
    * Options to pass to update
    *
    * @property status - The status the PlayerStreamer should be transitioned to
    */
  trait PlayerStreamerInstanceUpdateOptions extends StObject {
    
    var status: PlayerStreamerUpdateStatus
  }
  object PlayerStreamerInstanceUpdateOptions {
    
    inline def apply(status: PlayerStreamerUpdateStatus): PlayerStreamerInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerStreamerInstanceUpdateOptions]
    }
    
    extension [Self <: PlayerStreamerInstanceUpdateOptions](x: Self) {
      
      inline def setStatus(value: PlayerStreamerUpdateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PlayerStreamerListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): PlayerStreamerContext = js.native
    
    /**
      * create a PlayerStreamerInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[PlayerStreamerInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ PlayerStreamerInstance, Any]): js.Promise[PlayerStreamerInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ PlayerStreamerInstance, Any]
    ): js.Promise[PlayerStreamerInstance] = js.native
    def create(opts: PlayerStreamerListInstanceCreateOptions): js.Promise[PlayerStreamerInstance] = js.native
    def create(
      opts: PlayerStreamerListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ PlayerStreamerInstance, Any]
    ): js.Promise[PlayerStreamerInstance] = js.native
    
    /**
      * Streams PlayerStreamerInstance records from the API.
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
          /* item */ PlayerStreamerInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ PlayerStreamerInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: PlayerStreamerListInstanceEachOptions): Unit = js.native
    def each(
      opts: PlayerStreamerListInstanceEachOptions,
      callback: js.Function2[
          /* item */ PlayerStreamerInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a player_streamer
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): PlayerStreamerContext = js.native
    
    /**
      * Retrieve a single target page of PlayerStreamerInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[PlayerStreamerPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ PlayerStreamerPage, Any]): js.Promise[PlayerStreamerPage] = js.native
    def getPage(targetUrl: String): js.Promise[PlayerStreamerPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PlayerStreamerPage, Any]
    ): js.Promise[PlayerStreamerPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PlayerStreamerPage, Any]
    ): js.Promise[PlayerStreamerPage] = js.native
    
    /**
      * Lists PlayerStreamerInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[PlayerStreamerInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PlayerStreamerInstance], Any]
    ): js.Promise[js.Array[PlayerStreamerInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PlayerStreamerInstance], Any]
    ): js.Promise[js.Array[PlayerStreamerInstance]] = js.native
    def list(opts: PlayerStreamerListInstanceOptions): js.Promise[js.Array[PlayerStreamerInstance]] = js.native
    def list(
      opts: PlayerStreamerListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PlayerStreamerInstance], Any]
    ): js.Promise[js.Array[PlayerStreamerInstance]] = js.native
    
    /**
      * Retrieve a single page of PlayerStreamerInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[PlayerStreamerPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ PlayerStreamerPage, Any]): js.Promise[PlayerStreamerPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PlayerStreamerPage, Any]
    ): js.Promise[PlayerStreamerPage] = js.native
    def page(opts: PlayerStreamerListInstancePageOptions): js.Promise[PlayerStreamerPage] = js.native
    def page(
      opts: PlayerStreamerListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PlayerStreamerPage, Any]
    ): js.Promise[PlayerStreamerPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property maxDuration - Maximum PlayerStreamer duration in seconds
    * @property statusCallback - The URL to which Twilio will send PlayerStreamer event updates
    * @property statusCallbackMethod - The HTTP method Twilio should use to call the `status_callback` URL
    * @property video - Whether the PlayerStreamer is configured to stream video
    */
  trait PlayerStreamerListInstanceCreateOptions extends StObject {
    
    var maxDuration: js.UndefOr[Double] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var video: js.UndefOr[Boolean] = js.undefined
  }
  object PlayerStreamerListInstanceCreateOptions {
    
    inline def apply(): PlayerStreamerListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayerStreamerListInstanceCreateOptions]
    }
    
    extension [Self <: PlayerStreamerListInstanceCreateOptions](x: Self) {
      
      inline def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
      
      inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
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
    * @property order - The sort order of the list
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property status - Status to filter by
    */
  trait PlayerStreamerListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ PlayerStreamerInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[PlayerStreamerOrder] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[PlayerStreamerStatus] = js.undefined
  }
  object PlayerStreamerListInstanceEachOptions {
    
    inline def apply(): PlayerStreamerListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayerStreamerListInstanceEachOptions]
    }
    
    extension [Self <: PlayerStreamerListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ PlayerStreamerInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: PlayerStreamerOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: PlayerStreamerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property order - The sort order of the list
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property status - Status to filter by
    */
  trait PlayerStreamerListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[PlayerStreamerOrder] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[PlayerStreamerStatus] = js.undefined
  }
  object PlayerStreamerListInstanceOptions {
    
    inline def apply(): PlayerStreamerListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayerStreamerListInstanceOptions]
    }
    
    extension [Self <: PlayerStreamerListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: PlayerStreamerOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: PlayerStreamerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property order - The sort order of the list
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - Status to filter by
    */
  trait PlayerStreamerListInstancePageOptions extends StObject {
    
    var order: js.UndefOr[PlayerStreamerOrder] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[PlayerStreamerStatus] = js.undefined
  }
  object PlayerStreamerListInstancePageOptions {
    
    inline def apply(): PlayerStreamerListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayerStreamerListInstancePageOptions]
    }
    
    extension [Self <: PlayerStreamerListInstancePageOptions](x: Self) {
      
      inline def setOrder(value: PlayerStreamerOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStatus(value: PlayerStreamerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.asc_
    - typings.twilio.twilioStrings.desc_
  */
  trait PlayerStreamerOrder extends StObject
  object PlayerStreamerOrder {
    
    inline def asc: asc_ = "asc".asInstanceOf[asc_]
    
    inline def desc: desc_ = "desc".asInstanceOf[desc_]
  }
  
  trait PlayerStreamerPayload
    extends StObject
       with PlayerStreamerResource
       with TwilioResponsePayload
  object PlayerStreamerPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      ended_reason: PlayerStreamerEndedReason,
      first_page_uri: String,
      links: String,
      max_duration: Double,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      status: PlayerStreamerStatus,
      status_callback: String,
      status_callback_method: String,
      uri: String,
      url: String,
      video: Boolean
    ): PlayerStreamerPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], ended_reason = ended_reason.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], max_duration = max_duration.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerStreamerPayload]
    }
  }
  
  trait PlayerStreamerResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var ended_reason: PlayerStreamerEndedReason
    
    var links: String
    
    var max_duration: Double
    
    var sid: String
    
    var status: PlayerStreamerStatus
    
    var status_callback: String
    
    var status_callback_method: String
    
    var url: String
    
    var video: Boolean
  }
  object PlayerStreamerResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      ended_reason: PlayerStreamerEndedReason,
      links: String,
      max_duration: Double,
      sid: String,
      status: PlayerStreamerStatus,
      status_callback: String,
      status_callback_method: String,
      url: String,
      video: Boolean
    ): PlayerStreamerResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], ended_reason = ended_reason.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], max_duration = max_duration.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerStreamerResource]
    }
    
    extension [Self <: PlayerStreamerResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEnded_reason(value: PlayerStreamerEndedReason): Self = StObject.set(x, "ended_reason", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMax_duration(value: Double): Self = StObject.set(x, "max_duration", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: PlayerStreamerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback_method(value: String): Self = StObject.set(x, "status_callback_method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlayerStreamerSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.created
    - typings.twilio.twilioStrings.started
    - typings.twilio.twilioStrings.ended
    - typings.twilio.twilioStrings.failed__
  */
  trait PlayerStreamerStatus extends StObject
  object PlayerStreamerStatus {
    
    inline def created: typings.twilio.twilioStrings.created = "created".asInstanceOf[typings.twilio.twilioStrings.created]
    
    inline def ended: typings.twilio.twilioStrings.ended = "ended".asInstanceOf[typings.twilio.twilioStrings.ended]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def started: typings.twilio.twilioStrings.started = "started".asInstanceOf[typings.twilio.twilioStrings.started]
  }
  
  type PlayerStreamerUpdateStatus = ended
}
