package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.phoneNumberCountryMod.CountryListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1PhoneNumberMod {
  
  @JSImport("twilio/lib/rest/pricing/v1/phoneNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/pricing/v1/phoneNumber", "PhoneNumberInstance")
  @js.native
  open class PhoneNumberInstance protected () extends SerializableClass {
    /**
      * Initialize the PhoneNumberContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.pricingV1Mod.^, payload: PhoneNumberPayload) = this()
    
    var links: String = js.native
    
    var name: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the PhoneNumberList
    *
    * @param version - Version of the resource
    */
  inline def PhoneNumberList(version: typings.twilio.pricingV1Mod.^): PhoneNumberListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("PhoneNumberList")(version.asInstanceOf[js.Any]).asInstanceOf[PhoneNumberListInstance]
  
  @JSImport("twilio/lib/rest/pricing/v1/phoneNumber", "PhoneNumberPage")
  @js.native
  open class PhoneNumberPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.pricingV1Mod.^, 
          PhoneNumberPayload, 
          PhoneNumberResource, 
          PhoneNumberInstance
        ] {
    /**
      * Initialize the PhoneNumberPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.pricingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: PhoneNumberSolution
    ) = this()
    
    /**
      * Build an instance of PhoneNumberInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: PhoneNumberPayload): PhoneNumberInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait PhoneNumberListInstance extends StObject {
    
    var countries: js.UndefOr[CountryListInstance] = js.undefined
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any
  }
  object PhoneNumberListInstance {
    
    inline def apply(toJSON: () => Any): PhoneNumberListInstance = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[PhoneNumberListInstance]
    }
    
    extension [Self <: PhoneNumberListInstance](x: Self) {
      
      inline def setCountries(value: CountryListInstance): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait PhoneNumberPayload
    extends StObject
       with PhoneNumberResource
       with TwilioResponsePayload
  object PhoneNumberPayload {
    
    inline def apply(
      first_page_uri: String,
      links: String,
      name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String
    ): PhoneNumberPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberPayload]
    }
  }
  
  trait PhoneNumberResource extends StObject {
    
    var links: String
    
    var name: String
    
    var url: String
  }
  object PhoneNumberResource {
    
    inline def apply(links: String, name: String, url: String): PhoneNumberResource = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberResource]
    }
    
    extension [Self <: PhoneNumberResource](x: Self) {
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhoneNumberSolution extends StObject
}
