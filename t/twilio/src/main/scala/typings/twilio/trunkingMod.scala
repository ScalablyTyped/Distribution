package typings.twilio

import typings.twilio.v1TrunkMod.TrunkContext
import typings.twilio.v1TrunkMod.TrunkListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trunkingMod {
  
  @JSImport("twilio/lib/rest/Trunking", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Trunking {
    /**
      * Initialize trunking domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Trunking
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def trunks(sid: String): TrunkContext = js.native
    @JSName("trunks")
    val trunks_Original: TrunkListInstance = js.native
    
    val v1: typings.twilio.trunkingV1Mod.^ = js.native
  }
}
