package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventBinderMod {
  
  @JSImport("wonder.js/dist/es2015/event/binder/EventBinder", "EventBinder")
  @js.native
  abstract class EventBinder () extends StObject {
    
    def off(args: Any*): Unit = js.native
    
    def on(args: Any*): Unit = js.native
  }
}
