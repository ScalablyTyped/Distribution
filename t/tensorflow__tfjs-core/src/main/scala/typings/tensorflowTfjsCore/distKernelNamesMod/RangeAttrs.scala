package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeAttrs extends StObject {
  
  var dtype: float32 | int32
  
  var start: Double
  
  var step: Double
  
  var stop: Double
}
object RangeAttrs {
  
  inline def apply(dtype: float32 | int32, start: Double, step: Double, stop: Double): RangeAttrs = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeAttrs]
  }
  
  extension [Self <: RangeAttrs](x: Self) {
    
    inline def setDtype(value: float32 | int32): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
