package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestLookupsMod {
  
  @JSImport("twilio/lib/rest/Lookups", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Lookups {
    /**
      * Initialize lookups domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Lookups
    extends typings.twilio.libBaseDomainMod.^ {
    
    val phoneNumbers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhoneNumberListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestLookupsV1Mod.^ = js.native
    
    val v2: typings.twilio.libRestLookupsV2Mod.^ = js.native
  }
}
