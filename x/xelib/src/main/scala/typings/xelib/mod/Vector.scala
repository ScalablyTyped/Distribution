package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vector extends StObject {
  
  var X: js.UndefOr[Double] = js.undefined
  
  var Y: js.UndefOr[Double] = js.undefined
  
  var Z: js.UndefOr[Double] = js.undefined
}
object Vector {
  
  inline def apply(): Vector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vector]
  }
  
  extension [Self <: Vector](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "X", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "Y", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "Z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "Z", js.undefined)
  }
}
