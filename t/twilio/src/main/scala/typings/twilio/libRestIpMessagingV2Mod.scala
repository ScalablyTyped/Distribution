package typings.twilio

import typings.twilio.libRestIpMessagingBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestIpMessagingV2Mod {
  
  @JSImport("twilio/lib/rest/ipMessaging/V2", JSImport.Default)
  @js.native
  open class default protected () extends V2 {
    /**
      * Initialize the V2 version of IpMessaging
      *
      * @param domain - The Twilio (Twilio.IpMessaging) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.default {
    
    /** credentials - { Twilio.IpMessaging.V2.CredentialListInstance } resource */
    /* protected */ var _credentials: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CredentialListInstance */ Any
      ] = js.native
    
    /** services - { Twilio.IpMessaging.V2.ServiceListInstance } resource */
    /* protected */ var _services: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any
      ] = js.native
    
    /** Getter for credentials resource */
    def credentials: Any = js.native
    
    /** Getter for services resource */
    def services: Any = js.native
  }
}
