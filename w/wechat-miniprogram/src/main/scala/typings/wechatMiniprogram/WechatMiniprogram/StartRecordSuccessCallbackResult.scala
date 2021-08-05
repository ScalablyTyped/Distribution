package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRecordSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 录音文件的临时路径 (本地路径) */
  var tempFilePath: String
}
object StartRecordSuccessCallbackResult {
  
  inline def apply(errMsg: String, tempFilePath: String): StartRecordSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRecordSuccessCallbackResult]
  }
  
  extension [Self <: StartRecordSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
