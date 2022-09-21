package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v2NumberMod {
  
  @JSImport("twilio/lib/rest/pricing/v2/number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/pricing/v2/number", "NumberContext")
  @js.native
  open class NumberContext protected () extends StObject {
    /**
      * Initialize the NumberContext
      *
      * @param version - Version of the resource
      * @param destinationNumber - The destination number for which to fetch pricing information
      */
    def this(version: typings.twilio.pricingV2Mod.^, destinationNumber: String) = this()
    
    /**
      * fetch a NumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NumberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ NumberInstance, Any]): js.Promise[NumberInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ NumberInstance, Any]): js.Promise[NumberInstance] = js.native
    def fetch(opts: NumberInstanceFetchOptions): js.Promise[NumberInstance] = js.native
    def fetch(
      opts: NumberInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ NumberInstance, Any]
    ): js.Promise[NumberInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/pricing/v2/number", "NumberInstance")
  @js.native
  open class NumberInstance protected () extends SerializableClass {
    /**
      * Initialize the NumberContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param destinationNumber - The destination number for which to fetch pricing information
      */
    def this(version: typings.twilio.pricingV2Mod.^, payload: NumberPayload, destinationNumber: String) = this()
    
    /* private */ var _proxy: NumberContext = js.native
    
    var country: String = js.native
    
    var destinationNumber: String = js.native
    
    /**
      * fetch a NumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NumberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[NumberInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[NumberInstance] = js.native
    def fetch(opts: NumberInstanceFetchOptions): js.Promise[NumberInstance] = js.native
    def fetch(
      opts: NumberInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[NumberInstance] = js.native
    
    var isoCountry: String = js.native
    
    var originatingCallPrice: String = js.native
    
    var originationNumber: String = js.native
    
    var priceUnit: String = js.native
    
    var terminatingPrefixPrices: js.Array[String] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the NumberList
    *
    * @param version - Version of the resource
    */
  inline def NumberList(version: typings.twilio.pricingV2Mod.^): NumberListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("NumberList")(version.asInstanceOf[js.Any]).asInstanceOf[NumberListInstance]
  
  @JSImport("twilio/lib/rest/pricing/v2/number", "NumberPage")
  @js.native
  open class NumberPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.pricingV2Mod.^, NumberPayload, NumberResource, NumberInstance] {
    /**
      * Initialize the NumberPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.pricingV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: NumberSolution
    ) = this()
    
    /**
      * Build an instance of NumberInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: NumberPayload): NumberInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property originationNumber - The origination number for which to fetch pricing information
    */
  trait NumberInstanceFetchOptions extends StObject {
    
    var originationNumber: js.UndefOr[String] = js.undefined
  }
  object NumberInstanceFetchOptions {
    
    inline def apply(): NumberInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberInstanceFetchOptions]
    }
    
    extension [Self <: NumberInstanceFetchOptions](x: Self) {
      
      inline def setOriginationNumber(value: String): Self = StObject.set(x, "originationNumber", value.asInstanceOf[js.Any])
      
      inline def setOriginationNumberUndefined: Self = StObject.set(x, "originationNumber", js.undefined)
    }
  }
  
  @js.native
  trait NumberListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): NumberContext = js.native
    
    /**
      * Constructs a number
      *
      * @param destinationNumber - The destination number for which to fetch pricing information
      */
    def get(destinationNumber: String): NumberContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait NumberPayload
    extends StObject
       with NumberResource
       with TwilioResponsePayload
  object NumberPayload {
    
    inline def apply(
      country: String,
      destination_number: String,
      first_page_uri: String,
      iso_country: String,
      next_page_uri: String,
      originating_call_price: String,
      origination_number: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      price_unit: String,
      terminating_prefix_prices: js.Array[String],
      uri: String,
      url: String
    ): NumberPayload = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], destination_number = destination_number.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], originating_call_price = originating_call_price.asInstanceOf[js.Any], origination_number = origination_number.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], price_unit = price_unit.asInstanceOf[js.Any], terminating_prefix_prices = terminating_prefix_prices.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberPayload]
    }
  }
  
  trait NumberResource extends StObject {
    
    var country: String
    
    var destination_number: String
    
    var iso_country: String
    
    var originating_call_price: String
    
    var origination_number: String
    
    var price_unit: String
    
    var terminating_prefix_prices: js.Array[String]
    
    var url: String
  }
  object NumberResource {
    
    inline def apply(
      country: String,
      destination_number: String,
      iso_country: String,
      originating_call_price: String,
      origination_number: String,
      price_unit: String,
      terminating_prefix_prices: js.Array[String],
      url: String
    ): NumberResource = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], destination_number = destination_number.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], originating_call_price = originating_call_price.asInstanceOf[js.Any], origination_number = origination_number.asInstanceOf[js.Any], price_unit = price_unit.asInstanceOf[js.Any], terminating_prefix_prices = terminating_prefix_prices.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberResource]
    }
    
    extension [Self <: NumberResource](x: Self) {
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setDestination_number(value: String): Self = StObject.set(x, "destination_number", value.asInstanceOf[js.Any])
      
      inline def setIso_country(value: String): Self = StObject.set(x, "iso_country", value.asInstanceOf[js.Any])
      
      inline def setOriginating_call_price(value: String): Self = StObject.set(x, "originating_call_price", value.asInstanceOf[js.Any])
      
      inline def setOrigination_number(value: String): Self = StObject.set(x, "origination_number", value.asInstanceOf[js.Any])
      
      inline def setPrice_unit(value: String): Self = StObject.set(x, "price_unit", value.asInstanceOf[js.Any])
      
      inline def setTerminating_prefix_prices(value: js.Array[String]): Self = StObject.set(x, "terminating_prefix_prices", value.asInstanceOf[js.Any])
      
      inline def setTerminating_prefix_pricesVarargs(value: String*): Self = StObject.set(x, "terminating_prefix_prices", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberSolution extends StObject
}
