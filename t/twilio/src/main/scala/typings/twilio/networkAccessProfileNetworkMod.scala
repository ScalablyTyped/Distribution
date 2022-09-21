package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkAccessProfileNetworkMod {
  
  @JSImport("twilio/lib/rest/supersim/v1/networkAccessProfile/networkAccessProfileNetwork", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/supersim/v1/networkAccessProfile/networkAccessProfileNetwork", "NetworkAccessProfileNetworkContext")
  @js.native
  open class NetworkAccessProfileNetworkContext protected () extends StObject {
    /**
      * Initialize the NetworkAccessProfileNetworkContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param networkAccessProfileSid - The unique string that identifies the Network Access Profile resource
      * @param sid - The SID of the resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, networkAccessProfileSid: String, sid: String) = this()
    
    /**
      * fetch a NetworkAccessProfileNetworkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NetworkAccessProfileNetworkInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfileNetworkInstance, Any]
    ): js.Promise[NetworkAccessProfileNetworkInstance] = js.native
    
    /**
      * remove a NetworkAccessProfileNetworkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfileNetworkInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/supersim/v1/networkAccessProfile/networkAccessProfileNetwork", "NetworkAccessProfileNetworkInstance")
  @js.native
  open class NetworkAccessProfileNetworkInstance protected () extends SerializableClass {
    /**
      * Initialize the NetworkAccessProfileNetworkContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param networkAccessProfileSid - The unique string that identifies the Network Access Profile resource
      * @param sid - The SID of the resource to fetch
      */
    def this(
      version: typings.twilio.supersimV1Mod.^,
      payload: NetworkAccessProfileNetworkPayload,
      networkAccessProfileSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: NetworkAccessProfileNetworkContext = js.native
    
    /**
      * fetch a NetworkAccessProfileNetworkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NetworkAccessProfileNetworkInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[NetworkAccessProfileNetworkInstance] = js.native
    
    var friendlyName: String = js.native
    
    var identifiers: js.Array[js.Object] = js.native
    
    var isoCountry: String = js.native
    
    var networkAccessProfileSid: String = js.native
    
    /**
      * remove a NetworkAccessProfileNetworkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the NetworkAccessProfileNetworkList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param networkAccessProfileSid - The unique string that identifies the Network Access Profile resource
    */
  inline def NetworkAccessProfileNetworkList(version: typings.twilio.supersimV1Mod.^, networkAccessProfileSid: String): NetworkAccessProfileNetworkListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("NetworkAccessProfileNetworkList")(version.asInstanceOf[js.Any], networkAccessProfileSid.asInstanceOf[js.Any])).asInstanceOf[NetworkAccessProfileNetworkListInstance]
  
  @JSImport("twilio/lib/rest/supersim/v1/networkAccessProfile/networkAccessProfileNetwork", "NetworkAccessProfileNetworkPage")
  @js.native
  open class NetworkAccessProfileNetworkPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.supersimV1Mod.^, 
          NetworkAccessProfileNetworkPayload, 
          NetworkAccessProfileNetworkResource, 
          NetworkAccessProfileNetworkInstance
        ] {
    /**
      * Initialize the NetworkAccessProfileNetworkPage
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
      solution: NetworkAccessProfileNetworkSolution
    ) = this()
    
    /**
      * Build an instance of NetworkAccessProfileNetworkInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: NetworkAccessProfileNetworkPayload): NetworkAccessProfileNetworkInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait NetworkAccessProfileNetworkListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): NetworkAccessProfileNetworkContext = js.native
    
    /**
      * create a NetworkAccessProfileNetworkInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: NetworkAccessProfileNetworkListInstanceCreateOptions): js.Promise[NetworkAccessProfileNetworkInstance] = js.native
    def create(
      opts: NetworkAccessProfileNetworkListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ NetworkAccessProfileNetworkInstance, Any]
    ): js.Promise[NetworkAccessProfileNetworkInstance] = js.native
    
    /**
      * Streams NetworkAccessProfileNetworkInstance records from the API.
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
          /* item */ NetworkAccessProfileNetworkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ NetworkAccessProfileNetworkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: NetworkAccessProfileNetworkListInstanceEachOptions): Unit = js.native
    def each(
      opts: NetworkAccessProfileNetworkListInstanceEachOptions,
      callback: js.Function2[
          /* item */ NetworkAccessProfileNetworkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a network_access_profile_network
      *
      * @param sid - The SID of the resource to fetch
      */
    def get(sid: String): NetworkAccessProfileNetworkContext = js.native
    
    /**
      * Retrieve a single target page of NetworkAccessProfileNetworkInstance records
      * from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[NetworkAccessProfileNetworkPage] = js.native
    def getPage(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfileNetworkPage, Any]
    ): js.Promise[NetworkAccessProfileNetworkPage] = js.native
    def getPage(targetUrl: String): js.Promise[NetworkAccessProfileNetworkPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfileNetworkPage, Any]
    ): js.Promise[NetworkAccessProfileNetworkPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfileNetworkPage, Any]
    ): js.Promise[NetworkAccessProfileNetworkPage] = js.native
    
    /**
      * Lists NetworkAccessProfileNetworkInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[NetworkAccessProfileNetworkInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[NetworkAccessProfileNetworkInstance], 
          Any
        ]
    ): js.Promise[js.Array[NetworkAccessProfileNetworkInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[NetworkAccessProfileNetworkInstance], 
          Any
        ]
    ): js.Promise[js.Array[NetworkAccessProfileNetworkInstance]] = js.native
    def list(opts: NetworkAccessProfileNetworkListInstanceOptions): js.Promise[js.Array[NetworkAccessProfileNetworkInstance]] = js.native
    def list(
      opts: NetworkAccessProfileNetworkListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[NetworkAccessProfileNetworkInstance], 
          Any
        ]
    ): js.Promise[js.Array[NetworkAccessProfileNetworkInstance]] = js.native
    
    /**
      * Retrieve a single page of NetworkAccessProfileNetworkInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[NetworkAccessProfileNetworkPage] = js.native
    def page(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfileNetworkPage, Any]
    ): js.Promise[NetworkAccessProfileNetworkPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfileNetworkPage, Any]
    ): js.Promise[NetworkAccessProfileNetworkPage] = js.native
    def page(opts: NetworkAccessProfileNetworkListInstancePageOptions): js.Promise[NetworkAccessProfileNetworkPage] = js.native
    def page(
      opts: NetworkAccessProfileNetworkListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkAccessProfileNetworkPage, Any]
    ): js.Promise[NetworkAccessProfileNetworkPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property network - The SID that identifies the Network resource
    */
  trait NetworkAccessProfileNetworkListInstanceCreateOptions extends StObject {
    
    var network: String
  }
  object NetworkAccessProfileNetworkListInstanceCreateOptions {
    
    inline def apply(network: String): NetworkAccessProfileNetworkListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkAccessProfileNetworkListInstanceCreateOptions]
    }
    
    extension [Self <: NetworkAccessProfileNetworkListInstanceCreateOptions](x: Self) {
      
      inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
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
  trait NetworkAccessProfileNetworkListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ NetworkAccessProfileNetworkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object NetworkAccessProfileNetworkListInstanceEachOptions {
    
    inline def apply(): NetworkAccessProfileNetworkListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkAccessProfileNetworkListInstanceEachOptions]
    }
    
    extension [Self <: NetworkAccessProfileNetworkListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ NetworkAccessProfileNetworkInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait NetworkAccessProfileNetworkListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object NetworkAccessProfileNetworkListInstanceOptions {
    
    inline def apply(): NetworkAccessProfileNetworkListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkAccessProfileNetworkListInstanceOptions]
    }
    
    extension [Self <: NetworkAccessProfileNetworkListInstanceOptions](x: Self) {
      
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
  trait NetworkAccessProfileNetworkListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object NetworkAccessProfileNetworkListInstancePageOptions {
    
    inline def apply(): NetworkAccessProfileNetworkListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkAccessProfileNetworkListInstancePageOptions]
    }
    
    extension [Self <: NetworkAccessProfileNetworkListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait NetworkAccessProfileNetworkPayload
    extends StObject
       with NetworkAccessProfileNetworkResource
       with TwilioResponsePayload
  object NetworkAccessProfileNetworkPayload {
    
    inline def apply(
      first_page_uri: String,
      friendly_name: String,
      identifiers: js.Array[js.Object],
      iso_country: String,
      network_access_profile_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): NetworkAccessProfileNetworkPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], network_access_profile_sid = network_access_profile_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkAccessProfileNetworkPayload]
    }
  }
  
  trait NetworkAccessProfileNetworkResource extends StObject {
    
    var friendly_name: String
    
    var identifiers: js.Array[js.Object]
    
    var iso_country: String
    
    var network_access_profile_sid: String
    
    var sid: String
    
    var url: String
  }
  object NetworkAccessProfileNetworkResource {
    
    inline def apply(
      friendly_name: String,
      identifiers: js.Array[js.Object],
      iso_country: String,
      network_access_profile_sid: String,
      sid: String,
      url: String
    ): NetworkAccessProfileNetworkResource = {
      val __obj = js.Dynamic.literal(friendly_name = friendly_name.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], network_access_profile_sid = network_access_profile_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkAccessProfileNetworkResource]
    }
    
    extension [Self <: NetworkAccessProfileNetworkResource](x: Self) {
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIdentifiers(value: js.Array[js.Object]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
      
      inline def setIdentifiersVarargs(value: js.Object*): Self = StObject.set(x, "identifiers", js.Array(value*))
      
      inline def setIso_country(value: String): Self = StObject.set(x, "iso_country", value.asInstanceOf[js.Any])
      
      inline def setNetwork_access_profile_sid(value: String): Self = StObject.set(x, "network_access_profile_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkAccessProfileNetworkSolution extends StObject {
    
    var networkAccessProfileSid: js.UndefOr[String] = js.undefined
  }
  object NetworkAccessProfileNetworkSolution {
    
    inline def apply(): NetworkAccessProfileNetworkSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkAccessProfileNetworkSolution]
    }
    
    extension [Self <: NetworkAccessProfileNetworkSolution](x: Self) {
      
      inline def setNetworkAccessProfileSid(value: String): Self = StObject.set(x, "networkAccessProfileSid", value.asInstanceOf[js.Any])
      
      inline def setNetworkAccessProfileSidUndefined: Self = StObject.set(x, "networkAccessProfileSid", js.undefined)
    }
  }
}
