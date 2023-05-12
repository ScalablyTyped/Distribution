package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestAccountsMod {
  
  @JSImport("twilio/lib/rest/Accounts", JSImport.Namespace)
  @js.native
  open class ^ () extends Accounts
  
  @js.native
  trait Accounts
    extends typings.twilio.libRestAccountsBaseMod.^ {
    
    /**
      * @deprecated - Use v1.authTokenPromotion; instead
      */
    def authTokenPromotion: Any = js.native
    
    /**
      * @deprecated - Use v1.credentials; instead
      */
    def credentials: Any = js.native
    
    /**
      * @deprecated - Use v1.secondaryAuthToken; instead
      */
    def secondaryAuthToken: Any = js.native
  }
}
