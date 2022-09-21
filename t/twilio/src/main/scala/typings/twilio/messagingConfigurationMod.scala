package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagingConfigurationMod {
  
  @JSImport("twilio/lib/rest/verify/v2/service/messagingConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/service/messagingConfiguration", "MessagingConfigurationContext")
  @js.native
  open class MessagingConfigurationContext protected () extends StObject {
    /**
      * Initialize the MessagingConfigurationContext
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param country - The ISO-3166-1 country code of the country or `all`.
      */
    def this(version: typings.twilio.verifyV2Mod.^, serviceSid: String, country: String) = this()
    
    /**
      * fetch a MessagingConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MessagingConfigurationInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagingConfigurationInstance, Any]
    ): js.Promise[MessagingConfigurationInstance] = js.native
    
    /**
      * remove a MessagingConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagingConfigurationInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a MessagingConfigurationInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: MessagingConfigurationInstanceUpdateOptions): js.Promise[MessagingConfigurationInstance] = js.native
    def update(
      opts: MessagingConfigurationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagingConfigurationInstance, Any]
    ): js.Promise[MessagingConfigurationInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/verify/v2/service/messagingConfiguration", "MessagingConfigurationInstance")
  @js.native
  open class MessagingConfigurationInstance protected () extends SerializableClass {
    /**
      * Initialize the MessagingConfigurationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param country - The ISO-3166-1 country code of the country or `all`.
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      payload: MessagingConfigurationPayload,
      serviceSid: String,
      country: String
    ) = this()
    
    /* private */ var _proxy: MessagingConfigurationContext = js.native
    
    var accountSid: String = js.native
    
    var country: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a MessagingConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MessagingConfigurationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MessagingConfigurationInstance] = js.native
    
    var messagingServiceSid: String = js.native
    
    /**
      * remove a MessagingConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    /**
      * update a MessagingConfigurationInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: MessagingConfigurationInstanceUpdateOptions): js.Promise[MessagingConfigurationInstance] = js.native
    def update(
      opts: MessagingConfigurationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[MessagingConfigurationInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the MessagingConfigurationList
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the resource is associated with
    */
  inline def MessagingConfigurationList(version: typings.twilio.verifyV2Mod.^, serviceSid: String): MessagingConfigurationListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("MessagingConfigurationList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[MessagingConfigurationListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/service/messagingConfiguration", "MessagingConfigurationPage")
  @js.native
  open class MessagingConfigurationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.verifyV2Mod.^, 
          MessagingConfigurationPayload, 
          MessagingConfigurationResource, 
          MessagingConfigurationInstance
        ] {
    /**
      * Initialize the MessagingConfigurationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: MessagingConfigurationSolution
    ) = this()
    
    /**
      * Build an instance of MessagingConfigurationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: MessagingConfigurationPayload): MessagingConfigurationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property messagingServiceSid - The SID of the Messaging Service used for this configuration.
    */
  trait MessagingConfigurationInstanceUpdateOptions extends StObject {
    
    var messagingServiceSid: String
  }
  object MessagingConfigurationInstanceUpdateOptions {
    
    inline def apply(messagingServiceSid: String): MessagingConfigurationInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(messagingServiceSid = messagingServiceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagingConfigurationInstanceUpdateOptions]
    }
    
    extension [Self <: MessagingConfigurationInstanceUpdateOptions](x: Self) {
      
      inline def setMessagingServiceSid(value: String): Self = StObject.set(x, "messagingServiceSid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessagingConfigurationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): MessagingConfigurationContext = js.native
    
    /**
      * create a MessagingConfigurationInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: MessagingConfigurationListInstanceCreateOptions): js.Promise[MessagingConfigurationInstance] = js.native
    def create(
      opts: MessagingConfigurationListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ MessagingConfigurationInstance, Any]
    ): js.Promise[MessagingConfigurationInstance] = js.native
    
    /**
      * Streams MessagingConfigurationInstance records from the API.
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
          /* item */ MessagingConfigurationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ MessagingConfigurationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: MessagingConfigurationListInstanceEachOptions): Unit = js.native
    def each(
      opts: MessagingConfigurationListInstanceEachOptions,
      callback: js.Function2[
          /* item */ MessagingConfigurationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a messaging_configuration
      *
      * @param country - The ISO-3166-1 country code of the country or `all`.
      */
    def get(country: String): MessagingConfigurationContext = js.native
    
    /**
      * Retrieve a single target page of MessagingConfigurationInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[MessagingConfigurationPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagingConfigurationPage, Any]): js.Promise[MessagingConfigurationPage] = js.native
    def getPage(targetUrl: String): js.Promise[MessagingConfigurationPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagingConfigurationPage, Any]
    ): js.Promise[MessagingConfigurationPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagingConfigurationPage, Any]
    ): js.Promise[MessagingConfigurationPage] = js.native
    
    /**
      * Lists MessagingConfigurationInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[MessagingConfigurationInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[MessagingConfigurationInstance], 
          Any
        ]
    ): js.Promise[js.Array[MessagingConfigurationInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[MessagingConfigurationInstance], 
          Any
        ]
    ): js.Promise[js.Array[MessagingConfigurationInstance]] = js.native
    def list(opts: MessagingConfigurationListInstanceOptions): js.Promise[js.Array[MessagingConfigurationInstance]] = js.native
    def list(
      opts: MessagingConfigurationListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[MessagingConfigurationInstance], 
          Any
        ]
    ): js.Promise[js.Array[MessagingConfigurationInstance]] = js.native
    
    /**
      * Retrieve a single page of MessagingConfigurationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[MessagingConfigurationPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagingConfigurationPage, Any]): js.Promise[MessagingConfigurationPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagingConfigurationPage, Any]
    ): js.Promise[MessagingConfigurationPage] = js.native
    def page(opts: MessagingConfigurationListInstancePageOptions): js.Promise[MessagingConfigurationPage] = js.native
    def page(
      opts: MessagingConfigurationListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagingConfigurationPage, Any]
    ): js.Promise[MessagingConfigurationPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property country - The ISO-3166-1 country code of the country or `all`.
    * @property messagingServiceSid - The SID of the Messaging Service used for this configuration.
    */
  trait MessagingConfigurationListInstanceCreateOptions extends StObject {
    
    var country: String
    
    var messagingServiceSid: String
  }
  object MessagingConfigurationListInstanceCreateOptions {
    
    inline def apply(country: String, messagingServiceSid: String): MessagingConfigurationListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], messagingServiceSid = messagingServiceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagingConfigurationListInstanceCreateOptions]
    }
    
    extension [Self <: MessagingConfigurationListInstanceCreateOptions](x: Self) {
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setMessagingServiceSid(value: String): Self = StObject.set(x, "messagingServiceSid", value.asInstanceOf[js.Any])
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
  trait MessagingConfigurationListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ MessagingConfigurationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object MessagingConfigurationListInstanceEachOptions {
    
    inline def apply(): MessagingConfigurationListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessagingConfigurationListInstanceEachOptions]
    }
    
    extension [Self <: MessagingConfigurationListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ MessagingConfigurationInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait MessagingConfigurationListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object MessagingConfigurationListInstanceOptions {
    
    inline def apply(): MessagingConfigurationListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessagingConfigurationListInstanceOptions]
    }
    
    extension [Self <: MessagingConfigurationListInstanceOptions](x: Self) {
      
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
  trait MessagingConfigurationListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object MessagingConfigurationListInstancePageOptions {
    
    inline def apply(): MessagingConfigurationListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessagingConfigurationListInstancePageOptions]
    }
    
    extension [Self <: MessagingConfigurationListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait MessagingConfigurationPayload
    extends StObject
       with MessagingConfigurationResource
       with TwilioResponsePayload
  object MessagingConfigurationPayload {
    
    inline def apply(
      account_sid: String,
      country: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      messaging_service_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      uri: String,
      url: String
    ): MessagingConfigurationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagingConfigurationPayload]
    }
  }
  
  trait MessagingConfigurationResource extends StObject {
    
    var account_sid: String
    
    var country: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var messaging_service_sid: String
    
    var service_sid: String
    
    var url: String
  }
  object MessagingConfigurationResource {
    
    inline def apply(
      account_sid: String,
      country: String,
      date_created: js.Date,
      date_updated: js.Date,
      messaging_service_sid: String,
      service_sid: String,
      url: String
    ): MessagingConfigurationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagingConfigurationResource]
    }
    
    extension [Self <: MessagingConfigurationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setMessaging_service_sid(value: String): Self = StObject.set(x, "messaging_service_sid", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessagingConfigurationSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object MessagingConfigurationSolution {
    
    inline def apply(): MessagingConfigurationSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessagingConfigurationSolution]
    }
    
    extension [Self <: MessagingConfigurationSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
