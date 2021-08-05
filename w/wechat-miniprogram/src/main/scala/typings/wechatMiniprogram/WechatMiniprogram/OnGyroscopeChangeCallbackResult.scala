package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnGyroscopeChangeCallbackResult extends StObject {
  
  /** x 轴的角速度 */
  var x: Double
  
  /** y 轴的角速度 */
  var y: Double
  
  /** z 轴的角速度 */
  var z: Double
}
object OnGyroscopeChangeCallbackResult {
  
  inline def apply(x: Double, y: Double, z: Double): OnGyroscopeChangeCallbackResult = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGyroscopeChangeCallbackResult]
  }
  
  extension [Self <: OnGyroscopeChangeCallbackResult](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
