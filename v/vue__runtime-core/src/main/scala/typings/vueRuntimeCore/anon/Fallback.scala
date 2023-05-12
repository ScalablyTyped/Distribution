package typings.vueRuntimeCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.vueRuntimeCore.mod.RendererElement
import typings.vueRuntimeCore.mod.RendererNode
import typings.vueRuntimeCore.mod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fallback extends StObject {
  
  def default(): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
  
  def fallback(): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
}
object Fallback {
  
  inline def apply(
    default: () => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]],
    fallback: () => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
  ): Fallback = {
    val __obj = js.Dynamic.literal(default = js.Any.fromFunction0(default), fallback = js.Any.fromFunction0(fallback))
    __obj.asInstanceOf[Fallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fallback] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: () => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
    
    inline def setFallback(value: () => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]): Self = StObject.set(x, "fallback", js.Any.fromFunction0(value))
  }
}
