package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMonitorV1Mod {
  
  @JSImport("twilio/lib/rest/monitor/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Monitor
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestMonitorMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val alerts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlertListInstance */ Any = js.native
    
    val events: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventListInstance */ Any = js.native
  }
}
