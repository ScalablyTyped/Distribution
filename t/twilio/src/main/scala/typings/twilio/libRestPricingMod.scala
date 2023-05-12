package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPricingMod {
  
  @JSImport("twilio/lib/rest/Pricing", JSImport.Namespace)
  @js.native
  open class ^ () extends Pricing
  
  @js.native
  trait Pricing
    extends typings.twilio.libRestPricingBaseMod.^ {
    
    /**
      * @deprecated - Use v2.countries instead
      */
    def countries: Any = js.native
    
    /**
      * @deprecated - Use v1.messaging instead
      */
    def messaging: Any = js.native
    
    /**
      * @deprecated - Use v2.numbers instead
      */
    def numbers: Any = js.native
    
    /**
      * @deprecated - Use v1.phoneNumbers instead
      */
    def phoneNumbers: Any = js.native
    
    /**
      * @deprecated - Use v2.voice instead
      */
    def voice: Any = js.native
  }
}
