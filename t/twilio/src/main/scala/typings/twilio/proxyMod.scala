package typings.twilio

import typings.twilio.proxyV1ServiceMod.ServiceContext
import typings.twilio.proxyV1ServiceMod.ServiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyMod {
  
  @JSImport("twilio/lib/rest/Proxy", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Proxy {
    /**
      * Initialize proxy domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Proxy
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def services(sid: String): ServiceContext = js.native
    @JSName("services")
    val services_Original: ServiceListInstance = js.native
    
    val v1: typings.twilio.proxyV1Mod.^ = js.native
  }
}
