package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipCommandMod {
  
  @JSImport("twilio/lib/rest/supersim/v1/ipCommand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/supersim/v1/ipCommand", "IpCommandContext")
  @js.native
  open class IpCommandContext protected () extends StObject {
    /**
      * Initialize the IpCommandContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, sid: String) = this()
    
    /**
      * fetch a IpCommandInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[IpCommandInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpCommandInstance, Any]): js.Promise[IpCommandInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/supersim/v1/ipCommand", "IpCommandInstance")
  @js.native
  open class IpCommandInstance protected () extends SerializableClass {
    /**
      * Initialize the IpCommandContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, payload: IpCommandPayload, sid: String) = this()
    
    /* private */ var _proxy: IpCommandContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var deviceIp: String = js.native
    
    var devicePort: Double = js.native
    
    var direction: IpCommandDirection = js.native
    
    /**
      * fetch a IpCommandInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[IpCommandInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[IpCommandInstance] = js.native
    
    var payload: String = js.native
    
    var payloadType: IpCommandPayloadType = js.native
    
    var sid: String = js.native
    
    var simIccid: String = js.native
    
    var simSid: String = js.native
    
    var status: IpCommandStatus = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the IpCommandList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def IpCommandList(version: typings.twilio.supersimV1Mod.^): IpCommandListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("IpCommandList")(version.asInstanceOf[js.Any]).asInstanceOf[IpCommandListInstance]
  
  @JSImport("twilio/lib/rest/supersim/v1/ipCommand", "IpCommandPage")
  @js.native
  open class IpCommandPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.supersimV1Mod.^, IpCommandPayload, IpCommandResource, IpCommandInstance] {
    /**
      * Initialize the IpCommandPage
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
      solution: IpCommandSolution
    ) = this()
    
    /**
      * Build an instance of IpCommandInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: IpCommandPayload): IpCommandInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.to_sim
    - typings.twilio.twilioStrings.from_sim
  */
  trait IpCommandDirection extends StObject
  object IpCommandDirection {
    
    inline def from_sim: typings.twilio.twilioStrings.from_sim = "from_sim".asInstanceOf[typings.twilio.twilioStrings.from_sim]
    
    inline def to_sim: typings.twilio.twilioStrings.to_sim = "to_sim".asInstanceOf[typings.twilio.twilioStrings.to_sim]
  }
  
  @js.native
  trait IpCommandListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): IpCommandContext = js.native
    
    /**
      * create a IpCommandInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: IpCommandListInstanceCreateOptions): js.Promise[IpCommandInstance] = js.native
    def create(
      opts: IpCommandListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ IpCommandInstance, Any]
    ): js.Promise[IpCommandInstance] = js.native
    
    /**
      * Streams IpCommandInstance records from the API.
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
          /* item */ IpCommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ IpCommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: IpCommandListInstanceEachOptions): Unit = js.native
    def each(
      opts: IpCommandListInstanceEachOptions,
      callback: js.Function2[
          /* item */ IpCommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a ip_command
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): IpCommandContext = js.native
    
    /**
      * Retrieve a single target page of IpCommandInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[IpCommandPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpCommandPage, Any]): js.Promise[IpCommandPage] = js.native
    def getPage(targetUrl: String): js.Promise[IpCommandPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpCommandPage, Any]
    ): js.Promise[IpCommandPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpCommandPage, Any]
    ): js.Promise[IpCommandPage] = js.native
    
    /**
      * Lists IpCommandInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[IpCommandInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[IpCommandInstance], Any]): js.Promise[js.Array[IpCommandInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[IpCommandInstance], Any]
    ): js.Promise[js.Array[IpCommandInstance]] = js.native
    def list(opts: IpCommandListInstanceOptions): js.Promise[js.Array[IpCommandInstance]] = js.native
    def list(
      opts: IpCommandListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[IpCommandInstance], Any]
    ): js.Promise[js.Array[IpCommandInstance]] = js.native
    
    /**
      * Retrieve a single page of IpCommandInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[IpCommandPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ IpCommandPage, Any]): js.Promise[IpCommandPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ IpCommandPage, Any]): js.Promise[IpCommandPage] = js.native
    def page(opts: IpCommandListInstancePageOptions): js.Promise[IpCommandPage] = js.native
    def page(
      opts: IpCommandListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ IpCommandPage, Any]
    ): js.Promise[IpCommandPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property callbackMethod - The HTTP method we should use to call callback_url
    * @property callbackUrl - The URL we should call after we have sent the IP Command
    * @property devicePort - The device port to which the IP Command will be sent
    * @property payload - The payload to be delivered to the device
    * @property payloadType - Indicates how the payload is encoded
    * @property sim - The sid or unique_name of the Super SIM to send the IP Command to
    */
  trait IpCommandListInstanceCreateOptions extends StObject {
    
    var callbackMethod: js.UndefOr[String] = js.undefined
    
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var devicePort: Double
    
    var payload: String
    
    var payloadType: js.UndefOr[IpCommandPayloadType] = js.undefined
    
    var sim: String
  }
  object IpCommandListInstanceCreateOptions {
    
    inline def apply(devicePort: Double, payload: String, sim: String): IpCommandListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(devicePort = devicePort.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], sim = sim.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpCommandListInstanceCreateOptions]
    }
    
    extension [Self <: IpCommandListInstanceCreateOptions](x: Self) {
      
      inline def setCallbackMethod(value: String): Self = StObject.set(x, "callbackMethod", value.asInstanceOf[js.Any])
      
      inline def setCallbackMethodUndefined: Self = StObject.set(x, "callbackMethod", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setDevicePort(value: Double): Self = StObject.set(x, "devicePort", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadType(value: IpCommandPayloadType): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
      
      inline def setPayloadTypeUndefined: Self = StObject.set(x, "payloadType", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property direction - The direction of the IP Command
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
    * @property sim - The SID or unique name of the Sim resource that IP Command was sent to or from.
    * @property simIccid - The ICCID of the Sim resource that IP Command was sent to or from.
    * @property status - The status of the IP Command
    */
  trait IpCommandListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ IpCommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var direction: js.UndefOr[IpCommandDirection] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var simIccid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[IpCommandStatus] = js.undefined
  }
  object IpCommandListInstanceEachOptions {
    
    inline def apply(): IpCommandListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpCommandListInstanceEachOptions]
    }
    
    extension [Self <: IpCommandListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ IpCommandInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDirection(value: IpCommandDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimIccid(value: String): Self = StObject.set(x, "simIccid", value.asInstanceOf[js.Any])
      
      inline def setSimIccidUndefined: Self = StObject.set(x, "simIccid", js.undefined)
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStatus(value: IpCommandStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property direction - The direction of the IP Command
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
    * @property sim - The SID or unique name of the Sim resource that IP Command was sent to or from.
    * @property simIccid - The ICCID of the Sim resource that IP Command was sent to or from.
    * @property status - The status of the IP Command
    */
  trait IpCommandListInstanceOptions extends StObject {
    
    var direction: js.UndefOr[IpCommandDirection] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var simIccid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[IpCommandStatus] = js.undefined
  }
  object IpCommandListInstanceOptions {
    
    inline def apply(): IpCommandListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpCommandListInstanceOptions]
    }
    
    extension [Self <: IpCommandListInstanceOptions](x: Self) {
      
      inline def setDirection(value: IpCommandDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimIccid(value: String): Self = StObject.set(x, "simIccid", value.asInstanceOf[js.Any])
      
      inline def setSimIccidUndefined: Self = StObject.set(x, "simIccid", js.undefined)
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStatus(value: IpCommandStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property direction - The direction of the IP Command
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property sim - The SID or unique name of the Sim resource that IP Command was sent to or from.
    * @property simIccid - The ICCID of the Sim resource that IP Command was sent to or from.
    * @property status - The status of the IP Command
    */
  trait IpCommandListInstancePageOptions extends StObject {
    
    var direction: js.UndefOr[IpCommandDirection] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var simIccid: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[IpCommandStatus] = js.undefined
  }
  object IpCommandListInstancePageOptions {
    
    inline def apply(): IpCommandListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpCommandListInstancePageOptions]
    }
    
    extension [Self <: IpCommandListInstancePageOptions](x: Self) {
      
      inline def setDirection(value: IpCommandDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimIccid(value: String): Self = StObject.set(x, "simIccid", value.asInstanceOf[js.Any])
      
      inline def setSimIccidUndefined: Self = StObject.set(x, "simIccid", js.undefined)
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStatus(value: IpCommandStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait IpCommandPayload
    extends StObject
       with IpCommandResource
       with TwilioResponsePayload
  object IpCommandPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      device_ip: String,
      device_port: Double,
      direction: IpCommandDirection,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      payload: String,
      payload_type: IpCommandPayloadType,
      previous_page_uri: String,
      sid: String,
      sim_iccid: String,
      sim_sid: String,
      status: IpCommandStatus,
      uri: String,
      url: String
    ): IpCommandPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], device_ip = device_ip.asInstanceOf[js.Any], device_port = device_port.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], payload_type = payload_type.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_iccid = sim_iccid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpCommandPayload]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.text
    - typings.twilio.twilioStrings.binary
  */
  trait IpCommandPayloadType extends StObject
  object IpCommandPayloadType {
    
    inline def binary: typings.twilio.twilioStrings.binary = "binary".asInstanceOf[typings.twilio.twilioStrings.binary]
    
    inline def text: typings.twilio.twilioStrings.text = "text".asInstanceOf[typings.twilio.twilioStrings.text]
  }
  
  trait IpCommandResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var device_ip: String
    
    var device_port: Double
    
    var direction: IpCommandDirection
    
    var payload: String
    
    var payload_type: IpCommandPayloadType
    
    var sid: String
    
    var sim_iccid: String
    
    var sim_sid: String
    
    var status: IpCommandStatus
    
    var url: String
  }
  object IpCommandResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      device_ip: String,
      device_port: Double,
      direction: IpCommandDirection,
      payload: String,
      payload_type: IpCommandPayloadType,
      sid: String,
      sim_iccid: String,
      sim_sid: String,
      status: IpCommandStatus,
      url: String
    ): IpCommandResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], device_ip = device_ip.asInstanceOf[js.Any], device_port = device_port.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], payload_type = payload_type.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_iccid = sim_iccid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpCommandResource]
    }
    
    extension [Self <: IpCommandResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDevice_ip(value: String): Self = StObject.set(x, "device_ip", value.asInstanceOf[js.Any])
      
      inline def setDevice_port(value: Double): Self = StObject.set(x, "device_port", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: IpCommandDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayload_type(value: IpCommandPayloadType): Self = StObject.set(x, "payload_type", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSim_iccid(value: String): Self = StObject.set(x, "sim_iccid", value.asInstanceOf[js.Any])
      
      inline def setSim_sid(value: String): Self = StObject.set(x, "sim_sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: IpCommandStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IpCommandSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.queued
    - typings.twilio.twilioStrings.sent
    - typings.twilio.twilioStrings.received
    - typings.twilio.twilioStrings.failed__
  */
  trait IpCommandStatus extends StObject
  object IpCommandStatus {
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def queued: typings.twilio.twilioStrings.queued = "queued".asInstanceOf[typings.twilio.twilioStrings.queued]
    
    inline def received: typings.twilio.twilioStrings.received = "received".asInstanceOf[typings.twilio.twilioStrings.received]
    
    inline def sent: typings.twilio.twilioStrings.sent = "sent".asInstanceOf[typings.twilio.twilioStrings.sent]
  }
}
