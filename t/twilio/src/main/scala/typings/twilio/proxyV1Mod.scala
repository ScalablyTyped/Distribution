package typings.twilio

import typings.twilio.proxyV1ServiceMod.ServiceContext
import typings.twilio.proxyV1ServiceMod.ServiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyV1Mod {
  
  @JSImport("twilio/lib/rest/proxy/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Proxy
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.proxyMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def services(sid: String): ServiceContext = js.native
    @JSName("services")
    val services_Original: ServiceListInstance = js.native
  }
}
