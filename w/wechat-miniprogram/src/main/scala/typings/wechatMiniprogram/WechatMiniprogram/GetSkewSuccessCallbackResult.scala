package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSkewSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 倾斜角 */
  var skew: Double
}
object GetSkewSuccessCallbackResult {
  
  inline def apply(errMsg: String, skew: Double): GetSkewSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], skew = skew.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSkewSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSkewSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setSkew(value: Double): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
  }
}
