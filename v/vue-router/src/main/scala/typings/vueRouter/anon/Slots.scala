package typings.vueRouter.anon

import typings.vueRouter.mod.RouterViewProps
import typings.vueRuntimeCore.mod.AllowedComponentProps
import typings.vueRuntimeCore.mod.ComponentCustomProps
import typings.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slots extends StObject {
  
  @JSName("$props")
  var $props: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterViewProps
  
  @JSName("$slots")
  var $slots: `0`
}
object Slots {
  
  inline def apply($props: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterViewProps, $slots: `0`): Slots = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any], $slots = $slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slots]
  }
  
  extension [Self <: Slots](x: Self) {
    
    inline def set$props(value: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterViewProps): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$slots(value: `0`): Self = StObject.set(x, "$slots", value.asInstanceOf[js.Any])
  }
}
