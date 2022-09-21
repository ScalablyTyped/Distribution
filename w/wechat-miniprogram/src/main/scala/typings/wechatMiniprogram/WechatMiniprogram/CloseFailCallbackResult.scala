package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'bad file descriptor': 无效的文件描述符; */
  var errMsg: String
}
object CloseFailCallbackResult {
  
  inline def apply(errMsg: String): CloseFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseFailCallbackResult]
  }
  
  extension [Self <: CloseFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
