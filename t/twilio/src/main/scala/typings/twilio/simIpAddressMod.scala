package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simIpAddressMod {
  
  @JSImport("twilio/lib/rest/supersim/v1/sim/simIpAddress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/supersim/v1/sim/simIpAddress", "SimIpAddressInstance")
  @js.native
  open class SimIpAddressInstance protected () extends SerializableClass {
    /**
      * Initialize the SimIpAddressContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param simSid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.supersimV1Mod.^, payload: SimIpAddressPayload, simSid: String) = this()
    
    var ipAddress: String = js.native
    
    var ipAddressVersion: SimIpAddressIpAddressVersion = js.native
  }
  
  /**
    * Initialize the SimIpAddressList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param simSid - The unique string that identifies the resource
    */
  inline def SimIpAddressList(version: typings.twilio.supersimV1Mod.^, simSid: String): SimIpAddressListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SimIpAddressList")(version.asInstanceOf[js.Any], simSid.asInstanceOf[js.Any])).asInstanceOf[SimIpAddressListInstance]
  
  @JSImport("twilio/lib/rest/supersim/v1/sim/simIpAddress", "SimIpAddressPage")
  @js.native
  open class SimIpAddressPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.supersimV1Mod.^, 
          SimIpAddressPayload, 
          SimIpAddressResource, 
          SimIpAddressInstance
        ] {
    /**
      * Initialize the SimIpAddressPage
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
      solution: SimIpAddressSolution
    ) = this()
    
    /**
      * Build an instance of SimIpAddressInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SimIpAddressPayload): SimIpAddressInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.IPv4
    - typings.twilio.twilioStrings.IPv6
  */
  trait SimIpAddressIpAddressVersion extends StObject
  object SimIpAddressIpAddressVersion {
    
    inline def IPv4: typings.twilio.twilioStrings.IPv4 = "IPv4".asInstanceOf[typings.twilio.twilioStrings.IPv4]
    
    inline def IPv6: typings.twilio.twilioStrings.IPv6 = "IPv6".asInstanceOf[typings.twilio.twilioStrings.IPv6]
  }
  
  @js.native
  trait SimIpAddressListInstance extends StObject {
    
    /**
      * Streams SimIpAddressInstance records from the API.
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
          /* item */ SimIpAddressInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SimIpAddressInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SimIpAddressListInstanceEachOptions): Unit = js.native
    def each(
      opts: SimIpAddressListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SimIpAddressInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of SimIpAddressInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SimIpAddressPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SimIpAddressPage, Any]): js.Promise[SimIpAddressPage] = js.native
    def getPage(targetUrl: String): js.Promise[SimIpAddressPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SimIpAddressPage, Any]
    ): js.Promise[SimIpAddressPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SimIpAddressPage, Any]
    ): js.Promise[SimIpAddressPage] = js.native
    
    /**
      * Lists SimIpAddressInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SimIpAddressInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SimIpAddressInstance], Any]
    ): js.Promise[js.Array[SimIpAddressInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SimIpAddressInstance], Any]
    ): js.Promise[js.Array[SimIpAddressInstance]] = js.native
    def list(opts: SimIpAddressListInstanceOptions): js.Promise[js.Array[SimIpAddressInstance]] = js.native
    def list(
      opts: SimIpAddressListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SimIpAddressInstance], Any]
    ): js.Promise[js.Array[SimIpAddressInstance]] = js.native
    
    /**
      * Retrieve a single page of SimIpAddressInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SimIpAddressPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SimIpAddressPage, Any]): js.Promise[SimIpAddressPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SimIpAddressPage, Any]): js.Promise[SimIpAddressPage] = js.native
    def page(opts: SimIpAddressListInstancePageOptions): js.Promise[SimIpAddressPage] = js.native
    def page(
      opts: SimIpAddressListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SimIpAddressPage, Any]
    ): js.Promise[SimIpAddressPage] = js.native
    
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
  trait SimIpAddressListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SimIpAddressInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SimIpAddressListInstanceEachOptions {
    
    inline def apply(): SimIpAddressListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimIpAddressListInstanceEachOptions]
    }
    
    extension [Self <: SimIpAddressListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SimIpAddressInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait SimIpAddressListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SimIpAddressListInstanceOptions {
    
    inline def apply(): SimIpAddressListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimIpAddressListInstanceOptions]
    }
    
    extension [Self <: SimIpAddressListInstanceOptions](x: Self) {
      
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
  trait SimIpAddressListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SimIpAddressListInstancePageOptions {
    
    inline def apply(): SimIpAddressListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimIpAddressListInstancePageOptions]
    }
    
    extension [Self <: SimIpAddressListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SimIpAddressPayload
    extends StObject
       with SimIpAddressResource
       with TwilioResponsePayload
  object SimIpAddressPayload {
    
    inline def apply(
      first_page_uri: String,
      ip_address: String,
      ip_address_version: SimIpAddressIpAddressVersion,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): SimIpAddressPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], ip_address = ip_address.asInstanceOf[js.Any], ip_address_version = ip_address_version.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimIpAddressPayload]
    }
  }
  
  trait SimIpAddressResource extends StObject {
    
    var ip_address: String
    
    var ip_address_version: SimIpAddressIpAddressVersion
  }
  object SimIpAddressResource {
    
    inline def apply(ip_address: String, ip_address_version: SimIpAddressIpAddressVersion): SimIpAddressResource = {
      val __obj = js.Dynamic.literal(ip_address = ip_address.asInstanceOf[js.Any], ip_address_version = ip_address_version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimIpAddressResource]
    }
    
    extension [Self <: SimIpAddressResource](x: Self) {
      
      inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      inline def setIp_address_version(value: SimIpAddressIpAddressVersion): Self = StObject.set(x, "ip_address_version", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimIpAddressSolution extends StObject {
    
    var simSid: js.UndefOr[String] = js.undefined
  }
  object SimIpAddressSolution {
    
    inline def apply(): SimIpAddressSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimIpAddressSolution]
    }
    
    extension [Self <: SimIpAddressSolution](x: Self) {
      
      inline def setSimSid(value: String): Self = StObject.set(x, "simSid", value.asInstanceOf[js.Any])
      
      inline def setSimSidUndefined: Self = StObject.set(x, "simSid", js.undefined)
    }
  }
}
