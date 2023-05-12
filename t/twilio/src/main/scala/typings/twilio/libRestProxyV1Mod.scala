package typings.twilio

import typings.twilio.libRestProxyBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestProxyV1Mod {
  
  @JSImport("twilio/lib/rest/proxy/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Proxy
      *
      * @param domain - The Twilio (Twilio.Proxy) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** services - { Twilio.Proxy.V1.ServiceListInstance } resource */
    /* protected */ var _services: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any
      ] = js.native
    
    /** Getter for services resource */
    def services: Any = js.native
  }
}
