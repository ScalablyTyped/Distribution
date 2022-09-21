package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentDeploymentMod {
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment/deployment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment/deployment", "DeploymentContext")
  @js.native
  open class DeploymentContext protected () extends StObject {
    /**
      * Initialize the DeploymentContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the Deployment resource from
      * @param environmentSid - The SID of the Environment used by the Deployment to fetch
      * @param sid - The SID that identifies the Deployment resource to fetch
      */
    def this(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, environmentSid: String, sid: String) = this()
    
    /**
      * fetch a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DeploymentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentInstance, Any]): js.Promise[DeploymentInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment/deployment", "DeploymentInstance")
  @js.native
  open class DeploymentInstance protected () extends SerializableClass {
    /**
      * Initialize the DeploymentContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the Deployment resource is associated with
      * @param environmentSid - The SID of the Environment for the Deployment
      * @param sid - The SID that identifies the Deployment resource to fetch
      */
    def this(
      version: typings.twilio.serverlessV1Mod.^,
      payload: DeploymentPayload,
      serviceSid: String,
      environmentSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: DeploymentContext = js.native
    
    var accountSid: String = js.native
    
    var buildSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var environmentSid: String = js.native
    
    /**
      * fetch a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DeploymentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DeploymentInstance] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the DeploymentList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the Deployment resource is associated with
    * @param environmentSid - The SID of the Environment for the Deployment
    */
  inline def DeploymentList(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, environmentSid: String): DeploymentListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("DeploymentList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], environmentSid.asInstanceOf[js.Any])).asInstanceOf[DeploymentListInstance]
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment/deployment", "DeploymentPage")
  @js.native
  open class DeploymentPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.serverlessV1Mod.^, 
          DeploymentPayload, 
          DeploymentResource, 
          DeploymentInstance
        ] {
    /**
      * Initialize the DeploymentPage
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
      solution: DeploymentSolution
    ) = this()
    
    /**
      * Build an instance of DeploymentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DeploymentPayload): DeploymentInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait DeploymentListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): DeploymentContext = js.native
    
    /**
      * create a DeploymentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[DeploymentInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ DeploymentInstance, Any]): js.Promise[DeploymentInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ DeploymentInstance, Any]
    ): js.Promise[DeploymentInstance] = js.native
    def create(opts: DeploymentListInstanceCreateOptions): js.Promise[DeploymentInstance] = js.native
    def create(
      opts: DeploymentListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ DeploymentInstance, Any]
    ): js.Promise[DeploymentInstance] = js.native
    
    /**
      * Streams DeploymentInstance records from the API.
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
          /* item */ DeploymentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ DeploymentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: DeploymentListInstanceEachOptions): Unit = js.native
    def each(
      opts: DeploymentListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DeploymentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a deployment
      *
      * @param sid - The SID that identifies the Deployment resource to fetch
      */
    def get(sid: String): DeploymentContext = js.native
    
    /**
      * Retrieve a single target page of DeploymentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[DeploymentPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]): js.Promise[DeploymentPage] = js.native
    def getPage(targetUrl: String): js.Promise[DeploymentPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]
    ): js.Promise[DeploymentPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]
    ): js.Promise[DeploymentPage] = js.native
    
    /**
      * Lists DeploymentInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DeploymentInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeploymentInstance], Any]): js.Promise[js.Array[DeploymentInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeploymentInstance], Any]
    ): js.Promise[js.Array[DeploymentInstance]] = js.native
    def list(opts: DeploymentListInstanceOptions): js.Promise[js.Array[DeploymentInstance]] = js.native
    def list(
      opts: DeploymentListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeploymentInstance], Any]
    ): js.Promise[js.Array[DeploymentInstance]] = js.native
    
    /**
      * Retrieve a single page of DeploymentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[DeploymentPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]): js.Promise[DeploymentPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]): js.Promise[DeploymentPage] = js.native
    def page(opts: DeploymentListInstancePageOptions): js.Promise[DeploymentPage] = js.native
    def page(
      opts: DeploymentListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeploymentPage, Any]
    ): js.Promise[DeploymentPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property buildSid - The SID of the Build for the Deployment
    */
  trait DeploymentListInstanceCreateOptions extends StObject {
    
    var buildSid: js.UndefOr[String] = js.undefined
  }
  object DeploymentListInstanceCreateOptions {
    
    inline def apply(): DeploymentListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentListInstanceCreateOptions]
    }
    
    extension [Self <: DeploymentListInstanceCreateOptions](x: Self) {
      
      inline def setBuildSid(value: String): Self = StObject.set(x, "buildSid", value.asInstanceOf[js.Any])
      
      inline def setBuildSidUndefined: Self = StObject.set(x, "buildSid", js.undefined)
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
  trait DeploymentListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DeploymentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DeploymentListInstanceEachOptions {
    
    inline def apply(): DeploymentListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentListInstanceEachOptions]
    }
    
    extension [Self <: DeploymentListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ DeploymentInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait DeploymentListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DeploymentListInstanceOptions {
    
    inline def apply(): DeploymentListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentListInstanceOptions]
    }
    
    extension [Self <: DeploymentListInstanceOptions](x: Self) {
      
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
  trait DeploymentListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object DeploymentListInstancePageOptions {
    
    inline def apply(): DeploymentListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentListInstancePageOptions]
    }
    
    extension [Self <: DeploymentListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait DeploymentPayload
    extends StObject
       with DeploymentResource
       with TwilioResponsePayload
  object DeploymentPayload {
    
    inline def apply(
      account_sid: String,
      build_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      environment_sid: String,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String
    ): DeploymentPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], build_sid = build_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], environment_sid = environment_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentPayload]
    }
  }
  
  trait DeploymentResource extends StObject {
    
    var account_sid: String
    
    var build_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var environment_sid: String
    
    var service_sid: String
    
    var sid: String
    
    var url: String
  }
  object DeploymentResource {
    
    inline def apply(
      account_sid: String,
      build_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      environment_sid: String,
      service_sid: String,
      sid: String,
      url: String
    ): DeploymentResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], build_sid = build_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], environment_sid = environment_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentResource]
    }
    
    extension [Self <: DeploymentResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBuild_sid(value: String): Self = StObject.set(x, "build_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEnvironment_sid(value: String): Self = StObject.set(x, "environment_sid", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeploymentSolution extends StObject {
    
    var environmentSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object DeploymentSolution {
    
    inline def apply(): DeploymentSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentSolution]
    }
    
    extension [Self <: DeploymentSolution](x: Self) {
      
      inline def setEnvironmentSid(value: String): Self = StObject.set(x, "environmentSid", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentSidUndefined: Self = StObject.set(x, "environmentSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
