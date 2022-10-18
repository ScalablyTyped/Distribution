package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestAccountsV1Mod {
  
  @JSImport("twilio/lib/rest/accounts/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Accounts
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestAccountsMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val authTokenPromotion: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AuthTokenPromotionListInstance */ Any = js.native
    
    val credentials: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CredentialListInstance */ Any = js.native
    
    val secondaryAuthToken: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SecondaryAuthTokenListInstance */ Any = js.native
  }
}
