package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransceiveSuccessCallbackResult extends StObject {
  
  var data: ArrayBuffer
  
  var errMsg: String
}
object TransceiveSuccessCallbackResult {
  
  @scala.inline
  def apply(data: ArrayBuffer, errMsg: String): TransceiveSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransceiveSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class TransceiveSuccessCallbackResultMutableBuilder[Self <: TransceiveSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
