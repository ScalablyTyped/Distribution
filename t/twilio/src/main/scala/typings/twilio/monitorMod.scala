package typings.twilio

import typings.twilio.alertMod.AlertContext
import typings.twilio.alertMod.AlertListInstance
import typings.twilio.v1EventMod.EventContext
import typings.twilio.v1EventMod.EventListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monitorMod {
  
  @JSImport("twilio/lib/rest/Monitor", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Monitor {
    /**
      * Initialize monitor domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Monitor
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def alerts(sid: String): AlertContext = js.native
    @JSName("alerts")
    val alerts_Original: AlertListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def events(sid: String): EventContext = js.native
    @JSName("events")
    val events_Original: EventListInstance = js.native
    
    val v1: typings.twilio.monitorV1Mod.^ = js.native
  }
}
