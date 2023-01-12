package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.TeleportProps
import typings.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  @JSName("$props")
  var $props: VNodeProps & TeleportProps
}
object `0` {
  
  inline def apply($props: VNodeProps & TeleportProps): `0` = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def set$props(value: VNodeProps & TeleportProps): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
  }
}
