package typings.twilio

import typings.std.Record
import typings.twilio.anon.CommandsCallbackMethod
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewWirelessMod.default
import typings.twilio.libRestPreviewWirelessSimUsageMod.UsageContext
import typings.twilio.libRestPreviewWirelessSimUsageMod.UsageListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewWirelessSimMod {
  
  @JSImport("twilio/lib/rest/preview/wireless/sim", "SimContextImpl")
  @js.native
  open class SimContextImpl protected ()
    extends StObject
       with SimContext {
    def this(_version: default, sid: String) = this()
    
    /* protected */ var _solution: SimContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _usage: js.UndefOr[UsageListInstance] = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SimInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SimInstance], Any]
    ): js.Promise[SimInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SimInstance], Any]
    ): js.Promise[SimInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/wireless/sim", "SimInstance")
  @js.native
  open class SimInstance protected () extends StObject {
    def this(_version: default, payload: SimResource) = this()
    def this(_version: default, payload: SimResource, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[SimContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: SimContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    var accountSid: String = js.native
    
    var commandsCallbackMethod: String = js.native
    
    var commandsCallbackUrl: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var eId: String = js.native
    
    /**
      * Fetch a SimInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SimInstance
      */
    def fetch(): js.Promise[SimInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[SimInstance] = js.native
    
    var friendlyName: String = js.native
    
    var iccid: String = js.native
    
    var links: Record[String, String] = js.native
    
    var ratePlanSid: String = js.native
    
    var sid: String = js.native
    
    var smsFallbackMethod: String = js.native
    
    var smsFallbackUrl: String = js.native
    
    var smsMethod: String = js.native
    
    var smsUrl: String = js.native
    
    var status: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): CommandsCallbackMethod = js.native
    
    var uniqueName: String = js.native
    
    /**
      * Update a SimInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SimInstance
      */
    def update(): js.Promise[SimInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[SimInstance] = js.native
    /**
      * Update a SimInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SimInstance
      */
    def update(params: SimContextUpdateOptions): js.Promise[SimInstance] = js.native
    def update(
      params: SimContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[SimInstance] = js.native
    
    var url: String = js.native
    
    /**
      * Access the usage.
      */
    def usage(): UsageListInstance = js.native
    
    var voiceFallbackMethod: String = js.native
    
    var voiceFallbackUrl: String = js.native
    
    var voiceMethod: String = js.native
    
    var voiceUrl: String = js.native
  }
  
  @js.native
  trait SimListInstance extends StObject {
    
    def apply(sid: String): SimContext = js.native
    
    var _solution: SimSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Streams SimInstance records from the API.
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
      * @param { SimListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ SimInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: SimListInstanceEachOptions): Unit = js.native
    def each(
      params: SimListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SimInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): SimContext = js.native
    
    /**
      * Retrieve a single target page of SimInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[SimPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ SimPage, Any]): js.Promise[SimPage] = js.native
    
    /**
      * Lists SimInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SimListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SimInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SimInstance], Any]): js.Promise[js.Array[SimInstance]] = js.native
    def list(params: SimListInstanceOptions): js.Promise[js.Array[SimInstance]] = js.native
    def list(
      params: SimListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SimInstance], Any]
    ): js.Promise[js.Array[SimInstance]] = js.native
    
    /**
      * Retrieve a single page of SimInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { SimListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[SimPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SimPage, Any]): js.Promise[SimPage] = js.native
    def page(params: SimListInstancePageOptions): js.Promise[SimPage] = js.native
    def page(
      params: SimListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SimPage, Any]
    ): js.Promise[SimPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object SimListInstance {
    
    @JSImport("twilio/lib/rest/preview/wireless/sim", "SimListInstance")
    @js.native
    def apply(version: default): SimListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/wireless/sim", "SimPage")
  @js.native
  open class SimPage protected ()
    extends typings.twilio.libBasePageMod.default[default, SimPayload, SimResource, SimInstance] {
    /**
      * Initialize the SimPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: SimSolution
    ) = this()
    
    /**
      * Build an instance of SimInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SimResource): SimInstance = js.native
  }
  
  @js.native
  trait SimContext extends StObject {
    
    /**
      * Fetch a SimInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SimInstance
      */
    def fetch(): js.Promise[SimInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SimInstance], Any]): js.Promise[SimInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a SimInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SimInstance
      */
    def update(): js.Promise[SimInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SimInstance], Any]): js.Promise[SimInstance] = js.native
    /**
      * Update a SimInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed SimInstance
      */
    def update(params: SimContextUpdateOptions): js.Promise[SimInstance] = js.native
    def update(
      params: SimContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[SimInstance], Any]
    ): js.Promise[SimInstance] = js.native
    
    def usage(): UsageContext = js.native
    @JSName("usage")
    var usage_Original: UsageListInstance = js.native
  }
  
  trait SimContextSolution extends StObject {
    
    var sid: String
  }
  object SimContextSolution {
    
    inline def apply(sid: String): SimContextSolution = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimContextSolution] (val x: Self) extends AnyVal {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimContextUpdateOptions extends StObject {
    
    /**  */
    var callbackMethod: js.UndefOr[String] = js.undefined
    
    /**  */
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    /**  */
    var commandsCallbackMethod: js.UndefOr[String] = js.undefined
    
    /**  */
    var commandsCallbackUrl: js.UndefOr[String] = js.undefined
    
    /**  */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /**  */
    var ratePlan: js.UndefOr[String] = js.undefined
    
    /**  */
    var smsFallbackMethod: js.UndefOr[String] = js.undefined
    
    /**  */
    var smsFallbackUrl: js.UndefOr[String] = js.undefined
    
    /**  */
    var smsMethod: js.UndefOr[String] = js.undefined
    
    /**  */
    var smsUrl: js.UndefOr[String] = js.undefined
    
    /**  */
    var status: js.UndefOr[String] = js.undefined
    
    /**  */
    var uniqueName: js.UndefOr[String] = js.undefined
    
    /**  */
    var voiceFallbackMethod: js.UndefOr[String] = js.undefined
    
    /**  */
    var voiceFallbackUrl: js.UndefOr[String] = js.undefined
    
    /**  */
    var voiceMethod: js.UndefOr[String] = js.undefined
    
    /**  */
    var voiceUrl: js.UndefOr[String] = js.undefined
  }
  object SimContextUpdateOptions {
    
    inline def apply(): SimContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setCallbackMethod(value: String): Self = StObject.set(x, "callbackMethod", value.asInstanceOf[js.Any])
      
      inline def setCallbackMethodUndefined: Self = StObject.set(x, "callbackMethod", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setCommandsCallbackMethod(value: String): Self = StObject.set(x, "commandsCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setCommandsCallbackMethodUndefined: Self = StObject.set(x, "commandsCallbackMethod", js.undefined)
      
      inline def setCommandsCallbackUrl(value: String): Self = StObject.set(x, "commandsCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCommandsCallbackUrlUndefined: Self = StObject.set(x, "commandsCallbackUrl", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setRatePlan(value: String): Self = StObject.set(x, "ratePlan", value.asInstanceOf[js.Any])
      
      inline def setRatePlanUndefined: Self = StObject.set(x, "ratePlan", js.undefined)
      
      inline def setSmsFallbackMethod(value: String): Self = StObject.set(x, "smsFallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsFallbackMethodUndefined: Self = StObject.set(x, "smsFallbackMethod", js.undefined)
      
      inline def setSmsFallbackUrl(value: String): Self = StObject.set(x, "smsFallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsFallbackUrlUndefined: Self = StObject.set(x, "smsFallbackUrl", js.undefined)
      
      inline def setSmsMethod(value: String): Self = StObject.set(x, "smsMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsMethodUndefined: Self = StObject.set(x, "smsMethod", js.undefined)
      
      inline def setSmsUrl(value: String): Self = StObject.set(x, "smsUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsUrlUndefined: Self = StObject.set(x, "smsUrl", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
      
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
  
  trait SimListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SimInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /**  */
    var eId: js.UndefOr[String] = js.undefined
    
    /**  */
    var iccid: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /**  */
    var ratePlan: js.UndefOr[String] = js.undefined
    
    /**  */
    var simRegistrationCode: js.UndefOr[String] = js.undefined
    
    /**  */
    var status: js.UndefOr[String] = js.undefined
  }
  object SimListInstanceEachOptions {
    
    inline def apply(): SimListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ SimInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEId(value: String): Self = StObject.set(x, "eId", value.asInstanceOf[js.Any])
      
      inline def setEIdUndefined: Self = StObject.set(x, "eId", js.undefined)
      
      inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
      
      inline def setIccidUndefined: Self = StObject.set(x, "iccid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setRatePlan(value: String): Self = StObject.set(x, "ratePlan", value.asInstanceOf[js.Any])
      
      inline def setRatePlanUndefined: Self = StObject.set(x, "ratePlan", js.undefined)
      
      inline def setSimRegistrationCode(value: String): Self = StObject.set(x, "simRegistrationCode", value.asInstanceOf[js.Any])
      
      inline def setSimRegistrationCodeUndefined: Self = StObject.set(x, "simRegistrationCode", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait SimListInstanceOptions extends StObject {
    
    /**  */
    var eId: js.UndefOr[String] = js.undefined
    
    /**  */
    var iccid: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /**  */
    var ratePlan: js.UndefOr[String] = js.undefined
    
    /**  */
    var simRegistrationCode: js.UndefOr[String] = js.undefined
    
    /**  */
    var status: js.UndefOr[String] = js.undefined
  }
  object SimListInstanceOptions {
    
    inline def apply(): SimListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setEId(value: String): Self = StObject.set(x, "eId", value.asInstanceOf[js.Any])
      
      inline def setEIdUndefined: Self = StObject.set(x, "eId", js.undefined)
      
      inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
      
      inline def setIccidUndefined: Self = StObject.set(x, "iccid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setRatePlan(value: String): Self = StObject.set(x, "ratePlan", value.asInstanceOf[js.Any])
      
      inline def setRatePlanUndefined: Self = StObject.set(x, "ratePlan", js.undefined)
      
      inline def setSimRegistrationCode(value: String): Self = StObject.set(x, "simRegistrationCode", value.asInstanceOf[js.Any])
      
      inline def setSimRegistrationCodeUndefined: Self = StObject.set(x, "simRegistrationCode", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait SimListInstancePageOptions extends StObject {
    
    /**  */
    var eId: js.UndefOr[String] = js.undefined
    
    /**  */
    var iccid: js.UndefOr[String] = js.undefined
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
    
    /**  */
    var ratePlan: js.UndefOr[String] = js.undefined
    
    /**  */
    var simRegistrationCode: js.UndefOr[String] = js.undefined
    
    /**  */
    var status: js.UndefOr[String] = js.undefined
  }
  object SimListInstancePageOptions {
    
    inline def apply(): SimListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setEId(value: String): Self = StObject.set(x, "eId", value.asInstanceOf[js.Any])
      
      inline def setEIdUndefined: Self = StObject.set(x, "eId", js.undefined)
      
      inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
      
      inline def setIccidUndefined: Self = StObject.set(x, "iccid", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setRatePlan(value: String): Self = StObject.set(x, "ratePlan", value.asInstanceOf[js.Any])
      
      inline def setRatePlanUndefined: Self = StObject.set(x, "ratePlan", js.undefined)
      
      inline def setSimRegistrationCode(value: String): Self = StObject.set(x, "simRegistrationCode", value.asInstanceOf[js.Any])
      
      inline def setSimRegistrationCodeUndefined: Self = StObject.set(x, "simRegistrationCode", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait SimPayload
    extends StObject
       with TwilioResponsePayload {
    
    var sims: js.Array[SimResource]
  }
  object SimPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sims: js.Array[SimResource],
      uri: String
    ): SimPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sims = sims.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimPayload] (val x: Self) extends AnyVal {
      
      inline def setSims(value: js.Array[SimResource]): Self = StObject.set(x, "sims", value.asInstanceOf[js.Any])
      
      inline def setSimsVarargs(value: SimResource*): Self = StObject.set(x, "sims", js.Array(value*))
    }
  }
  
  trait SimResource extends StObject {
    
    var account_sid: String
    
    var commands_callback_method: String
    
    var commands_callback_url: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var e_id: String
    
    var friendly_name: String
    
    var iccid: String
    
    var links: Record[String, String]
    
    var rate_plan_sid: String
    
    var sid: String
    
    var sms_fallback_method: String
    
    var sms_fallback_url: String
    
    var sms_method: String
    
    var sms_url: String
    
    var status: String
    
    var unique_name: String
    
    var url: String
    
    var voice_fallback_method: String
    
    var voice_fallback_url: String
    
    var voice_method: String
    
    var voice_url: String
  }
  object SimResource {
    
    inline def apply(
      account_sid: String,
      commands_callback_method: String,
      commands_callback_url: String,
      date_created: js.Date,
      date_updated: js.Date,
      e_id: String,
      friendly_name: String,
      iccid: String,
      links: Record[String, String],
      rate_plan_sid: String,
      sid: String,
      sms_fallback_method: String,
      sms_fallback_url: String,
      sms_method: String,
      sms_url: String,
      status: String,
      unique_name: String,
      url: String,
      voice_fallback_method: String,
      voice_fallback_url: String,
      voice_method: String,
      voice_url: String
    ): SimResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], commands_callback_method = commands_callback_method.asInstanceOf[js.Any], commands_callback_url = commands_callback_url.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], e_id = e_id.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], iccid = iccid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], rate_plan_sid = rate_plan_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sms_fallback_method = sms_fallback_method.asInstanceOf[js.Any], sms_fallback_url = sms_fallback_url.asInstanceOf[js.Any], sms_method = sms_method.asInstanceOf[js.Any], sms_url = sms_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_fallback_method = voice_fallback_method.asInstanceOf[js.Any], voice_fallback_url = voice_fallback_url.asInstanceOf[js.Any], voice_method = voice_method.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCommands_callback_method(value: String): Self = StObject.set(x, "commands_callback_method", value.asInstanceOf[js.Any])
      
      inline def setCommands_callback_url(value: String): Self = StObject.set(x, "commands_callback_url", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setE_id(value: String): Self = StObject.set(x, "e_id", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setRate_plan_sid(value: String): Self = StObject.set(x, "rate_plan_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSms_fallback_method(value: String): Self = StObject.set(x, "sms_fallback_method", value.asInstanceOf[js.Any])
      
      inline def setSms_fallback_url(value: String): Self = StObject.set(x, "sms_fallback_url", value.asInstanceOf[js.Any])
      
      inline def setSms_method(value: String): Self = StObject.set(x, "sms_method", value.asInstanceOf[js.Any])
      
      inline def setSms_url(value: String): Self = StObject.set(x, "sms_url", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_method(value: String): Self = StObject.set(x, "voice_fallback_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_fallback_url(value: String): Self = StObject.set(x, "voice_fallback_url", value.asInstanceOf[js.Any])
      
      inline def setVoice_method(value: String): Self = StObject.set(x, "voice_method", value.asInstanceOf[js.Any])
      
      inline def setVoice_url(value: String): Self = StObject.set(x, "voice_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimSolution extends StObject
}
