package typings.vueRuntimeCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.vueRuntimeCore.mod.RendererElement
import typings.vueRuntimeCore.mod.RendererNode
import typings.vueRuntimeCore.mod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def default(): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
}
object `0` {
  
  inline def apply(default: () => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]): `0` = {
    val __obj = js.Dynamic.literal(default = js.Any.fromFunction0(default))
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: () => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
  }
}
