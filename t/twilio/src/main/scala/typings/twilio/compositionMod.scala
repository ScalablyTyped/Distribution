package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.deleted_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositionMod {
  
  @JSImport("twilio/lib/rest/video/v1/composition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/video/v1/composition", "CompositionContext")
  @js.native
  open class CompositionContext protected () extends StObject {
    /**
      * Initialize the CompositionContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, sid: String) = this()
    
    /**
      * fetch a CompositionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CompositionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionInstance, Any]): js.Promise[CompositionInstance] = js.native
    
    /**
      * remove a CompositionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/video/v1/composition", "CompositionInstance")
  @js.native
  open class CompositionInstance protected () extends SerializableClass {
    /**
      * Initialize the CompositionContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, payload: CompositionPayload, sid: String) = this()
    
    /* private */ var _proxy: CompositionContext = js.native
    
    var accountSid: String = js.native
    
    var audioSources: js.Array[String] = js.native
    
    var audioSourcesExcluded: js.Array[String] = js.native
    
    var bitrate: Double = js.native
    
    var dateCompleted: js.Date = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateDeleted: js.Date = js.native
    
    var duration: Double = js.native
    
    /**
      * fetch a CompositionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CompositionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CompositionInstance] = js.native
    
    var format: CompositionFormat = js.native
    
    var links: String = js.native
    
    var mediaExternalLocation: String = js.native
    
    /**
      * remove a CompositionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var resolution: String = js.native
    
    var roomSid: String = js.native
    
    var sid: String = js.native
    
    var size: Double = js.native
    
    var status: CompositionStatus = js.native
    
    var statusCallback: String = js.native
    
    var statusCallbackMethod: String = js.native
    
    var trim: Boolean = js.native
    
    var url: String = js.native
    
    var videoLayout: Any = js.native
  }
  
  /**
    * Initialize the CompositionList
    *
    * @param version - Version of the resource
    */
  inline def CompositionList(version: typings.twilio.videoV1Mod.^): CompositionListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("CompositionList")(version.asInstanceOf[js.Any]).asInstanceOf[CompositionListInstance]
  
  @JSImport("twilio/lib/rest/video/v1/composition", "CompositionPage")
  @js.native
  open class CompositionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.videoV1Mod.^, 
          CompositionPayload, 
          CompositionResource, 
          CompositionInstance
        ] {
    /**
      * Initialize the CompositionPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CompositionSolution
    ) = this()
    
    /**
      * Build an instance of CompositionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CompositionPayload): CompositionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.mp4
    - typings.twilio.twilioStrings.webm
  */
  trait CompositionFormat extends StObject
  object CompositionFormat {
    
    inline def mp4: typings.twilio.twilioStrings.mp4 = "mp4".asInstanceOf[typings.twilio.twilioStrings.mp4]
    
    inline def webm: typings.twilio.twilioStrings.webm = "webm".asInstanceOf[typings.twilio.twilioStrings.webm]
  }
  
  @js.native
  trait CompositionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CompositionContext = js.native
    
    /**
      * create a CompositionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: CompositionListInstanceCreateOptions): js.Promise[CompositionInstance] = js.native
    def create(
      opts: CompositionListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ CompositionInstance, Any]
    ): js.Promise[CompositionInstance] = js.native
    
    /**
      * Streams CompositionInstance records from the API.
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
          /* item */ CompositionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CompositionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CompositionListInstanceEachOptions): Unit = js.native
    def each(
      opts: CompositionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CompositionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a composition
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): CompositionContext = js.native
    
    /**
      * Retrieve a single target page of CompositionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CompositionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionPage, Any]): js.Promise[CompositionPage] = js.native
    def getPage(targetUrl: String): js.Promise[CompositionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionPage, Any]
    ): js.Promise[CompositionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionPage, Any]
    ): js.Promise[CompositionPage] = js.native
    
    /**
      * Lists CompositionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CompositionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CompositionInstance], Any]
    ): js.Promise[js.Array[CompositionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CompositionInstance], Any]
    ): js.Promise[js.Array[CompositionInstance]] = js.native
    def list(opts: CompositionListInstanceOptions): js.Promise[js.Array[CompositionInstance]] = js.native
    def list(
      opts: CompositionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CompositionInstance], Any]
    ): js.Promise[js.Array[CompositionInstance]] = js.native
    
    /**
      * Retrieve a single page of CompositionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CompositionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionPage, Any]): js.Promise[CompositionPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionPage, Any]): js.Promise[CompositionPage] = js.native
    def page(opts: CompositionListInstancePageOptions): js.Promise[CompositionPage] = js.native
    def page(
      opts: CompositionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionPage, Any]
    ): js.Promise[CompositionPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property audioSources - An array of track names from the same group room to merge
    * @property audioSourcesExcluded - An array of track names to exclude
    * @property format - The container format of the composition's media files
    * @property resolution - A string that describes the columns (width) and rows (height) of the generated composed video in pixels
    * @property roomSid - The SID of the Group Room with the media tracks to be used as composition sources
    * @property statusCallback - The URL we should call to send status information to your application
    * @property statusCallbackMethod - The HTTP method we should use to call status_callback
    * @property trim - Whether to clip the intervals where there is no active media in the composition
    * @property videoLayout - An object that describes the video layout of the composition
    */
  trait CompositionListInstanceCreateOptions extends StObject {
    
    var audioSources: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var audioSourcesExcluded: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var format: js.UndefOr[CompositionFormat] = js.undefined
    
    var resolution: js.UndefOr[String] = js.undefined
    
    var roomSid: String
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var videoLayout: js.UndefOr[js.Object] = js.undefined
  }
  object CompositionListInstanceCreateOptions {
    
    inline def apply(roomSid: String): CompositionListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(roomSid = roomSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositionListInstanceCreateOptions]
    }
    
    extension [Self <: CompositionListInstanceCreateOptions](x: Self) {
      
      inline def setAudioSources(value: String | js.Array[String]): Self = StObject.set(x, "audioSources", value.asInstanceOf[js.Any])
      
      inline def setAudioSourcesExcluded(value: String | js.Array[String]): Self = StObject.set(x, "audioSourcesExcluded", value.asInstanceOf[js.Any])
      
      inline def setAudioSourcesExcludedUndefined: Self = StObject.set(x, "audioSourcesExcluded", js.undefined)
      
      inline def setAudioSourcesExcludedVarargs(value: String*): Self = StObject.set(x, "audioSourcesExcluded", js.Array(value*))
      
      inline def setAudioSourcesUndefined: Self = StObject.set(x, "audioSources", js.undefined)
      
      inline def setAudioSourcesVarargs(value: String*): Self = StObject.set(x, "audioSources", js.Array(value*))
      
      inline def setFormat(value: CompositionFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setRoomSid(value: String): Self = StObject.set(x, "roomSid", value.asInstanceOf[js.Any])
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setVideoLayout(value: js.Object): Self = StObject.set(x, "videoLayout", value.asInstanceOf[js.Any])
      
      inline def setVideoLayoutUndefined: Self = StObject.set(x, "videoLayout", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property dateCreatedAfter - Read only Composition resources created on or after this {@link https://en.wikipedia.org/wiki/ISO_8601|ISO 8601} date-time with time zone
    * @property dateCreatedBefore - Read only Composition resources created before this ISO 8601 date-time with time zone
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
    * @property roomSid - Read only Composition resources with this Room SID
    * @property status - Read only Composition resources with this status
    */
  trait CompositionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CompositionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var roomSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[CompositionStatus] = js.undefined
  }
  object CompositionListInstanceEachOptions {
    
    inline def apply(): CompositionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositionListInstanceEachOptions]
    }
    
    extension [Self <: CompositionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ CompositionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setRoomSid(value: String): Self = StObject.set(x, "roomSid", value.asInstanceOf[js.Any])
      
      inline def setRoomSidUndefined: Self = StObject.set(x, "roomSid", js.undefined)
      
      inline def setStatus(value: CompositionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property dateCreatedAfter - Read only Composition resources created on or after this {@link https://en.wikipedia.org/wiki/ISO_8601|ISO 8601} date-time with time zone
    * @property dateCreatedBefore - Read only Composition resources created before this ISO 8601 date-time with time zone
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
    * @property roomSid - Read only Composition resources with this Room SID
    * @property status - Read only Composition resources with this status
    */
  trait CompositionListInstanceOptions extends StObject {
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var roomSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[CompositionStatus] = js.undefined
  }
  object CompositionListInstanceOptions {
    
    inline def apply(): CompositionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositionListInstanceOptions]
    }
    
    extension [Self <: CompositionListInstanceOptions](x: Self) {
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setRoomSid(value: String): Self = StObject.set(x, "roomSid", value.asInstanceOf[js.Any])
      
      inline def setRoomSidUndefined: Self = StObject.set(x, "roomSid", js.undefined)
      
      inline def setStatus(value: CompositionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property dateCreatedAfter - Read only Composition resources created on or after this {@link https://en.wikipedia.org/wiki/ISO_8601|ISO 8601} date-time with time zone
    * @property dateCreatedBefore - Read only Composition resources created before this ISO 8601 date-time with time zone
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property roomSid - Read only Composition resources with this Room SID
    * @property status - Read only Composition resources with this status
    */
  trait CompositionListInstancePageOptions extends StObject {
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var roomSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[CompositionStatus] = js.undefined
  }
  object CompositionListInstancePageOptions {
    
    inline def apply(): CompositionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositionListInstancePageOptions]
    }
    
    extension [Self <: CompositionListInstancePageOptions](x: Self) {
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setRoomSid(value: String): Self = StObject.set(x, "roomSid", value.asInstanceOf[js.Any])
      
      inline def setRoomSidUndefined: Self = StObject.set(x, "roomSid", js.undefined)
      
      inline def setStatus(value: CompositionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait CompositionPayload
    extends StObject
       with CompositionResource
       with TwilioResponsePayload
  object CompositionPayload {
    
    inline def apply(
      account_sid: String,
      audio_sources: js.Array[String],
      audio_sources_excluded: js.Array[String],
      bitrate: Double,
      date_completed: js.Date,
      date_created: js.Date,
      date_deleted: js.Date,
      duration: Double,
      first_page_uri: String,
      format: CompositionFormat,
      links: String,
      media_external_location: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      resolution: String,
      room_sid: String,
      sid: String,
      size: Double,
      status: CompositionStatus,
      status_callback: String,
      status_callback_method: String,
      trim: Boolean,
      uri: String,
      url: String,
      video_layout: js.Object
    ): CompositionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], audio_sources = audio_sources.asInstanceOf[js.Any], audio_sources_excluded = audio_sources_excluded.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], date_completed = date_completed.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_deleted = date_deleted.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], media_external_location = media_external_location.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], video_layout = video_layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositionPayload]
    }
  }
  
  trait CompositionResource extends StObject {
    
    var account_sid: String
    
    var audio_sources: js.Array[String]
    
    var audio_sources_excluded: js.Array[String]
    
    var bitrate: Double
    
    var date_completed: js.Date
    
    var date_created: js.Date
    
    var date_deleted: js.Date
    
    var duration: Double
    
    var format: CompositionFormat
    
    var links: String
    
    var media_external_location: String
    
    var resolution: String
    
    var room_sid: String
    
    var sid: String
    
    var size: Double
    
    var status: CompositionStatus
    
    var status_callback: String
    
    var status_callback_method: String
    
    var trim: Boolean
    
    var url: String
    
    var video_layout: js.Object
  }
  object CompositionResource {
    
    inline def apply(
      account_sid: String,
      audio_sources: js.Array[String],
      audio_sources_excluded: js.Array[String],
      bitrate: Double,
      date_completed: js.Date,
      date_created: js.Date,
      date_deleted: js.Date,
      duration: Double,
      format: CompositionFormat,
      links: String,
      media_external_location: String,
      resolution: String,
      room_sid: String,
      sid: String,
      size: Double,
      status: CompositionStatus,
      status_callback: String,
      status_callback_method: String,
      trim: Boolean,
      url: String,
      video_layout: js.Object
    ): CompositionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], audio_sources = audio_sources.asInstanceOf[js.Any], audio_sources_excluded = audio_sources_excluded.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], date_completed = date_completed.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_deleted = date_deleted.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], media_external_location = media_external_location.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], video_layout = video_layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositionResource]
    }
    
    extension [Self <: CompositionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAudio_sources(value: js.Array[String]): Self = StObject.set(x, "audio_sources", value.asInstanceOf[js.Any])
      
      inline def setAudio_sourcesVarargs(value: String*): Self = StObject.set(x, "audio_sources", js.Array(value*))
      
      inline def setAudio_sources_excluded(value: js.Array[String]): Self = StObject.set(x, "audio_sources_excluded", value.asInstanceOf[js.Any])
      
      inline def setAudio_sources_excludedVarargs(value: String*): Self = StObject.set(x, "audio_sources_excluded", js.Array(value*))
      
      inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      inline def setDate_completed(value: js.Date): Self = StObject.set(x, "date_completed", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_deleted(value: js.Date): Self = StObject.set(x, "date_deleted", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: CompositionFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMedia_external_location(value: String): Self = StObject.set(x, "media_external_location", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setRoom_sid(value: String): Self = StObject.set(x, "room_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: CompositionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback_method(value: String): Self = StObject.set(x, "status_callback_method", value.asInstanceOf[js.Any])
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVideo_layout(value: js.Object): Self = StObject.set(x, "video_layout", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompositionSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.enqueued
    - typings.twilio.twilioStrings.processing
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.deleted_
    - typings.twilio.twilioStrings.failed__
  */
  trait CompositionStatus extends StObject
  object CompositionStatus {
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def deleted: deleted_ = "deleted".asInstanceOf[deleted_]
    
    inline def enqueued: typings.twilio.twilioStrings.enqueued = "enqueued".asInstanceOf[typings.twilio.twilioStrings.enqueued]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def processing: typings.twilio.twilioStrings.processing = "processing".asInstanceOf[typings.twilio.twilioStrings.processing]
  }
}
