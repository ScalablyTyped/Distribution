package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalOptions extends CommonCallbackOptions {
  
  //  取消按钮的文字颜色，必须是 16 进制格式的颜色字符串，默认值'#000000'
  var cancelColor: js.UndefOr[String] = js.native
  
  //  取消按钮的文字，最多 4 个字符，默认值'取消'
  var cancelText: js.UndefOr[String] = js.native
  
  //  确认按钮的文字颜色，必须是 16 进制格式的颜色字符串，默认值'#3cc51f'
  var confirmColor: js.UndefOr[Boolean] = js.native
  
  //  确认按钮的文字，最多 4 个字符
  var confirmText: js.UndefOr[String] = js.native
  
  // 提示的内容
  var content: String = js.native
  
  //  是否显示取消按钮，默认值true
  var showCancel: js.UndefOr[Boolean] = js.native
  
  // 提示的内容
  var title: String = js.native
}
object ModalOptions {
  
  @scala.inline
  def apply(content: String, title: String): ModalOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions]
  }
  
  @scala.inline
  implicit class ModalOptionsMutableBuilder[Self <: ModalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelColor(value: String): Self = StObject.set(x, "cancelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelColorUndefined: Self = StObject.set(x, "cancelColor", js.undefined)
    
    @scala.inline
    def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    @scala.inline
    def setConfirmColor(value: Boolean): Self = StObject.set(x, "confirmColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmColorUndefined: Self = StObject.set(x, "confirmColor", js.undefined)
    
    @scala.inline
    def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
