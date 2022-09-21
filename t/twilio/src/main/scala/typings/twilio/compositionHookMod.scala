package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositionHookMod {
  
  @JSImport("twilio/lib/rest/video/v1/compositionHook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/video/v1/compositionHook", "CompositionHookContext")
  @js.native
  open class CompositionHookContext protected () extends StObject {
    /**
      * Initialize the CompositionHookContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, sid: String) = this()
    
    /**
      * fetch a CompositionHookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CompositionHookInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionHookInstance, Any]): js.Promise[CompositionHookInstance] = js.native
    
    /**
      * remove a CompositionHookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionHookInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a CompositionHookInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: CompositionHookInstanceUpdateOptions): js.Promise[CompositionHookInstance] = js.native
    def update(
      opts: CompositionHookInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionHookInstance, Any]
    ): js.Promise[CompositionHookInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/video/v1/compositionHook", "CompositionHookInstance")
  @js.native
  open class CompositionHookInstance protected () extends SerializableClass {
    /**
      * Initialize the CompositionHookContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.videoV1Mod.^, payload: CompositionHookPayload, sid: String) = this()
    
    /* private */ var _proxy: CompositionHookContext = js.native
    
    var accountSid: String = js.native
    
    var audioSources: js.Array[String] = js.native
    
    var audioSourcesExcluded: js.Array[String] = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var enabled: Boolean = js.native
    
    /**
      * fetch a CompositionHookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CompositionHookInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CompositionHookInstance] = js.native
    
    var format: CompositionHookFormat = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a CompositionHookInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var resolution: String = js.native
    
    var sid: String = js.native
    
    var statusCallback: String = js.native
    
    var statusCallbackMethod: String = js.native
    
    var trim: Boolean = js.native
    
    /**
      * update a CompositionHookInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: CompositionHookInstanceUpdateOptions): js.Promise[CompositionHookInstance] = js.native
    def update(
      opts: CompositionHookInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[CompositionHookInstance] = js.native
    
    var url: String = js.native
    
    var videoLayout: Any = js.native
  }
  
  /**
    * Initialize the CompositionHookList
    *
    * @param version - Version of the resource
    */
  inline def CompositionHookList(version: typings.twilio.videoV1Mod.^): CompositionHookListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("CompositionHookList")(version.asInstanceOf[js.Any]).asInstanceOf[CompositionHookListInstance]
  
  @JSImport("twilio/lib/rest/video/v1/compositionHook", "CompositionHookPage")
  @js.native
  open class CompositionHookPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.videoV1Mod.^, 
          CompositionHookPayload, 
          CompositionHookResource, 
          CompositionHookInstance
        ] {
    /**
      * Initialize the CompositionHookPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CompositionHookSolution
    ) = this()
    
    /**
      * Build an instance of CompositionHookInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CompositionHookPayload): CompositionHookInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.mp4
    - typings.twilio.twilioStrings.webm
  */
  trait CompositionHookFormat extends StObject
  object CompositionHookFormat {
    
    inline def mp4: typings.twilio.twilioStrings.mp4 = "mp4".asInstanceOf[typings.twilio.twilioStrings.mp4]
    
    inline def webm: typings.twilio.twilioStrings.webm = "webm".asInstanceOf[typings.twilio.twilioStrings.webm]
  }
  
  /**
    * Options to pass to update
    *
    * @property audioSources - An array of track names from the same group room to merge
    * @property audioSourcesExcluded - An array of track names to exclude
    * @property enabled - Whether the composition hook is active
    * @property format - The container format of the media files used by the compositions created by the composition hook
    * @property friendlyName - A unique string to describe the resource
    * @property resolution - A string that describes the columns (width) and rows (height) of the generated composed video in pixels
    * @property statusCallback - The URL we should call to send status information to your application
    * @property statusCallbackMethod - The HTTP method we should use to call status_callback
    * @property trim - Whether to clip the intervals where there is no active media in the Compositions triggered by the composition hook
    * @property videoLayout - A JSON object that describes the video layout of the composition hook
    */
  trait CompositionHookInstanceUpdateOptions extends StObject {
    
    var audioSources: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var audioSourcesExcluded: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[CompositionHookFormat] = js.undefined
    
    var friendlyName: String
    
    var resolution: js.UndefOr[String] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var videoLayout: js.UndefOr[js.Object] = js.undefined
  }
  object CompositionHookInstanceUpdateOptions {
    
    inline def apply(friendlyName: String): CompositionHookInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositionHookInstanceUpdateOptions]
    }
    
    extension [Self <: CompositionHookInstanceUpdateOptions](x: Self) {
      
      inline def setAudioSources(value: String | js.Array[String]): Self = StObject.set(x, "audioSources", value.asInstanceOf[js.Any])
      
      inline def setAudioSourcesExcluded(value: String | js.Array[String]): Self = StObject.set(x, "audioSourcesExcluded", value.asInstanceOf[js.Any])
      
      inline def setAudioSourcesExcludedUndefined: Self = StObject.set(x, "audioSourcesExcluded", js.undefined)
      
      inline def setAudioSourcesExcludedVarargs(value: String*): Self = StObject.set(x, "audioSourcesExcluded", js.Array(value*))
      
      inline def setAudioSourcesUndefined: Self = StObject.set(x, "audioSources", js.undefined)
      
      inline def setAudioSourcesVarargs(value: String*): Self = StObject.set(x, "audioSources", js.Array(value*))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFormat(value: CompositionHookFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
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
  
  @js.native
  trait CompositionHookListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CompositionHookContext = js.native
    
    /**
      * create a CompositionHookInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: CompositionHookListInstanceCreateOptions): js.Promise[CompositionHookInstance] = js.native
    def create(
      opts: CompositionHookListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ CompositionHookInstance, Any]
    ): js.Promise[CompositionHookInstance] = js.native
    
    /**
      * Streams CompositionHookInstance records from the API.
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
          /* item */ CompositionHookInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CompositionHookInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CompositionHookListInstanceEachOptions): Unit = js.native
    def each(
      opts: CompositionHookListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CompositionHookInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a composition_hook
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): CompositionHookContext = js.native
    
    /**
      * Retrieve a single target page of CompositionHookInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CompositionHookPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionHookPage, Any]): js.Promise[CompositionHookPage] = js.native
    def getPage(targetUrl: String): js.Promise[CompositionHookPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionHookPage, Any]
    ): js.Promise[CompositionHookPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionHookPage, Any]
    ): js.Promise[CompositionHookPage] = js.native
    
    /**
      * Lists CompositionHookInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CompositionHookInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CompositionHookInstance], Any]
    ): js.Promise[js.Array[CompositionHookInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CompositionHookInstance], Any]
    ): js.Promise[js.Array[CompositionHookInstance]] = js.native
    def list(opts: CompositionHookListInstanceOptions): js.Promise[js.Array[CompositionHookInstance]] = js.native
    def list(
      opts: CompositionHookListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CompositionHookInstance], Any]
    ): js.Promise[js.Array[CompositionHookInstance]] = js.native
    
    /**
      * Retrieve a single page of CompositionHookInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CompositionHookPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionHookPage, Any]): js.Promise[CompositionHookPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionHookPage, Any]
    ): js.Promise[CompositionHookPage] = js.native
    def page(opts: CompositionHookListInstancePageOptions): js.Promise[CompositionHookPage] = js.native
    def page(
      opts: CompositionHookListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CompositionHookPage, Any]
    ): js.Promise[CompositionHookPage] = js.native
    
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
    * @property enabled - Whether the composition hook is active
    * @property format - The container format of the media files used by the compositions created by the composition hook
    * @property friendlyName - A unique string to describe the resource
    * @property resolution - A string that describes the rows (width) and columns (height) of the generated composed video in pixels
    * @property statusCallback - The URL we should call to send status information to your application
    * @property statusCallbackMethod - The HTTP method we should use to call status_callback
    * @property trim - Whether to clip the intervals where there is no active media in the Compositions triggered by the composition hook
    * @property videoLayout - An object that describes the video layout of the composition hook
    */
  trait CompositionHookListInstanceCreateOptions extends StObject {
    
    var audioSources: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var audioSourcesExcluded: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[CompositionHookFormat] = js.undefined
    
    var friendlyName: String
    
    var resolution: js.UndefOr[String] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var videoLayout: js.UndefOr[js.Object] = js.undefined
  }
  object CompositionHookListInstanceCreateOptions {
    
    inline def apply(friendlyName: String): CompositionHookListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositionHookListInstanceCreateOptions]
    }
    
    extension [Self <: CompositionHookListInstanceCreateOptions](x: Self) {
      
      inline def setAudioSources(value: String | js.Array[String]): Self = StObject.set(x, "audioSources", value.asInstanceOf[js.Any])
      
      inline def setAudioSourcesExcluded(value: String | js.Array[String]): Self = StObject.set(x, "audioSourcesExcluded", value.asInstanceOf[js.Any])
      
      inline def setAudioSourcesExcludedUndefined: Self = StObject.set(x, "audioSourcesExcluded", js.undefined)
      
      inline def setAudioSourcesExcludedVarargs(value: String*): Self = StObject.set(x, "audioSourcesExcluded", js.Array(value*))
      
      inline def setAudioSourcesUndefined: Self = StObject.set(x, "audioSources", js.undefined)
      
      inline def setAudioSourcesVarargs(value: String*): Self = StObject.set(x, "audioSources", js.Array(value*))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFormat(value: CompositionHookFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
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
    * @property dateCreatedAfter - Read only CompositionHook resources created on or after this ISO 8601 datetime with time zone
    * @property dateCreatedBefore - Read only CompositionHook resources created before this ISO 8601 datetime with time zone
    * @property done - Function to be called upon completion of streaming
    * @property enabled - Read only CompositionHook resources with an enabled value that matches this parameter
    * @property friendlyName - Read only CompositionHook resources with friendly names that match this string
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
  trait CompositionHookListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CompositionHookInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CompositionHookListInstanceEachOptions {
    
    inline def apply(): CompositionHookListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositionHookListInstanceEachOptions]
    }
    
    extension [Self <: CompositionHookListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ CompositionHookInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property dateCreatedAfter - Read only CompositionHook resources created on or after this ISO 8601 datetime with time zone
    * @property dateCreatedBefore - Read only CompositionHook resources created before this ISO 8601 datetime with time zone
    * @property enabled - Read only CompositionHook resources with an enabled value that matches this parameter
    * @property friendlyName - Read only CompositionHook resources with friendly names that match this string
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
  trait CompositionHookListInstanceOptions extends StObject {
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CompositionHookListInstanceOptions {
    
    inline def apply(): CompositionHookListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositionHookListInstanceOptions]
    }
    
    extension [Self <: CompositionHookListInstanceOptions](x: Self) {
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property dateCreatedAfter - Read only CompositionHook resources created on or after this ISO 8601 datetime with time zone
    * @property dateCreatedBefore - Read only CompositionHook resources created before this ISO 8601 datetime with time zone
    * @property enabled - Read only CompositionHook resources with an enabled value that matches this parameter
    * @property friendlyName - Read only CompositionHook resources with friendly names that match this string
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait CompositionHookListInstancePageOptions extends StObject {
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object CompositionHookListInstancePageOptions {
    
    inline def apply(): CompositionHookListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositionHookListInstancePageOptions]
    }
    
    extension [Self <: CompositionHookListInstancePageOptions](x: Self) {
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait CompositionHookPayload
    extends StObject
       with CompositionHookResource
       with TwilioResponsePayload
  object CompositionHookPayload {
    
    inline def apply(
      account_sid: String,
      audio_sources: js.Array[String],
      audio_sources_excluded: js.Array[String],
      date_created: js.Date,
      date_updated: js.Date,
      enabled: Boolean,
      first_page_uri: String,
      format: CompositionHookFormat,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      resolution: String,
      sid: String,
      status_callback: String,
      status_callback_method: String,
      trim: Boolean,
      uri: String,
      url: String,
      video_layout: js.Object
    ): CompositionHookPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], audio_sources = audio_sources.asInstanceOf[js.Any], audio_sources_excluded = audio_sources_excluded.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], video_layout = video_layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositionHookPayload]
    }
  }
  
  trait CompositionHookResource extends StObject {
    
    var account_sid: String
    
    var audio_sources: js.Array[String]
    
    var audio_sources_excluded: js.Array[String]
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var enabled: Boolean
    
    var format: CompositionHookFormat
    
    var friendly_name: String
    
    var resolution: String
    
    var sid: String
    
    var status_callback: String
    
    var status_callback_method: String
    
    var trim: Boolean
    
    var url: String
    
    var video_layout: js.Object
  }
  object CompositionHookResource {
    
    inline def apply(
      account_sid: String,
      audio_sources: js.Array[String],
      audio_sources_excluded: js.Array[String],
      date_created: js.Date,
      date_updated: js.Date,
      enabled: Boolean,
      format: CompositionHookFormat,
      friendly_name: String,
      resolution: String,
      sid: String,
      status_callback: String,
      status_callback_method: String,
      trim: Boolean,
      url: String,
      video_layout: js.Object
    ): CompositionHookResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], audio_sources = audio_sources.asInstanceOf[js.Any], audio_sources_excluded = audio_sources_excluded.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status_callback = status_callback.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], video_layout = video_layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositionHookResource]
    }
    
    extension [Self <: CompositionHookResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAudio_sources(value: js.Array[String]): Self = StObject.set(x, "audio_sources", value.asInstanceOf[js.Any])
      
      inline def setAudio_sourcesVarargs(value: String*): Self = StObject.set(x, "audio_sources", js.Array(value*))
      
      inline def setAudio_sources_excluded(value: js.Array[String]): Self = StObject.set(x, "audio_sources_excluded", value.asInstanceOf[js.Any])
      
      inline def setAudio_sources_excludedVarargs(value: String*): Self = StObject.set(x, "audio_sources_excluded", js.Array(value*))
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: CompositionHookFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback(value: String): Self = StObject.set(x, "status_callback", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback_method(value: String): Self = StObject.set(x, "status_callback_method", value.asInstanceOf[js.Any])
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVideo_layout(value: js.Object): Self = StObject.set(x, "video_layout", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompositionHookSolution extends StObject
}
