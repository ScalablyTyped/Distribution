package typings.vueTemplateCompiler.mod

import typings.vue.vnodeMod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompiledResultFunctions extends StObject {
  
  def render(): VNode
  
  var staticRenderFns: js.Array[js.Function0[VNode]]
}
object CompiledResultFunctions {
  
  inline def apply(render: () => VNode, staticRenderFns: js.Array[js.Function0[VNode]]): CompiledResultFunctions = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render), staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledResultFunctions]
  }
  
  extension [Self <: CompiledResultFunctions](x: Self) {
    
    inline def setRender(value: () => VNode): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    inline def setStaticRenderFns(value: js.Array[js.Function0[VNode]]): Self = StObject.set(x, "staticRenderFns", value.asInstanceOf[js.Any])
    
    inline def setStaticRenderFnsVarargs(value: js.Function0[VNode]*): Self = StObject.set(x, "staticRenderFns", js.Array(value :_*))
  }
}
