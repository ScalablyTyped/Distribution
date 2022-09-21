package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.SuspenseProps
import typings.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  @JSName("$props")
  var $props: VNodeProps & SuspenseProps
}
object `1` {
  
  inline def apply($props: VNodeProps & SuspenseProps): `1` = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def set$props(value: VNodeProps & SuspenseProps): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
  }
}
