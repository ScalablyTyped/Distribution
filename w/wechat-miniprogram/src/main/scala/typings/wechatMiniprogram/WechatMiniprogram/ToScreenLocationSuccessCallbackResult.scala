package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToScreenLocationSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** x 坐标值 */
  var x: Double
  
  /** y 坐标值 */
  var y: Double
}
object ToScreenLocationSuccessCallbackResult {
  
  inline def apply(errMsg: String, x: Double, y: Double): ToScreenLocationSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToScreenLocationSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToScreenLocationSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
