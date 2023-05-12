package typings.twilio

import typings.twilio.libRestTrunkingBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTrunkingV1Mod {
  
  @JSImport("twilio/lib/rest/trunking/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Trunking
      *
      * @param domain - The Twilio (Twilio.Trunking) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** trunks - { Twilio.Trunking.V1.TrunkListInstance } resource */
    /* protected */ var _trunks: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TrunkListInstance */ Any
      ] = js.native
    
    /** Getter for trunks resource */
    def trunks: Any = js.native
  }
}
