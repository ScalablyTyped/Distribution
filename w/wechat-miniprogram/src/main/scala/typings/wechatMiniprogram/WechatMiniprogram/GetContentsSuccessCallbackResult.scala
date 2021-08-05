package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContentsSuccessCallbackResult extends StObject {
  
  /** 表示内容的delta对象 */
  var delta: IAnyObject
  
  var errMsg: String
  
  /** 带标签的HTML内容 */
  var html: String
  
  /** 纯文本内容 */
  var text: String
}
object GetContentsSuccessCallbackResult {
  
  inline def apply(delta: IAnyObject, errMsg: String, html: String, text: String): GetContentsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContentsSuccessCallbackResult]
  }
  
  extension [Self <: GetContentsSuccessCallbackResult](x: Self) {
    
    inline def setDelta(value: IAnyObject): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
