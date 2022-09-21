package typings.twilio

import typings.twilio.callSummariesMod.CallSummariesListInstance
import typings.twilio.roomMod.RoomContext
import typings.twilio.roomMod.RoomListInstance
import typings.twilio.settingMod.SettingContext
import typings.twilio.settingMod.SettingListInstance
import typings.twilio.v1CallMod.CallContext
import typings.twilio.v1CallMod.CallListInstance
import typings.twilio.v1ConferenceMod.ConferenceContext
import typings.twilio.v1ConferenceMod.ConferenceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insightsMod {
  
  @JSImport("twilio/lib/rest/Insights", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Insights {
    /**
      * Initialize insights domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Insights
    extends typings.twilio.domainMod.^ {
    
    val callSummaries: CallSummariesListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def calls(sid: String): CallContext = js.native
    @JSName("calls")
    val calls_Original: CallListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def conferences(sid: String): ConferenceContext = js.native
    @JSName("conferences")
    val conferences_Original: ConferenceListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def rooms(sid: String): RoomContext = js.native
    @JSName("rooms")
    val rooms_Original: RoomListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def settings(sid: String): SettingContext = js.native
    @JSName("settings")
    val settings_Original: SettingListInstance = js.native
    
    val v1: typings.twilio.insightsV1Mod.^ = js.native
  }
}
