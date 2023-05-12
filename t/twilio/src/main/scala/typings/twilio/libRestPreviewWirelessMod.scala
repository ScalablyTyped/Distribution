package typings.twilio

import typings.twilio.libRestPreviewBaseMod.^
import typings.twilio.libRestPreviewWirelessCommandMod.CommandListInstance
import typings.twilio.libRestPreviewWirelessRatePlanMod.RatePlanListInstance
import typings.twilio.libRestPreviewWirelessSimMod.SimListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewWirelessMod {
  
  @JSImport("twilio/lib/rest/preview/Wireless", JSImport.Default)
  @js.native
  open class default protected () extends Wireless {
    /**
      * Initialize the Wireless version of Preview
      *
      * @param domain - The Twilio (Twilio.Preview) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait Wireless
    extends typings.twilio.libBaseVersionMod.default {
    
    /** commands - { Twilio.Preview.Wireless.CommandListInstance } resource */
    /* protected */ var _commands: js.UndefOr[CommandListInstance] = js.native
    
    /** ratePlans - { Twilio.Preview.Wireless.RatePlanListInstance } resource */
    /* protected */ var _ratePlans: js.UndefOr[RatePlanListInstance] = js.native
    
    /** sims - { Twilio.Preview.Wireless.SimListInstance } resource */
    /* protected */ var _sims: js.UndefOr[SimListInstance] = js.native
    
    /** Getter for commands resource */
    def commands: CommandListInstance = js.native
    
    /** Getter for ratePlans resource */
    def ratePlans: RatePlanListInstance = js.native
    
    /** Getter for sims resource */
    def sims: SimListInstance = js.native
  }
}
