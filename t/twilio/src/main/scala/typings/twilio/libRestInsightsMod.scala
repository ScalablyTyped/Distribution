package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestInsightsMod {
  
  @JSImport("twilio/lib/rest/Insights", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Insights {
    /**
      * Initialize insights domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Insights
    extends typings.twilio.libBaseDomainMod.^ {
    
    val callSummaries: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CallSummariesListInstance */ Any = js.native
    
    val calls: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CallListInstance */ Any = js.native
    
    val conferences: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConferenceListInstance */ Any = js.native
    
    val rooms: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RoomListInstance */ Any = js.native
    
    val settings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SettingListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestInsightsV1Mod.^ = js.native
  }
}
