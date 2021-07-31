package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCompassChangeCallbackResult extends StObject {
  
  /** 精度
    *
    * 最低基础库： `2.4.0` */
  var accuracy: Double | String
  
  /** 面对的方向度数 */
  var direction: Double
}
object OnCompassChangeCallbackResult {
  
  @scala.inline
  def apply(accuracy: Double | String, direction: Double): OnCompassChangeCallbackResult = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCompassChangeCallbackResult]
  }
  
  @scala.inline
  implicit class OnCompassChangeCallbackResultMutableBuilder[Self <: OnCompassChangeCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double | String): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
