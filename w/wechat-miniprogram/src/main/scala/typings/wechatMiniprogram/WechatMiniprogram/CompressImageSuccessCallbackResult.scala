package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressImageSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 压缩后图片的临时文件路径 (本地路径) */
  var tempFilePath: String
}
object CompressImageSuccessCallbackResult {
  
  inline def apply(errMsg: String, tempFilePath: String): CompressImageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressImageSuccessCallbackResult]
  }
  
  extension [Self <: CompressImageSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
