package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestInsightsV1Mod {
  
  @JSImport("twilio/lib/rest/insights/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Insights
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestInsightsMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val callSummaries: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CallSummariesListInstance */ Any = js.native
    
    val calls: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CallListInstance */ Any = js.native
    
    val conferences: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConferenceListInstance */ Any = js.native
    
    val rooms: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RoomListInstance */ Any = js.native
    
    val settings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SettingListInstance */ Any = js.native
  }
}
