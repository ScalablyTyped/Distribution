package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestBulkexportsBaseMod {
  
  @JSImport("twilio/lib/rest/BulkexportsBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends BulkexportsBase {
    /**
      * Initialize bulkexports domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait BulkexportsBase extends default {
    
    var _v1: js.UndefOr[typings.twilio.libRestBulkexportsV1Mod.default] = js.native
    
    def v1: typings.twilio.libRestBulkexportsV1Mod.default = js.native
  }
}
