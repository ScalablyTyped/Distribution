package typings.vueRouter.anon

import typings.vueRouter.mod.RouterLinkProps
import typings.vueRuntimeCore.mod.AllowedComponentProps
import typings.vueRuntimeCore.mod.ComponentCustomProps
import typings.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props extends StObject {
  
  @JSName("$props")
  var $props: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterLinkProps
  
  @JSName("$slots")
  var $slots: Default
}
object Props {
  
  inline def apply(
    $props: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterLinkProps,
    $slots: Default
  ): Props = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any], $slots = $slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  extension [Self <: Props](x: Self) {
    
    inline def set$props(value: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterLinkProps): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$slots(value: Default): Self = StObject.set(x, "$slots", value.asInstanceOf[js.Any])
  }
}
