package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestInsightsMod {
  
  @JSImport("twilio/lib/rest/Insights", JSImport.Namespace)
  @js.native
  open class ^ () extends Insights
  
  @js.native
  trait Insights
    extends typings.twilio.libRestInsightsBaseMod.^ {
    
    /**
      * @deprecated - Use v1.callSummaries instead
      */
    def callSummaries: Any = js.native
    
    /**
      * @deprecated - Use v1.calls instead
      */
    def calls: Any = js.native
    
    /**
      * @deprecated - Use v1.conferences instead
      */
    def conferences: Any = js.native
    
    /**
      * @deprecated - Use v1.rooms instead
      */
    def rooms: Any = js.native
    
    /**
      * @deprecated - Use v1.settings instead
      */
    def settings: Any = js.native
  }
}
