package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVerifyV2Mod {
  
  @JSImport("twilio/lib/rest/verify/V2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2 {
    /**
      * Initialize the V2 version of Verify
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestVerifyMod.^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.^ {
    
    val forms: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormListInstance */ Any = js.native
    
    val safelist: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SafelistListInstance */ Any = js.native
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
    
    val templates: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateListInstance */ Any = js.native
    
    val verificationAttempts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VerificationAttemptListInstance */ Any = js.native
    
    val verificationAttemptsSummary: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VerificationAttemptsSummaryListInstance */ Any = js.native
  }
}
