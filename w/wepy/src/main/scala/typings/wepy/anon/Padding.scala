package typings.wepy.anon

import typings.wepy.wxEnhancedMod.LagLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Padding extends StObject {
  
  var padding: js.Array[Double]
  
  var points: js.Array[LagLng]
}
object Padding {
  
  inline def apply(padding: js.Array[Double], points: js.Array[LagLng]): Padding = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
  
  extension [Self <: Padding](x: Self) {
    
    inline def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    inline def setPoints(value: js.Array[LagLng]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: LagLng*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
