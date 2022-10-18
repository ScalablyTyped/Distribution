package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestSupersimMod {
  
  @JSImport("twilio/lib/rest/Supersim", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Supersim {
    /**
      * Initialize supersim domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Supersim
    extends typings.twilio.libBaseDomainMod.^ {
    
    val esimProfiles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EsimProfileListInstance */ Any = js.native
    
    val fleets: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FleetListInstance */ Any = js.native
    
    val ipCommands: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IpCommandListInstance */ Any = js.native
    
    val networkAccessProfiles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NetworkAccessProfileListInstance */ Any = js.native
    
    val networks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NetworkListInstance */ Any = js.native
    
    val sims: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimListInstance */ Any = js.native
    
    val smsCommands: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SmsCommandListInstance */ Any = js.native
    
    val usageRecords: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsageRecordListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestSupersimV1Mod.^ = js.native
  }
}
