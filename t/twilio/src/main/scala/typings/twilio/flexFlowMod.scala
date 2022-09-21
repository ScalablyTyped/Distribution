package typings.twilio

import typings.twilio.anon.Channel
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexFlowMod {
  
  @JSImport("twilio/lib/rest/flexApi/v1/flexFlow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/flexApi/v1/flexFlow", "FlexFlowContext")
  @js.native
  open class FlexFlowContext protected () extends StObject {
    /**
      * Initialize the FlexFlowContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.flexApiV1Mod.^, sid: String) = this()
    
    /**
      * fetch a FlexFlowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FlexFlowInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FlexFlowInstance, Any]): js.Promise[FlexFlowInstance] = js.native
    
    /**
      * remove a FlexFlowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ FlexFlowInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a FlexFlowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[FlexFlowInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ FlexFlowInstance, Any]): js.Promise[FlexFlowInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FlexFlowInstance, Any]): js.Promise[FlexFlowInstance] = js.native
    def update(opts: FlexFlowInstanceUpdateOptions): js.Promise[FlexFlowInstance] = js.native
    def update(
      opts: FlexFlowInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FlexFlowInstance, Any]
    ): js.Promise[FlexFlowInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/flexApi/v1/flexFlow", "FlexFlowInstance")
  @js.native
  open class FlexFlowInstance protected () extends SerializableClass {
    /**
      * Initialize the FlexFlowContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.flexApiV1Mod.^, payload: FlexFlowPayload, sid: String) = this()
    
    /* private */ var _proxy: FlexFlowContext = js.native
    
    var accountSid: String = js.native
    
    var channelType: FlexFlowChannelType = js.native
    
    var chatServiceSid: String = js.native
    
    var contactIdentity: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var enabled: Boolean = js.native
    
    /**
      * fetch a FlexFlowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FlexFlowInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FlexFlowInstance] = js.native
    
    var friendlyName: String = js.native
    
    var integration: Any = js.native
    
    var integrationType: FlexFlowIntegrationType = js.native
    
    var janitorEnabled: Boolean = js.native
    
    var longLived: Boolean = js.native
    
    /**
      * remove a FlexFlowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * update a FlexFlowInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[FlexFlowInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FlexFlowInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FlexFlowInstance] = js.native
    def update(opts: FlexFlowInstanceUpdateOptions): js.Promise[FlexFlowInstance] = js.native
    def update(
      opts: FlexFlowInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[FlexFlowInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the FlexFlowList
    *
    * @param version - Version of the resource
    */
  inline def FlexFlowList(version: typings.twilio.flexApiV1Mod.^): FlexFlowListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("FlexFlowList")(version.asInstanceOf[js.Any]).asInstanceOf[FlexFlowListInstance]
  
  @JSImport("twilio/lib/rest/flexApi/v1/flexFlow", "FlexFlowPage")
  @js.native
  open class FlexFlowPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.flexApiV1Mod.^, FlexFlowPayload, FlexFlowResource, FlexFlowInstance] {
    /**
      * Initialize the FlexFlowPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.flexApiV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: FlexFlowSolution
    ) = this()
    
    /**
      * Build an instance of FlexFlowInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FlexFlowPayload): FlexFlowInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.web
    - typings.twilio.twilioStrings.sms
    - typings.twilio.twilioStrings.facebook
    - typings.twilio.twilioStrings.whatsapp
    - typings.twilio.twilioStrings.line
    - typings.twilio.twilioStrings.custom
  */
  trait FlexFlowChannelType extends StObject
  object FlexFlowChannelType {
    
    inline def custom: typings.twilio.twilioStrings.custom = "custom".asInstanceOf[typings.twilio.twilioStrings.custom]
    
    inline def facebook: typings.twilio.twilioStrings.facebook = "facebook".asInstanceOf[typings.twilio.twilioStrings.facebook]
    
    inline def line: typings.twilio.twilioStrings.line = "line".asInstanceOf[typings.twilio.twilioStrings.line]
    
    inline def sms: typings.twilio.twilioStrings.sms = "sms".asInstanceOf[typings.twilio.twilioStrings.sms]
    
    inline def web: typings.twilio.twilioStrings.web = "web".asInstanceOf[typings.twilio.twilioStrings.web]
    
    inline def whatsapp: typings.twilio.twilioStrings.whatsapp = "whatsapp".asInstanceOf[typings.twilio.twilioStrings.whatsapp]
  }
  
  /**
    * Options to pass to update
    *
    * @property channelType - The channel type
    * @property chatServiceSid - The SID of the chat service
    * @property contactIdentity - The channel contact's Identity
    * @property enabled - Whether the new Flex Flow is enabled
    * @property friendlyName - A string to describe the resource
    * @property integration.channel - The Task Channel for a new Task
    * @property integration.creationOnMessage - Whether to create a Task when the first message arrives
    * @property integration.flowSid - The SID of the Studio Flow
    * @property integration.priority - The Task priority of a new Task
    * @property integration.retryCount - The number of times to retry the Studio Flow or webhook in case of failure
    * @property integration.timeout - The Task timeout in seconds for a new Task
    * @property integration.url - The External Webhook URL
    * @property integration.workflowSid - The Workflow SID for a new Task
    * @property integration.workspaceSid - The Workspace SID for a new Task
    * @property integrationType - The software that will handle inbound messages.
    * @property janitorEnabled - Remove active Proxy sessions if the corresponding Task is deleted
    * @property longLived - Reuse this chat channel for future interactions with a contact
    */
  trait FlexFlowInstanceUpdateOptions extends StObject {
    
    var channelType: js.UndefOr[FlexFlowChannelType] = js.undefined
    
    var chatServiceSid: js.UndefOr[String] = js.undefined
    
    var contactIdentity: js.UndefOr[String] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var integration: js.UndefOr[Channel] = js.undefined
    
    var integrationType: js.UndefOr[FlexFlowIntegrationType] = js.undefined
    
    var janitorEnabled: js.UndefOr[Boolean] = js.undefined
    
    var longLived: js.UndefOr[Boolean] = js.undefined
  }
  object FlexFlowInstanceUpdateOptions {
    
    inline def apply(): FlexFlowInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexFlowInstanceUpdateOptions]
    }
    
    extension [Self <: FlexFlowInstanceUpdateOptions](x: Self) {
      
      inline def setChannelType(value: FlexFlowChannelType): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
      
      inline def setChannelTypeUndefined: Self = StObject.set(x, "channelType", js.undefined)
      
      inline def setChatServiceSid(value: String): Self = StObject.set(x, "chatServiceSid", value.asInstanceOf[js.Any])
      
      inline def setChatServiceSidUndefined: Self = StObject.set(x, "chatServiceSid", js.undefined)
      
      inline def setContactIdentity(value: String): Self = StObject.set(x, "contactIdentity", value.asInstanceOf[js.Any])
      
      inline def setContactIdentityUndefined: Self = StObject.set(x, "contactIdentity", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIntegration(value: Channel): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
      
      inline def setIntegrationType(value: FlexFlowIntegrationType): Self = StObject.set(x, "integrationType", value.asInstanceOf[js.Any])
      
      inline def setIntegrationTypeUndefined: Self = StObject.set(x, "integrationType", js.undefined)
      
      inline def setIntegrationUndefined: Self = StObject.set(x, "integration", js.undefined)
      
      inline def setJanitorEnabled(value: Boolean): Self = StObject.set(x, "janitorEnabled", value.asInstanceOf[js.Any])
      
      inline def setJanitorEnabledUndefined: Self = StObject.set(x, "janitorEnabled", js.undefined)
      
      inline def setLongLived(value: Boolean): Self = StObject.set(x, "longLived", value.asInstanceOf[js.Any])
      
      inline def setLongLivedUndefined: Self = StObject.set(x, "longLived", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.studio
    - typings.twilio.twilioStrings.external
    - typings.twilio.twilioStrings.task
  */
  trait FlexFlowIntegrationType extends StObject
  object FlexFlowIntegrationType {
    
    inline def external: typings.twilio.twilioStrings.external = "external".asInstanceOf[typings.twilio.twilioStrings.external]
    
    inline def studio: typings.twilio.twilioStrings.studio = "studio".asInstanceOf[typings.twilio.twilioStrings.studio]
    
    inline def task: typings.twilio.twilioStrings.task = "task".asInstanceOf[typings.twilio.twilioStrings.task]
  }
  
  @js.native
  trait FlexFlowListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FlexFlowContext = js.native
    
    /**
      * create a FlexFlowInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: FlexFlowListInstanceCreateOptions): js.Promise[FlexFlowInstance] = js.native
    def create(
      opts: FlexFlowListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ FlexFlowInstance, Any]
    ): js.Promise[FlexFlowInstance] = js.native
    
    /**
      * Streams FlexFlowInstance records from the API.
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
          /* item */ FlexFlowInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ FlexFlowInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: FlexFlowListInstanceEachOptions): Unit = js.native
    def each(
      opts: FlexFlowListInstanceEachOptions,
      callback: js.Function2[
          /* item */ FlexFlowInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a flex_flow
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): FlexFlowContext = js.native
    
    /**
      * Retrieve a single target page of FlexFlowInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[FlexFlowPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ FlexFlowPage, Any]): js.Promise[FlexFlowPage] = js.native
    def getPage(targetUrl: String): js.Promise[FlexFlowPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FlexFlowPage, Any]
    ): js.Promise[FlexFlowPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FlexFlowPage, Any]
    ): js.Promise[FlexFlowPage] = js.native
    
    /**
      * Lists FlexFlowInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[FlexFlowInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FlexFlowInstance], Any]): js.Promise[js.Array[FlexFlowInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FlexFlowInstance], Any]
    ): js.Promise[js.Array[FlexFlowInstance]] = js.native
    def list(opts: FlexFlowListInstanceOptions): js.Promise[js.Array[FlexFlowInstance]] = js.native
    def list(
      opts: FlexFlowListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FlexFlowInstance], Any]
    ): js.Promise[js.Array[FlexFlowInstance]] = js.native
    
    /**
      * Retrieve a single page of FlexFlowInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[FlexFlowPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ FlexFlowPage, Any]): js.Promise[FlexFlowPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FlexFlowPage, Any]): js.Promise[FlexFlowPage] = js.native
    def page(opts: FlexFlowListInstancePageOptions): js.Promise[FlexFlowPage] = js.native
    def page(
      opts: FlexFlowListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FlexFlowPage, Any]
    ): js.Promise[FlexFlowPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property channelType - The channel type
    * @property chatServiceSid - The SID of the chat service
    * @property contactIdentity - The channel contact's Identity
    * @property enabled - Whether the new Flex Flow is enabled
    * @property friendlyName - A string to describe the resource
    * @property integration.channel - The Task Channel for a new Task
    * @property integration.creationOnMessage - Whether to create a Task when the first message arrives
    * @property integration.flowSid - The SID of the Studio Flow
    * @property integration.priority - The Task priority of a new Task
    * @property integration.retryCount - The number of times to retry the Studio Flow or webhook in case of failure
    * @property integration.timeout - The Task timeout in seconds for a new Task
    * @property integration.url - The External Webhook URL
    * @property integration.workflowSid - The Workflow SID for a new Task
    * @property integration.workspaceSid - The Workspace SID for a new Task
    * @property integrationType - The software that will handle inbound messages.
    * @property janitorEnabled - Remove active Proxy sessions if the corresponding Task is deleted
    * @property longLived - Reuse this chat channel for future interactions with a contact
    */
  trait FlexFlowListInstanceCreateOptions extends StObject {
    
    var channelType: FlexFlowChannelType
    
    var chatServiceSid: String
    
    var contactIdentity: js.UndefOr[String] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: String
    
    var integration: js.UndefOr[Channel] = js.undefined
    
    var integrationType: js.UndefOr[FlexFlowIntegrationType] = js.undefined
    
    var janitorEnabled: js.UndefOr[Boolean] = js.undefined
    
    var longLived: js.UndefOr[Boolean] = js.undefined
  }
  object FlexFlowListInstanceCreateOptions {
    
    inline def apply(channelType: FlexFlowChannelType, chatServiceSid: String, friendlyName: String): FlexFlowListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(channelType = channelType.asInstanceOf[js.Any], chatServiceSid = chatServiceSid.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlexFlowListInstanceCreateOptions]
    }
    
    extension [Self <: FlexFlowListInstanceCreateOptions](x: Self) {
      
      inline def setChannelType(value: FlexFlowChannelType): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
      
      inline def setChatServiceSid(value: String): Self = StObject.set(x, "chatServiceSid", value.asInstanceOf[js.Any])
      
      inline def setContactIdentity(value: String): Self = StObject.set(x, "contactIdentity", value.asInstanceOf[js.Any])
      
      inline def setContactIdentityUndefined: Self = StObject.set(x, "contactIdentity", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setIntegration(value: Channel): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
      
      inline def setIntegrationType(value: FlexFlowIntegrationType): Self = StObject.set(x, "integrationType", value.asInstanceOf[js.Any])
      
      inline def setIntegrationTypeUndefined: Self = StObject.set(x, "integrationType", js.undefined)
      
      inline def setIntegrationUndefined: Self = StObject.set(x, "integration", js.undefined)
      
      inline def setJanitorEnabled(value: Boolean): Self = StObject.set(x, "janitorEnabled", value.asInstanceOf[js.Any])
      
      inline def setJanitorEnabledUndefined: Self = StObject.set(x, "janitorEnabled", js.undefined)
      
      inline def setLongLived(value: Boolean): Self = StObject.set(x, "longLived", value.asInstanceOf[js.Any])
      
      inline def setLongLivedUndefined: Self = StObject.set(x, "longLived", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - The `friendly_name` of the Flex Flow resources to read
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
  trait FlexFlowListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ FlexFlowInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FlexFlowListInstanceEachOptions {
    
    inline def apply(): FlexFlowListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexFlowListInstanceEachOptions]
    }
    
    extension [Self <: FlexFlowListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ FlexFlowInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
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
    * @property friendlyName - The `friendly_name` of the Flex Flow resources to read
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
  trait FlexFlowListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FlexFlowListInstanceOptions {
    
    inline def apply(): FlexFlowListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexFlowListInstanceOptions]
    }
    
    extension [Self <: FlexFlowListInstanceOptions](x: Self) {
      
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
    * @property friendlyName - The `friendly_name` of the Flex Flow resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait FlexFlowListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object FlexFlowListInstancePageOptions {
    
    inline def apply(): FlexFlowListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexFlowListInstancePageOptions]
    }
    
    extension [Self <: FlexFlowListInstancePageOptions](x: Self) {
      
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
  
  trait FlexFlowPayload
    extends StObject
       with FlexFlowResource
       with TwilioResponsePayload
  object FlexFlowPayload {
    
    inline def apply(
      account_sid: String,
      channel_type: FlexFlowChannelType,
      chat_service_sid: String,
      contact_identity: String,
      date_created: js.Date,
      date_updated: js.Date,
      enabled: Boolean,
      first_page_uri: String,
      friendly_name: String,
      integration: js.Object,
      integration_type: FlexFlowIntegrationType,
      janitor_enabled: Boolean,
      long_lived: Boolean,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): FlexFlowPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_type = channel_type.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], contact_identity = contact_identity.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], integration = integration.asInstanceOf[js.Any], integration_type = integration_type.asInstanceOf[js.Any], janitor_enabled = janitor_enabled.asInstanceOf[js.Any], long_lived = long_lived.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlexFlowPayload]
    }
  }
  
  trait FlexFlowResource extends StObject {
    
    var account_sid: String
    
    var channel_type: FlexFlowChannelType
    
    var chat_service_sid: String
    
    var contact_identity: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var enabled: Boolean
    
    var friendly_name: String
    
    var integration: js.Object
    
    var integration_type: FlexFlowIntegrationType
    
    var janitor_enabled: Boolean
    
    var long_lived: Boolean
    
    var sid: String
    
    var url: String
  }
  object FlexFlowResource {
    
    inline def apply(
      account_sid: String,
      channel_type: FlexFlowChannelType,
      chat_service_sid: String,
      contact_identity: String,
      date_created: js.Date,
      date_updated: js.Date,
      enabled: Boolean,
      friendly_name: String,
      integration: js.Object,
      integration_type: FlexFlowIntegrationType,
      janitor_enabled: Boolean,
      long_lived: Boolean,
      sid: String,
      url: String
    ): FlexFlowResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_type = channel_type.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], contact_identity = contact_identity.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], integration = integration.asInstanceOf[js.Any], integration_type = integration_type.asInstanceOf[js.Any], janitor_enabled = janitor_enabled.asInstanceOf[js.Any], long_lived = long_lived.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlexFlowResource]
    }
    
    extension [Self <: FlexFlowResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setChannel_type(value: FlexFlowChannelType): Self = StObject.set(x, "channel_type", value.asInstanceOf[js.Any])
      
      inline def setChat_service_sid(value: String): Self = StObject.set(x, "chat_service_sid", value.asInstanceOf[js.Any])
      
      inline def setContact_identity(value: String): Self = StObject.set(x, "contact_identity", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIntegration(value: js.Object): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
      
      inline def setIntegration_type(value: FlexFlowIntegrationType): Self = StObject.set(x, "integration_type", value.asInstanceOf[js.Any])
      
      inline def setJanitor_enabled(value: Boolean): Self = StObject.set(x, "janitor_enabled", value.asInstanceOf[js.Any])
      
      inline def setLong_lived(value: Boolean): Self = StObject.set(x, "long_lived", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlexFlowSolution extends StObject
}
