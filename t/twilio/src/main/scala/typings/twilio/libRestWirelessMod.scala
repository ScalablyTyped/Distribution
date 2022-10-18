package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestWirelessMod {
  
  @JSImport("twilio/lib/rest/Wireless", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Wireless {
    /**
      * Initialize wireless domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Wireless
    extends typings.twilio.libBaseDomainMod.^ {
    
    val commands: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CommandListInstance */ Any = js.native
    
    val ratePlans: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RatePlanListInstance */ Any = js.native
    
    val sims: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimListInstance */ Any = js.native
    
    val usageRecords: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsageRecordListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestWirelessV1Mod.^ = js.native
  }
}
