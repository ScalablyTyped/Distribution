package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestAccountsBaseMod {
  
  @JSImport("twilio/lib/rest/AccountsBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends AccountsBase {
    /**
      * Initialize accounts domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait AccountsBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestAccountsV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestAccountsV1Mod.default = js.native
  }
}
