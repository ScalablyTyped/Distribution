package typings.twilio

import typings.twilio.libRestRoutesBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestRoutesV2Mod {
  
  @JSImport("twilio/lib/rest/routes/V2", JSImport.Default)
  @js.native
  open class default protected () extends V2 {
    /**
      * Initialize the V2 version of Routes
      *
      * @param domain - The Twilio (Twilio.Routes) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.default {
    
    /** phoneNumbers - { Twilio.Routes.V2.PhoneNumberListInstance } resource */
    /* protected */ var _phoneNumbers: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhoneNumberListInstance */ Any
      ] = js.native
    
    /** sipDomains - { Twilio.Routes.V2.SipDomainListInstance } resource */
    /* protected */ var _sipDomains: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SipDomainListInstance */ Any
      ] = js.native
    
    /** trunks - { Twilio.Routes.V2.TrunkListInstance } resource */
    /* protected */ var _trunks: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TrunkListInstance */ Any
      ] = js.native
    
    /** Getter for phoneNumbers resource */
    def phoneNumbers: Any = js.native
    
    /** Getter for sipDomains resource */
    def sipDomains: Any = js.native
    
    /** Getter for trunks resource */
    def trunks: Any = js.native
  }
}
