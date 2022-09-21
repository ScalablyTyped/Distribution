package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FstatFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'bad file descriptor': 无效的文件描述符;
    * - 'fail permission denied': 指定的 fd 路径没有读权限; */
  var errMsg: String
}
object FstatFailCallbackResult {
  
  inline def apply(errMsg: String): FstatFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[FstatFailCallbackResult]
  }
  
  extension [Self <: FstatFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
