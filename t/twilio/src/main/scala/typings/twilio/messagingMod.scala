package typings.twilio

import typings.twilio.countryMod.CountryListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagingMod {
  
  @JSImport("twilio/lib/rest/pricing/v1/messaging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/pricing/v1/messaging", "MessagingInstance")
  @js.native
  open class MessagingInstance protected () extends SerializableClass {
    /**
      * Initialize the MessagingContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.pricingV1Mod.^, payload: MessagingPayload) = this()
    
    var links: String = js.native
    
    var name: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the MessagingList
    *
    * @param version - Version of the resource
    */
  inline def MessagingList(version: typings.twilio.pricingV1Mod.^): MessagingListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("MessagingList")(version.asInstanceOf[js.Any]).asInstanceOf[MessagingListInstance]
  
  @JSImport("twilio/lib/rest/pricing/v1/messaging", "MessagingPage")
  @js.native
  open class MessagingPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.pricingV1Mod.^, MessagingPayload, MessagingResource, MessagingInstance] {
    /**
      * Initialize the MessagingPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.pricingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: MessagingSolution
    ) = this()
    
    /**
      * Build an instance of MessagingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: MessagingPayload): MessagingInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait MessagingListInstance extends StObject {
    
    var countries: js.UndefOr[CountryListInstance] = js.undefined
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any
  }
  object MessagingListInstance {
    
    inline def apply(toJSON: () => Any): MessagingListInstance = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[MessagingListInstance]
    }
    
    extension [Self <: MessagingListInstance](x: Self) {
      
      inline def setCountries(value: CountryListInstance): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait MessagingPayload
    extends StObject
       with MessagingResource
       with TwilioResponsePayload
  object MessagingPayload {
    
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
    ): MessagingPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagingPayload]
    }
  }
  
  trait MessagingResource extends StObject {
    
    var links: String
    
    var name: String
    
    var url: String
  }
  object MessagingResource {
    
    inline def apply(links: String, name: String, url: String): MessagingResource = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagingResource]
    }
    
    extension [Self <: MessagingResource](x: Self) {
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessagingSolution extends StObject
}
