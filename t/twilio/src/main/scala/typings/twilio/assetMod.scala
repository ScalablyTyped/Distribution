package typings.twilio

import typings.twilio.assetVersionMod.AssetVersionContext
import typings.twilio.assetVersionMod.AssetVersionListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetMod {
  
  @JSImport("twilio/lib/rest/serverless/v1/service/asset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/serverless/v1/service/asset", "AssetContext")
  @js.native
  open class AssetContext protected () extends StObject {
    /**
      * Initialize the AssetContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the Asset resource from
      * @param sid - The SID that identifies the Asset resource to fetch
      */
    def this(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def assetVersions(sid: String): AssetVersionContext = js.native
    @JSName("assetVersions")
    var assetVersions_Original: AssetVersionListInstance = js.native
    
    /**
      * fetch a AssetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssetInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetInstance, Any]): js.Promise[AssetInstance] = js.native
    
    /**
      * remove a AssetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a AssetInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: AssetInstanceUpdateOptions): js.Promise[AssetInstance] = js.native
    def update(
      opts: AssetInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetInstance, Any]
    ): js.Promise[AssetInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/serverless/v1/service/asset", "AssetInstance")
  @js.native
  open class AssetInstance protected () extends SerializableClass {
    /**
      * Initialize the AssetContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the Asset resource is associated with
      * @param sid - The SID that identifies the Asset resource to fetch
      */
    def this(version: typings.twilio.serverlessV1Mod.^, payload: AssetPayload, serviceSid: String, sid: String) = this()
    
    /* private */ var _proxy: AssetContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the assetVersions
      */
    def assetVersions(): AssetVersionListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a AssetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssetInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AssetInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    /**
      * remove a AssetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    /**
      * update a AssetInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: AssetInstanceUpdateOptions): js.Promise[AssetInstance] = js.native
    def update(
      opts: AssetInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[AssetInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AssetList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the Asset resource is associated with
    */
  inline def AssetList(version: typings.twilio.serverlessV1Mod.^, serviceSid: String): AssetListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AssetList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[AssetListInstance]
  
  @JSImport("twilio/lib/rest/serverless/v1/service/asset", "AssetPage")
  @js.native
  open class AssetPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.serverlessV1Mod.^, AssetPayload, AssetResource, AssetInstance] {
    /**
      * Initialize the AssetPage
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
      solution: AssetSolution
    ) = this()
    
    /**
      * Build an instance of AssetInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AssetPayload): AssetInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - A string to describe the Asset resource
    */
  trait AssetInstanceUpdateOptions extends StObject {
    
    var friendlyName: String
  }
  object AssetInstanceUpdateOptions {
    
    inline def apply(friendlyName: String): AssetInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetInstanceUpdateOptions]
    }
    
    extension [Self <: AssetInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AssetListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AssetContext = js.native
    
    /**
      * create a AssetInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: AssetListInstanceCreateOptions): js.Promise[AssetInstance] = js.native
    def create(
      opts: AssetListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ AssetInstance, Any]
    ): js.Promise[AssetInstance] = js.native
    
    /**
      * Streams AssetInstance records from the API.
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
          /* item */ AssetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AssetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AssetListInstanceEachOptions): Unit = js.native
    def each(
      opts: AssetListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AssetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a asset
      *
      * @param sid - The SID that identifies the Asset resource to fetch
      */
    def get(sid: String): AssetContext = js.native
    
    /**
      * Retrieve a single target page of AssetInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AssetPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetPage, Any]): js.Promise[AssetPage] = js.native
    def getPage(targetUrl: String): js.Promise[AssetPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetPage, Any]): js.Promise[AssetPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetPage, Any]): js.Promise[AssetPage] = js.native
    
    /**
      * Lists AssetInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AssetInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AssetInstance], Any]): js.Promise[js.Array[AssetInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AssetInstance], Any]
    ): js.Promise[js.Array[AssetInstance]] = js.native
    def list(opts: AssetListInstanceOptions): js.Promise[js.Array[AssetInstance]] = js.native
    def list(
      opts: AssetListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AssetInstance], Any]
    ): js.Promise[js.Array[AssetInstance]] = js.native
    
    /**
      * Retrieve a single page of AssetInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AssetPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetPage, Any]): js.Promise[AssetPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetPage, Any]): js.Promise[AssetPage] = js.native
    def page(opts: AssetListInstancePageOptions): js.Promise[AssetPage] = js.native
    def page(
      opts: AssetListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssetPage, Any]
    ): js.Promise[AssetPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property friendlyName - A string to describe the Asset resource
    */
  trait AssetListInstanceCreateOptions extends StObject {
    
    var friendlyName: String
  }
  object AssetListInstanceCreateOptions {
    
    inline def apply(friendlyName: String): AssetListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetListInstanceCreateOptions]
    }
    
    extension [Self <: AssetListInstanceCreateOptions](x: Self) {
      
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
  trait AssetListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AssetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AssetListInstanceEachOptions {
    
    inline def apply(): AssetListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssetListInstanceEachOptions]
    }
    
    extension [Self <: AssetListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AssetInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait AssetListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AssetListInstanceOptions {
    
    inline def apply(): AssetListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssetListInstanceOptions]
    }
    
    extension [Self <: AssetListInstanceOptions](x: Self) {
      
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
  trait AssetListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AssetListInstancePageOptions {
    
    inline def apply(): AssetListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssetListInstancePageOptions]
    }
    
    extension [Self <: AssetListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait AssetPayload
    extends StObject
       with AssetResource
       with TwilioResponsePayload
  object AssetPayload {
    
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
      service_sid: String,
      sid: String,
      uri: String,
      url: String
    ): AssetPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetPayload]
    }
  }
  
  trait AssetResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: String
    
    var service_sid: String
    
    var sid: String
    
    var url: String
  }
  object AssetResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: String,
      service_sid: String,
      sid: String,
      url: String
    ): AssetResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetResource]
    }
    
    extension [Self <: AssetResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssetSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object AssetSolution {
    
    inline def apply(): AssetSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssetSolution]
    }
    
    extension [Self <: AssetSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
