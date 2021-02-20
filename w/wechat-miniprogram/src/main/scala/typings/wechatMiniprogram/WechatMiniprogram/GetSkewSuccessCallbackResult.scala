package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSkewSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 倾斜角 */
  var skew: Double = js.native
}
object GetSkewSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, skew: Double): GetSkewSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], skew = skew.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSkewSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetSkewSuccessCallbackResultMutableBuilder[Self <: GetSkewSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkew(value: Double): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
  }
}
