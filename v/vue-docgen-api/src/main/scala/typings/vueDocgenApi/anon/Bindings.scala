package typings.vueDocgenApi.anon

import typings.vueInbrowserCompilerUtils.typesMod.ParamTag
import typings.vueInbrowserCompilerUtils.typesMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bindings extends js.Object {
  
  var bindings: js.Array[ParamTag | Tag] = js.native
}
object Bindings {
  
  @scala.inline
  def apply(bindings: js.Array[ParamTag | Tag]): Bindings = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bindings]
  }
  
  @scala.inline
  implicit class BindingsOps[Self <: Bindings] (val x: Self) extends AnyVal {
    
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
    def setBindingsVarargs(value: (ParamTag | Tag)*): Self = this.set("bindings", js.Array(value :_*))
    
    @scala.inline
    def setBindings(value: js.Array[ParamTag | Tag]): Self = this.set("bindings", value.asInstanceOf[js.Any])
  }
}
