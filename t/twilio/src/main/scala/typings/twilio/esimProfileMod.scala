package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esimProfileMod {
  
  @JSImport("twilio/lib/rest/supersim/v1/esimProfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/supersim/v1/esimProfile", "EsimProfileContext")
  @js.native
  open class EsimProfileContext protected () extends StObject {
    /**
      * Initialize the EsimProfileContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - The SID of the eSIM Profile resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, sid: String) = this()
    
    /**
      * fetch a EsimProfileInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EsimProfileInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ EsimProfileInstance, Any]): js.Promise[EsimProfileInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/supersim/v1/esimProfile", "EsimProfileInstance")
  @js.native
  open class EsimProfileInstance protected () extends SerializableClass {
    /**
      * Initialize the EsimProfileContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID of the eSIM Profile resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, payload: EsimProfilePayload, sid: String) = this()
    
    /* private */ var _proxy: EsimProfileContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var eid: String = js.native
    
    var errorCode: String = js.native
    
    var errorMessage: String = js.native
    
    /**
      * fetch a EsimProfileInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EsimProfileInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[EsimProfileInstance] = js.native
    
    var iccid: String = js.native
    
    var sid: String = js.native
    
    var simSid: String = js.native
    
    var smdpPlusAddress: String = js.native
    
    var status: EsimProfileStatus = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the EsimProfileList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def EsimProfileList(version: typings.twilio.supersimV1Mod.^): EsimProfileListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("EsimProfileList")(version.asInstanceOf[js.Any]).asInstanceOf[EsimProfileListInstance]
  
  @JSImport("twilio/lib/rest/supersim/v1/esimProfile", "EsimProfilePage")
  @js.native
  open class EsimProfilePage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.supersimV1Mod.^, 
          EsimProfilePayload, 
          EsimProfileResource, 
          EsimProfileInstance
        ] {
    /**
      * Initialize the EsimProfilePage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.supersimV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: EsimProfileSolution
    ) = this()
    
    /**
      * Build an instance of EsimProfileInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: EsimProfilePayload): EsimProfileInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait EsimProfileListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): EsimProfileContext = js.native
    
    /**
      * create a EsimProfileInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[EsimProfileInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ EsimProfileInstance, Any]): js.Promise[EsimProfileInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ EsimProfileInstance, Any]
    ): js.Promise[EsimProfileInstance] = js.native
    def create(opts: EsimProfileListInstanceCreateOptions): js.Promise[EsimProfileInstance] = js.native
    def create(
      opts: EsimProfileListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ EsimProfileInstance, Any]
    ): js.Promise[EsimProfileInstance] = js.native
    
    /**
      * Streams EsimProfileInstance records from the API.
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
          /* item */ EsimProfileInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ EsimProfileInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: EsimProfileListInstanceEachOptions): Unit = js.native
    def each(
      opts: EsimProfileListInstanceEachOptions,
      callback: js.Function2[
          /* item */ EsimProfileInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a esim_profile
      *
      * @param sid - The SID of the eSIM Profile resource to fetch
      */
    def get(sid: String): EsimProfileContext = js.native
    
    /**
      * Retrieve a single target page of EsimProfileInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[EsimProfilePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ EsimProfilePage, Any]): js.Promise[EsimProfilePage] = js.native
    def getPage(targetUrl: String): js.Promise[EsimProfilePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EsimProfilePage, Any]
    ): js.Promise[EsimProfilePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EsimProfilePage, Any]
    ): js.Promise[EsimProfilePage] = js.native
    
    /**
      * Lists EsimProfileInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[EsimProfileInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EsimProfileInstance], Any]
    ): js.Promise[js.Array[EsimProfileInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EsimProfileInstance], Any]
    ): js.Promise[js.Array[EsimProfileInstance]] = js.native
    def list(opts: EsimProfileListInstanceOptions): js.Promise[js.Array[EsimProfileInstance]] = js.native
    def list(
      opts: EsimProfileListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EsimProfileInstance], Any]
    ): js.Promise[js.Array[EsimProfileInstance]] = js.native
    
    /**
      * Retrieve a single page of EsimProfileInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[EsimProfilePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ EsimProfilePage, Any]): js.Promise[EsimProfilePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ EsimProfilePage, Any]): js.Promise[EsimProfilePage] = js.native
    def page(opts: EsimProfileListInstancePageOptions): js.Promise[EsimProfilePage] = js.native
    def page(
      opts: EsimProfileListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EsimProfilePage, Any]
    ): js.Promise[EsimProfilePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property callbackMethod - The HTTP method we should use to call callback_url
    * @property callbackUrl - The URL we should call after we have sent when the status of the eSIM Profile changes
    * @property eid - Identifier of the eUICC that will claim the eSIM Profile
    */
  trait EsimProfileListInstanceCreateOptions extends StObject {
    
    var callbackMethod: js.UndefOr[String] = js.undefined
    
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var eid: js.UndefOr[String] = js.undefined
  }
  object EsimProfileListInstanceCreateOptions {
    
    inline def apply(): EsimProfileListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EsimProfileListInstanceCreateOptions]
    }
    
    extension [Self <: EsimProfileListInstanceCreateOptions](x: Self) {
      
      inline def setCallbackMethod(value: String): Self = StObject.set(x, "callbackMethod", value.asInstanceOf[js.Any])
      
      inline def setCallbackMethodUndefined: Self = StObject.set(x, "callbackMethod", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setEid(value: String): Self = StObject.set(x, "eid", value.asInstanceOf[js.Any])
      
      inline def setEidUndefined: Self = StObject.set(x, "eid", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property eid - List the eSIM Profiles that have been associated with an EId
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
    * @property simSid - Find the eSIM Profile resource related to a Sim resource by providing the SIM SID
    * @property status - List the eSIM Profiles that are in a given status
    */
  trait EsimProfileListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ EsimProfileInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var eid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var simSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[EsimProfileStatus] = js.undefined
  }
  object EsimProfileListInstanceEachOptions {
    
    inline def apply(): EsimProfileListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EsimProfileListInstanceEachOptions]
    }
    
    extension [Self <: EsimProfileListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ EsimProfileInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEid(value: String): Self = StObject.set(x, "eid", value.asInstanceOf[js.Any])
      
      inline def setEidUndefined: Self = StObject.set(x, "eid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSimSid(value: String): Self = StObject.set(x, "simSid", value.asInstanceOf[js.Any])
      
      inline def setSimSidUndefined: Self = StObject.set(x, "simSid", js.undefined)
      
      inline def setStatus(value: EsimProfileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property eid - List the eSIM Profiles that have been associated with an EId
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
    * @property simSid - Find the eSIM Profile resource related to a Sim resource by providing the SIM SID
    * @property status - List the eSIM Profiles that are in a given status
    */
  trait EsimProfileListInstanceOptions extends StObject {
    
    var eid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var simSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[EsimProfileStatus] = js.undefined
  }
  object EsimProfileListInstanceOptions {
    
    inline def apply(): EsimProfileListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EsimProfileListInstanceOptions]
    }
    
    extension [Self <: EsimProfileListInstanceOptions](x: Self) {
      
      inline def setEid(value: String): Self = StObject.set(x, "eid", value.asInstanceOf[js.Any])
      
      inline def setEidUndefined: Self = StObject.set(x, "eid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSimSid(value: String): Self = StObject.set(x, "simSid", value.asInstanceOf[js.Any])
      
      inline def setSimSidUndefined: Self = StObject.set(x, "simSid", js.undefined)
      
      inline def setStatus(value: EsimProfileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property eid - List the eSIM Profiles that have been associated with an EId
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property simSid - Find the eSIM Profile resource related to a Sim resource by providing the SIM SID
    * @property status - List the eSIM Profiles that are in a given status
    */
  trait EsimProfileListInstancePageOptions extends StObject {
    
    var eid: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var simSid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[EsimProfileStatus] = js.undefined
  }
  object EsimProfileListInstancePageOptions {
    
    inline def apply(): EsimProfileListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EsimProfileListInstancePageOptions]
    }
    
    extension [Self <: EsimProfileListInstancePageOptions](x: Self) {
      
      inline def setEid(value: String): Self = StObject.set(x, "eid", value.asInstanceOf[js.Any])
      
      inline def setEidUndefined: Self = StObject.set(x, "eid", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setSimSid(value: String): Self = StObject.set(x, "simSid", value.asInstanceOf[js.Any])
      
      inline def setSimSidUndefined: Self = StObject.set(x, "simSid", js.undefined)
      
      inline def setStatus(value: EsimProfileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait EsimProfilePayload
    extends StObject
       with EsimProfileResource
       with TwilioResponsePayload
  object EsimProfilePayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      eid: String,
      error_code: String,
      error_message: String,
      first_page_uri: String,
      iccid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      sim_sid: String,
      smdp_plus_address: String,
      status: EsimProfileStatus,
      uri: String,
      url: String
    ): EsimProfilePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], eid = eid.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], iccid = iccid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], smdp_plus_address = smdp_plus_address.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EsimProfilePayload]
    }
  }
  
  trait EsimProfileResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var eid: String
    
    var error_code: String
    
    var error_message: String
    
    var iccid: String
    
    var sid: String
    
    var sim_sid: String
    
    var smdp_plus_address: String
    
    var status: EsimProfileStatus
    
    var url: String
  }
  object EsimProfileResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      eid: String,
      error_code: String,
      error_message: String,
      iccid: String,
      sid: String,
      sim_sid: String,
      smdp_plus_address: String,
      status: EsimProfileStatus,
      url: String
    ): EsimProfileResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], eid = eid.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], iccid = iccid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], smdp_plus_address = smdp_plus_address.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EsimProfileResource]
    }
    
    extension [Self <: EsimProfileResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEid(value: String): Self = StObject.set(x, "eid", value.asInstanceOf[js.Any])
      
      inline def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
      
      inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSim_sid(value: String): Self = StObject.set(x, "sim_sid", value.asInstanceOf[js.Any])
      
      inline def setSmdp_plus_address(value: String): Self = StObject.set(x, "smdp_plus_address", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: EsimProfileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait EsimProfileSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`new`
    - typings.twilio.twilioStrings.reserving
    - typings.twilio.twilioStrings.available
    - typings.twilio.twilioStrings.downloaded
    - typings.twilio.twilioStrings.installed
    - typings.twilio.twilioStrings.failed__
  */
  trait EsimProfileStatus extends StObject
  object EsimProfileStatus {
    
    inline def available: typings.twilio.twilioStrings.available = "available".asInstanceOf[typings.twilio.twilioStrings.available]
    
    inline def downloaded: typings.twilio.twilioStrings.downloaded = "downloaded".asInstanceOf[typings.twilio.twilioStrings.downloaded]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def installed: typings.twilio.twilioStrings.installed = "installed".asInstanceOf[typings.twilio.twilioStrings.installed]
    
    inline def `new`: typings.twilio.twilioStrings.`new` = "new".asInstanceOf[typings.twilio.twilioStrings.`new`]
    
    inline def reserving: typings.twilio.twilioStrings.reserving = "reserving".asInstanceOf[typings.twilio.twilioStrings.reserving]
  }
}
