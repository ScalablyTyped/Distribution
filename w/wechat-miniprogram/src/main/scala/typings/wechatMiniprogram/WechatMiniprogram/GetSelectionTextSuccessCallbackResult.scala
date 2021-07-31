package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSelectionTextSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 纯文本内容 */
  var text: String
}
object GetSelectionTextSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, text: String): GetSelectionTextSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSelectionTextSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetSelectionTextSuccessCallbackResultMutableBuilder[Self <: GetSelectionTextSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
