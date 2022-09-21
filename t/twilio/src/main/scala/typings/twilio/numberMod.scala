package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod {
  
  @JSImport("twilio/lib/rest/pricing/v1/voice/number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/pricing/v1/voice/number", "NumberContext")
  @js.native
  open class NumberContext protected () extends StObject {
    /**
      * Initialize the NumberContext
      *
      * @param version - Version of the resource
      * @param number - The phone number to fetch
      */
    def this(version: typings.twilio.pricingV1Mod.^, number: String) = this()
    
    /**
      * fetch a NumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NumberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ NumberInstance, Any]): js.Promise[NumberInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/pricing/v1/voice/number", "NumberInstance")
  @js.native
  open class NumberInstance protected () extends SerializableClass {
    /**
      * Initialize the NumberContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param number - The phone number to fetch
      */
    def this(version: typings.twilio.pricingV1Mod.^, payload: NumberPayload, number: String) = this()
    
    /* private */ var _proxy: NumberContext = js.native
    
    var country: String = js.native
    
    /**
      * fetch a NumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[NumberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[NumberInstance] = js.native
    
    var inboundCallPrice: String = js.native
    
    var isoCountry: String = js.native
    
    var number: String = js.native
    
    var outboundCallPrice: String = js.native
    
    var priceUnit: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the NumberList
    *
    * @param version - Version of the resource
    */
  inline def NumberList(version: typings.twilio.pricingV1Mod.^): NumberListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("NumberList")(version.asInstanceOf[js.Any]).asInstanceOf[NumberListInstance]
  
  @JSImport("twilio/lib/rest/pricing/v1/voice/number", "NumberPage")
  @js.native
  open class NumberPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.pricingV1Mod.^, NumberPayload, NumberResource, NumberInstance] {
    /**
      * Initialize the NumberPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.pricingV1Mod.^,
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
  
  @js.native
  trait NumberListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): NumberContext = js.native
    
    /**
      * Constructs a number
      *
      * @param number - The phone number to fetch
      */
    def get(number: String): NumberContext = js.native
    
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
      first_page_uri: String,
      inbound_call_price: String,
      iso_country: String,
      next_page_uri: String,
      number: String,
      outbound_call_price: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      price_unit: String,
      uri: String,
      url: String
    ): NumberPayload = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], inbound_call_price = inbound_call_price.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], outbound_call_price = outbound_call_price.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], price_unit = price_unit.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberPayload]
    }
  }
  
  trait NumberResource extends StObject {
    
    var country: String
    
    var inbound_call_price: String
    
    var iso_country: String
    
    var number: String
    
    var outbound_call_price: String
    
    var price_unit: String
    
    var url: String
  }
  object NumberResource {
    
    inline def apply(
      country: String,
      inbound_call_price: String,
      iso_country: String,
      number: String,
      outbound_call_price: String,
      price_unit: String,
      url: String
    ): NumberResource = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], inbound_call_price = inbound_call_price.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], outbound_call_price = outbound_call_price.asInstanceOf[js.Any], price_unit = price_unit.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberResource]
    }
    
    extension [Self <: NumberResource](x: Self) {
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setInbound_call_price(value: String): Self = StObject.set(x, "inbound_call_price", value.asInstanceOf[js.Any])
      
      inline def setIso_country(value: String): Self = StObject.set(x, "iso_country", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setOutbound_call_price(value: String): Self = StObject.set(x, "outbound_call_price", value.asInstanceOf[js.Any])
      
      inline def setPrice_unit(value: String): Self = StObject.set(x, "price_unit", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberSolution extends StObject
}
