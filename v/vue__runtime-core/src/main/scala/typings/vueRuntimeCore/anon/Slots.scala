package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.KeepAliveProps
import typings.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slots extends StObject {
  
  @JSName("$props")
  var $props: VNodeProps & KeepAliveProps
  
  @JSName("$slots")
  var $slots: `0`
}
object Slots {
  
  inline def apply($props: VNodeProps & KeepAliveProps, $slots: `0`): Slots = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any], $slots = $slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Slots] (val x: Self) extends AnyVal {
    
    inline def set$props(value: VNodeProps & KeepAliveProps): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$slots(value: `0`): Self = StObject.set(x, "$slots", value.asInstanceOf[js.Any])
  }
}
