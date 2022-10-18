package typings.vueReactivity.mod

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebuggerEventExtraInfo extends StObject {
  
  var key: Any
  
  var newValue: js.UndefOr[Any] = js.undefined
  
  var oldTarget: js.UndefOr[(Map[Any, Any]) | Set[Any]] = js.undefined
  
  var oldValue: js.UndefOr[Any] = js.undefined
  
  var target: js.Object
  
  var `type`: TrackOpTypes | TriggerOpTypes
}
object DebuggerEventExtraInfo {
  
  inline def apply(key: Any, target: js.Object, `type`: TrackOpTypes | TriggerOpTypes): DebuggerEventExtraInfo = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebuggerEventExtraInfo]
  }
  
  extension [Self <: DebuggerEventExtraInfo](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldTarget(value: (Map[Any, Any]) | Set[Any]): Self = StObject.set(x, "oldTarget", value.asInstanceOf[js.Any])
    
    inline def setOldTargetUndefined: Self = StObject.set(x, "oldTarget", js.undefined)
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: TrackOpTypes | TriggerOpTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
