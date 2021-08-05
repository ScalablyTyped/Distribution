package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressVideoSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 压缩后的大小，单位 kB */
  var size: String
  
  /** 压缩后的临时文件地址 */
  var tempFilePath: String
}
object CompressVideoSuccessCallbackResult {
  
  inline def apply(errMsg: String, size: String, tempFilePath: String): CompressVideoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressVideoSuccessCallbackResult]
  }
  
  extension [Self <: CompressVideoSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
