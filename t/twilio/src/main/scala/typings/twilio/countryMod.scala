package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countryMod {
  
  @JSImport("twilio/lib/rest/pricing/v1/messaging/country", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/pricing/v1/messaging/country", "CountryContext")
  @js.native
  open class CountryContext protected () extends StObject {
    /**
      * Initialize the CountryContext
      *
      * @param version - Version of the resource
      * @param isoCountry - The ISO country code
      */
    def this(version: typings.twilio.pricingV1Mod.^, isoCountry: String) = this()
    
    /**
      * fetch a CountryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CountryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryInstance, Any]): js.Promise[CountryInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/pricing/v1/messaging/country", "CountryInstance")
  @js.native
  open class CountryInstance protected () extends SerializableClass {
    /**
      * Initialize the CountryContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param isoCountry - The ISO country code
      */
    def this(version: typings.twilio.pricingV1Mod.^, payload: CountryPayload, isoCountry: String) = this()
    
    /* private */ var _proxy: CountryContext = js.native
    
    var country: String = js.native
    
    /**
      * fetch a CountryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CountryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CountryInstance] = js.native
    
    var inboundSmsPrices: js.Array[String] = js.native
    
    var isoCountry: String = js.native
    
    var outboundSmsPrices: js.Array[String] = js.native
    
    var priceUnit: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the CountryList
    *
    * @param version - Version of the resource
    */
  inline def CountryList(version: typings.twilio.pricingV1Mod.^): CountryListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("CountryList")(version.asInstanceOf[js.Any]).asInstanceOf[CountryListInstance]
  
  @JSImport("twilio/lib/rest/pricing/v1/messaging/country", "CountryPage")
  @js.native
  open class CountryPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.pricingV1Mod.^, CountryPayload, CountryResource, CountryInstance] {
    /**
      * Initialize the CountryPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.pricingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CountrySolution
    ) = this()
    
    /**
      * Build an instance of CountryInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CountryPayload): CountryInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait CountryListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CountryContext = js.native
    
    /**
      * Streams CountryInstance records from the API.
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
          /* item */ CountryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CountryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CountryListInstanceEachOptions): Unit = js.native
    def each(
      opts: CountryListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CountryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a country
      *
      * @param isoCountry - The ISO country code
      */
    def get(isoCountry: String): CountryContext = js.native
    
    /**
      * Retrieve a single target page of CountryInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CountryPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryPage, Any]): js.Promise[CountryPage] = js.native
    def getPage(targetUrl: String): js.Promise[CountryPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryPage, Any]
    ): js.Promise[CountryPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryPage, Any]): js.Promise[CountryPage] = js.native
    
    /**
      * Lists CountryInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CountryInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CountryInstance], Any]): js.Promise[js.Array[CountryInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CountryInstance], Any]
    ): js.Promise[js.Array[CountryInstance]] = js.native
    def list(opts: CountryListInstanceOptions): js.Promise[js.Array[CountryInstance]] = js.native
    def list(
      opts: CountryListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CountryInstance], Any]
    ): js.Promise[js.Array[CountryInstance]] = js.native
    
    /**
      * Retrieve a single page of CountryInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CountryPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryPage, Any]): js.Promise[CountryPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryPage, Any]): js.Promise[CountryPage] = js.native
    def page(opts: CountryListInstancePageOptions): js.Promise[CountryPage] = js.native
    def page(
      opts: CountryListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryPage, Any]
    ): js.Promise[CountryPage] = js.native
    
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
  trait CountryListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CountryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CountryListInstanceEachOptions {
    
    inline def apply(): CountryListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountryListInstanceEachOptions]
    }
    
    extension [Self <: CountryListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ CountryInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait CountryListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CountryListInstanceOptions {
    
    inline def apply(): CountryListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountryListInstanceOptions]
    }
    
    extension [Self <: CountryListInstanceOptions](x: Self) {
      
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
  trait CountryListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object CountryListInstancePageOptions {
    
    inline def apply(): CountryListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountryListInstancePageOptions]
    }
    
    extension [Self <: CountryListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait CountryPayload
    extends StObject
       with CountryResource
       with TwilioResponsePayload
  object CountryPayload {
    
    inline def apply(
      country: String,
      first_page_uri: String,
      iso_country: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String
    ): CountryPayload = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryPayload]
    }
  }
  
  trait CountryResource extends StObject {
    
    var country: String
    
    var inbound_sms_prices: js.UndefOr[js.Array[String]] = js.undefined
    
    var iso_country: String
    
    var outbound_sms_prices: js.UndefOr[js.Array[String]] = js.undefined
    
    var price_unit: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object CountryResource {
    
    inline def apply(country: String, iso_country: String, url: String): CountryResource = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryResource]
    }
    
    extension [Self <: CountryResource](x: Self) {
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setInbound_sms_prices(value: js.Array[String]): Self = StObject.set(x, "inbound_sms_prices", value.asInstanceOf[js.Any])
      
      inline def setInbound_sms_pricesUndefined: Self = StObject.set(x, "inbound_sms_prices", js.undefined)
      
      inline def setInbound_sms_pricesVarargs(value: String*): Self = StObject.set(x, "inbound_sms_prices", js.Array(value*))
      
      inline def setIso_country(value: String): Self = StObject.set(x, "iso_country", value.asInstanceOf[js.Any])
      
      inline def setOutbound_sms_prices(value: js.Array[String]): Self = StObject.set(x, "outbound_sms_prices", value.asInstanceOf[js.Any])
      
      inline def setOutbound_sms_pricesUndefined: Self = StObject.set(x, "outbound_sms_prices", js.undefined)
      
      inline def setOutbound_sms_pricesVarargs(value: String*): Self = StObject.set(x, "outbound_sms_prices", js.Array(value*))
      
      inline def setPrice_unit(value: String): Self = StObject.set(x, "price_unit", value.asInstanceOf[js.Any])
      
      inline def setPrice_unitUndefined: Self = StObject.set(x, "price_unit", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CountrySolution extends StObject
}
