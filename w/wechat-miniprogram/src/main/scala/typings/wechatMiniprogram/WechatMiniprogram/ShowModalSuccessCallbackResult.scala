package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowModalSuccessCallbackResult extends StObject {
  
  /** 为 true 时，表示用户点击了取消（用于 Android 系统区分点击蒙层关闭还是点击取消按钮关闭）
    *
    * 最低基础库： `1.1.0` */
  var cancel: Boolean = js.native
  
  /** 为 true 时，表示用户点击了确定按钮 */
  var confirm: Boolean = js.native
  
  var errMsg: String = js.native
}
object ShowModalSuccessCallbackResult {
  
  @scala.inline
  def apply(cancel: Boolean, confirm: Boolean, errMsg: String): ShowModalSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowModalSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ShowModalSuccessCallbackResultMutableBuilder[Self <: ShowModalSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
