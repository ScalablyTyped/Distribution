package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkMod {
  
  @JSImport("twilio/lib/rest/supersim/v1/network", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/supersim/v1/network", "NetworkContext")
  @js.native
  open class NetworkContext protected () extends StObject {
    /**
      * Initialize the NetworkContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - The SID of the Network resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, sid: String) = this()
    
    /**
      * fetch a NetworkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NetworkInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkInstance, Any]): js.Promise[NetworkInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/supersim/v1/network", "NetworkInstance")
  @js.native
  open class NetworkInstance protected () extends SerializableClass {
    /**
      * Initialize the NetworkContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID of the Network resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, payload: NetworkPayload, sid: String) = this()
    
    /* private */ var _proxy: NetworkContext = js.native
    
    /**
      * fetch a NetworkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NetworkInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[NetworkInstance] = js.native
    
    var friendlyName: String = js.native
    
    var identifiers: js.Array[js.Object] = js.native
    
    var isoCountry: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the NetworkList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def NetworkList(version: typings.twilio.supersimV1Mod.^): NetworkListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("NetworkList")(version.asInstanceOf[js.Any]).asInstanceOf[NetworkListInstance]
  
  @JSImport("twilio/lib/rest/supersim/v1/network", "NetworkPage")
  @js.native
  open class NetworkPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.supersimV1Mod.^, NetworkPayload, NetworkResource, NetworkInstance] {
    /**
      * Initialize the NetworkPage
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
      solution: NetworkSolution
    ) = this()
    
    /**
      * Build an instance of NetworkInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: NetworkPayload): NetworkInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait NetworkListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): NetworkContext = js.native
    
    /**
      * Streams NetworkInstance records from the API.
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
          /* item */ NetworkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ NetworkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: NetworkListInstanceEachOptions): Unit = js.native
    def each(
      opts: NetworkListInstanceEachOptions,
      callback: js.Function2[
          /* item */ NetworkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a network
      *
      * @param sid - The SID of the Network resource to fetch
      */
    def get(sid: String): NetworkContext = js.native
    
    /**
      * Retrieve a single target page of NetworkInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[NetworkPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkPage, Any]): js.Promise[NetworkPage] = js.native
    def getPage(targetUrl: String): js.Promise[NetworkPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkPage, Any]
    ): js.Promise[NetworkPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkPage, Any]): js.Promise[NetworkPage] = js.native
    
    /**
      * Lists NetworkInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[NetworkInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[NetworkInstance], Any]): js.Promise[js.Array[NetworkInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[NetworkInstance], Any]
    ): js.Promise[js.Array[NetworkInstance]] = js.native
    def list(opts: NetworkListInstanceOptions): js.Promise[js.Array[NetworkInstance]] = js.native
    def list(
      opts: NetworkListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[NetworkInstance], Any]
    ): js.Promise[js.Array[NetworkInstance]] = js.native
    
    /**
      * Retrieve a single page of NetworkInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[NetworkPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkPage, Any]): js.Promise[NetworkPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkPage, Any]): js.Promise[NetworkPage] = js.native
    def page(opts: NetworkListInstancePageOptions): js.Promise[NetworkPage] = js.native
    def page(
      opts: NetworkListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NetworkPage, Any]
    ): js.Promise[NetworkPage] = js.native
    
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
    * @property isoCountry - The ISO country code of the Network resources to read
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property mcc - The MCC of Network resource identifiers to be read
    * @property mnc - The MNC of Network resource identifiers to be read
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait NetworkListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ NetworkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var mcc: js.UndefOr[String] = js.undefined
    
    var mnc: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object NetworkListInstanceEachOptions {
    
    inline def apply(): NetworkListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkListInstanceEachOptions]
    }
    
    extension [Self <: NetworkListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ NetworkInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMcc(value: String): Self = StObject.set(x, "mcc", value.asInstanceOf[js.Any])
      
      inline def setMccUndefined: Self = StObject.set(x, "mcc", js.undefined)
      
      inline def setMnc(value: String): Self = StObject.set(x, "mnc", value.asInstanceOf[js.Any])
      
      inline def setMncUndefined: Self = StObject.set(x, "mnc", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property isoCountry - The ISO country code of the Network resources to read
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property mcc - The MCC of Network resource identifiers to be read
    * @property mnc - The MNC of Network resource identifiers to be read
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    */
  trait NetworkListInstanceOptions extends StObject {
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var mcc: js.UndefOr[String] = js.undefined
    
    var mnc: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object NetworkListInstanceOptions {
    
    inline def apply(): NetworkListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkListInstanceOptions]
    }
    
    extension [Self <: NetworkListInstanceOptions](x: Self) {
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMcc(value: String): Self = StObject.set(x, "mcc", value.asInstanceOf[js.Any])
      
      inline def setMccUndefined: Self = StObject.set(x, "mcc", js.undefined)
      
      inline def setMnc(value: String): Self = StObject.set(x, "mnc", value.asInstanceOf[js.Any])
      
      inline def setMncUndefined: Self = StObject.set(x, "mnc", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property isoCountry - The ISO country code of the Network resources to read
    * @property mcc - The MCC of Network resource identifiers to be read
    * @property mnc - The MNC of Network resource identifiers to be read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait NetworkListInstancePageOptions extends StObject {
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var mcc: js.UndefOr[String] = js.undefined
    
    var mnc: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object NetworkListInstancePageOptions {
    
    inline def apply(): NetworkListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkListInstancePageOptions]
    }
    
    extension [Self <: NetworkListInstancePageOptions](x: Self) {
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setMcc(value: String): Self = StObject.set(x, "mcc", value.asInstanceOf[js.Any])
      
      inline def setMccUndefined: Self = StObject.set(x, "mcc", js.undefined)
      
      inline def setMnc(value: String): Self = StObject.set(x, "mnc", value.asInstanceOf[js.Any])
      
      inline def setMncUndefined: Self = StObject.set(x, "mnc", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait NetworkPayload
    extends StObject
       with NetworkResource
       with TwilioResponsePayload
  object NetworkPayload {
    
    inline def apply(
      first_page_uri: String,
      friendly_name: String,
      identifiers: js.Array[js.Object],
      iso_country: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): NetworkPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkPayload]
    }
  }
  
  trait NetworkResource extends StObject {
    
    var friendly_name: String
    
    var identifiers: js.Array[js.Object]
    
    var iso_country: String
    
    var sid: String
    
    var url: String
  }
  object NetworkResource {
    
    inline def apply(
      friendly_name: String,
      identifiers: js.Array[js.Object],
      iso_country: String,
      sid: String,
      url: String
    ): NetworkResource = {
      val __obj = js.Dynamic.literal(friendly_name = friendly_name.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkResource]
    }
    
    extension [Self <: NetworkResource](x: Self) {
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIdentifiers(value: js.Array[js.Object]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
      
      inline def setIdentifiersVarargs(value: js.Object*): Self = StObject.set(x, "identifiers", js.Array(value*))
      
      inline def setIso_country(value: String): Self = StObject.set(x, "iso_country", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkSolution extends StObject
}
