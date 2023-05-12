package typings.twilio

import typings.twilio.libRestNotifyBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestNotifyV1Mod {
  
  @JSImport("twilio/lib/rest/notify/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Notify
      *
      * @param domain - The Twilio (Twilio.Notify) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** credentials - { Twilio.Notify.V1.CredentialListInstance } resource */
    /* protected */ var _credentials: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CredentialListInstance */ Any
      ] = js.native
    
    /** services - { Twilio.Notify.V1.ServiceListInstance } resource */
    /* protected */ var _services: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any
      ] = js.native
    
    /** Getter for credentials resource */
    def credentials: Any = js.native
    
    /** Getter for services resource */
    def services: Any = js.native
  }
}
