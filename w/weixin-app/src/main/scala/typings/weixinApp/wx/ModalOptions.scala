package typings.weixinApp.wx

import typings.weixinApp.anon.Cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 取消按钮的文字颜色，默认为"#000000"
    */
  var cancelColor: js.UndefOr[String] = js.undefined
  
  /**
    * 取消按钮的文字，默认为"取消"，最多 4 个字符
    */
  var cancelText: js.UndefOr[String] = js.undefined
  
  /**
    * 确定按钮的文字颜色，默认为"#3CC51F"
    */
  var confirmColor: js.UndefOr[String] = js.undefined
  
  /**
    * 确定按钮的文字，默认为"确定"，最多 4 个字符
    */
  var confirmText: js.UndefOr[String] = js.undefined
  
  /**
    * 提示的内容
    */
  var content: String
  
  /**
    * 是否显示取消按钮，默认为 true
    */
  var showCancel: js.UndefOr[Boolean] = js.undefined
  
  @JSName("success")
  var success_ModalOptions: js.UndefOr[js.Function1[/* res */ Cancel, Unit]] = js.undefined
  
  /**
    * 提示的标题
    */
  var title: String
}
object ModalOptions {
  
  inline def apply(content: String, title: String): ModalOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions]
  }
  
  extension [Self <: ModalOptions](x: Self) {
    
    inline def setCancelColor(value: String): Self = StObject.set(x, "cancelColor", value.asInstanceOf[js.Any])
    
    inline def setCancelColorUndefined: Self = StObject.set(x, "cancelColor", js.undefined)
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setConfirmColor(value: String): Self = StObject.set(x, "confirmColor", value.asInstanceOf[js.Any])
    
    inline def setConfirmColorUndefined: Self = StObject.set(x, "confirmColor", js.undefined)
    
    inline def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    inline def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
    
    inline def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
    
    inline def setSuccess(value: /* res */ Cancel => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
