package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRotateSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 旋转角 */
  var rotate: Double = js.native
}
object GetRotateSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, rotate: Double): GetRotateSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRotateSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetRotateSuccessCallbackResultMutableBuilder[Self <: GetRotateSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
  }
}
