package typings.twilio

import typings.twilio.alertMod.AlertContext
import typings.twilio.alertMod.AlertListInstance
import typings.twilio.v1EventMod.EventContext
import typings.twilio.v1EventMod.EventListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monitorV1Mod {
  
  @JSImport("twilio/lib/rest/monitor/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Monitor
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.monitorMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
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
  }
}
