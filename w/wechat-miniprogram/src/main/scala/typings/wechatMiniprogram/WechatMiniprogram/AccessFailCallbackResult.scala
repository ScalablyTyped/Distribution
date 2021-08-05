package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail no such file or directory ${path}': 文件/目录不存在; */
  var errMsg: String
}
object AccessFailCallbackResult {
  
  inline def apply(errMsg: String): AccessFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessFailCallbackResult]
  }
  
  extension [Self <: AccessFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
