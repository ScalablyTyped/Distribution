package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartLocalServiceDiscoveryFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'invalid param': serviceType 为空;
    * - 'scan task already exist': 在当前 startLocalServiceDiscovery 发起的搜索未停止的情况下，再次调用 startLocalServiceDiscovery; */
  var errMsg: String
}
object StartLocalServiceDiscoveryFailCallbackResult {
  
  inline def apply(errMsg: String): StartLocalServiceDiscoveryFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLocalServiceDiscoveryFailCallbackResult]
  }
  
  extension [Self <: StartLocalServiceDiscoveryFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
