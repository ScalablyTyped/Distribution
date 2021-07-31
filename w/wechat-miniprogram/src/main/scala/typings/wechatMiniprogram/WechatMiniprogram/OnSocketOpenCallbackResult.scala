package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSocketOpenCallbackResult extends StObject {
  
  /** 连接成功的 HTTP 响应 Header
    *
    * 最低基础库： `2.0.0` */
  var header: IAnyObject
}
object OnSocketOpenCallbackResult {
  
  @scala.inline
  def apply(header: IAnyObject): OnSocketOpenCallbackResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSocketOpenCallbackResult]
  }
  
  @scala.inline
  implicit class OnSocketOpenCallbackResultMutableBuilder[Self <: OnSocketOpenCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: IAnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
