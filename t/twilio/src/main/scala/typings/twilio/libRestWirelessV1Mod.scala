package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestWirelessV1Mod {
  
  @JSImport("twilio/lib/rest/wireless/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Wireless
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestWirelessMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val commands: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CommandListInstance */ Any = js.native
    
    val ratePlans: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RatePlanListInstance */ Any = js.native
    
    val sims: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimListInstance */ Any = js.native
    
    val usageRecords: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsageRecordListInstance */ Any = js.native
  }
}
