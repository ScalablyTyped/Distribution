package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.serviceBindingMod.BindingContext
import typings.twilio.serviceBindingMod.BindingListInstance
import typings.twilio.serviceConfigurationMod.ConfigurationContext
import typings.twilio.serviceConfigurationMod.ConfigurationListInstance
import typings.twilio.serviceConversationMod.ConversationContext
import typings.twilio.serviceConversationMod.ConversationListInstance
import typings.twilio.serviceParticipantConversationMod.ParticipantConversationListInstance
import typings.twilio.v1ServiceRoleMod.RoleContext
import typings.twilio.v1ServiceRoleMod.RoleListInstance
import typings.twilio.v1ServiceUserMod.UserContext
import typings.twilio.v1ServiceUserMod.UserListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1ServiceMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/service", "ServiceContext")
  @js.native
  open class ServiceContext protected () extends StObject {
    /**
      * Initialize the ServiceContext
      *
      * @param version - Version of the resource
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(version: typings.twilio.conversationsV1Mod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def bindings(sid: String): BindingContext = js.native
    @JSName("bindings")
    var bindings_Original: BindingListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def configuration(sid: String): ConfigurationContext = js.native
    @JSName("configuration")
    var configuration_Original: ConfigurationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def conversations(sid: String): ConversationContext = js.native
    @JSName("conversations")
    var conversations_Original: ConversationListInstance = js.native
    
    /**
      * fetch a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ServiceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[ServiceInstance] = js.native
    
    var participantConversations: ParticipantConversationListInstance = js.native
    
    /**
      * remove a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def roles(sid: String): RoleContext = js.native
    @JSName("roles")
    var roles_Original: RoleListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * @param sid - sid of instance
      */
    def users(sid: String): UserContext = js.native
    @JSName("users")
    var users_Original: UserListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/conversations/v1/service", "ServiceInstance")
  @js.native
  open class ServiceInstance protected () extends SerializableClass {
    /**
      * Initialize the ServiceContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(version: typings.twilio.conversationsV1Mod.^, payload: ServicePayload, sid: String) = this()
    
    /* private */ var _proxy: ServiceContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the bindings
      */
    def bindings(): BindingListInstance = js.native
    
    /**
      * Access the configuration
      */
    def configuration(): ConfigurationListInstance = js.native
    
    /**
      * Access the conversations
      */
    def conversations(): ConversationListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ServiceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ServiceInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    /**
      * Access the participantConversations
      */
    def participantConversations(): ParticipantConversationListInstance = js.native
    
    /**
      * remove a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Access the roles
      */
    def roles(): RoleListInstance = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
    
    /**
      * Access the users
      */
    def users(): UserListInstance = js.native
  }
  
  /**
    * Initialize the ServiceList
    *
    * @param version - Version of the resource
    */
  inline def ServiceList(version: typings.twilio.conversationsV1Mod.^): ServiceListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ServiceList")(version.asInstanceOf[js.Any]).asInstanceOf[ServiceListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/service", "ServicePage")
  @js.native
  open class ServicePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.conversationsV1Mod.^, ServicePayload, ServiceResource, ServiceInstance] {
    /**
      * Initialize the ServicePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ServiceSolution
    ) = this()
    
    /**
      * Build an instance of ServiceInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ServicePayload): ServiceInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ServiceListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ServiceContext = js.native
    
    /**
      * create a ServiceInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ServiceListInstanceCreateOptions): js.Promise[ServiceInstance] = js.native
    def create(
      opts: ServiceListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ServiceInstance, Any]
    ): js.Promise[ServiceInstance] = js.native
    
    /**
      * Streams ServiceInstance records from the API.
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
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ServiceListInstanceEachOptions): Unit = js.native
    def each(
      opts: ServiceListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a service
      *
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def get(sid: String): ServiceContext = js.native
    
    /**
      * Retrieve a single target page of ServiceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ServicePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    def getPage(targetUrl: String): js.Promise[ServicePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]
    ): js.Promise[ServicePage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    
    /**
      * Lists ServiceInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]
    ): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(opts: ServiceListInstanceOptions): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(
      opts: ServiceListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]
    ): js.Promise[js.Array[ServiceInstance]] = js.native
    
    /**
      * Retrieve a single page of ServiceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ServicePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    def page(opts: ServiceListInstancePageOptions): js.Promise[ServicePage] = js.native
    def page(
      opts: ServiceListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]
    ): js.Promise[ServicePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property friendlyName - The human-readable name of this service.
    */
  trait ServiceListInstanceCreateOptions extends StObject {
    
    var friendlyName: String
  }
  object ServiceListInstanceCreateOptions {
    
    inline def apply(friendlyName: String): ServiceListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceListInstanceCreateOptions]
    }
    
    extension [Self <: ServiceListInstanceCreateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
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
  trait ServiceListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ServiceListInstanceEachOptions {
    
    inline def apply(): ServiceListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstanceEachOptions]
    }
    
    extension [Self <: ServiceListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ServiceInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ServiceListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ServiceListInstanceOptions {
    
    inline def apply(): ServiceListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstanceOptions]
    }
    
    extension [Self <: ServiceListInstanceOptions](x: Self) {
      
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
  trait ServiceListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ServiceListInstancePageOptions {
    
    inline def apply(): ServiceListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstancePageOptions]
    }
    
    extension [Self <: ServiceListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ServicePayload
    extends StObject
       with ServiceResource
       with TwilioResponsePayload
  object ServicePayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): ServicePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServicePayload]
    }
  }
  
  trait ServiceResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: String
    
    var sid: String
    
    var url: String
  }
  object ServiceResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: String,
      sid: String,
      url: String
    ): ServiceResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceResource]
    }
    
    extension [Self <: ServiceResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceSolution extends StObject
}
