package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rotate extends StObject {
  
  /** 旋转程度，最低基础库 2.3.0 */
  var rotate: Double
  
  /** 缩放程度，最低基础库 2.3.0 */
  var skew: Double
}
object Rotate {
  
  inline def apply(rotate: Double, skew: Double): Rotate = {
    val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any], skew = skew.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotate]
  }
  
  extension [Self <: Rotate](x: Self) {
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setSkew(value: Double): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
  }
}
