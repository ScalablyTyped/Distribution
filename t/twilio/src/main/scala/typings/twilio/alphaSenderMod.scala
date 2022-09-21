package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alphaSenderMod {
  
  @JSImport("twilio/lib/rest/messaging/v1/service/alphaSender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/messaging/v1/service/alphaSender", "AlphaSenderContext")
  @js.native
  open class AlphaSenderContext protected () extends StObject {
    /**
      * Initialize the AlphaSenderContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Messaging Service to fetch the resource from
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.messagingV1Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * fetch a AlphaSenderInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AlphaSenderInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AlphaSenderInstance, Any]): js.Promise[AlphaSenderInstance] = js.native
    
    /**
      * remove a AlphaSenderInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ AlphaSenderInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/messaging/v1/service/alphaSender", "AlphaSenderInstance")
  @js.native
  open class AlphaSenderInstance protected () extends SerializableClass {
    /**
      * Initialize the AlphaSenderContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(
      version: typings.twilio.messagingV1Mod.^,
      payload: AlphaSenderPayload,
      serviceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: AlphaSenderContext = js.native
    
    var accountSid: String = js.native
    
    var alphaSender: String = js.native
    
    var capabilities: js.Array[String] = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a AlphaSenderInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AlphaSenderInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AlphaSenderInstance] = js.native
    
    /**
      * remove a AlphaSenderInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AlphaSenderList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the resource is associated with
    */
  inline def AlphaSenderList(version: typings.twilio.messagingV1Mod.^, serviceSid: String): AlphaSenderListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AlphaSenderList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[AlphaSenderListInstance]
  
  @JSImport("twilio/lib/rest/messaging/v1/service/alphaSender", "AlphaSenderPage")
  @js.native
  open class AlphaSenderPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.messagingV1Mod.^, 
          AlphaSenderPayload, 
          AlphaSenderResource, 
          AlphaSenderInstance
        ] {
    /**
      * Initialize the AlphaSenderPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.messagingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AlphaSenderSolution
    ) = this()
    
    /**
      * Build an instance of AlphaSenderInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AlphaSenderPayload): AlphaSenderInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AlphaSenderListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AlphaSenderContext = js.native
    
    /**
      * create a AlphaSenderInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: AlphaSenderListInstanceCreateOptions): js.Promise[AlphaSenderInstance] = js.native
    def create(
      opts: AlphaSenderListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ AlphaSenderInstance, Any]
    ): js.Promise[AlphaSenderInstance] = js.native
    
    /**
      * Streams AlphaSenderInstance records from the API.
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
          /* item */ AlphaSenderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AlphaSenderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AlphaSenderListInstanceEachOptions): Unit = js.native
    def each(
      opts: AlphaSenderListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AlphaSenderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a alpha_sender
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): AlphaSenderContext = js.native
    
    /**
      * Retrieve a single target page of AlphaSenderInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AlphaSenderPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AlphaSenderPage, Any]): js.Promise[AlphaSenderPage] = js.native
    def getPage(targetUrl: String): js.Promise[AlphaSenderPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AlphaSenderPage, Any]
    ): js.Promise[AlphaSenderPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AlphaSenderPage, Any]
    ): js.Promise[AlphaSenderPage] = js.native
    
    /**
      * Lists AlphaSenderInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AlphaSenderInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AlphaSenderInstance], Any]
    ): js.Promise[js.Array[AlphaSenderInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AlphaSenderInstance], Any]
    ): js.Promise[js.Array[AlphaSenderInstance]] = js.native
    def list(opts: AlphaSenderListInstanceOptions): js.Promise[js.Array[AlphaSenderInstance]] = js.native
    def list(
      opts: AlphaSenderListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AlphaSenderInstance], Any]
    ): js.Promise[js.Array[AlphaSenderInstance]] = js.native
    
    /**
      * Retrieve a single page of AlphaSenderInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AlphaSenderPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AlphaSenderPage, Any]): js.Promise[AlphaSenderPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AlphaSenderPage, Any]): js.Promise[AlphaSenderPage] = js.native
    def page(opts: AlphaSenderListInstancePageOptions): js.Promise[AlphaSenderPage] = js.native
    def page(
      opts: AlphaSenderListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AlphaSenderPage, Any]
    ): js.Promise[AlphaSenderPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property alphaSender - The Alphanumeric Sender ID string
    */
  trait AlphaSenderListInstanceCreateOptions extends StObject {
    
    var alphaSender: String
  }
  object AlphaSenderListInstanceCreateOptions {
    
    inline def apply(alphaSender: String): AlphaSenderListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(alphaSender = alphaSender.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlphaSenderListInstanceCreateOptions]
    }
    
    extension [Self <: AlphaSenderListInstanceCreateOptions](x: Self) {
      
      inline def setAlphaSender(value: String): Self = StObject.set(x, "alphaSender", value.asInstanceOf[js.Any])
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
  trait AlphaSenderListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AlphaSenderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AlphaSenderListInstanceEachOptions {
    
    inline def apply(): AlphaSenderListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlphaSenderListInstanceEachOptions]
    }
    
    extension [Self <: AlphaSenderListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AlphaSenderInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait AlphaSenderListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AlphaSenderListInstanceOptions {
    
    inline def apply(): AlphaSenderListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlphaSenderListInstanceOptions]
    }
    
    extension [Self <: AlphaSenderListInstanceOptions](x: Self) {
      
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
  trait AlphaSenderListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AlphaSenderListInstancePageOptions {
    
    inline def apply(): AlphaSenderListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlphaSenderListInstancePageOptions]
    }
    
    extension [Self <: AlphaSenderListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait AlphaSenderPayload
    extends StObject
       with AlphaSenderResource
       with TwilioResponsePayload
  object AlphaSenderPayload {
    
    inline def apply(
      account_sid: String,
      alpha_sender: String,
      capabilities: js.Array[String],
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String
    ): AlphaSenderPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], alpha_sender = alpha_sender.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlphaSenderPayload]
    }
  }
  
  trait AlphaSenderResource extends StObject {
    
    var account_sid: String
    
    var alpha_sender: String
    
    var capabilities: js.Array[String]
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var service_sid: String
    
    var sid: String
    
    var url: String
  }
  object AlphaSenderResource {
    
    inline def apply(
      account_sid: String,
      alpha_sender: String,
      capabilities: js.Array[String],
      date_created: js.Date,
      date_updated: js.Date,
      service_sid: String,
      sid: String,
      url: String
    ): AlphaSenderResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], alpha_sender = alpha_sender.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlphaSenderResource]
    }
    
    extension [Self <: AlphaSenderResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAlpha_sender(value: String): Self = StObject.set(x, "alpha_sender", value.asInstanceOf[js.Any])
      
      inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value*))
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AlphaSenderSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object AlphaSenderSolution {
    
    inline def apply(): AlphaSenderSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlphaSenderSolution]
    }
    
    extension [Self <: AlphaSenderSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
