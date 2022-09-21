package typings.vueRouter.anon

import org.scalablytyped.runtime.StringDictionary
import typings.vueRuntimeCore.mod.RendererElement
import typings.vueRuntimeCore.mod.RendererNode
import typings.vueRuntimeCore.mod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def default(arg: Component): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
}
object `0` {
  
  inline def apply(default: Component => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]): `0` = {
    val __obj = js.Dynamic.literal(default = js.Any.fromFunction1(default))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setDefault(value: Component => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
  }
}
