package typings.twilio

import typings.twilio.libRestVerifyBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVerifyV2Mod {
  
  @JSImport("twilio/lib/rest/verify/V2", JSImport.Default)
  @js.native
  open class default protected () extends V2 {
    /**
      * Initialize the V2 version of Verify
      *
      * @param domain - The Twilio (Twilio.Verify) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.default {
    
    /** forms - { Twilio.Verify.V2.FormListInstance } resource */
    /* protected */ var _forms: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormListInstance */ Any
      ] = js.native
    
    /** safelist - { Twilio.Verify.V2.SafelistListInstance } resource */
    /* protected */ var _safelist: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SafelistListInstance */ Any
      ] = js.native
    
    /** services - { Twilio.Verify.V2.ServiceListInstance } resource */
    /* protected */ var _services: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any
      ] = js.native
    
    /** templates - { Twilio.Verify.V2.TemplateListInstance } resource */
    /* protected */ var _templates: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateListInstance */ Any
      ] = js.native
    
    /** verificationAttempts - { Twilio.Verify.V2.VerificationAttemptListInstance } resource */
    /* protected */ var _verificationAttempts: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VerificationAttemptListInstance */ Any
      ] = js.native
    
    /** verificationAttemptsSummary - { Twilio.Verify.V2.VerificationAttemptsSummaryListInstance } resource */
    /* protected */ var _verificationAttemptsSummary: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VerificationAttemptsSummaryListInstance */ Any
      ] = js.native
    
    /** Getter for forms resource */
    def forms: Any = js.native
    
    /** Getter for safelist resource */
    def safelist: Any = js.native
    
    /** Getter for services resource */
    def services: Any = js.native
    
    /** Getter for templates resource */
    def templates: Any = js.native
    
    /** Getter for verificationAttempts resource */
    def verificationAttempts: Any = js.native
    
    /** Getter for verificationAttemptsSummary resource */
    def verificationAttemptsSummary: Any = js.native
  }
}
