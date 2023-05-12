package typings.twilio

import typings.twilio.libRestMonitorBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMonitorV1Mod {
  
  @JSImport("twilio/lib/rest/monitor/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Monitor
      *
      * @param domain - The Twilio (Twilio.Monitor) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** alerts - { Twilio.Monitor.V1.AlertListInstance } resource */
    /* protected */ var _alerts: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlertListInstance */ Any
      ] = js.native
    
    /** events - { Twilio.Monitor.V1.EventListInstance } resource */
    /* protected */ var _events: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventListInstance */ Any
      ] = js.native
    
    /** Getter for alerts resource */
    def alerts: Any = js.native
    
    /** Getter for events resource */
    def events: Any = js.native
  }
}
