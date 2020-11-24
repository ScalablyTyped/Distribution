package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.done
import typings.wegameApi.wegameApiStrings.go
import typings.wegameApi.wegameApiStrings.next
import typings.wegameApi.wegameApiStrings.search
import typings.wegameApi.wegameApiStrings.send
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmHold extends js.Object {
  
  /**
    * 当点击完成时键盘是否收起
    */
  var confirmHold: js.UndefOr[Boolean] = js.native
  
  /**
    * 键盘右下角 confirm 按钮的类型，只影响按钮的文本内容
    */
  var confirmType: js.UndefOr[done | next | search | go | send] = js.native
  
  /**
    * 键盘输入框显示的默认值
    */
  var defaultValue: String = js.native
  
  /**
    * 键盘中文本的最大长度
    */
  var maxLength: js.UndefOr[Double] = js.native
  
  /**
    * 是否为多行输入
    */
  var multiple: js.UndefOr[Boolean] = js.native
}
object ConfirmHold {
  
  @scala.inline
  def apply(defaultValue: String): ConfirmHold = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmHold]
  }
  
  @scala.inline
  implicit class ConfirmHoldOps[Self <: ConfirmHold] (val x: Self) extends AnyVal {
    
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
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmHold(value: Boolean): Self = this.set("confirmHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmHold: Self = this.set("confirmHold", js.undefined)
    
    @scala.inline
    def setConfirmType(value: done | next | search | go | send): Self = this.set("confirmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmType: Self = this.set("confirmType", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
  }
}
