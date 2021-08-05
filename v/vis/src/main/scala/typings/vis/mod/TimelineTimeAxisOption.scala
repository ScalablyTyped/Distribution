package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineTimeAxisOption extends StObject {
  
  var scale: js.UndefOr[TimelineTimeAxisScaleType] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
}
object TimelineTimeAxisOption {
  
  inline def apply(): TimelineTimeAxisOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineTimeAxisOption]
  }
  
  extension [Self <: TimelineTimeAxisOption](x: Self) {
    
    inline def setScale(value: TimelineTimeAxisScaleType): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
