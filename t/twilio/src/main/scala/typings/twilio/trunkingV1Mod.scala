package typings.twilio

import typings.twilio.v1TrunkMod.TrunkContext
import typings.twilio.v1TrunkMod.TrunkListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trunkingV1Mod {
  
  @JSImport("twilio/lib/rest/trunking/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Trunking
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.trunkingMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def trunks(sid: String): TrunkContext = js.native
    @JSName("trunks")
    val trunks_Original: TrunkListInstance = js.native
  }
}
