package typings.vueTemplateCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vueRuntimeCore.mod.RendererElement
import typings.vueRuntimeCore.mod.RendererNode
import typings.vueRuntimeCore.mod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompiledResultFunctions extends StObject {
  
  def render(): VNode[RendererNode, RendererElement, StringDictionary[Any]]
  
  var staticRenderFns: js.Array[js.Function0[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
}
object CompiledResultFunctions {
  
  inline def apply(
    render: () => VNode[RendererNode, RendererElement, StringDictionary[Any]],
    staticRenderFns: js.Array[js.Function0[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
  ): CompiledResultFunctions = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render), staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledResultFunctions]
  }
  
  extension [Self <: CompiledResultFunctions](x: Self) {
    
    inline def setRender(value: () => VNode[RendererNode, RendererElement, StringDictionary[Any]]): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    inline def setStaticRenderFns(value: js.Array[js.Function0[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]): Self = StObject.set(x, "staticRenderFns", value.asInstanceOf[js.Any])
    
    inline def setStaticRenderFnsVarargs(value: (js.Function0[VNode[RendererNode, RendererElement, StringDictionary[Any]]])*): Self = StObject.set(x, "staticRenderFns", js.Array(value*))
  }
}
