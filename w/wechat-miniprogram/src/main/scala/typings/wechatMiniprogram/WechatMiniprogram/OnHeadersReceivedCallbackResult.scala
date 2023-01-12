package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnHeadersReceivedCallbackResult extends StObject {
  
  /** 开发者服务器返回的 HTTP Response Header */
  var header: IAnyObject
}
object OnHeadersReceivedCallbackResult {
  
  inline def apply(header: IAnyObject): OnHeadersReceivedCallbackResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeadersReceivedCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnHeadersReceivedCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: IAnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
