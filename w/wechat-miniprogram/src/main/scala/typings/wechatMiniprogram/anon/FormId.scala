package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormId extends js.Object {
  
  var formId: js.UndefOr[js.Any] = js.native
  
  var target: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject] = js.native
  
  /** 表单中的数据，需要在表单组件中加上 name 来作为 key。 */
  var value: IAnyObject = js.native
}
object FormId {
  
  @scala.inline
  def apply(target: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject], value: IAnyObject): FormId = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormId]
  }
  
  @scala.inline
  implicit class FormIdOps[Self <: FormId] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: IAnyObject): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormId(value: js.Any): Self = this.set("formId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormId: Self = this.set("formId", js.undefined)
  }
}
