package typings.twilio

import typings.twilio.environmentDeploymentMod.DeploymentContext
import typings.twilio.environmentDeploymentMod.DeploymentListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.logMod.LogContext
import typings.twilio.logMod.LogListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.variableMod.VariableContext
import typings.twilio.variableMod.VariableListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentMod {
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment", "EnvironmentContext")
  @js.native
  open class EnvironmentContext protected () extends StObject {
    /**
      * Initialize the EnvironmentContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the Environment resource from
      * @param sid - The SID of the Environment resource to fetch
      */
    def this(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def deployments(sid: String): DeploymentContext = js.native
    @JSName("deployments")
    var deployments_Original: DeploymentListInstance = js.native
    
    /**
      * fetch a EnvironmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EnvironmentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ EnvironmentInstance, Any]): js.Promise[EnvironmentInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def logs(sid: String): LogContext = js.native
    @JSName("logs")
    var logs_Original: LogListInstance = js.native
    
    /**
      * remove a EnvironmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ EnvironmentInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * @param sid - sid of instance
      */
    def variables(sid: String): VariableContext = js.native
    @JSName("variables")
    var variables_Original: VariableListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment", "EnvironmentInstance")
  @js.native
  open class EnvironmentInstance protected () extends SerializableClass {
    /**
      * Initialize the EnvironmentContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the Environment resource is associated with
      * @param sid - The SID of the Environment resource to fetch
      */
    def this(
      version: typings.twilio.serverlessV1Mod.^,
      payload: EnvironmentPayload,
      serviceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: EnvironmentContext = js.native
    
    var accountSid: String = js.native
    
    var buildSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Access the deployments
      */
    def deployments(): DeploymentListInstance = js.native
    
    var domainName: String = js.native
    
    var domainSuffix: String = js.native
    
    /**
      * fetch a EnvironmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EnvironmentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[EnvironmentInstance] = js.native
    
    var links: String = js.native
    
    /**
      * Access the logs
      */
    def logs(): LogListInstance = js.native
    
    /**
      * remove a EnvironmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    var url: String = js.native
    
    /**
      * Access the variables
      */
    def variables(): VariableListInstance = js.native
  }
  
  /**
    * Initialize the EnvironmentList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the Environment resource is associated with
    */
  inline def EnvironmentList(version: typings.twilio.serverlessV1Mod.^, serviceSid: String): EnvironmentListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("EnvironmentList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[EnvironmentListInstance]
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment", "EnvironmentPage")
  @js.native
  open class EnvironmentPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.serverlessV1Mod.^, 
          EnvironmentPayload, 
          EnvironmentResource, 
          EnvironmentInstance
        ] {
    /**
      * Initialize the EnvironmentPage
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
      solution: EnvironmentSolution
    ) = this()
    
    /**
      * Build an instance of EnvironmentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: EnvironmentPayload): EnvironmentInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait EnvironmentListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): EnvironmentContext = js.native
    
    /**
      * create a EnvironmentInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: EnvironmentListInstanceCreateOptions): js.Promise[EnvironmentInstance] = js.native
    def create(
      opts: EnvironmentListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ EnvironmentInstance, Any]
    ): js.Promise[EnvironmentInstance] = js.native
    
    /**
      * Streams EnvironmentInstance records from the API.
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
          /* item */ EnvironmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ EnvironmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: EnvironmentListInstanceEachOptions): Unit = js.native
    def each(
      opts: EnvironmentListInstanceEachOptions,
      callback: js.Function2[
          /* item */ EnvironmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a environment
      *
      * @param sid - The SID of the Environment resource to fetch
      */
    def get(sid: String): EnvironmentContext = js.native
    
    /**
      * Retrieve a single target page of EnvironmentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[EnvironmentPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ EnvironmentPage, Any]): js.Promise[EnvironmentPage] = js.native
    def getPage(targetUrl: String): js.Promise[EnvironmentPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EnvironmentPage, Any]
    ): js.Promise[EnvironmentPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EnvironmentPage, Any]
    ): js.Promise[EnvironmentPage] = js.native
    
    /**
      * Lists EnvironmentInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[EnvironmentInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EnvironmentInstance], Any]
    ): js.Promise[js.Array[EnvironmentInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EnvironmentInstance], Any]
    ): js.Promise[js.Array[EnvironmentInstance]] = js.native
    def list(opts: EnvironmentListInstanceOptions): js.Promise[js.Array[EnvironmentInstance]] = js.native
    def list(
      opts: EnvironmentListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EnvironmentInstance], Any]
    ): js.Promise[js.Array[EnvironmentInstance]] = js.native
    
    /**
      * Retrieve a single page of EnvironmentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[EnvironmentPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ EnvironmentPage, Any]): js.Promise[EnvironmentPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ EnvironmentPage, Any]): js.Promise[EnvironmentPage] = js.native
    def page(opts: EnvironmentListInstancePageOptions): js.Promise[EnvironmentPage] = js.native
    def page(
      opts: EnvironmentListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EnvironmentPage, Any]
    ): js.Promise[EnvironmentPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property domainSuffix - A URL-friendly name that represents the environment
    * @property uniqueName - A user-defined string that uniquely identifies the Environment resource
    */
  trait EnvironmentListInstanceCreateOptions extends StObject {
    
    var domainSuffix: js.UndefOr[String] = js.undefined
    
    var uniqueName: String
  }
  object EnvironmentListInstanceCreateOptions {
    
    inline def apply(uniqueName: String): EnvironmentListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentListInstanceCreateOptions]
    }
    
    extension [Self <: EnvironmentListInstanceCreateOptions](x: Self) {
      
      inline def setDomainSuffix(value: String): Self = StObject.set(x, "domainSuffix", value.asInstanceOf[js.Any])
      
      inline def setDomainSuffixUndefined: Self = StObject.set(x, "domainSuffix", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
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
  trait EnvironmentListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ EnvironmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EnvironmentListInstanceEachOptions {
    
    inline def apply(): EnvironmentListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvironmentListInstanceEachOptions]
    }
    
    extension [Self <: EnvironmentListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ EnvironmentInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait EnvironmentListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EnvironmentListInstanceOptions {
    
    inline def apply(): EnvironmentListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvironmentListInstanceOptions]
    }
    
    extension [Self <: EnvironmentListInstanceOptions](x: Self) {
      
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
  trait EnvironmentListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object EnvironmentListInstancePageOptions {
    
    inline def apply(): EnvironmentListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvironmentListInstancePageOptions]
    }
    
    extension [Self <: EnvironmentListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait EnvironmentPayload
    extends StObject
       with EnvironmentResource
       with TwilioResponsePayload
  object EnvironmentPayload {
    
    inline def apply(
      account_sid: String,
      build_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      domain_name: String,
      domain_suffix: String,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): EnvironmentPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], build_sid = build_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], domain_name = domain_name.asInstanceOf[js.Any], domain_suffix = domain_suffix.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentPayload]
    }
  }
  
  trait EnvironmentResource extends StObject {
    
    var account_sid: String
    
    var build_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var domain_name: String
    
    var domain_suffix: String
    
    var links: String
    
    var service_sid: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object EnvironmentResource {
    
    inline def apply(
      account_sid: String,
      build_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      domain_name: String,
      domain_suffix: String,
      links: String,
      service_sid: String,
      sid: String,
      unique_name: String,
      url: String
    ): EnvironmentResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], build_sid = build_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], domain_name = domain_name.asInstanceOf[js.Any], domain_suffix = domain_suffix.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentResource]
    }
    
    extension [Self <: EnvironmentResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBuild_sid(value: String): Self = StObject.set(x, "build_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDomain_name(value: String): Self = StObject.set(x, "domain_name", value.asInstanceOf[js.Any])
      
      inline def setDomain_suffix(value: String): Self = StObject.set(x, "domain_suffix", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnvironmentSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object EnvironmentSolution {
    
    inline def apply(): EnvironmentSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvironmentSolution]
    }
    
    extension [Self <: EnvironmentSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
