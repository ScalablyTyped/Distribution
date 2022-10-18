package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestLookupsV2Mod {
  
  @JSImport("twilio/lib/rest/lookups/V2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2 {
    /**
      * Initialize the V2 version of Lookups
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestLookupsMod.^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.^ {
    
    val phoneNumbers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhoneNumberListInstance */ Any = js.native
  }
}
