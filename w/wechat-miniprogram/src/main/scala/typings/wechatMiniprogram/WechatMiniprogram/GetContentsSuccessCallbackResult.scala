package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContentsSuccessCallbackResult extends StObject {
  
  /** 表示内容的delta对象 */
  var delta: IAnyObject = js.native
  
  var errMsg: String = js.native
  
  /** 带标签的HTML内容 */
  var html: String = js.native
  
  /** 纯文本内容 */
  var text: String = js.native
}
object GetContentsSuccessCallbackResult {
  
  @scala.inline
  def apply(delta: IAnyObject, errMsg: String, html: String, text: String): GetContentsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContentsSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetContentsSuccessCallbackResultMutableBuilder[Self <: GetContentsSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelta(value: IAnyObject): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
