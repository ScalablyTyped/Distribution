package typings.twilio

import typings.twilio.libRestLookupsBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestLookupsV1Mod {
  
  @JSImport("twilio/lib/rest/lookups/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Lookups
      *
      * @param domain - The Twilio (Twilio.Lookups) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** phoneNumbers - { Twilio.Lookups.V1.PhoneNumberListInstance } resource */
    /* protected */ var _phoneNumbers: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhoneNumberListInstance */ Any
      ] = js.native
    
    /** Getter for phoneNumbers resource */
    def phoneNumbers: Any = js.native
  }
}
