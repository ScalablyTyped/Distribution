package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestAccountsMod {
  
  @JSImport("twilio/lib/rest/Accounts", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Accounts {
    /**
      * Initialize accounts domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Accounts
    extends typings.twilio.libBaseDomainMod.^ {
    
    val authTokenPromotion: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AuthTokenPromotionListInstance */ Any = js.native
    
    val credentials: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CredentialListInstance */ Any = js.native
    
    val secondaryAuthToken: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SecondaryAuthTokenListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestAccountsV1Mod.^ = js.native
  }
}
