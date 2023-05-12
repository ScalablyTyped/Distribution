package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.SuspenseProps
import typings.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props extends StObject {
  
  @JSName("$props")
  var $props: VNodeProps & SuspenseProps
  
  @JSName("$slots")
  var $slots: Fallback
}
object Props {
  
  inline def apply($props: VNodeProps & SuspenseProps, $slots: Fallback): Props = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any], $slots = $slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
    
    inline def set$props(value: VNodeProps & SuspenseProps): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$slots(value: Fallback): Self = StObject.set(x, "$slots", value.asInstanceOf[js.Any])
  }
}
