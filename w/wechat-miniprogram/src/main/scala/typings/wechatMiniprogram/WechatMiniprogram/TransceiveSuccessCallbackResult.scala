package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransceiveSuccessCallbackResult extends StObject {
  
  var data: js.typedarray.ArrayBuffer
  
  var errMsg: String
}
object TransceiveSuccessCallbackResult {
  
  inline def apply(data: js.typedarray.ArrayBuffer, errMsg: String): TransceiveSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransceiveSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransceiveSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
