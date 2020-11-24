package typings.vueTemplateCompiler.mod

import typings.vue.vnodeMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompiledResultFunctions extends js.Object {
  
  def render(): VNode = js.native
  
  var staticRenderFns: js.Array[js.Function0[VNode]] = js.native
}
object CompiledResultFunctions {
  
  @scala.inline
  def apply(render: () => VNode, staticRenderFns: js.Array[js.Function0[VNode]]): CompiledResultFunctions = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render), staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledResultFunctions]
  }
  
  @scala.inline
  implicit class CompiledResultFunctionsOps[Self <: CompiledResultFunctions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRender(value: () => VNode): Self = this.set("render", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStaticRenderFnsVarargs(value: js.Function0[VNode]*): Self = this.set("staticRenderFns", js.Array(value :_*))
    
    @scala.inline
    def setStaticRenderFns(value: js.Array[js.Function0[VNode]]): Self = this.set("staticRenderFns", value.asInstanceOf[js.Any])
  }
}
