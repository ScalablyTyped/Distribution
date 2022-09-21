package typings.twilio

import typings.twilio.formMod.FormContext
import typings.twilio.formMod.FormListInstance
import typings.twilio.safelistMod.SafelistContext
import typings.twilio.safelistMod.SafelistListInstance
import typings.twilio.templateMod.TemplateListInstance
import typings.twilio.verificationAttemptMod.VerificationAttemptContext
import typings.twilio.verificationAttemptMod.VerificationAttemptListInstance
import typings.twilio.verificationAttemptsSummaryMod.VerificationAttemptsSummaryContext
import typings.twilio.verificationAttemptsSummaryMod.VerificationAttemptsSummaryListInstance
import typings.twilio.verifyV2ServiceMod.ServiceContext
import typings.twilio.verifyV2ServiceMod.ServiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verifyV2Mod {
  
  @JSImport("twilio/lib/rest/verify/V2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2 {
    /**
      * Initialize the V2 version of Verify
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.verifyMod.^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def forms(sid: String): FormContext = js.native
    @JSName("forms")
    val forms_Original: FormListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def safelist(sid: String): SafelistContext = js.native
    @JSName("safelist")
    val safelist_Original: SafelistListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def services(sid: String): ServiceContext = js.native
    @JSName("services")
    val services_Original: ServiceListInstance = js.native
    
    val templates: TemplateListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def verificationAttempts(sid: String): VerificationAttemptContext = js.native
    
    /**
      * @param sid - sid of instance
      */
    def verificationAttemptsSummary(sid: String): VerificationAttemptsSummaryContext = js.native
    @JSName("verificationAttemptsSummary")
    val verificationAttemptsSummary_Original: VerificationAttemptsSummaryListInstance = js.native
    
    @JSName("verificationAttempts")
    val verificationAttempts_Original: VerificationAttemptListInstance = js.native
  }
}
