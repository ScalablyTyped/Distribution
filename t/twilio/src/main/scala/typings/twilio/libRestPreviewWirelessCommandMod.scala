package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewWirelessCommandMod {
  
  @JSImport("twilio/lib/rest/preview/wireless/command", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/wireless/command", "CommandContext")
  @js.native
  open class CommandContext protected () extends StObject {
    /**
      * Initialize the CommandContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param sid - The sid
      */
    def this(version: typings.twilio.libRestPreviewWirelessMod.^, sid: String) = this()
    
    /**
      * fetch a CommandInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CommandInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CommandInstance, Any]): js.Promise[CommandInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/wireless/command", "CommandInstance")
  @js.native
  open class CommandInstance protected () extends SerializableClass {
    /**
      * Initialize the CommandContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The sid
      */
    def this(version: typings.twilio.libRestPreviewWirelessMod.^, payload: CommandPayload, sid: String) = this()
    
    /* private */ var _proxy: CommandContext = js.native
    
    var accountSid: String = js.native
    
    var command: String = js.native
    
    var commandMode: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var deviceSid: String = js.native
    
    var direction: String = js.native
    
    /**
      * fetch a CommandInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CommandInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CommandInstance] = js.native
    
    var sid: String = js.native
    
    var simSid: String = js.native
    
    var status: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the CommandList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def CommandList(version: typings.twilio.libRestPreviewWirelessMod.^): CommandListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("CommandList")(version.asInstanceOf[js.Any]).asInstanceOf[CommandListInstance]
  
  @JSImport("twilio/lib/rest/preview/wireless/command", "CommandPage")
  @js.native
  open class CommandPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewWirelessMod.^, 
          CommandPayload, 
          CommandResource, 
          CommandInstance
        ] {
    /**
      * Initialize the CommandPage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.libRestPreviewWirelessMod.^,
      response: typings.twilio.libHttpResponseMod.^[String],
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
      * @param sid - The sid
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
    * @property callbackMethod - The callback_method
    * @property callbackUrl - The callback_url
    * @property command - The command
    * @property commandMode - The command_mode
    * @property device - The device
    * @property includeSid - The include_sid
    * @property sim - The sim
    */
  trait CommandListInstanceCreateOptions extends StObject {
    
    var callbackMethod: js.UndefOr[String] = js.undefined
    
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var command: String
    
    var commandMode: js.UndefOr[String] = js.undefined
    
    var device: js.UndefOr[String] = js.undefined
    
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
      
      inline def setCommandMode(value: String): Self = StObject.set(x, "commandMode", value.asInstanceOf[js.Any])
      
      inline def setCommandModeUndefined: Self = StObject.set(x, "commandMode", js.undefined)
      
      inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
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
    * @property device - The device
    * @property direction - The direction
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
    * @property sim - The sim
    * @property status - The status
    */
  trait CommandListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var device: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
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
      
      inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property device - The device
    * @property direction - The direction
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
    * @property sim - The sim
    * @property status - The status
    */
  trait CommandListInstanceOptions extends StObject {
    
    var device: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
  }
  object CommandListInstanceOptions {
    
    inline def apply(): CommandListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandListInstanceOptions]
    }
    
    extension [Self <: CommandListInstanceOptions](x: Self) {
      
      inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property device - The device
    * @property direction - The direction
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property sim - The sim
    * @property status - The status
    */
  trait CommandListInstancePageOptions extends StObject {
    
    var device: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var sim: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
  }
  object CommandListInstancePageOptions {
    
    inline def apply(): CommandListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandListInstancePageOptions]
    }
    
    extension [Self <: CommandListInstancePageOptions](x: Self) {
      
      inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setSim(value: String): Self = StObject.set(x, "sim", value.asInstanceOf[js.Any])
      
      inline def setSimUndefined: Self = StObject.set(x, "sim", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
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
      command_mode: String,
      date_created: js.Date,
      date_updated: js.Date,
      device_sid: String,
      direction: String,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      sim_sid: String,
      status: String,
      uri: String,
      url: String
    ): CommandPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], command_mode = command_mode.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], device_sid = device_sid.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandPayload]
    }
  }
  
  trait CommandResource extends StObject {
    
    var account_sid: String
    
    var command: String
    
    var command_mode: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var device_sid: String
    
    var direction: String
    
    var sid: String
    
    var sim_sid: String
    
    var status: String
    
    var url: String
  }
  object CommandResource {
    
    inline def apply(
      account_sid: String,
      command: String,
      command_mode: String,
      date_created: js.Date,
      date_updated: js.Date,
      device_sid: String,
      direction: String,
      sid: String,
      sim_sid: String,
      status: String,
      url: String
    ): CommandResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], command_mode = command_mode.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], device_sid = device_sid.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sim_sid = sim_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandResource]
    }
    
    extension [Self <: CommandResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommand_mode(value: String): Self = StObject.set(x, "command_mode", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDevice_sid(value: String): Self = StObject.set(x, "device_sid", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSim_sid(value: String): Self = StObject.set(x, "sim_sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandSolution extends StObject
}
