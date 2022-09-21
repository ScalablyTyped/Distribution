package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenSyncError extends StObject {
  
  /** 错误码
    *
    * | 错误信息 | 说明 |
    * | - | - |
    * | fail no such file or directory "${filePath}" | 上级目录不存在 | */ var errCode: Double
  
  /** 错误信息
    *
    * | 错误信息 | 说明 |
    * | - | - |
    * | fail no such file or directory "${filePath}" | 上级目录不存在 | */ var errMsg: String
}
object OpenSyncError {
  
  inline def apply(errCode: Double, errMsg: String): OpenSyncError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenSyncError]
  }
  
  extension [Self <: OpenSyncError](x: Self) {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
