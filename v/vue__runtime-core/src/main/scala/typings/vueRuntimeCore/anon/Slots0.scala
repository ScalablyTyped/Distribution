package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.TeleportProps
import typings.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slots0 extends StObject {
  
  @JSName("$props")
  var $props: VNodeProps & TeleportProps
  
  @JSName("$slots")
  var $slots: `0`
}
object Slots0 {
  
  inline def apply($props: VNodeProps & TeleportProps, $slots: `0`): Slots0 = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any], $slots = $slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slots0]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Slots0] (val x: Self) extends AnyVal {
    
    inline def set$props(value: VNodeProps & TeleportProps): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$slots(value: `0`): Self = StObject.set(x, "$slots", value.asInstanceOf[js.Any])
  }
}
