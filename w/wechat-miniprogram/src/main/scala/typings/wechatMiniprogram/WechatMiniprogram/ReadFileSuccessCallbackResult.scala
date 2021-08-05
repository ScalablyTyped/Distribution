package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadFileSuccessCallbackResult extends StObject {
  
  /** 文件内容 */
  var data: String | ArrayBuffer
  
  var errMsg: String
}
object ReadFileSuccessCallbackResult {
  
  inline def apply(data: String | ArrayBuffer, errMsg: String): ReadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileSuccessCallbackResult]
  }
  
  extension [Self <: ReadFileSuccessCallbackResult](x: Self) {
    
    inline def setData(value: String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
