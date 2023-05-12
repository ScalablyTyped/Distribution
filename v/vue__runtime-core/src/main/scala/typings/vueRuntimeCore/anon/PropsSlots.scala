package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.BaseTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsSlots extends StObject {
  
  @JSName("$props")
  var $props: BaseTransitionProps[Any]
  
  @JSName("$slots")
  var $slots: `0`
}
object PropsSlots {
  
  inline def apply($props: BaseTransitionProps[Any], $slots: `0`): PropsSlots = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any], $slots = $slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsSlots] (val x: Self) extends AnyVal {
    
    inline def set$props(value: BaseTransitionProps[Any]): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$slots(value: `0`): Self = StObject.set(x, "$slots", value.asInstanceOf[js.Any])
  }
}
