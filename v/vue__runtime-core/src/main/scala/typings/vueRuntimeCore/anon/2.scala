package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.TeleportProps
import typings.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  @JSName("$props")
  var $props: VNodeProps & TeleportProps
}
object `2` {
  
  inline def apply($props: VNodeProps & TeleportProps): `2` = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def set$props(value: VNodeProps & TeleportProps): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
  }
}
