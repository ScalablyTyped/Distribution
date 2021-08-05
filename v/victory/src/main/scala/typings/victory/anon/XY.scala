package typings.victory.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XY extends StObject {
  
  var x: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.undefined
  
  var y: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.undefined
}
object XY {
  
  inline def apply(): XY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XY]
  }
  
  extension [Self <: XY](x: Self) {
    
    inline def setX(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
