package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dx extends StObject {
  
  var dx: Double
  
  var dy: Double
}
object Dx {
  
  inline def apply(dx: Double, dy: Double): Dx = {
    val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dx] (val x: Self) extends AnyVal {
    
    inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
  }
}
