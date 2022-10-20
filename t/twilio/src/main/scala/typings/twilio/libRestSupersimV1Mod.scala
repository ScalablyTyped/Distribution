package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestSupersimV1Mod {
  
  @JSImport("twilio/lib/rest/supersim/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Supersim
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestSupersimMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val esimProfiles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EsimProfileListInstance */ Any = js.native
    
    val fleets: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FleetListInstance */ Any = js.native
    
    val ipCommands: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IpCommandListInstance */ Any = js.native
    
    val networkAccessProfiles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NetworkAccessProfileListInstance */ Any = js.native
    
    val networks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NetworkListInstance */ Any = js.native
    
    val settingsUpdates: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SettingsUpdateListInstance */ Any = js.native
    
    val sims: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimListInstance */ Any = js.native
    
    val smsCommands: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SmsCommandListInstance */ Any = js.native
    
    val usageRecords: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsageRecordListInstance */ Any = js.native
  }
}
