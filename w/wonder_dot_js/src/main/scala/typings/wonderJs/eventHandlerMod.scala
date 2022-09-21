package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventHandlerMod {
  
  @JSImport("wonder.js/dist/es2015/event/handler/EventHandler", "EventHandler")
  @js.native
  abstract class EventHandler () extends StObject {
    
    def off(args: Any*): Any = js.native
    
    def on(args: Any*): Any = js.native
    
    def trigger(args: Any*): Any = js.native
  }
}
