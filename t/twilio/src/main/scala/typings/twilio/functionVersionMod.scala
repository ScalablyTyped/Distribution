package typings.twilio

import typings.twilio.functionVersionContentMod.FunctionVersionContentContext
import typings.twilio.functionVersionContentMod.FunctionVersionContentListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionVersionMod {
  
  @JSImport("twilio/lib/rest/serverless/v1/service/function/functionVersion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/serverless/v1/service/function/functionVersion", "FunctionVersionContext")
  @js.native
  open class FunctionVersionContext protected () extends StObject {
    /**
      * Initialize the FunctionVersionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the Function Version resource from
      * @param functionSid - The SID of the function that is the parent of the Function Version resource to fetch
      * @param sid - The SID that identifies the Function Version resource to fetch
      */
    def this(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, functionSid: String, sid: String) = this()
    
    /**
      * fetch a FunctionVersionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FunctionVersionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FunctionVersionInstance, Any]): js.Promise[FunctionVersionInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def functionVersionContent(sid: String): FunctionVersionContentContext = js.native
    @JSName("functionVersionContent")
    var functionVersionContent_Original: FunctionVersionContentListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/serverless/v1/service/function/functionVersion", "FunctionVersionInstance")
  @js.native
  open class FunctionVersionInstance protected () extends SerializableClass {
    /**
      * Initialize the FunctionVersionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the Function Version resource is associated with
      * @param functionSid - The SID of the Function resource that is the parent of the Function Version resource
      * @param sid - The SID that identifies the Function Version resource to fetch
      */
    def this(
      version: typings.twilio.serverlessV1Mod.^,
      payload: FunctionVersionPayload,
      serviceSid: String,
      functionSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: FunctionVersionContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    /**
      * fetch a FunctionVersionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FunctionVersionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FunctionVersionInstance] = js.native
    
    var functionSid: String = js.native
    
    /**
      * Access the functionVersionContent
      */
    def functionVersionContent(): FunctionVersionContentListInstance = js.native
    
    var links: String = js.native
    
    var path: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
    
    var visibility: FunctionVersionVisibility = js.native
  }
  
  /**
    * Initialize the FunctionVersionList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the Function Version resource is associated with
    * @param functionSid - The SID of the Function resource that is the parent of the Function Version resource
    */
  inline def FunctionVersionList(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, functionSid: String): FunctionVersionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("FunctionVersionList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], functionSid.asInstanceOf[js.Any])).asInstanceOf[FunctionVersionListInstance]
  
  @JSImport("twilio/lib/rest/serverless/v1/service/function/functionVersion", "FunctionVersionPage")
  @js.native
  open class FunctionVersionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.serverlessV1Mod.^, 
          FunctionVersionPayload, 
          FunctionVersionResource, 
          FunctionVersionInstance
        ] {
    /**
      * Initialize the FunctionVersionPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.serverlessV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: FunctionVersionSolution
    ) = this()
    
    /**
      * Build an instance of FunctionVersionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FunctionVersionPayload): FunctionVersionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait FunctionVersionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FunctionVersionContext = js.native
    
    /**
      * Streams FunctionVersionInstance records from the API.
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
          /* item */ FunctionVersionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ FunctionVersionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: FunctionVersionListInstanceEachOptions): Unit = js.native
    def each(
      opts: FunctionVersionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ FunctionVersionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a function_version
      *
      * @param sid - The SID that identifies the Function Version resource to fetch
      */
    def get(sid: String): FunctionVersionContext = js.native
    
    /**
      * Retrieve a single target page of FunctionVersionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[FunctionVersionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ FunctionVersionPage, Any]): js.Promise[FunctionVersionPage] = js.native
    def getPage(targetUrl: String): js.Promise[FunctionVersionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FunctionVersionPage, Any]
    ): js.Promise[FunctionVersionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FunctionVersionPage, Any]
    ): js.Promise[FunctionVersionPage] = js.native
    
    /**
      * Lists FunctionVersionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[FunctionVersionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FunctionVersionInstance], Any]
    ): js.Promise[js.Array[FunctionVersionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FunctionVersionInstance], Any]
    ): js.Promise[js.Array[FunctionVersionInstance]] = js.native
    def list(opts: FunctionVersionListInstanceOptions): js.Promise[js.Array[FunctionVersionInstance]] = js.native
    def list(
      opts: FunctionVersionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FunctionVersionInstance], Any]
    ): js.Promise[js.Array[FunctionVersionInstance]] = js.native
    
    /**
      * Retrieve a single page of FunctionVersionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[FunctionVersionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ FunctionVersionPage, Any]): js.Promise[FunctionVersionPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FunctionVersionPage, Any]
    ): js.Promise[FunctionVersionPage] = js.native
    def page(opts: FunctionVersionListInstancePageOptions): js.Promise[FunctionVersionPage] = js.native
    def page(
      opts: FunctionVersionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FunctionVersionPage, Any]
    ): js.Promise[FunctionVersionPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
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
  trait FunctionVersionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ FunctionVersionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FunctionVersionListInstanceEachOptions {
    
    inline def apply(): FunctionVersionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionVersionListInstanceEachOptions]
    }
    
    extension [Self <: FunctionVersionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ FunctionVersionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait FunctionVersionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FunctionVersionListInstanceOptions {
    
    inline def apply(): FunctionVersionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionVersionListInstanceOptions]
    }
    
    extension [Self <: FunctionVersionListInstanceOptions](x: Self) {
      
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
  trait FunctionVersionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object FunctionVersionListInstancePageOptions {
    
    inline def apply(): FunctionVersionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionVersionListInstancePageOptions]
    }
    
    extension [Self <: FunctionVersionListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait FunctionVersionPayload
    extends StObject
       with FunctionVersionResource
       with TwilioResponsePayload
  object FunctionVersionPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      first_page_uri: String,
      function_sid: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      path: String,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String,
      visibility: FunctionVersionVisibility
    ): FunctionVersionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], function_sid = function_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionVersionPayload]
    }
  }
  
  trait FunctionVersionResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var function_sid: String
    
    var links: String
    
    var path: String
    
    var service_sid: String
    
    var sid: String
    
    var url: String
    
    var visibility: FunctionVersionVisibility
  }
  object FunctionVersionResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      function_sid: String,
      links: String,
      path: String,
      service_sid: String,
      sid: String,
      url: String,
      visibility: FunctionVersionVisibility
    ): FunctionVersionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], function_sid = function_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionVersionResource]
    }
    
    extension [Self <: FunctionVersionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setFunction_sid(value: String): Self = StObject.set(x, "function_sid", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVisibility(value: FunctionVersionVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionVersionSolution extends StObject {
    
    var functionSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object FunctionVersionSolution {
    
    inline def apply(): FunctionVersionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionVersionSolution]
    }
    
    extension [Self <: FunctionVersionSolution](x: Self) {
      
      inline def setFunctionSid(value: String): Self = StObject.set(x, "functionSid", value.asInstanceOf[js.Any])
      
      inline def setFunctionSidUndefined: Self = StObject.set(x, "functionSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.public
    - typings.twilio.twilioStrings.`private`
    - typings.twilio.twilioStrings.`protected`
  */
  trait FunctionVersionVisibility extends StObject
  object FunctionVersionVisibility {
    
    inline def `private`: typings.twilio.twilioStrings.`private` = "private".asInstanceOf[typings.twilio.twilioStrings.`private`]
    
    inline def `protected`: typings.twilio.twilioStrings.`protected` = "protected".asInstanceOf[typings.twilio.twilioStrings.`protected`]
    
    inline def public: typings.twilio.twilioStrings.public = "public".asInstanceOf[typings.twilio.twilioStrings.public]
  }
}
