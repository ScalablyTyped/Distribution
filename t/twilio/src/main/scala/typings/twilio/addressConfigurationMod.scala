package typings.twilio

import typings.twilio.anon.ConversationServiceSid
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressConfigurationMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/addressConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/addressConfiguration", "AddressConfigurationContext")
  @js.native
  open class AddressConfigurationContext protected () extends StObject {
    /**
      * Initialize the AddressConfigurationContext
      *
      * @param version - Version of the resource
      * @param sid - The SID or Address of the Configuration.
      */
    def this(version: typings.twilio.conversationsV1Mod.^, sid: String) = this()
    
    /**
      * fetch a AddressConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AddressConfigurationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressConfigurationInstance, Any]): js.Promise[AddressConfigurationInstance] = js.native
    
    /**
      * remove a AddressConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressConfigurationInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a AddressConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AddressConfigurationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressConfigurationInstance, Any]): js.Promise[AddressConfigurationInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressConfigurationInstance, Any]
    ): js.Promise[AddressConfigurationInstance] = js.native
    def update(opts: AddressConfigurationInstanceUpdateOptions): js.Promise[AddressConfigurationInstance] = js.native
    def update(
      opts: AddressConfigurationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressConfigurationInstance, Any]
    ): js.Promise[AddressConfigurationInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/conversations/v1/addressConfiguration", "AddressConfigurationInstance")
  @js.native
  open class AddressConfigurationInstance protected () extends SerializableClass {
    /**
      * Initialize the AddressConfigurationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID or Address of the Configuration.
      */
    def this(version: typings.twilio.conversationsV1Mod.^, payload: AddressConfigurationPayload, sid: String) = this()
    
    /* private */ var _proxy: AddressConfigurationContext = js.native
    
    var accountSid: String = js.native
    
    var address: String = js.native
    
    var autoCreation: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a AddressConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AddressConfigurationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AddressConfigurationInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a AddressConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var `type`: String = js.native
    
    /**
      * update a AddressConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AddressConfigurationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AddressConfigurationInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AddressConfigurationInstance] = js.native
    def update(opts: AddressConfigurationInstanceUpdateOptions): js.Promise[AddressConfigurationInstance] = js.native
    def update(
      opts: AddressConfigurationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[AddressConfigurationInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AddressConfigurationList
    *
    * @param version - Version of the resource
    */
  inline def AddressConfigurationList(version: typings.twilio.conversationsV1Mod.^): AddressConfigurationListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("AddressConfigurationList")(version.asInstanceOf[js.Any]).asInstanceOf[AddressConfigurationListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/addressConfiguration", "AddressConfigurationPage")
  @js.native
  open class AddressConfigurationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.conversationsV1Mod.^, 
          AddressConfigurationPayload, 
          AddressConfigurationResource, 
          AddressConfigurationInstance
        ] {
    /**
      * Initialize the AddressConfigurationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AddressConfigurationSolution
    ) = this()
    
    /**
      * Build an instance of AddressConfigurationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AddressConfigurationPayload): AddressConfigurationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.webhook
    - typings.twilio.twilioStrings.studio
    - typings.twilio.twilioStrings.default
  */
  trait AddressConfigurationAutoCreationType extends StObject
  object AddressConfigurationAutoCreationType {
    
    inline def default: typings.twilio.twilioStrings.default = "default".asInstanceOf[typings.twilio.twilioStrings.default]
    
    inline def studio: typings.twilio.twilioStrings.studio = "studio".asInstanceOf[typings.twilio.twilioStrings.studio]
    
    inline def webhook: typings.twilio.twilioStrings.webhook = "webhook".asInstanceOf[typings.twilio.twilioStrings.webhook]
  }
  
  /**
    * Options to pass to update
    *
    * @property autoCreation.conversationServiceSid - Conversation Service for the auto-created conversation.
    * @property autoCreation.enabled - Enable/Disable auto-creating conversations for messages to this address
    * @property autoCreation.studioFlowSid - For type `studio`, the studio flow SID where the webhook should be sent to.
    * @property autoCreation.studioRetryCount - For type `studio`, number of times to retry the webhook request
    * @property autoCreation.type - Type of Auto Creation.
    * @property autoCreation.webhookFilters - The list of events, firing webhook event for this Conversation.
    * @property autoCreation.webhookMethod - For type `webhook`, the HTTP method to be used when sending a webhook request.
    * @property autoCreation.webhookUrl - For type `webhook`, the url for the webhook request.
    * @property friendlyName - The human-readable name of this configuration.
    */
  trait AddressConfigurationInstanceUpdateOptions extends StObject {
    
    var autoCreation: js.UndefOr[ConversationServiceSid] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object AddressConfigurationInstanceUpdateOptions {
    
    inline def apply(): AddressConfigurationInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressConfigurationInstanceUpdateOptions]
    }
    
    extension [Self <: AddressConfigurationInstanceUpdateOptions](x: Self) {
      
      inline def setAutoCreation(value: ConversationServiceSid): Self = StObject.set(x, "autoCreation", value.asInstanceOf[js.Any])
      
      inline def setAutoCreationUndefined: Self = StObject.set(x, "autoCreation", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait AddressConfigurationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AddressConfigurationContext = js.native
    
    /**
      * create a AddressConfigurationInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: AddressConfigurationListInstanceCreateOptions): js.Promise[AddressConfigurationInstance] = js.native
    def create(
      opts: AddressConfigurationListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ AddressConfigurationInstance, Any]
    ): js.Promise[AddressConfigurationInstance] = js.native
    
    /**
      * Streams AddressConfigurationInstance records from the API.
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
          /* item */ AddressConfigurationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AddressConfigurationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AddressConfigurationListInstanceEachOptions): Unit = js.native
    def each(
      opts: AddressConfigurationListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AddressConfigurationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a address_configuration
      *
      * @param sid - The SID or Address of the Configuration.
      */
    def get(sid: String): AddressConfigurationContext = js.native
    
    /**
      * Retrieve a single target page of AddressConfigurationInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AddressConfigurationPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressConfigurationPage, Any]): js.Promise[AddressConfigurationPage] = js.native
    def getPage(targetUrl: String): js.Promise[AddressConfigurationPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressConfigurationPage, Any]
    ): js.Promise[AddressConfigurationPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressConfigurationPage, Any]
    ): js.Promise[AddressConfigurationPage] = js.native
    
    /**
      * Lists AddressConfigurationInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AddressConfigurationInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AddressConfigurationInstance], Any]
    ): js.Promise[js.Array[AddressConfigurationInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AddressConfigurationInstance], Any]
    ): js.Promise[js.Array[AddressConfigurationInstance]] = js.native
    def list(opts: AddressConfigurationListInstanceOptions): js.Promise[js.Array[AddressConfigurationInstance]] = js.native
    def list(
      opts: AddressConfigurationListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AddressConfigurationInstance], Any]
    ): js.Promise[js.Array[AddressConfigurationInstance]] = js.native
    
    /**
      * Retrieve a single page of AddressConfigurationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AddressConfigurationPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressConfigurationPage, Any]): js.Promise[AddressConfigurationPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressConfigurationPage, Any]
    ): js.Promise[AddressConfigurationPage] = js.native
    def page(opts: AddressConfigurationListInstancePageOptions): js.Promise[AddressConfigurationPage] = js.native
    def page(
      opts: AddressConfigurationListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressConfigurationPage, Any]
    ): js.Promise[AddressConfigurationPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property address - The unique address to be configured.
    * @property autoCreation.conversationServiceSid - Conversation Service for the auto-created conversation.
    * @property autoCreation.enabled - Enable/Disable auto-creating conversations for messages to this address
    * @property autoCreation.studioFlowSid - For type `studio`, the studio flow SID where the webhook should be sent to.
    * @property autoCreation.studioRetryCount - For type `studio`, number of times to retry the webhook request
    * @property autoCreation.type - Type of Auto Creation.
    * @property autoCreation.webhookFilters - The list of events, firing webhook event for this Conversation.
    * @property autoCreation.webhookMethod - For type `webhook`, the HTTP method to be used when sending a webhook request.
    * @property autoCreation.webhookUrl - For type `webhook`, the url for the webhook request.
    * @property friendlyName - The human-readable name of this configuration.
    * @property type - Type of Address.
    */
  trait AddressConfigurationListInstanceCreateOptions extends StObject {
    
    var address: String
    
    var autoCreation: js.UndefOr[ConversationServiceSid] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var `type`: AddressConfigurationType
  }
  object AddressConfigurationListInstanceCreateOptions {
    
    inline def apply(address: String, `type`: AddressConfigurationType): AddressConfigurationListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressConfigurationListInstanceCreateOptions]
    }
    
    extension [Self <: AddressConfigurationListInstanceCreateOptions](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAutoCreation(value: ConversationServiceSid): Self = StObject.set(x, "autoCreation", value.asInstanceOf[js.Any])
      
      inline def setAutoCreationUndefined: Self = StObject.set(x, "autoCreation", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setType(value: AddressConfigurationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    * @property type - The type of address configuration.
    */
  trait AddressConfigurationListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AddressConfigurationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AddressConfigurationListInstanceEachOptions {
    
    inline def apply(): AddressConfigurationListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressConfigurationListInstanceEachOptions]
    }
    
    extension [Self <: AddressConfigurationListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AddressConfigurationInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    * @property type - The type of address configuration.
    */
  trait AddressConfigurationListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AddressConfigurationListInstanceOptions {
    
    inline def apply(): AddressConfigurationListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressConfigurationListInstanceOptions]
    }
    
    extension [Self <: AddressConfigurationListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property type - The type of address configuration.
    */
  trait AddressConfigurationListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AddressConfigurationListInstancePageOptions {
    
    inline def apply(): AddressConfigurationListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressConfigurationListInstancePageOptions]
    }
    
    extension [Self <: AddressConfigurationListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.GET
    - typings.twilio.twilioStrings.POST
  */
  trait AddressConfigurationMethod extends StObject
  object AddressConfigurationMethod {
    
    inline def GET: typings.twilio.twilioStrings.GET = "GET".asInstanceOf[typings.twilio.twilioStrings.GET]
    
    inline def POST: typings.twilio.twilioStrings.POST = "POST".asInstanceOf[typings.twilio.twilioStrings.POST]
  }
  
  trait AddressConfigurationPayload
    extends StObject
       with AddressConfigurationResource
       with TwilioResponsePayload
  object AddressConfigurationPayload {
    
    inline def apply(
      account_sid: String,
      address: String,
      auto_creation: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      `type`: String,
      uri: String,
      url: String
    ): AddressConfigurationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], auto_creation = auto_creation.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressConfigurationPayload]
    }
  }
  
  trait AddressConfigurationResource extends StObject {
    
    var account_sid: String
    
    var address: String
    
    var auto_creation: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var sid: String
    
    var `type`: String
    
    var url: String
  }
  object AddressConfigurationResource {
    
    inline def apply(
      account_sid: String,
      address: String,
      auto_creation: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      sid: String,
      `type`: String,
      url: String
    ): AddressConfigurationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], auto_creation = auto_creation.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressConfigurationResource]
    }
    
    extension [Self <: AddressConfigurationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAuto_creation(value: js.Object): Self = StObject.set(x, "auto_creation", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AddressConfigurationSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.sms
    - typings.twilio.twilioStrings.whatsapp
    - typings.twilio.twilioStrings.messenger
    - typings.twilio.twilioStrings.gbm
  */
  trait AddressConfigurationType extends StObject
  object AddressConfigurationType {
    
    inline def gbm: typings.twilio.twilioStrings.gbm = "gbm".asInstanceOf[typings.twilio.twilioStrings.gbm]
    
    inline def messenger: typings.twilio.twilioStrings.messenger = "messenger".asInstanceOf[typings.twilio.twilioStrings.messenger]
    
    inline def sms: typings.twilio.twilioStrings.sms = "sms".asInstanceOf[typings.twilio.twilioStrings.sms]
    
    inline def whatsapp: typings.twilio.twilioStrings.whatsapp = "whatsapp".asInstanceOf[typings.twilio.twilioStrings.whatsapp]
  }
}
