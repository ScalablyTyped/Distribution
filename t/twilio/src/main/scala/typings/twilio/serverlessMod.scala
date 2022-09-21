package typings.twilio

import typings.twilio.serverlessV1ServiceMod.ServiceContext
import typings.twilio.serverlessV1ServiceMod.ServiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverlessMod {
  
  @JSImport("twilio/lib/rest/Serverless", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Serverless {
    /**
      * Initialize serverless domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Serverless
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def services(sid: String): ServiceContext = js.native
    @JSName("services")
    val services_Original: ServiceListInstance = js.native
    
    val v1: typings.twilio.serverlessV1Mod.^ = js.native
  }
}
