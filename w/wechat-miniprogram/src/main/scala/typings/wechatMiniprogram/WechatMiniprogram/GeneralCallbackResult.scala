package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralCallbackResult extends StObject {
  
  var errMsg: String
}
object GeneralCallbackResult {
  
  @scala.inline
  def apply(errMsg: String): GeneralCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralCallbackResult]
  }
  
  @scala.inline
  implicit class GeneralCallbackResultMutableBuilder[Self <: GeneralCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
