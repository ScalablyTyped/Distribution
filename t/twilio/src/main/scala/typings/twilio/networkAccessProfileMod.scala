package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.networkAccessProfileNetworkMod.NetworkAccessProfileNetworkContext
import typings.twilio.networkAccessProfileNetworkMod.NetworkAccessProfileNetworkListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkAccessProfileMod {
  
  @JSImport("twilio/lib/rest/supersim/v1/networkAccessProfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/supersim/v1/networkAccessProfile", "NetworkAccessProfileContext")
  @js.native
  open class NetworkAccessProfileContext protected () extends StObject {
    /**
      * Initialize the NetworkAccessProfileContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, sid: String) = this()
    
    /**
      * fetch a NetworkAccessProfileInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NetworkAccessProfileInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfileInstance, Any]): js.Promise[NetworkAccessProfileInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def networks(sid: String): NetworkAccessProfileNetworkContext = js.native
    @JSName("networks")
    var networks_Original: NetworkAccessProfileNetworkListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a NetworkAccessProfileInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[NetworkAccessProfileInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfileInstance, Any]): js.Promise[NetworkAccessProfileInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfileInstance, Any]
    ): js.Promise[NetworkAccessProfileInstance] = js.native
    def update(opts: NetworkAccessProfileInstanceUpdateOptions): js.Promise[NetworkAccessProfileInstance] = js.native
    def update(
      opts: NetworkAccessProfileInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfileInstance, Any]
    ): js.Promise[NetworkAccessProfileInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/supersim/v1/networkAccessProfile", "NetworkAccessProfileInstance")
  @js.native
  open class NetworkAccessProfileInstance protected () extends SerializableClass {
    /**
      * Initialize the NetworkAccessProfileContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, payload: NetworkAccessProfilePayload, sid: String) = this()
    
    /* private */ var _proxy: NetworkAccessProfileContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a NetworkAccessProfileInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NetworkAccessProfileInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[NetworkAccessProfileInstance] = js.native
    
    var links: String = js.native
    
    /**
      * Access the networks
      */
    def networks(): NetworkAccessProfileNetworkListInstance = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a NetworkAccessProfileInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[NetworkAccessProfileInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[NetworkAccessProfileInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[NetworkAccessProfileInstance] = js.native
    def update(opts: NetworkAccessProfileInstanceUpdateOptions): js.Promise[NetworkAccessProfileInstance] = js.native
    def update(
      opts: NetworkAccessProfileInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[NetworkAccessProfileInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the NetworkAccessProfileList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def NetworkAccessProfileList(version: typings.twilio.supersimV1Mod.^): NetworkAccessProfileListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("NetworkAccessProfileList")(version.asInstanceOf[js.Any]).asInstanceOf[NetworkAccessProfileListInstance]
  
  @JSImport("twilio/lib/rest/supersim/v1/networkAccessProfile", "NetworkAccessProfilePage")
  @js.native
  open class NetworkAccessProfilePage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.supersimV1Mod.^, 
          NetworkAccessProfilePayload, 
          NetworkAccessProfileResource, 
          NetworkAccessProfileInstance
        ] {
    /**
      * Initialize the NetworkAccessProfilePage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.supersimV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: NetworkAccessProfileSolution
    ) = this()
    
    /**
      * Build an instance of NetworkAccessProfileInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: NetworkAccessProfilePayload): NetworkAccessProfileInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property uniqueName - The new unique name of the resource
    */
  trait NetworkAccessProfileInstanceUpdateOptions extends StObject {
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object NetworkAccessProfileInstanceUpdateOptions {
    
    inline def apply(): NetworkAccessProfileInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkAccessProfileInstanceUpdateOptions]
    }
    
    extension [Self <: NetworkAccessProfileInstanceUpdateOptions](x: Self) {
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  @js.native
  trait NetworkAccessProfileListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): NetworkAccessProfileContext = js.native
    
    /**
      * create a NetworkAccessProfileInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[NetworkAccessProfileInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ NetworkAccessProfileInstance, Any]): js.Promise[NetworkAccessProfileInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ NetworkAccessProfileInstance, Any]
    ): js.Promise[NetworkAccessProfileInstance] = js.native
    def create(opts: NetworkAccessProfileListInstanceCreateOptions): js.Promise[NetworkAccessProfileInstance] = js.native
    def create(
      opts: NetworkAccessProfileListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ NetworkAccessProfileInstance, Any]
    ): js.Promise[NetworkAccessProfileInstance] = js.native
    
    /**
      * Streams NetworkAccessProfileInstance records from the API.
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
          /* item */ NetworkAccessProfileInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ NetworkAccessProfileInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: NetworkAccessProfileListInstanceEachOptions): Unit = js.native
    def each(
      opts: NetworkAccessProfileListInstanceEachOptions,
      callback: js.Function2[
          /* item */ NetworkAccessProfileInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a network_access_profile
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): NetworkAccessProfileContext = js.native
    
    /**
      * Retrieve a single target page of NetworkAccessProfileInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[NetworkAccessProfilePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfilePage, Any]): js.Promise[NetworkAccessProfilePage] = js.native
    def getPage(targetUrl: String): js.Promise[NetworkAccessProfilePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfilePage, Any]
    ): js.Promise[NetworkAccessProfilePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfilePage, Any]
    ): js.Promise[NetworkAccessProfilePage] = js.native
    
    /**
      * Lists NetworkAccessProfileInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[NetworkAccessProfileInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[NetworkAccessProfileInstance], Any]
    ): js.Promise[js.Array[NetworkAccessProfileInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[NetworkAccessProfileInstance], Any]
    ): js.Promise[js.Array[NetworkAccessProfileInstance]] = js.native
    def list(opts: NetworkAccessProfileListInstanceOptions): js.Promise[js.Array[NetworkAccessProfileInstance]] = js.native
    def list(
      opts: NetworkAccessProfileListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[NetworkAccessProfileInstance], Any]
    ): js.Promise[js.Array[NetworkAccessProfileInstance]] = js.native
    
    /**
      * Retrieve a single page of NetworkAccessProfileInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[NetworkAccessProfilePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfilePage, Any]): js.Promise[NetworkAccessProfilePage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfilePage, Any]
    ): js.Promise[NetworkAccessProfilePage] = js.native
    def page(opts: NetworkAccessProfileListInstancePageOptions): js.Promise[NetworkAccessProfilePage] = js.native
    def page(
      opts: NetworkAccessProfileListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfilePage, Any]
    ): js.Promise[NetworkAccessProfilePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property networks - List of Network SIDs that this Network Access Profile will allow connections to
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    */
  trait NetworkAccessProfileListInstanceCreateOptions extends StObject {
    
    var networks: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object NetworkAccessProfileListInstanceCreateOptions {
    
    inline def apply(): NetworkAccessProfileListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkAccessProfileListInstanceCreateOptions]
    }
    
    extension [Self <: NetworkAccessProfileListInstanceCreateOptions](x: Self) {
      
      inline def setNetworks(value: String | js.Array[String]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
      
      inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
      
      inline def setNetworksVarargs(value: String*): Self = StObject.set(x, "networks", js.Array(value*))
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
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
  trait NetworkAccessProfileListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ NetworkAccessProfileInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object NetworkAccessProfileListInstanceEachOptions {
    
    inline def apply(): NetworkAccessProfileListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkAccessProfileListInstanceEachOptions]
    }
    
    extension [Self <: NetworkAccessProfileListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ NetworkAccessProfileInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait NetworkAccessProfileListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object NetworkAccessProfileListInstanceOptions {
    
    inline def apply(): NetworkAccessProfileListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkAccessProfileListInstanceOptions]
    }
    
    extension [Self <: NetworkAccessProfileListInstanceOptions](x: Self) {
      
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
  trait NetworkAccessProfileListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object NetworkAccessProfileListInstancePageOptions {
    
    inline def apply(): NetworkAccessProfileListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkAccessProfileListInstancePageOptions]
    }
    
    extension [Self <: NetworkAccessProfileListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait NetworkAccessProfilePayload
    extends StObject
       with NetworkAccessProfileResource
       with TwilioResponsePayload
  object NetworkAccessProfilePayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): NetworkAccessProfilePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkAccessProfilePayload]
    }
  }
  
  trait NetworkAccessProfileResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var links: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object NetworkAccessProfileResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      links: String,
      sid: String,
      unique_name: String,
      url: String
    ): NetworkAccessProfileResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkAccessProfileResource]
    }
    
    extension [Self <: NetworkAccessProfileResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkAccessProfileSolution extends StObject
}
