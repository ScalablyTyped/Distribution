package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1CommandMod {
  
  @JSImport("twilio/lib/rest/wireless/v1/command", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/wireless/v1/command", "CommandContext")
  @js.native
  open class CommandContext protected () extends StObject {
    /**
      * Initialize the CommandContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.wirelessV1Mod.^, sid: String) = this()
    
    /**
      * fetch a CommandInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CommandInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CommandInstance, Any]): js.Promise[CommandInstance] = js.native
    
    /**
      * remove a CommandInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ CommandInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/wireless/v1/command", "CommandInstance")
  @js.native
  open class CommandInstance protected () extends SerializableClass {
    /**
      * Initialize the CommandContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.wirelessV1Mod.^, payload: CommandPayload, sid: String) = this()
    
    /* private */ var _proxy: CommandContext = js.native
    
    var accountSid: String = js.native
    
    var command: String = js.native
    
    var commandMode: CommandCommandMode = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var deliveryReceiptRequested: Boolean = js.native
    
    var direction: CommandDirection = js.native
    
    /**
      * fetch a CommandInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CommandInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CommandInstance] = js.native
    
    /**
      * remove a CommandInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var simSid: String = js.native
    
    var status: CommandStatus = js.native
    
    var transport: CommandTransport = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the CommandList
    *
    * @param version - Version of the resource
    */
  inline def CommandList(version: typings.twilio.wirelessV1Mod.^): CommandListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("CommandList")(version.asInstanceOf[js.Any]).asInstanceOf[CommandListInstance]
  
  @JSImport("twilio/lib/rest/wireless/v1/command", "CommandPage")
  @js.native
  open class CommandPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.wirelessV1Mod.^, CommandPayload, CommandResource, CommandInstance] {
    /**
      * Initialize the CommandPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.wirelessV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CommandSolution
    ) = this()
    
    /**
      * Build an instance of CommandInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CommandPayload): CommandInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.text
    - typings.twilio.twilioStrings.binary
  */
  trait CommandCommandMode extends StObject
  object CommandCommandMode {
    
    inline def binary: typings.twilio.twilioStrings.binary = "binary".asInstanceOf[typings.twilio.twilioStrings.binary]
    
    inline def text: typings.twilio.twilioStrings.text = "text".asInstanceOf[typings.twilio.twilioStrings.text]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.from_sim
    - typings.twilio.twilioStrings.to_sim
  */
  trait CommandDirection extends StObject
  object CommandDirection {
    
    inline def from_sim: typings.twilio.twilioStrings.from_sim = "from_sim".asInstanceOf[typings.twilio.twilioStrings.from_sim]
    
    inline def to_sim: typings.twilio.twilioStrings.to_sim = "to_sim".asInstanceOf[typings.twilio.twilioStrings.to_sim]
  }
  
  @js.native
  trait CommandListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CommandContext = js.native
    
    /**
      * create a CommandInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: CommandListInstanceCreateOptions): js.Promise[CommandInstance] = js.native
    def create(
      opts: CommandListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ CommandInstance, Any]
    ): js.Promise[CommandInstance] = js.native
    
    /**
      * Streams CommandInstance records from the API.
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
          /* item */ CommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CommandListInstanceEachOptions): Unit = js.native
    def each(
      opts: CommandListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a command
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): CommandContext = js.native
    
    /**
      * Retrieve a single target page of CommandInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CommandPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ CommandPage, Any]): js.Promise[CommandPage] = js.native
    def getPage(targetUrl: String): js.Promise[CommandPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CommandPage, Any]
    ): js.Promise[CommandPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ CommandPage, Any]): js.Promise[CommandPage] = js.native
    
    /**
      * Lists CommandInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CommandInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CommandInstance], Any]): js.Promise[js.Array[CommandInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CommandInstance], Any]
    ): js.Promise[js.Array[CommandInstance]] = js.native
    def list(opts: CommandListInstanceOptions): js.Promise[js.Array[CommandInstance]] = js.native
    def list(
      opts: CommandListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CommandInstance], Any]
    ): js.Promise[js.Array[CommandInstance]] = js.native
    
    /**
      * Retrieve a single page of CommandInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CommandPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ CommandPage, Any]): js.Promise[CommandPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ CommandPage, Any]): js.Promise[CommandPage] = js.native
    def page(opts: CommandListInstancePageOptions): js.Promise[CommandPage] = js.native
    def page(
      opts: CommandListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CommandPage, Any]
    ): js.Promise[CommandPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property callbackMethod - The HTTP method we use to call callback_url
    * @property callbackUrl - he URL we call when the Command has finished sending
    * @property command - The message body of the Command or a Base64 encoded byte string in binary mode
    * @property commandMode - The mode to use when sending the SMS message
    * @property deliveryReceiptRequested - Whether to request delivery receipt from the recipient
    * @property includeSid - Whether to include the SID of the command in the message body
    * @property sim - The sid or unique_name of the SIM to send the Command to
    */
  trait CommandListInstanceCreateOptions extends StObject {
    
    var callbackMethod: js.UndefOr[String] = js.undefined
    
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var command: String
    
    var commandMode: js.UndefOr[CommandCommandMode] = js.undefined
    
    var deliveryReceiptRequested: js.UndefOr[Boolean] = js.undefined
    
    var includeSid: js.UndefOr[String] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
  }
  object CommandListInstanceCreateOptions {
    
    inline def apply(command: String): CommandListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandListInstanceCreateOptions]
    }
    
    extension [Self <: CommandListInstanceCreateOptions](x: Self) {
      
      inline def setCallbackMethod(value: String): Self = StObject.set(x, "callbackMethod", value.asInstanceOf[js.Any])
      
      inline def setCallbackMethodUndefined: Self = StObject.set(x, "callbackMethod", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandMode(value: CommandCommandMode): Self = StObject.set(x, "commandMode", value.asInstanceOf[js.Any])
      
      inline def setCommandModeUndefined: Self = StObject.set(x, "commandMode", js.undefined)
      
      inline def setDeliveryReceiptRequested(value: Boolean): Self = StObject.set(x, "deliveryReceiptRequested", value.asInstanceOf[js.Any])
      
      inline def setDeliveryReceiptRequestedUndefined: Self = StObject.set(x, "deliveryReceiptRequested", js.undefined)
      
      inline def setIncludeSid(value: String): Self = StObject.set(x, "includeSid", value.asInstanceOf[js.Any])
      
      inline def setIncludeSidUndefined: Self = StObject.set(x, "includeSid", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property direction - Only return Commands with this direction value
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
    * @property sim - The sid or unique_name of the Sim resources to read
    * @property status - The status of the resources to read
    * @property transport - Only return Commands with this transport value
    */
  trait CommandListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var direction: js.UndefOr[CommandDirection] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[CommandStatus] = js.undefined
    
    var transport: js.UndefOr[CommandTransport] = js.undefined
  }
  object CommandListInstanceEachOptions {
    
    inline def apply(): CommandListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandListInstanceEachOptions]
    }
    
    extension [Self <: CommandListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ CommandInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDirection(value: CommandDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStatus(value: CommandStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTransport(value: CommandTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property direction - Only return Commands with this direction value
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
    * @property sim - The sid or unique_name of the Sim resources to read
    * @property status - The status of the resources to read
    * @property transport - Only return Commands with this transport value
    */
  trait CommandListInstanceOptions extends StObject {
    
    var direction: js.UndefOr[CommandDirection] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[CommandStatus] = js.undefined
    
    var transport: js.UndefOr[CommandTransport] = js.undefined
  }
  object CommandListInstanceOptions {
    
    inline def apply(): CommandListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandListInstanceOptions]
    }
    
    extension [Self <: CommandListInstanceOptions](x: Self) {
      
      inline def setDirection(value: CommandDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStatus(value: CommandStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTransport(value: CommandTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property direction - Only return Commands with this direction value
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property sim - The sid or unique_name of the Sim resources to read
    * @property status - The status of the resources to read
    * @property transport - Only return Commands with this transport value
    */
  trait CommandListInstancePageOptions extends StObject {
    
    var direction: js.UndefOr[CommandDirection] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[CommandStatus] = js.undefined
    
    var transport: js.UndefOr[CommandTransport] = js.undefined
  }
  object CommandListInstancePageOptions {
    
    inline def apply(): CommandListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandListInstancePageOptions]
    }
    
    extension [Self <: CommandListInstancePageOptions](x: Self) {
      
      inline def setDirection(value: CommandDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStatus(value: CommandStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTransport(value: CommandTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  trait CommandPayload
    extends StObject
       with CommandResource
       with TwilioResponsePayload
  object CommandPayload {
    
    inline def apply(
      account_sid: String,
      command: String,
      command_mode: CommandCommandMode,
      date_created: js.Date,
      date_updated: js.Date,
      delivery_receipt_requested: Boolean,
      direction: CommandDirection,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      sim_sid: String,
      status: CommandStatus,
      transport: CommandTransport,
      uri: String,
      url: String
    ): CommandPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], command_mode = command_mode.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], delivery_receipt_requested = delivery_receipt_requested.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandPayload]
    }
  }
  
  trait CommandResource extends StObject {
    
    var account_sid: String
    
    var command: String
    
    var command_mode: CommandCommandMode
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var delivery_receipt_requested: Boolean
    
    var direction: CommandDirection
    
    var sid: String
    
    var sim_sid: String
    
    var status: CommandStatus
    
    var transport: CommandTransport
    
    var url: String
  }
  object CommandResource {
    
    inline def apply(
      account_sid: String,
      command: String,
      command_mode: CommandCommandMode,
      date_created: js.Date,
      date_updated: js.Date,
      delivery_receipt_requested: Boolean,
      direction: CommandDirection,
      sid: String,
      sim_sid: String,
      status: CommandStatus,
      transport: CommandTransport,
      url: String
    ): CommandResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], command_mode = command_mode.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], delivery_receipt_requested = delivery_receipt_requested.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandResource]
    }
    
    extension [Self <: CommandResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommand_mode(value: CommandCommandMode): Self = StObject.set(x, "command_mode", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDelivery_receipt_requested(value: Boolean): Self = StObject.set(x, "delivery_receipt_requested", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: CommandDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSim_sid(value: String): Self = StObject.set(x, "sim_sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: CommandStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: CommandTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.queued
    - typings.twilio.twilioStrings.sent
    - typings.twilio.twilioStrings.delivered
    - typings.twilio.twilioStrings.received
    - typings.twilio.twilioStrings.failed__
  */
  trait CommandStatus extends StObject
  object CommandStatus {
    
    inline def delivered: typings.twilio.twilioStrings.delivered = "delivered".asInstanceOf[typings.twilio.twilioStrings.delivered]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def queued: typings.twilio.twilioStrings.queued = "queued".asInstanceOf[typings.twilio.twilioStrings.queued]
    
    inline def received: typings.twilio.twilioStrings.received = "received".asInstanceOf[typings.twilio.twilioStrings.received]
    
    inline def sent: typings.twilio.twilioStrings.sent = "sent".asInstanceOf[typings.twilio.twilioStrings.sent]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.sms
    - typings.twilio.twilioStrings.ip
  */
  trait CommandTransport extends StObject
  object CommandTransport {
    
    inline def ip: typings.twilio.twilioStrings.ip = "ip".asInstanceOf[typings.twilio.twilioStrings.ip]
    
    inline def sms: typings.twilio.twilioStrings.sms = "sms".asInstanceOf[typings.twilio.twilioStrings.sms]
  }
}
