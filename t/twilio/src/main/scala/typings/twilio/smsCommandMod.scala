package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smsCommandMod {
  
  @JSImport("twilio/lib/rest/supersim/v1/smsCommand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/supersim/v1/smsCommand", "SmsCommandContext")
  @js.native
  open class SmsCommandContext protected () extends StObject {
    /**
      * Initialize the SmsCommandContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, sid: String) = this()
    
    /**
      * fetch a SmsCommandInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SmsCommandInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SmsCommandInstance, Any]): js.Promise[SmsCommandInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/supersim/v1/smsCommand", "SmsCommandInstance")
  @js.native
  open class SmsCommandInstance protected () extends SerializableClass {
    /**
      * Initialize the SmsCommandContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, payload: SmsCommandPayload, sid: String) = this()
    
    /* private */ var _proxy: SmsCommandContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var direction: SmsCommandDirection = js.native
    
    /**
      * fetch a SmsCommandInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SmsCommandInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SmsCommandInstance] = js.native
    
    var payload: String = js.native
    
    var sid: String = js.native
    
    var simSid: String = js.native
    
    var status: SmsCommandStatus = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SmsCommandList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def SmsCommandList(version: typings.twilio.supersimV1Mod.^): SmsCommandListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("SmsCommandList")(version.asInstanceOf[js.Any]).asInstanceOf[SmsCommandListInstance]
  
  @JSImport("twilio/lib/rest/supersim/v1/smsCommand", "SmsCommandPage")
  @js.native
  open class SmsCommandPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.supersimV1Mod.^, 
          SmsCommandPayload, 
          SmsCommandResource, 
          SmsCommandInstance
        ] {
    /**
      * Initialize the SmsCommandPage
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
      solution: SmsCommandSolution
    ) = this()
    
    /**
      * Build an instance of SmsCommandInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SmsCommandPayload): SmsCommandInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.to_sim
    - typings.twilio.twilioStrings.from_sim
  */
  trait SmsCommandDirection extends StObject
  object SmsCommandDirection {
    
    inline def from_sim: typings.twilio.twilioStrings.from_sim = "from_sim".asInstanceOf[typings.twilio.twilioStrings.from_sim]
    
    inline def to_sim: typings.twilio.twilioStrings.to_sim = "to_sim".asInstanceOf[typings.twilio.twilioStrings.to_sim]
  }
  
  @js.native
  trait SmsCommandListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SmsCommandContext = js.native
    
    /**
      * create a SmsCommandInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: SmsCommandListInstanceCreateOptions): js.Promise[SmsCommandInstance] = js.native
    def create(
      opts: SmsCommandListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SmsCommandInstance, Any]
    ): js.Promise[SmsCommandInstance] = js.native
    
    /**
      * Streams SmsCommandInstance records from the API.
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
          /* item */ SmsCommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SmsCommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SmsCommandListInstanceEachOptions): Unit = js.native
    def each(
      opts: SmsCommandListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SmsCommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a sms_command
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): SmsCommandContext = js.native
    
    /**
      * Retrieve a single target page of SmsCommandInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SmsCommandPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SmsCommandPage, Any]): js.Promise[SmsCommandPage] = js.native
    def getPage(targetUrl: String): js.Promise[SmsCommandPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SmsCommandPage, Any]
    ): js.Promise[SmsCommandPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SmsCommandPage, Any]
    ): js.Promise[SmsCommandPage] = js.native
    
    /**
      * Lists SmsCommandInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SmsCommandInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SmsCommandInstance], Any]): js.Promise[js.Array[SmsCommandInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SmsCommandInstance], Any]
    ): js.Promise[js.Array[SmsCommandInstance]] = js.native
    def list(opts: SmsCommandListInstanceOptions): js.Promise[js.Array[SmsCommandInstance]] = js.native
    def list(
      opts: SmsCommandListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SmsCommandInstance], Any]
    ): js.Promise[js.Array[SmsCommandInstance]] = js.native
    
    /**
      * Retrieve a single page of SmsCommandInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SmsCommandPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SmsCommandPage, Any]): js.Promise[SmsCommandPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SmsCommandPage, Any]): js.Promise[SmsCommandPage] = js.native
    def page(opts: SmsCommandListInstancePageOptions): js.Promise[SmsCommandPage] = js.native
    def page(
      opts: SmsCommandListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SmsCommandPage, Any]
    ): js.Promise[SmsCommandPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property callbackMethod - The HTTP method we should use to call callback_url
    * @property callbackUrl - The URL we should call after we have sent the command
    * @property payload - The message body of the SMS Command
    * @property sim - The sid or unique_name of the SIM to send the SMS Command to
    */
  trait SmsCommandListInstanceCreateOptions extends StObject {
    
    var callbackMethod: js.UndefOr[String] = js.undefined
    
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var payload: String
    
    var sim: String
  }
  object SmsCommandListInstanceCreateOptions {
    
    inline def apply(payload: String, sim: String): SmsCommandListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], sim = sim.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmsCommandListInstanceCreateOptions]
    }
    
    extension [Self <: SmsCommandListInstanceCreateOptions](x: Self) {
      
      inline def setCallbackMethod(value: String): Self = StObject.set(x, "callbackMethod", value.asInstanceOf[js.Any])
      
      inline def setCallbackMethodUndefined: Self = StObject.set(x, "callbackMethod", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property direction - The direction of the SMS Command
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
    * @property sim - The SID or unique name of the Sim resource that SMS Command was sent to or from.
    * @property status - The status of the SMS Command
    */
  trait SmsCommandListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SmsCommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var direction: js.UndefOr[SmsCommandDirection] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[SmsCommandStatus] = js.undefined
  }
  object SmsCommandListInstanceEachOptions {
    
    inline def apply(): SmsCommandListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmsCommandListInstanceEachOptions]
    }
    
    extension [Self <: SmsCommandListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SmsCommandInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDirection(value: SmsCommandDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStatus(value: SmsCommandStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property direction - The direction of the SMS Command
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
    * @property sim - The SID or unique name of the Sim resource that SMS Command was sent to or from.
    * @property status - The status of the SMS Command
    */
  trait SmsCommandListInstanceOptions extends StObject {
    
    var direction: js.UndefOr[SmsCommandDirection] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[SmsCommandStatus] = js.undefined
  }
  object SmsCommandListInstanceOptions {
    
    inline def apply(): SmsCommandListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmsCommandListInstanceOptions]
    }
    
    extension [Self <: SmsCommandListInstanceOptions](x: Self) {
      
      inline def setDirection(value: SmsCommandDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStatus(value: SmsCommandStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property direction - The direction of the SMS Command
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property sim - The SID or unique name of the Sim resource that SMS Command was sent to or from.
    * @property status - The status of the SMS Command
    */
  trait SmsCommandListInstancePageOptions extends StObject {
    
    var direction: js.UndefOr[SmsCommandDirection] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[SmsCommandStatus] = js.undefined
  }
  object SmsCommandListInstancePageOptions {
    
    inline def apply(): SmsCommandListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmsCommandListInstancePageOptions]
    }
    
    extension [Self <: SmsCommandListInstancePageOptions](x: Self) {
      
      inline def setDirection(value: SmsCommandDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStatus(value: SmsCommandStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait SmsCommandPayload
    extends StObject
       with SmsCommandResource
       with TwilioResponsePayload
  object SmsCommandPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      direction: SmsCommandDirection,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      payload: String,
      previous_page_uri: String,
      sid: String,
      sim_sid: String,
      status: SmsCommandStatus,
      uri: String,
      url: String
    ): SmsCommandPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmsCommandPayload]
    }
  }
  
  trait SmsCommandResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var direction: SmsCommandDirection
    
    var payload: String
    
    var sid: String
    
    var sim_sid: String
    
    var status: SmsCommandStatus
    
    var url: String
  }
  object SmsCommandResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      direction: SmsCommandDirection,
      payload: String,
      sid: String,
      sim_sid: String,
      status: SmsCommandStatus,
      url: String
    ): SmsCommandResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmsCommandResource]
    }
    
    extension [Self <: SmsCommandResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: SmsCommandDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSim_sid(value: String): Self = StObject.set(x, "sim_sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: SmsCommandStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SmsCommandSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.queued
    - typings.twilio.twilioStrings.sent
    - typings.twilio.twilioStrings.delivered
    - typings.twilio.twilioStrings.received
    - typings.twilio.twilioStrings.failed__
  */
  trait SmsCommandStatus extends StObject
  object SmsCommandStatus {
    
    inline def delivered: typings.twilio.twilioStrings.delivered = "delivered".asInstanceOf[typings.twilio.twilioStrings.delivered]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def queued: typings.twilio.twilioStrings.queued = "queued".asInstanceOf[typings.twilio.twilioStrings.queued]
    
    inline def received: typings.twilio.twilioStrings.received = "received".asInstanceOf[typings.twilio.twilioStrings.received]
    
    inline def sent: typings.twilio.twilioStrings.sent = "sent".asInstanceOf[typings.twilio.twilioStrings.sent]
  }
}
