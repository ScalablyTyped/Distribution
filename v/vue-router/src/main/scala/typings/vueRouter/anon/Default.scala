package typings.vueRouter.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.ReturnType
import typings.vueReactivity.mod.UnwrapRef
import typings.vueRouter.mod.UseLinkOptions
import typings.vueRuntimeCore.mod.RendererElement
import typings.vueRuntimeCore.mod.RendererNode
import typings.vueRuntimeCore.mod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  def default(arg: UnwrapRef[ReturnType[js.Function1[/* props */ UseLinkOptions, IsActive]]]): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
}
object Default {
  
  inline def apply(
    default: UnwrapRef[ReturnType[js.Function1[/* props */ UseLinkOptions, IsActive]]] => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
  ): Default = {
    val __obj = js.Dynamic.literal(default = js.Any.fromFunction1(default))
    __obj.asInstanceOf[Default]
  }
  
  extension [Self <: Default](x: Self) {
    
    inline def setDefault(
      value: UnwrapRef[ReturnType[js.Function1[/* props */ UseLinkOptions, IsActive]]] => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    ): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
  }
}
