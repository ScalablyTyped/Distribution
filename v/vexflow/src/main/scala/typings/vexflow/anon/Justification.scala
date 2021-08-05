package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Justification extends StObject {
  
  var justification: js.UndefOr[typings.vexflow.Vex.Flow.TextNote.Justification] = js.undefined
  
  var shift_x: js.UndefOr[Double] = js.undefined
  
  var shift_y: js.UndefOr[Double] = js.undefined
}
object Justification {
  
  inline def apply(): Justification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Justification]
  }
  
  extension [Self <: Justification](x: Self) {
    
    inline def setJustification(value: typings.vexflow.Vex.Flow.TextNote.Justification): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    inline def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    inline def setShift_x(value: Double): Self = StObject.set(x, "shift_x", value.asInstanceOf[js.Any])
    
    inline def setShift_xUndefined: Self = StObject.set(x, "shift_x", js.undefined)
    
    inline def setShift_y(value: Double): Self = StObject.set(x, "shift_y", value.asInstanceOf[js.Any])
    
    inline def setShift_yUndefined: Self = StObject.set(x, "shift_y", js.undefined)
  }
}
