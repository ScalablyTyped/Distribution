package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def render(): ReactNode
}
object `0` {
  
  inline def apply(render: () => ReactNode): `0` = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setRender(value: () => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
  }
}
