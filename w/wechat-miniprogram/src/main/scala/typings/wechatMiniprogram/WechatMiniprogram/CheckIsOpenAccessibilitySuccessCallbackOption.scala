package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckIsOpenAccessibilitySuccessCallbackOption extends js.Object {
  
  /** iOS 上开启辅助功能旁白，安卓开启 talkback 时返回 true */
  var open: Boolean = js.native
}
object CheckIsOpenAccessibilitySuccessCallbackOption {
  
  @scala.inline
  def apply(open: Boolean): CheckIsOpenAccessibilitySuccessCallbackOption = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsOpenAccessibilitySuccessCallbackOption]
  }
  
  @scala.inline
  implicit class CheckIsOpenAccessibilitySuccessCallbackOptionOps[Self <: CheckIsOpenAccessibilitySuccessCallbackOption] (val x: Self) extends AnyVal {
    
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
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
  }
}
