package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cps extends StObject {
  
  var cps: js.UndefOr[js.Array[X]] = js.undefined
  
  var invert: Boolean
  
  var position: typings.vexflow.Vex.Flow.Curve.Position
  
  var spacing: js.UndefOr[Double] = js.undefined
  
  var thickness: js.UndefOr[Double] = js.undefined
  
  var x_shift: js.UndefOr[Double] = js.undefined
  
  var y_shift: Double
}
object Cps {
  
  inline def apply(invert: Boolean, position: typings.vexflow.Vex.Flow.Curve.Position, y_shift: Double): Cps = {
    val __obj = js.Dynamic.literal(invert = invert.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cps]
  }
  
  extension [Self <: Cps](x: Self) {
    
    inline def setCps(value: js.Array[X]): Self = StObject.set(x, "cps", value.asInstanceOf[js.Any])
    
    inline def setCpsUndefined: Self = StObject.set(x, "cps", js.undefined)
    
    inline def setCpsVarargs(value: X*): Self = StObject.set(x, "cps", js.Array(value :_*))
    
    inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: typings.vexflow.Vex.Flow.Curve.Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setX_shift(value: Double): Self = StObject.set(x, "x_shift", value.asInstanceOf[js.Any])
    
    inline def setX_shiftUndefined: Self = StObject.set(x, "x_shift", js.undefined)
    
    inline def setY_shift(value: Double): Self = StObject.set(x, "y_shift", value.asInstanceOf[js.Any])
  }
}
