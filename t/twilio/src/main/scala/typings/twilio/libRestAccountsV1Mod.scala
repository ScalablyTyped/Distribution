package typings.twilio

import typings.twilio.libRestAccountsBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestAccountsV1Mod {
  
  @JSImport("twilio/lib/rest/accounts/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Accounts
      *
      * @param domain - The Twilio (Twilio.Accounts) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** authTokenPromotion - { Twilio.Accounts.V1.AuthTokenPromotionListInstance } resource */
    /* protected */ var _authTokenPromotion: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AuthTokenPromotionListInstance */ Any
      ] = js.native
    
    /** credentials - { Twilio.Accounts.V1.CredentialListInstance } resource */
    /* protected */ var _credentials: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CredentialListInstance */ Any
      ] = js.native
    
    /** secondaryAuthToken - { Twilio.Accounts.V1.SecondaryAuthTokenListInstance } resource */
    /* protected */ var _secondaryAuthToken: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SecondaryAuthTokenListInstance */ Any
      ] = js.native
    
    /** Getter for authTokenPromotion resource */
    def authTokenPromotion: Any = js.native
    
    /** Getter for credentials resource */
    def credentials: Any = js.native
    
    /** Getter for secondaryAuthToken resource */
    def secondaryAuthToken: Any = js.native
  }
}
