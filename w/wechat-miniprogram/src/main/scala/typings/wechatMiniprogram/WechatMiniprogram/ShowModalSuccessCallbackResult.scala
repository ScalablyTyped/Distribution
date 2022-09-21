package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowModalSuccessCallbackResult extends StObject {
  
  /** 为 true 时，表示用户点击了取消（用于 Android 系统区分点击蒙层关闭还是点击取消按钮关闭）
    *
    * 最低基础库： `1.1.0` */
  var cancel: Boolean
  
  /** 为 true 时，表示用户点击了确定按钮 */
  var confirm: Boolean
  
  /** editable 为 true 时，用户输入的文本 */
  var content: String
  
  var errMsg: String
}
object ShowModalSuccessCallbackResult {
  
  inline def apply(cancel: Boolean, confirm: Boolean, content: String, errMsg: String): ShowModalSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowModalSuccessCallbackResult]
  }
  
  extension [Self <: ShowModalSuccessCallbackResult](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
