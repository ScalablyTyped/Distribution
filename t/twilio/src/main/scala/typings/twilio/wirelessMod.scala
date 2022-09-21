package typings.twilio

import typings.twilio.commandMod.CommandContext
import typings.twilio.commandMod.CommandListInstance
import typings.twilio.ratePlanMod.RatePlanContext
import typings.twilio.ratePlanMod.RatePlanListInstance
import typings.twilio.simMod.SimContext
import typings.twilio.simMod.SimListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wirelessMod {
  
  @JSImport("twilio/lib/rest/preview/Wireless", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Wireless {
    /**
      * Initialize the Wireless version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.previewMod.^) = this()
  }
  
  @js.native
  trait Wireless
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def commands(sid: String): CommandContext = js.native
    @JSName("commands")
    val commands_Original: CommandListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def ratePlans(sid: String): RatePlanContext = js.native
    @JSName("ratePlans")
    val ratePlans_Original: RatePlanListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def sims(sid: String): SimContext = js.native
    @JSName("sims")
    val sims_Original: SimListInstance = js.native
  }
}
