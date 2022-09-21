package typings.twilio

import typings.twilio.authTokenPromotionMod.AuthTokenPromotionContext
import typings.twilio.authTokenPromotionMod.AuthTokenPromotionListInstance
import typings.twilio.credentialMod.CredentialListInstance
import typings.twilio.secondaryAuthTokenMod.SecondaryAuthTokenContext
import typings.twilio.secondaryAuthTokenMod.SecondaryAuthTokenListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1Mod {
  
  @JSImport("twilio/lib/rest/accounts/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Accounts
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.accountsMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def authTokenPromotion(sid: String): AuthTokenPromotionContext = js.native
    @JSName("authTokenPromotion")
    val authTokenPromotion_Original: AuthTokenPromotionListInstance = js.native
    
    val credentials: CredentialListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def secondaryAuthToken(sid: String): SecondaryAuthTokenContext = js.native
    @JSName("secondaryAuthToken")
    val secondaryAuthToken_Original: SecondaryAuthTokenListInstance = js.native
  }
}
