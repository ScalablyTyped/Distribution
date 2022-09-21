package typings.twilio

import typings.twilio.v1CommandMod.CommandContext
import typings.twilio.v1CommandMod.CommandListInstance
import typings.twilio.v1RatePlanMod.RatePlanContext
import typings.twilio.v1RatePlanMod.RatePlanListInstance
import typings.twilio.v1UsageRecordMod.UsageRecordListInstance
import typings.twilio.wirelessV1SimMod.SimContext
import typings.twilio.wirelessV1SimMod.SimListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wirelessV1Mod {
  
  @JSImport("twilio/lib/rest/wireless/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Wireless
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.restWirelessMod.^) = this()
  }
  
  @js.native
  trait V1
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
    
    val usageRecords: UsageRecordListInstance = js.native
  }
}
