package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVoiceMod {
  
  @JSImport("twilio/lib/rest/Voice", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Voice {
    /**
      * Initialize voice domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Voice
    extends typings.twilio.libBaseDomainMod.^ {
    
    val archivedCalls: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArchivedCallListInstance */ Any = js.native
    
    val byocTrunks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByocTrunkListInstance */ Any = js.native
    
    val connectionPolicies: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConnectionPolicyListInstance */ Any = js.native
    
    val dialingPermissions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DialingPermissionsListInstance */ Any = js.native
    
    val ipRecords: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IpRecordListInstance */ Any = js.native
    
    val sourceIpMappings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SourceIpMappingListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestVoiceV1Mod.^ = js.native
  }
}
