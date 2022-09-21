package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.numberMod.NumberListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.voiceCountryMod.CountryListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object voiceMod {
  
  @JSImport("twilio/lib/rest/pricing/v1/voice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/pricing/v1/voice", "VoiceInstance")
  @js.native
  open class VoiceInstance protected () extends SerializableClass {
    /**
      * Initialize the VoiceContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.pricingV1Mod.^, payload: VoicePayload) = this()
    
    var links: String = js.native
    
    var name: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the VoiceList
    *
    * @param version - Version of the resource
    */
  inline def VoiceList(version: typings.twilio.pricingV1Mod.^): VoiceListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("VoiceList")(version.asInstanceOf[js.Any]).asInstanceOf[VoiceListInstance]
  
  @JSImport("twilio/lib/rest/pricing/v1/voice", "VoicePage")
  @js.native
  open class VoicePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.pricingV1Mod.^, VoicePayload, VoiceResource, VoiceInstance] {
    /**
      * Initialize the VoicePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.pricingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: VoiceSolution
    ) = this()
    
    /**
      * Build an instance of VoiceInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: VoicePayload): VoiceInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait VoiceListInstance extends StObject {
    
    var countries: js.UndefOr[CountryListInstance] = js.undefined
    
    var numbers: js.UndefOr[NumberListInstance] = js.undefined
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any
  }
  object VoiceListInstance {
    
    inline def apply(toJSON: () => Any): VoiceListInstance = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[VoiceListInstance]
    }
    
    extension [Self <: VoiceListInstance](x: Self) {
      
      inline def setCountries(value: CountryListInstance): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      inline def setNumbers(value: NumberListInstance): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      inline def setNumbersUndefined: Self = StObject.set(x, "numbers", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait VoicePayload
    extends StObject
       with VoiceResource
       with TwilioResponsePayload
  object VoicePayload {
    
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
    ): VoicePayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[VoicePayload]
    }
  }
  
  trait VoiceResource extends StObject {
    
    var links: String
    
    var name: String
    
    var url: String
  }
  object VoiceResource {
    
    inline def apply(links: String, name: String, url: String): VoiceResource = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[VoiceResource]
    }
    
    extension [Self <: VoiceResource](x: Self) {
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait VoiceSolution extends StObject
}
