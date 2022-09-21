package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object originationUrlMod {
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk/originationUrl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk/originationUrl", "OriginationUrlContext")
  @js.native
  open class OriginationUrlContext protected () extends StObject {
    /**
      * Initialize the OriginationUrlContext
      *
      * @param version - Version of the resource
      * @param trunkSid - The SID of the Trunk from which to fetch the OriginationUrl
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.trunkingV1Mod.^, trunkSid: String, sid: String) = this()
    
    /**
      * fetch a OriginationUrlInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[OriginationUrlInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ OriginationUrlInstance, Any]): js.Promise[OriginationUrlInstance] = js.native
    
    /**
      * remove a OriginationUrlInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ OriginationUrlInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a OriginationUrlInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[OriginationUrlInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ OriginationUrlInstance, Any]): js.Promise[OriginationUrlInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ OriginationUrlInstance, Any]
    ): js.Promise[OriginationUrlInstance] = js.native
    def update(opts: OriginationUrlInstanceUpdateOptions): js.Promise[OriginationUrlInstance] = js.native
    def update(
      opts: OriginationUrlInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ OriginationUrlInstance, Any]
    ): js.Promise[OriginationUrlInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk/originationUrl", "OriginationUrlInstance")
  @js.native
  open class OriginationUrlInstance protected () extends SerializableClass {
    /**
      * Initialize the OriginationUrlContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param trunkSid - The SID of the Trunk that owns the Origination URL
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.trunkingV1Mod.^,
      payload: OriginationUrlPayload,
      trunkSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: OriginationUrlContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var enabled: Boolean = js.native
    
    /**
      * fetch a OriginationUrlInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[OriginationUrlInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[OriginationUrlInstance] = js.native
    
    var friendlyName: String = js.native
    
    var priority: Double = js.native
    
    /**
      * remove a OriginationUrlInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var sipUrl: String = js.native
    
    var trunkSid: String = js.native
    
    /**
      * update a OriginationUrlInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[OriginationUrlInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[OriginationUrlInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[OriginationUrlInstance] = js.native
    def update(opts: OriginationUrlInstanceUpdateOptions): js.Promise[OriginationUrlInstance] = js.native
    def update(
      opts: OriginationUrlInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[OriginationUrlInstance] = js.native
    
    var url: String = js.native
    
    var weight: Double = js.native
  }
  
  /**
    * Initialize the OriginationUrlList
    *
    * @param version - Version of the resource
    * @param trunkSid - The SID of the Trunk that owns the Origination URL
    */
  inline def OriginationUrlList(version: typings.twilio.trunkingV1Mod.^, trunkSid: String): OriginationUrlListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("OriginationUrlList")(version.asInstanceOf[js.Any], trunkSid.asInstanceOf[js.Any])).asInstanceOf[OriginationUrlListInstance]
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk/originationUrl", "OriginationUrlPage")
  @js.native
  open class OriginationUrlPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trunkingV1Mod.^, 
          OriginationUrlPayload, 
          OriginationUrlResource, 
          OriginationUrlInstance
        ] {
    /**
      * Initialize the OriginationUrlPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trunkingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: OriginationUrlSolution
    ) = this()
    
    /**
      * Build an instance of OriginationUrlInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: OriginationUrlPayload): OriginationUrlInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property enabled - Whether the URL is enabled
    * @property friendlyName - A string to describe the resource
    * @property priority - The relative importance of the URI
    * @property sipUrl - The SIP address you want Twilio to route your Origination calls to
    * @property weight - The value that determines the relative load the URI should receive compared to others with the same priority
    */
  trait OriginationUrlInstanceUpdateOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var sipUrl: js.UndefOr[String] = js.undefined
    
    var weight: js.UndefOr[Double] = js.undefined
  }
  object OriginationUrlInstanceUpdateOptions {
    
    inline def apply(): OriginationUrlInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginationUrlInstanceUpdateOptions]
    }
    
    extension [Self <: OriginationUrlInstanceUpdateOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSipUrl(value: String): Self = StObject.set(x, "sipUrl", value.asInstanceOf[js.Any])
      
      inline def setSipUrlUndefined: Self = StObject.set(x, "sipUrl", js.undefined)
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  @js.native
  trait OriginationUrlListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): OriginationUrlContext = js.native
    
    /**
      * create a OriginationUrlInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: OriginationUrlListInstanceCreateOptions): js.Promise[OriginationUrlInstance] = js.native
    def create(
      opts: OriginationUrlListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ OriginationUrlInstance, Any]
    ): js.Promise[OriginationUrlInstance] = js.native
    
    /**
      * Streams OriginationUrlInstance records from the API.
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
          /* item */ OriginationUrlInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ OriginationUrlInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: OriginationUrlListInstanceEachOptions): Unit = js.native
    def each(
      opts: OriginationUrlListInstanceEachOptions,
      callback: js.Function2[
          /* item */ OriginationUrlInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a origination_url
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): OriginationUrlContext = js.native
    
    /**
      * Retrieve a single target page of OriginationUrlInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[OriginationUrlPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ OriginationUrlPage, Any]): js.Promise[OriginationUrlPage] = js.native
    def getPage(targetUrl: String): js.Promise[OriginationUrlPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ OriginationUrlPage, Any]
    ): js.Promise[OriginationUrlPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ OriginationUrlPage, Any]
    ): js.Promise[OriginationUrlPage] = js.native
    
    /**
      * Lists OriginationUrlInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[OriginationUrlInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[OriginationUrlInstance], Any]
    ): js.Promise[js.Array[OriginationUrlInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[OriginationUrlInstance], Any]
    ): js.Promise[js.Array[OriginationUrlInstance]] = js.native
    def list(opts: OriginationUrlListInstanceOptions): js.Promise[js.Array[OriginationUrlInstance]] = js.native
    def list(
      opts: OriginationUrlListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[OriginationUrlInstance], Any]
    ): js.Promise[js.Array[OriginationUrlInstance]] = js.native
    
    /**
      * Retrieve a single page of OriginationUrlInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[OriginationUrlPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ OriginationUrlPage, Any]): js.Promise[OriginationUrlPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ OriginationUrlPage, Any]
    ): js.Promise[OriginationUrlPage] = js.native
    def page(opts: OriginationUrlListInstancePageOptions): js.Promise[OriginationUrlPage] = js.native
    def page(
      opts: OriginationUrlListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ OriginationUrlPage, Any]
    ): js.Promise[OriginationUrlPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property enabled - Whether the URL is enabled
    * @property friendlyName - A string to describe the resource
    * @property priority - The relative importance of the URI
    * @property sipUrl - The SIP address you want Twilio to route your Origination calls to
    * @property weight - The value that determines the relative load the URI should receive compared to others with the same priority
    */
  trait OriginationUrlListInstanceCreateOptions extends StObject {
    
    var enabled: Boolean
    
    var friendlyName: String
    
    var priority: Double
    
    var sipUrl: String
    
    var weight: Double
  }
  object OriginationUrlListInstanceCreateOptions {
    
    inline def apply(enabled: Boolean, friendlyName: String, priority: Double, sipUrl: String, weight: Double): OriginationUrlListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], sipUrl = sipUrl.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginationUrlListInstanceCreateOptions]
    }
    
    extension [Self <: OriginationUrlListInstanceCreateOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setSipUrl(value: String): Self = StObject.set(x, "sipUrl", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
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
  trait OriginationUrlListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ OriginationUrlInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object OriginationUrlListInstanceEachOptions {
    
    inline def apply(): OriginationUrlListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginationUrlListInstanceEachOptions]
    }
    
    extension [Self <: OriginationUrlListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ OriginationUrlInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait OriginationUrlListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object OriginationUrlListInstanceOptions {
    
    inline def apply(): OriginationUrlListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginationUrlListInstanceOptions]
    }
    
    extension [Self <: OriginationUrlListInstanceOptions](x: Self) {
      
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
  trait OriginationUrlListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object OriginationUrlListInstancePageOptions {
    
    inline def apply(): OriginationUrlListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginationUrlListInstancePageOptions]
    }
    
    extension [Self <: OriginationUrlListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait OriginationUrlPayload
    extends StObject
       with OriginationUrlResource
       with TwilioResponsePayload
  object OriginationUrlPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      enabled: Boolean,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      priority: Double,
      sid: String,
      sip_url: String,
      trunk_sid: String,
      uri: String,
      url: String,
      weight: Double
    ): OriginationUrlPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sip_url = sip_url.asInstanceOf[js.Any], trunk_sid = trunk_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginationUrlPayload]
    }
  }
  
  trait OriginationUrlResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var enabled: Boolean
    
    var friendly_name: String
    
    var priority: Double
    
    var sid: String
    
    var sip_url: String
    
    var trunk_sid: String
    
    var url: String
    
    var weight: Double
  }
  object OriginationUrlResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      enabled: Boolean,
      friendly_name: String,
      priority: Double,
      sid: String,
      sip_url: String,
      trunk_sid: String,
      url: String,
      weight: Double
    ): OriginationUrlResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sip_url = sip_url.asInstanceOf[js.Any], trunk_sid = trunk_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginationUrlResource]
    }
    
    extension [Self <: OriginationUrlResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSip_url(value: String): Self = StObject.set(x, "sip_url", value.asInstanceOf[js.Any])
      
      inline def setTrunk_sid(value: String): Self = StObject.set(x, "trunk_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait OriginationUrlSolution extends StObject {
    
    var trunkSid: js.UndefOr[String] = js.undefined
  }
  object OriginationUrlSolution {
    
    inline def apply(): OriginationUrlSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginationUrlSolution]
    }
    
    extension [Self <: OriginationUrlSolution](x: Self) {
      
      inline def setTrunkSid(value: String): Self = StObject.set(x, "trunkSid", value.asInstanceOf[js.Any])
      
      inline def setTrunkSidUndefined: Self = StObject.set(x, "trunkSid", js.undefined)
    }
  }
}
