package typings.vueDocgenApi.slotHandlerMod

import typings.vueInbrowserCompilerUtils.typesMod.ParamTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<vue-docgen-api.vue-docgen-api/dist/Documentation.SlotDescriptor, 'bindings'> */
@js.native
trait SlotComment extends js.Object {
  
  var bindings: js.UndefOr[js.Array[ParamTag]] = js.native
}
object SlotComment {
  
  @scala.inline
  def apply(): SlotComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotComment]
  }
  
  @scala.inline
  implicit class SlotCommentOps[Self <: SlotComment] (val x: Self) extends AnyVal {
    
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
    def setBindingsVarargs(value: ParamTag*): Self = this.set("bindings", js.Array(value :_*))
    
    @scala.inline
    def setBindings(value: js.Array[ParamTag]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
  }
}
