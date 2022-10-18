package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVoiceV1Mod {
  
  @JSImport("twilio/lib/rest/voice/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Voice
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestVoiceMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val archivedCalls: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArchivedCallListInstance */ Any = js.native
    
    val byocTrunks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByocTrunkListInstance */ Any = js.native
    
    val connectionPolicies: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConnectionPolicyListInstance */ Any = js.native
    
    val dialingPermissions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DialingPermissionsListInstance */ Any = js.native
    
    val ipRecords: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IpRecordListInstance */ Any = js.native
    
    val sourceIpMappings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SourceIpMappingListInstance */ Any = js.native
  }
}
