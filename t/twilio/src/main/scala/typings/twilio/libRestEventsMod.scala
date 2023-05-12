package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestEventsMod {
  
  @JSImport("twilio/lib/rest/Events", JSImport.Namespace)
  @js.native
  open class ^ () extends Events
  
  @js.native
  trait Events
    extends typings.twilio.libRestEventsBaseMod.^ {
    
    /**
      * @deprecated - Use v1.eventTypes instead
      */
    def eventTypes: Any = js.native
    
    /**
      * @deprecated - Use v1.schemas instead
      */
    def schemas: Any = js.native
    
    /**
      * @deprecated - Use v1.sinks instead
      */
    def sinks: Any = js.native
    
    /**
      * @deprecated - Use v1.subscriptions instead
      */
    def subscriptions: Any = js.native
  }
}
