package typings.vegaLite.buildSrcTransformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImputeSequence extends StObject {
  
  /**
    * The starting value of the sequence.
    * __Default value:__ `0`
    */
  var start: js.UndefOr[Double] = js.undefined
  
  /**
    * The step value between sequence entries.
    * __Default value:__ `1` or `-1` if `stop < start`
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * The ending value(exclusive) of the sequence.
    */
  var stop: Double
}
object ImputeSequence {
  
  inline def apply(stop: Double): ImputeSequence = {
    val __obj = js.Dynamic.literal(stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImputeSequence]
  }
  
  extension [Self <: ImputeSequence](x: Self) {
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
