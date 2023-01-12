package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.KeepAliveProps
import typings.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  @JSName("$props")
  var $props: VNodeProps & KeepAliveProps
}
object `2` {
  
  inline def apply($props: VNodeProps & KeepAliveProps): `2` = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def set$props(value: VNodeProps & KeepAliveProps): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
  }
}
