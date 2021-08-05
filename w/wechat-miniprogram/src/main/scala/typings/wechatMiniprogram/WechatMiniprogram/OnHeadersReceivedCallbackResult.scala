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
  
  extension [Self <: OnHeadersReceivedCallbackResult](x: Self) {
    
    inline def setHeader(value: IAnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
