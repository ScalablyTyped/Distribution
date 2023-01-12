package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExtConfigSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 第三方平台自定义的数据 */
  var extConfig: IAnyObject
}
object GetExtConfigSuccessCallbackResult {
  
  inline def apply(errMsg: String, extConfig: IAnyObject): GetExtConfigSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExtConfigSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetExtConfigSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setExtConfig(value: IAnyObject): Self = StObject.set(x, "extConfig", value.asInstanceOf[js.Any])
  }
}
