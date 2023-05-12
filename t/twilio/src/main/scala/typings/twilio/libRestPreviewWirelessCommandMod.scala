package typings.twilio

import typings.twilio.anon.Command
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewWirelessMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewWirelessCommandMod {
  
  @JSImport("twilio/lib/rest/preview/wireless/command", "CommandContextImpl")
  @js.native
  open class CommandContextImpl protected ()
    extends StObject
       with CommandContext {
    def this(_version: default, sid: String) = this()
    
    /* protected */ var _solution: CommandContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/wireless/command", "CommandInstance")
  @js.native
  open class CommandInstance protected () extends StObject {
    def this(_version: default, payload: CommandResource) = this()
    def this(_version: default, payload: CommandResource, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[CommandContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: CommandContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    var accountSid: String = js.native
    
    var command: String = js.native
    
    var commandMode: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var deviceSid: String = js.native
    
    var direction: String = js.native
    
    /**
      * Fetch a CommandInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed CommandInstance
      */
    def fetch(): js.Promise[CommandInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[CommandInstance] = js.native
    
    var sid: String = js.native
    
    var simSid: String = js.native
    
    var status: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): Command = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait CommandListInstance extends StObject {
    
    def apply(sid: String): CommandContext = js.native
    
    var _solution: CommandSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a CommandInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed CommandInstance
      */
    def create(params: CommandListInstanceCreateOptions): js.Promise[CommandInstance] = js.native
    def create(
      params: CommandListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[CommandInstance], Any]
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
      * @param { CommandListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ CommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: CommandListInstanceEachOptions): Unit = js.native
    def each(
      params: CommandListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): CommandContext = js.native
    
    /**
      * Retrieve a single target page of CommandInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[CommandPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CommandPage, Any]
    ): js.Promise[CommandPage] = js.native
    
    /**
      * Lists CommandInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { CommandListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CommandInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CommandInstance], Any]): js.Promise[js.Array[CommandInstance]] = js.native
    def list(params: CommandListInstanceOptions): js.Promise[js.Array[CommandInstance]] = js.native
    def list(
      params: CommandListInstanceOptions,
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
      * @param { CommandListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[CommandPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ CommandPage, Any]): js.Promise[CommandPage] = js.native
    def page(params: CommandListInstancePageOptions): js.Promise[CommandPage] = js.native
    def page(
      params: CommandListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CommandPage, Any]
    ): js.Promise[CommandPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object CommandListInstance {
    
    @JSImport("twilio/lib/rest/preview/wireless/command", "CommandListInstance")
    @js.native
    def apply(version: default): CommandListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/wireless/command", "CommandPage")
  @js.native
  open class CommandPage protected ()
    extends typings.twilio.libBasePageMod.default[default, CommandPayload, CommandResource, CommandInstance] {
    /**
      * Initialize the CommandPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: CommandSolution
    ) = this()
    
    /**
      * Build an instance of CommandInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CommandResource): CommandInstance = js.native
  }
  
  @js.native
  trait CommandContext extends StObject {
    
    /**
      * Fetch a CommandInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed CommandInstance
      */
    def fetch(): js.Promise[CommandInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[CommandInstance], Any]): js.Promise[CommandInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait CommandContextSolution extends StObject {
    
    var sid: String
  }
  object CommandContextSolution {
    
    inline def apply(sid: String): CommandContextSolution = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandContextSolution] (val x: Self) extends AnyVal {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandListInstanceCreateOptions extends StObject {
    
    /**  */
    var callbackMethod: js.UndefOr[String] = js.undefined
    
    /**  */
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    /**  */
    var command: String
    
    /**  */
    var commandMode: js.UndefOr[String] = js.undefined
    
    /**  */
    var device: js.UndefOr[String] = js.undefined
    
    /**  */
    var includeSid: js.UndefOr[String] = js.undefined
    
    /**  */
    var sim: js.UndefOr[String] = js.undefined
  }
  object CommandListInstanceCreateOptions {
    
    inline def apply(command: String): CommandListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
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
  
  trait CommandListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CommandInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /**  */
    var device: js.UndefOr[String] = js.undefined
    
    /**  */
    var direction: js.UndefOr[String] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /**  */
    var sim: js.UndefOr[String] = js.undefined
    
    /**  */
    var status: js.UndefOr[String] = js.undefined
  }
  object CommandListInstanceEachOptions {
    
    inline def apply(): CommandListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandListInstanceEachOptions] (val x: Self) extends AnyVal {
      
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
  
  trait CommandListInstanceOptions extends StObject {
    
    /**  */
    var device: js.UndefOr[String] = js.undefined
    
    /**  */
    var direction: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /**  */
    var sim: js.UndefOr[String] = js.undefined
    
    /**  */
    var status: js.UndefOr[String] = js.undefined
  }
  object CommandListInstanceOptions {
    
    inline def apply(): CommandListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandListInstanceOptions] (val x: Self) extends AnyVal {
      
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
  
  trait CommandListInstancePageOptions extends StObject {
    
    /**  */
    var device: js.UndefOr[String] = js.undefined
    
    /**  */
    var direction: js.UndefOr[String] = js.undefined
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
    
    /**  */
    var sim: js.UndefOr[String] = js.undefined
    
    /**  */
    var status: js.UndefOr[String] = js.undefined
  }
  object CommandListInstancePageOptions {
    
    inline def apply(): CommandListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandListInstancePageOptions] (val x: Self) extends AnyVal {
      
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
       with TwilioResponsePayload {
    
    var commands: js.Array[CommandResource]
  }
  object CommandPayload {
    
    inline def apply(
      commands: js.Array[CommandResource],
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): CommandPayload = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandPayload] (val x: Self) extends AnyVal {
      
      inline def setCommands(value: js.Array[CommandResource]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: CommandResource*): Self = StObject.set(x, "commands", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandResource] (val x: Self) extends AnyVal {
      
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
