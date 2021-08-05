package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstrainNumberRange
  extends StObject
     with NumberRange {
  
  var exact: js.UndefOr[Double] = js.undefined
  
  var ideal: js.UndefOr[Double] = js.undefined
}
object ConstrainNumberRange {
  
  inline def apply(): ConstrainNumberRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainNumberRange]
  }
  
  extension [Self <: ConstrainNumberRange](x: Self) {
    
    inline def setExact(value: Double): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setIdeal(value: Double): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
  }
}
