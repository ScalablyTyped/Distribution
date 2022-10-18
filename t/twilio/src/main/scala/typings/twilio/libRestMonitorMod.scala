package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMonitorMod {
  
  @JSImport("twilio/lib/rest/Monitor", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Monitor {
    /**
      * Initialize monitor domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Monitor
    extends typings.twilio.libBaseDomainMod.^ {
    
    val alerts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlertListInstance */ Any = js.native
    
    val events: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestMonitorV1Mod.^ = js.native
  }
}
