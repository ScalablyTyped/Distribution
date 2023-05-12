package typings.twilio

import typings.twilio.libRestLookupsBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestLookupsV2Mod {
  
  @JSImport("twilio/lib/rest/lookups/V2", JSImport.Default)
  @js.native
  open class default protected () extends V2 {
    /**
      * Initialize the V2 version of Lookups
      *
      * @param domain - The Twilio (Twilio.Lookups) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.default {
    
    /** phoneNumbers - { Twilio.Lookups.V2.PhoneNumberListInstance } resource */
    /* protected */ var _phoneNumbers: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhoneNumberListInstance */ Any
      ] = js.native
    
    /** Getter for phoneNumbers resource */
    def phoneNumbers: Any = js.native
  }
}
