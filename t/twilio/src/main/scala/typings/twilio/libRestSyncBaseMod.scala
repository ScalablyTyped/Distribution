package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestSyncBaseMod {
  
  @JSImport("twilio/lib/rest/SyncBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends SyncBase {
    /**
      * Initialize sync domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait SyncBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestSyncV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestSyncV1Mod.default = js.native
  }
}
