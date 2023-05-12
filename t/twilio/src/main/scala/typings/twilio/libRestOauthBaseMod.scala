package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestOauthBaseMod {
  
  @JSImport("twilio/lib/rest/OauthBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends OauthBase {
    /**
      * Initialize oauth domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait OauthBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestOauthV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestOauthV1Mod.default = js.native
  }
}
