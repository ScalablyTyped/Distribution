package typings.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  errMsg :string} & weixin-app.wx.ExtConfig */
trait errMsgstringExtConfig extends StObject {
  
  /* 调用结果 */
  var errMsg: String
  
  /** 第三方平台自定义的数据 */
  var extConfig: Any
}
object errMsgstringExtConfig {
  
  inline def apply(errMsg: String, extConfig: Any): errMsgstringExtConfig = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[errMsgstringExtConfig]
  }
  
  extension [Self <: errMsgstringExtConfig](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setExtConfig(value: Any): Self = StObject.set(x, "extConfig", value.asInstanceOf[js.Any])
  }
}
