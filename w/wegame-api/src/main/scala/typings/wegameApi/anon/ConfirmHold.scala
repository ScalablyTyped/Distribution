package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.done
import typings.wegameApi.wegameApiStrings.go
import typings.wegameApi.wegameApiStrings.next
import typings.wegameApi.wegameApiStrings.search
import typings.wegameApi.wegameApiStrings.send
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmHold extends StObject {
  
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
  implicit class ConfirmHoldMutableBuilder[Self <: ConfirmHold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmHold(value: Boolean): Self = StObject.set(x, "confirmHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmHoldUndefined: Self = StObject.set(x, "confirmHold", js.undefined)
    
    @scala.inline
    def setConfirmType(value: done | next | search | go | send): Self = StObject.set(x, "confirmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmTypeUndefined: Self = StObject.set(x, "confirmType", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
