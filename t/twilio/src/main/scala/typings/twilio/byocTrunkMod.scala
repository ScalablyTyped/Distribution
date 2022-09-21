package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byocTrunkMod {
  
  @JSImport("twilio/lib/rest/voice/v1/byocTrunk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/voice/v1/byocTrunk", "ByocTrunkContext")
  @js.native
  open class ByocTrunkContext protected () extends StObject {
    /**
      * Initialize the ByocTrunkContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.voiceV1Mod.^, sid: String) = this()
    
    /**
      * fetch a ByocTrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ByocTrunkInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ByocTrunkInstance, Any]): js.Promise[ByocTrunkInstance] = js.native
    
    /**
      * remove a ByocTrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ByocTrunkInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ByocTrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ByocTrunkInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ByocTrunkInstance, Any]): js.Promise[ByocTrunkInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ByocTrunkInstance, Any]
    ): js.Promise[ByocTrunkInstance] = js.native
    def update(opts: ByocTrunkInstanceUpdateOptions): js.Promise[ByocTrunkInstance] = js.native
    def update(
      opts: ByocTrunkInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ByocTrunkInstance, Any]
    ): js.Promise[ByocTrunkInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/voice/v1/byocTrunk", "ByocTrunkInstance")
  @js.native
  open class ByocTrunkInstance protected () extends SerializableClass {
    /**
      * Initialize the ByocTrunkContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.voiceV1Mod.^, payload: ByocTrunkPayload, sid: String) = this()
    
    /* private */ var _proxy: ByocTrunkContext = js.native
    
    var accountSid: String = js.native
    
    var cnamLookupEnabled: Boolean = js.native
    
    var connectionPolicySid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ByocTrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ByocTrunkInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ByocTrunkInstance] = js.native
    
    var friendlyName: String = js.native
    
    var fromDomainSid: String = js.native
    
    /**
      * remove a ByocTrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var statusCallbackMethod: String = js.native
    
    var statusCallbackUrl: String = js.native
    
    /**
      * update a ByocTrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ByocTrunkInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ByocTrunkInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ByocTrunkInstance] = js.native
    def update(opts: ByocTrunkInstanceUpdateOptions): js.Promise[ByocTrunkInstance] = js.native
    def update(
      opts: ByocTrunkInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ByocTrunkInstance] = js.native
    
    var url: String = js.native
    
    var voiceFallbackMethod: String = js.native
    
    var voiceFallbackUrl: String = js.native
    
    var voiceMethod: String = js.native
    
    var voiceUrl: String = js.native
  }
  
  /**
    * Initialize the ByocTrunkList
    *
    * @param version - Version of the resource
    */
  inline def ByocTrunkList(version: typings.twilio.voiceV1Mod.^): ByocTrunkListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ByocTrunkList")(version.asInstanceOf[js.Any]).asInstanceOf[ByocTrunkListInstance]
  
  @JSImport("twilio/lib/rest/voice/v1/byocTrunk", "ByocTrunkPage")
  @js.native
  open class ByocTrunkPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.voiceV1Mod.^, ByocTrunkPayload, ByocTrunkResource, ByocTrunkInstance] {
    /**
      * Initialize the ByocTrunkPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.voiceV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ByocTrunkSolution
    ) = this()
    
    /**
      * Build an instance of ByocTrunkInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ByocTrunkPayload): ByocTrunkInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property cnamLookupEnabled - Whether Caller ID Name (CNAM) lookup is enabled for the trunk
    * @property connectionPolicySid - Origination Connection Policy (to your Carrier)
    * @property friendlyName - A string to describe the resource
    * @property fromDomainSid - The SID of the SIP Domain that should be used in the `From` header of originating calls
    * @property statusCallbackMethod - The HTTP method we should use to call status_callback_url
    * @property statusCallbackUrl - The URL that we should call to pass status updates
    * @property voiceFallbackMethod - The HTTP method used with voice_fallback_url
    * @property voiceFallbackUrl - The URL we should call when an error occurs in executing TwiML
    * @property voiceMethod - The HTTP method we should use with voice_url
    * @property voiceUrl - The URL we should call when receiving a call
    */
  trait ByocTrunkInstanceUpdateOptions extends StObject {
    
    var cnamLookupEnabled: js.UndefOr[Boolean] = js.undefined
    
    var connectionPolicySid: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var fromDomainSid: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var statusCallbackUrl: js.UndefOr[String] = js.undefined
    
    var voiceFallbackMethod: js.UndefOr[String] = js.undefined
    
    var voiceFallbackUrl: js.UndefOr[String] = js.undefined
    
    var voiceMethod: js.UndefOr[String] = js.undefined
    
    var voiceUrl: js.UndefOr[String] = js.undefined
  }
  object ByocTrunkInstanceUpdateOptions {
    
    inline def apply(): ByocTrunkInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ByocTrunkInstanceUpdateOptions]
    }
    
    extension [Self <: ByocTrunkInstanceUpdateOptions](x: Self) {
      
      inline def setCnamLookupEnabled(value: Boolean): Self = StObject.set(x, "cnamLookupEnabled", value.asInstanceOf[js.Any])
      
      inline def setCnamLookupEnabledUndefined: Self = StObject.set(x, "cnamLookupEnabled", js.undefined)
      
      inline def setConnectionPolicySid(value: String): Self = StObject.set(x, "connectionPolicySid", value.asInstanceOf[js.Any])
      
      inline def setConnectionPolicySidUndefined: Self = StObject.set(x, "connectionPolicySid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setFromDomainSid(value: String): Self = StObject.set(x, "fromDomainSid", value.asInstanceOf[js.Any])
      
      inline def setFromDomainSidUndefined: Self = StObject.set(x, "fromDomainSid", js.undefined)
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUrl(value: String): Self = StObject.set(x, "statusCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackUrlUndefined: Self = StObject.set(x, "statusCallbackUrl", js.undefined)
      
      inline def setVoiceFallbackMethod(value: String): Self = StObject.set(x, "voiceFallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackMethodUndefined: Self = StObject.set(x, "voiceFallbackMethod", js.undefined)
      
      inline def setVoiceFallbackUrl(value: String): Self = StObject.set(x, "voiceFallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackUrlUndefined: Self = StObject.set(x, "voiceFallbackUrl", js.undefined)
      
      inline def setVoiceMethod(value: String): Self = StObject.set(x, "voiceMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceMethodUndefined: Self = StObject.set(x, "voiceMethod", js.undefined)
      
      inline def setVoiceUrl(value: String): Self = StObject.set(x, "voiceUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceUrlUndefined: Self = StObject.set(x, "voiceUrl", js.undefined)
    }
  }
  
  @js.native
  trait ByocTrunkListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ByocTrunkContext = js.native
    
    /**
      * create a ByocTrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[ByocTrunkInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ ByocTrunkInstance, Any]): js.Promise[ByocTrunkInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ ByocTrunkInstance, Any]): js.Promise[ByocTrunkInstance] = js.native
    def create(opts: ByocTrunkListInstanceCreateOptions): js.Promise[ByocTrunkInstance] = js.native
    def create(
      opts: ByocTrunkListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ByocTrunkInstance, Any]
    ): js.Promise[ByocTrunkInstance] = js.native
    
    /**
      * Streams ByocTrunkInstance records from the API.
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
          /* item */ ByocTrunkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ByocTrunkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ByocTrunkListInstanceEachOptions): Unit = js.native
    def each(
      opts: ByocTrunkListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ByocTrunkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a byoc_trunk
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): ByocTrunkContext = js.native
    
    /**
      * Retrieve a single target page of ByocTrunkInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ByocTrunkPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ByocTrunkPage, Any]): js.Promise[ByocTrunkPage] = js.native
    def getPage(targetUrl: String): js.Promise[ByocTrunkPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ByocTrunkPage, Any]
    ): js.Promise[ByocTrunkPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ByocTrunkPage, Any]
    ): js.Promise[ByocTrunkPage] = js.native
    
    /**
      * Lists ByocTrunkInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ByocTrunkInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ByocTrunkInstance], Any]): js.Promise[js.Array[ByocTrunkInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ByocTrunkInstance], Any]
    ): js.Promise[js.Array[ByocTrunkInstance]] = js.native
    def list(opts: ByocTrunkListInstanceOptions): js.Promise[js.Array[ByocTrunkInstance]] = js.native
    def list(
      opts: ByocTrunkListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ByocTrunkInstance], Any]
    ): js.Promise[js.Array[ByocTrunkInstance]] = js.native
    
    /**
      * Retrieve a single page of ByocTrunkInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ByocTrunkPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ByocTrunkPage, Any]): js.Promise[ByocTrunkPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ByocTrunkPage, Any]): js.Promise[ByocTrunkPage] = js.native
    def page(opts: ByocTrunkListInstancePageOptions): js.Promise[ByocTrunkPage] = js.native
    def page(
      opts: ByocTrunkListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ByocTrunkPage, Any]
    ): js.Promise[ByocTrunkPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property cnamLookupEnabled - Whether Caller ID Name (CNAM) lookup is enabled for the trunk
    * @property connectionPolicySid - Origination Connection Policy (to your Carrier)
    * @property friendlyName - A string to describe the resource
    * @property fromDomainSid - The SID of the SIP Domain that should be used in the `From` header of originating calls
    * @property statusCallbackMethod - The HTTP method we should use to call `status_callback_url`
    * @property statusCallbackUrl - The URL that we should call to pass status updates
    * @property voiceFallbackMethod - The HTTP method to use with voice_fallback_url
    * @property voiceFallbackUrl - The URL we should call when an error occurs in executing TwiML
    * @property voiceMethod - The HTTP method to use with voice_url
    * @property voiceUrl - The URL we should call when receiving a call
    */
  trait ByocTrunkListInstanceCreateOptions extends StObject {
    
    var cnamLookupEnabled: js.UndefOr[Boolean] = js.undefined
    
    var connectionPolicySid: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var fromDomainSid: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var statusCallbackUrl: js.UndefOr[String] = js.undefined
    
    var voiceFallbackMethod: js.UndefOr[String] = js.undefined
    
    var voiceFallbackUrl: js.UndefOr[String] = js.undefined
    
    var voiceMethod: js.UndefOr[String] = js.undefined
    
    var voiceUrl: js.UndefOr[String] = js.undefined
  }
  object ByocTrunkListInstanceCreateOptions {
    
    inline def apply(): ByocTrunkListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ByocTrunkListInstanceCreateOptions]
    }
    
    extension [Self <: ByocTrunkListInstanceCreateOptions](x: Self) {
      
      inline def setCnamLookupEnabled(value: Boolean): Self = StObject.set(x, "cnamLookupEnabled", value.asInstanceOf[js.Any])
      
      inline def setCnamLookupEnabledUndefined: Self = StObject.set(x, "cnamLookupEnabled", js.undefined)
      
      inline def setConnectionPolicySid(value: String): Self = StObject.set(x, "connectionPolicySid", value.asInstanceOf[js.Any])
      
      inline def setConnectionPolicySidUndefined: Self = StObject.set(x, "connectionPolicySid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setFromDomainSid(value: String): Self = StObject.set(x, "fromDomainSid", value.asInstanceOf[js.Any])
      
      inline def setFromDomainSidUndefined: Self = StObject.set(x, "fromDomainSid", js.undefined)
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUrl(value: String): Self = StObject.set(x, "statusCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackUrlUndefined: Self = StObject.set(x, "statusCallbackUrl", js.undefined)
      
      inline def setVoiceFallbackMethod(value: String): Self = StObject.set(x, "voiceFallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackMethodUndefined: Self = StObject.set(x, "voiceFallbackMethod", js.undefined)
      
      inline def setVoiceFallbackUrl(value: String): Self = StObject.set(x, "voiceFallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceFallbackUrlUndefined: Self = StObject.set(x, "voiceFallbackUrl", js.undefined)
      
      inline def setVoiceMethod(value: String): Self = StObject.set(x, "voiceMethod", value.asInstanceOf[js.Any])
      
      inline def setVoiceMethodUndefined: Self = StObject.set(x, "voiceMethod", js.undefined)
      
      inline def setVoiceUrl(value: String): Self = StObject.set(x, "voiceUrl", value.asInstanceOf[js.Any])
      
      inline def setVoiceUrlUndefined: Self = StObject.set(x, "voiceUrl", js.undefined)
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
  trait ByocTrunkListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ByocTrunkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ByocTrunkListInstanceEachOptions {
    
    inline def apply(): ByocTrunkListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ByocTrunkListInstanceEachOptions]
    }
    
    extension [Self <: ByocTrunkListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ByocTrunkInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ByocTrunkListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ByocTrunkListInstanceOptions {
    
    inline def apply(): ByocTrunkListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ByocTrunkListInstanceOptions]
    }
    
    extension [Self <: ByocTrunkListInstanceOptions](x: Self) {
      
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
  trait ByocTrunkListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ByocTrunkListInstancePageOptions {
    
    inline def apply(): ByocTrunkListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ByocTrunkListInstancePageOptions]
    }
    
    extension [Self <: ByocTrunkListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ByocTrunkPayload
    extends StObject
       with ByocTrunkResource
       with TwilioResponsePayload
  object ByocTrunkPayload {
    
    inline def apply(
      account_sid: String,
      cnam_lookup_enabled: Boolean,
      connection_policy_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      from_domain_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      status_callback_method: String,
      status_callback_url: String,
      uri: String,
      url: String,
      voice_fallback_method: String,
      voice_fallback_url: String,
      voice_method: String,
      voice_url: String
    ): ByocTrunkPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cnam_lookup_enabled = cnam_lookup_enabled.asInstanceOf[js.Any], connection_policy_sid = connection_policy_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], from_domain_sid = from_domain_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], status_callback_url = status_callback_url.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_fallback_method = voice_fallback_method.asInstanceOf[js.Any], voice_fallback_url = voice_fallback_url.asInstanceOf[js.Any], voice_method = voice_method.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByocTrunkPayload]
    }
  }
  
  trait ByocTrunkResource extends StObject {
    
    var account_sid: String
    
    var cnam_lookup_enabled: Boolean
    
    var connection_policy_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var from_domain_sid: String
    
    var sid: String
    
    var status_callback_method: String
    
    var status_callback_url: String
    
    var url: String
    
    var voice_fallback_method: String
    
    var voice_fallback_url: String
    
    var voice_method: String
    
    var voice_url: String
  }
  object ByocTrunkResource {
    
    inline def apply(
      account_sid: String,
      cnam_lookup_enabled: Boolean,
      connection_policy_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      from_domain_sid: String,
      sid: String,
      status_callback_method: String,
      status_callback_url: String,
      url: String,
      voice_fallback_method: String,
      voice_fallback_url: String,
      voice_method: String,
      voice_url: String
    ): ByocTrunkResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], cnam_lookup_enabled = cnam_lookup_enabled.asInstanceOf[js.Any], connection_policy_sid = connection_policy_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], from_domain_sid = from_domain_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status_callback_method = status_callback_method.asInstanceOf[js.Any], status_callback_url = status_callback_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_fallback_method = voice_fallback_method.asInstanceOf[js.Any], voice_fallback_url = voice_fallback_url.asInstanceOf[js.Any], voice_method = voice_method.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByocTrunkResource]
    }
    
    extension [Self <: ByocTrunkResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCnam_lookup_enabled(value: Boolean): Self = StObject.set(x, "cnam_lookup_enabled", value.asInstanceOf[js.Any])
      
      inline def setConnection_policy_sid(value: String): Self = StObject.set(x, "connection_policy_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setFrom_domain_sid(value: String): Self = StObject.set(x, "from_domain_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback_method(value: String): Self = StObject.set(x, "status_callback_method", value.asInstanceOf[js.Any])
      
      inline def setStatus_callback_url(value: String): Self = StObject.set(x, "status_callback_url", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_method(value: String): Self = StObject.set(x, "voice_fallback_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_url(value: String): Self = StObject.set(x, "voice_fallback_url", value.asInstanceOf[js.Any])
      
      inline def setVoice_method(value: String): Self = StObject.set(x, "voice_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_url(value: String): Self = StObject.set(x, "voice_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ByocTrunkSolution extends StObject
}
