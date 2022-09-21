package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventDispatcherMod {
  
  @JSImport("wonder.js/dist/es2015/event/dispatcher/EventDispatcher", "EventDispatcher")
  @js.native
  abstract class EventDispatcher () extends StObject {
    
    def trigger(args: Any*): Any = js.native
  }
}
