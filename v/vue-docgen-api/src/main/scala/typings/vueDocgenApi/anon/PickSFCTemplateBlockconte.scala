package typings.vueDocgenApi.anon

import typings.std.Record
import typings.vueDocgenApi.vueDocgenApiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@vue/compiler-sfc.@vue/compiler-sfc.SFCTemplateBlock, 'content' | 'attrs'> */
@js.native
trait PickSFCTemplateBlockconte extends js.Object {
  
  var attrs: Record[String, String | `true`] = js.native
  
  var content: String = js.native
}
object PickSFCTemplateBlockconte {
  
  @scala.inline
  def apply(attrs: Record[String, String | `true`], content: String): PickSFCTemplateBlockconte = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSFCTemplateBlockconte]
  }
  
  @scala.inline
  implicit class PickSFCTemplateBlockconteOps[Self <: PickSFCTemplateBlockconte] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: Record[String, String | `true`]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
  }
}
