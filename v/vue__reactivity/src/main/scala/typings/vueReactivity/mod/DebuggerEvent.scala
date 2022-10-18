package typings.vueReactivity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebuggerEvent
  extends StObject
     with DebuggerEventExtraInfo {
  
  var effect: ReactiveEffect[Any]
}
object DebuggerEvent {
  
  inline def apply(effect: ReactiveEffect[Any], key: Any, target: js.Object, `type`: TrackOpTypes | TriggerOpTypes): DebuggerEvent = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebuggerEvent]
  }
  
  extension [Self <: DebuggerEvent](x: Self) {
    
    inline def setEffect(value: ReactiveEffect[Any]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
  }
}
