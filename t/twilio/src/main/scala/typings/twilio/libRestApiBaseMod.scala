package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestApiBaseMod {
  
  @JSImport("twilio/lib/rest/ApiBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ApiBase {
    /**
      * Initialize api domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait ApiBase extends default {
    
    var _v2010: js.UndefOr[typings.twilio.libRestApiV2010Mod.default] = js.native
    
    def v2010: typings.twilio.libRestApiV2010Mod.default = js.native
  }
}
