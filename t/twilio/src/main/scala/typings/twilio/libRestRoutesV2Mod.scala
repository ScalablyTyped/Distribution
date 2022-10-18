package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestRoutesV2Mod {
  
  @JSImport("twilio/lib/rest/routes/V2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2 {
    /**
      * Initialize the V2 version of Routes
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestRoutesMod.^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.^ {
    
    val phoneNumbers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhoneNumberListInstance */ Any = js.native
    
    val sipDomains: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SipDomainListInstance */ Any = js.native
    
    val trunks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TrunkListInstance */ Any = js.native
  }
}
