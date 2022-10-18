package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVerifyMod {
  
  @JSImport("twilio/lib/rest/Verify", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Verify {
    /**
      * Initialize verify domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Verify
    extends typings.twilio.libBaseDomainMod.^ {
    
    val forms: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormListInstance */ Any = js.native
    
    val safelist: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SafelistListInstance */ Any = js.native
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
    
    val templates: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateListInstance */ Any = js.native
    
    val v2: typings.twilio.libRestVerifyV2Mod.^ = js.native
    
    val verificationAttempts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VerificationAttemptListInstance */ Any = js.native
    
    val verificationAttemptsSummary: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VerificationAttemptsSummaryListInstance */ Any = js.native
  }
}
