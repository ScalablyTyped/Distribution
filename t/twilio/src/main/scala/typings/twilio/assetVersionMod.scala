package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetVersionMod {
  
  @JSImport("twilio/lib/rest/serverless/v1/service/asset/assetVersion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/serverless/v1/service/asset/assetVersion", "AssetVersionContext")
  @js.native
  open class AssetVersionContext protected () extends StObject {
    /**
      * Initialize the AssetVersionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the Asset Version resource from
      * @param assetSid - The SID of the Asset resource that is the parent of the Asset Version resource to fetch
      * @param sid - The SID that identifies the Asset Version resource to fetch
      */
    def this(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, assetSid: String, sid: String) = this()
    
    /**
      * fetch a AssetVersionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssetVersionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetVersionInstance, Any]): js.Promise[AssetVersionInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/serverless/v1/service/asset/assetVersion", "AssetVersionInstance")
  @js.native
  open class AssetVersionInstance protected () extends SerializableClass {
    /**
      * Initialize the AssetVersionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the Asset Version resource is associated with
      * @param assetSid - The SID of the Asset resource that is the parent of the Asset Version
      * @param sid - The SID that identifies the Asset Version resource to fetch
      */
    def this(
      version: typings.twilio.serverlessV1Mod.^,
      payload: AssetVersionPayload,
      serviceSid: String,
      assetSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: AssetVersionContext = js.native
    
    var accountSid: String = js.native
    
    var assetSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    /**
      * fetch a AssetVersionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssetVersionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AssetVersionInstance] = js.native
    
    var path: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
    
    var visibility: AssetVersionVisibility = js.native
  }
  
  /**
    * Initialize the AssetVersionList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the Asset Version resource is associated with
    * @param assetSid - The SID of the Asset resource that is the parent of the Asset Version
    */
  inline def AssetVersionList(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, assetSid: String): AssetVersionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AssetVersionList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], assetSid.asInstanceOf[js.Any])).asInstanceOf[AssetVersionListInstance]
  
  @JSImport("twilio/lib/rest/serverless/v1/service/asset/assetVersion", "AssetVersionPage")
  @js.native
  open class AssetVersionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.serverlessV1Mod.^, 
          AssetVersionPayload, 
          AssetVersionResource, 
          AssetVersionInstance
        ] {
    /**
      * Initialize the AssetVersionPage
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
      solution: AssetVersionSolution
    ) = this()
    
    /**
      * Build an instance of AssetVersionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AssetVersionPayload): AssetVersionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AssetVersionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AssetVersionContext = js.native
    
    /**
      * Streams AssetVersionInstance records from the API.
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
          /* item */ AssetVersionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AssetVersionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AssetVersionListInstanceEachOptions): Unit = js.native
    def each(
      opts: AssetVersionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AssetVersionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a asset_version
      *
      * @param sid - The SID that identifies the Asset Version resource to fetch
      */
    def get(sid: String): AssetVersionContext = js.native
    
    /**
      * Retrieve a single target page of AssetVersionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AssetVersionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetVersionPage, Any]): js.Promise[AssetVersionPage] = js.native
    def getPage(targetUrl: String): js.Promise[AssetVersionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetVersionPage, Any]
    ): js.Promise[AssetVersionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetVersionPage, Any]
    ): js.Promise[AssetVersionPage] = js.native
    
    /**
      * Lists AssetVersionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AssetVersionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AssetVersionInstance], Any]
    ): js.Promise[js.Array[AssetVersionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AssetVersionInstance], Any]
    ): js.Promise[js.Array[AssetVersionInstance]] = js.native
    def list(opts: AssetVersionListInstanceOptions): js.Promise[js.Array[AssetVersionInstance]] = js.native
    def list(
      opts: AssetVersionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AssetVersionInstance], Any]
    ): js.Promise[js.Array[AssetVersionInstance]] = js.native
    
    /**
      * Retrieve a single page of AssetVersionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AssetVersionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetVersionPage, Any]): js.Promise[AssetVersionPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetVersionPage, Any]): js.Promise[AssetVersionPage] = js.native
    def page(opts: AssetVersionListInstancePageOptions): js.Promise[AssetVersionPage] = js.native
    def page(
      opts: AssetVersionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetVersionPage, Any]
    ): js.Promise[AssetVersionPage] = js.native
    
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
  trait AssetVersionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AssetVersionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AssetVersionListInstanceEachOptions {
    
    inline def apply(): AssetVersionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssetVersionListInstanceEachOptions]
    }
    
    extension [Self <: AssetVersionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AssetVersionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait AssetVersionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AssetVersionListInstanceOptions {
    
    inline def apply(): AssetVersionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssetVersionListInstanceOptions]
    }
    
    extension [Self <: AssetVersionListInstanceOptions](x: Self) {
      
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
  trait AssetVersionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AssetVersionListInstancePageOptions {
    
    inline def apply(): AssetVersionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssetVersionListInstancePageOptions]
    }
    
    extension [Self <: AssetVersionListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait AssetVersionPayload
    extends StObject
       with AssetVersionResource
       with TwilioResponsePayload
  object AssetVersionPayload {
    
    inline def apply(
      account_sid: String,
      asset_sid: String,
      date_created: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      path: String,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String,
      visibility: AssetVersionVisibility
    ): AssetVersionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], asset_sid = asset_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetVersionPayload]
    }
  }
  
  trait AssetVersionResource extends StObject {
    
    var account_sid: String
    
    var asset_sid: String
    
    var date_created: js.Date
    
    var path: String
    
    var service_sid: String
    
    var sid: String
    
    var url: String
    
    var visibility: AssetVersionVisibility
  }
  object AssetVersionResource {
    
    inline def apply(
      account_sid: String,
      asset_sid: String,
      date_created: js.Date,
      path: String,
      service_sid: String,
      sid: String,
      url: String,
      visibility: AssetVersionVisibility
    ): AssetVersionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], asset_sid = asset_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetVersionResource]
    }
    
    extension [Self <: AssetVersionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAsset_sid(value: String): Self = StObject.set(x, "asset_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVisibility(value: AssetVersionVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssetVersionSolution extends StObject {
    
    var assetSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object AssetVersionSolution {
    
    inline def apply(): AssetVersionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssetVersionSolution]
    }
    
    extension [Self <: AssetVersionSolution](x: Self) {
      
      inline def setAssetSid(value: String): Self = StObject.set(x, "assetSid", value.asInstanceOf[js.Any])
      
      inline def setAssetSidUndefined: Self = StObject.set(x, "assetSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.public
    - typings.twilio.twilioStrings.`private`
    - typings.twilio.twilioStrings.`protected`
  */
  trait AssetVersionVisibility extends StObject
  object AssetVersionVisibility {
    
    inline def `private`: typings.twilio.twilioStrings.`private` = "private".asInstanceOf[typings.twilio.twilioStrings.`private`]
    
    inline def `protected`: typings.twilio.twilioStrings.`protected` = "protected".asInstanceOf[typings.twilio.twilioStrings.`protected`]
    
    inline def public: typings.twilio.twilioStrings.public = "public".asInstanceOf[typings.twilio.twilioStrings.public]
  }
}
