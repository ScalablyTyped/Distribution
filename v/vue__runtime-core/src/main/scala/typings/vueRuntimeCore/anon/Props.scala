package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.BaseTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props extends StObject {
  
  @JSName("$props")
  var $props: BaseTransitionProps[Any]
}
object Props {
  
  inline def apply($props: BaseTransitionProps[Any]): Props = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
    
    inline def set$props(value: BaseTransitionProps[Any]): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
  }
}
