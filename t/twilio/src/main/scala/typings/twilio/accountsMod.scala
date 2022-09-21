package typings.twilio

import typings.twilio.authTokenPromotionMod.AuthTokenPromotionContext
import typings.twilio.authTokenPromotionMod.AuthTokenPromotionListInstance
import typings.twilio.credentialMod.CredentialListInstance
import typings.twilio.secondaryAuthTokenMod.SecondaryAuthTokenContext
import typings.twilio.secondaryAuthTokenMod.SecondaryAuthTokenListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountsMod {
  
  @JSImport("twilio/lib/rest/Accounts", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Accounts {
    /**
      * Initialize accounts domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Accounts
    extends typings.twilio.domainMod.^ {
    
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
    
    val v1: typings.twilio.v1Mod.^ = js.native
  }
}
