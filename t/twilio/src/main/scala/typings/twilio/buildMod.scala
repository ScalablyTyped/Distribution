package typings.twilio

import typings.twilio.buildStatusMod.BuildStatusContext
import typings.twilio.buildStatusMod.BuildStatusListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("twilio/lib/rest/serverless/v1/service/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/serverless/v1/service/build", "BuildContext")
  @js.native
  open class BuildContext protected () extends StObject {
    /**
      * Initialize the BuildContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the Build resource from
      * @param sid - The SID of the Build resource to fetch
      */
    def this(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def buildStatus(sid: String): BuildStatusContext = js.native
    @JSName("buildStatus")
    var buildStatus_Original: BuildStatusListInstance = js.native
    
    /**
      * fetch a BuildInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BuildInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ BuildInstance, Any]): js.Promise[BuildInstance] = js.native
    
    /**
      * remove a BuildInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ BuildInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/serverless/v1/service/build", "BuildInstance")
  @js.native
  open class BuildInstance protected () extends SerializableClass {
    /**
      * Initialize the BuildContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the Build resource is associated with
      * @param sid - The SID of the Build resource to fetch
      */
    def this(version: typings.twilio.serverlessV1Mod.^, payload: BuildPayload, serviceSid: String, sid: String) = this()
    
    /* private */ var _proxy: BuildContext = js.native
    
    var accountSid: String = js.native
    
    var assetVersions: js.Array[js.Object] = js.native
    
    /**
      * Access the buildStatus
      */
    def buildStatus(): BuildStatusListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var dependencies: js.Array[js.Object] = js.native
    
    /**
      * fetch a BuildInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BuildInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BuildInstance] = js.native
    
    var functionVersions: js.Array[js.Object] = js.native
    
    var links: String = js.native
    
    /**
      * remove a BuildInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var runtime: BuildRuntime = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var status: BuildStatus = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the BuildList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the Build resource is associated with
    */
  inline def BuildList(version: typings.twilio.serverlessV1Mod.^, serviceSid: String): BuildListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[BuildListInstance]
  
  @JSImport("twilio/lib/rest/serverless/v1/service/build", "BuildPage")
  @js.native
  open class BuildPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.serverlessV1Mod.^, BuildPayload, BuildResource, BuildInstance] {
    /**
      * Initialize the BuildPage
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
      solution: BuildSolution
    ) = this()
    
    /**
      * Build an instance of BuildInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: BuildPayload): BuildInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait BuildListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): BuildContext = js.native
    
    /**
      * create a BuildInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[BuildInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ BuildInstance, Any]): js.Promise[BuildInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ BuildInstance, Any]): js.Promise[BuildInstance] = js.native
    def create(opts: BuildListInstanceCreateOptions): js.Promise[BuildInstance] = js.native
    def create(
      opts: BuildListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ BuildInstance, Any]
    ): js.Promise[BuildInstance] = js.native
    
    /**
      * Streams BuildInstance records from the API.
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
          /* item */ BuildInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ BuildInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: BuildListInstanceEachOptions): Unit = js.native
    def each(
      opts: BuildListInstanceEachOptions,
      callback: js.Function2[
          /* item */ BuildInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a build
      *
      * @param sid - The SID of the Build resource to fetch
      */
    def get(sid: String): BuildContext = js.native
    
    /**
      * Retrieve a single target page of BuildInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[BuildPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ BuildPage, Any]): js.Promise[BuildPage] = js.native
    def getPage(targetUrl: String): js.Promise[BuildPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ BuildPage, Any]): js.Promise[BuildPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ BuildPage, Any]): js.Promise[BuildPage] = js.native
    
    /**
      * Lists BuildInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[BuildInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BuildInstance], Any]): js.Promise[js.Array[BuildInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BuildInstance], Any]
    ): js.Promise[js.Array[BuildInstance]] = js.native
    def list(opts: BuildListInstanceOptions): js.Promise[js.Array[BuildInstance]] = js.native
    def list(
      opts: BuildListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BuildInstance], Any]
    ): js.Promise[js.Array[BuildInstance]] = js.native
    
    /**
      * Retrieve a single page of BuildInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[BuildPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ BuildPage, Any]): js.Promise[BuildPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ BuildPage, Any]): js.Promise[BuildPage] = js.native
    def page(opts: BuildListInstancePageOptions): js.Promise[BuildPage] = js.native
    def page(
      opts: BuildListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BuildPage, Any]
    ): js.Promise[BuildPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property assetVersions - The list of Asset Version resource SIDs to include in the Build
    * @property dependencies - A list of objects that describe the Dependencies included in the Build
    * @property functionVersions - The list of the Function Version resource SIDs to include in the Build
    * @property runtime - The Runtime version that will be used to run the Build.
    */
  trait BuildListInstanceCreateOptions extends StObject {
    
    var assetVersions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var dependencies: js.UndefOr[String] = js.undefined
    
    var functionVersions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var runtime: js.UndefOr[String] = js.undefined
  }
  object BuildListInstanceCreateOptions {
    
    inline def apply(): BuildListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildListInstanceCreateOptions]
    }
    
    extension [Self <: BuildListInstanceCreateOptions](x: Self) {
      
      inline def setAssetVersions(value: String | js.Array[String]): Self = StObject.set(x, "assetVersions", value.asInstanceOf[js.Any])
      
      inline def setAssetVersionsUndefined: Self = StObject.set(x, "assetVersions", js.undefined)
      
      inline def setAssetVersionsVarargs(value: String*): Self = StObject.set(x, "assetVersions", js.Array(value*))
      
      inline def setDependencies(value: String): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setFunctionVersions(value: String | js.Array[String]): Self = StObject.set(x, "functionVersions", value.asInstanceOf[js.Any])
      
      inline def setFunctionVersionsUndefined: Self = StObject.set(x, "functionVersions", js.undefined)
      
      inline def setFunctionVersionsVarargs(value: String*): Self = StObject.set(x, "functionVersions", js.Array(value*))
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
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
  trait BuildListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ BuildInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object BuildListInstanceEachOptions {
    
    inline def apply(): BuildListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildListInstanceEachOptions]
    }
    
    extension [Self <: BuildListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ BuildInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait BuildListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object BuildListInstanceOptions {
    
    inline def apply(): BuildListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildListInstanceOptions]
    }
    
    extension [Self <: BuildListInstanceOptions](x: Self) {
      
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
  trait BuildListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object BuildListInstancePageOptions {
    
    inline def apply(): BuildListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildListInstancePageOptions]
    }
    
    extension [Self <: BuildListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait BuildPayload
    extends StObject
       with BuildResource
       with TwilioResponsePayload
  object BuildPayload {
    
    inline def apply(
      account_sid: String,
      asset_versions: js.Array[js.Object],
      date_created: js.Date,
      date_updated: js.Date,
      dependencies: js.Array[js.Object],
      first_page_uri: String,
      function_versions: js.Array[js.Object],
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      runtime: BuildRuntime,
      service_sid: String,
      sid: String,
      status: BuildStatus,
      uri: String,
      url: String
    ): BuildPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], asset_versions = asset_versions.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], function_versions = function_versions.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildPayload]
    }
  }
  
  trait BuildResource extends StObject {
    
    var account_sid: String
    
    var asset_versions: js.Array[js.Object]
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var dependencies: js.Array[js.Object]
    
    var function_versions: js.Array[js.Object]
    
    var links: String
    
    var runtime: BuildRuntime
    
    var service_sid: String
    
    var sid: String
    
    var status: BuildStatus
    
    var url: String
  }
  object BuildResource {
    
    inline def apply(
      account_sid: String,
      asset_versions: js.Array[js.Object],
      date_created: js.Date,
      date_updated: js.Date,
      dependencies: js.Array[js.Object],
      function_versions: js.Array[js.Object],
      links: String,
      runtime: BuildRuntime,
      service_sid: String,
      sid: String,
      status: BuildStatus,
      url: String
    ): BuildResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], asset_versions = asset_versions.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], function_versions = function_versions.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildResource]
    }
    
    extension [Self <: BuildResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAsset_versions(value: js.Array[js.Object]): Self = StObject.set(x, "asset_versions", value.asInstanceOf[js.Any])
      
      inline def setAsset_versionsVarargs(value: js.Object*): Self = StObject.set(x, "asset_versions", js.Array(value*))
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: js.Array[js.Object]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: js.Object*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setFunction_versions(value: js.Array[js.Object]): Self = StObject.set(x, "function_versions", value.asInstanceOf[js.Any])
      
      inline def setFunction_versionsVarargs(value: js.Object*): Self = StObject.set(x, "function_versions", js.Array(value*))
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: BuildRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: BuildStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.node8
    - typings.twilio.twilioStrings.node10
    - typings.twilio.twilioStrings.node12
    - typings.twilio.twilioStrings.node14
  */
  trait BuildRuntime extends StObject
  object BuildRuntime {
    
    inline def node10: typings.twilio.twilioStrings.node10 = "node10".asInstanceOf[typings.twilio.twilioStrings.node10]
    
    inline def node12: typings.twilio.twilioStrings.node12 = "node12".asInstanceOf[typings.twilio.twilioStrings.node12]
    
    inline def node14: typings.twilio.twilioStrings.node14 = "node14".asInstanceOf[typings.twilio.twilioStrings.node14]
    
    inline def node8: typings.twilio.twilioStrings.node8 = "node8".asInstanceOf[typings.twilio.twilioStrings.node8]
  }
  
  trait BuildSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object BuildSolution {
    
    inline def apply(): BuildSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildSolution]
    }
    
    extension [Self <: BuildSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.building
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.failed__
  */
  trait BuildStatus extends StObject
  object BuildStatus {
    
    inline def building: typings.twilio.twilioStrings.building = "building".asInstanceOf[typings.twilio.twilioStrings.building]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
  }
}
