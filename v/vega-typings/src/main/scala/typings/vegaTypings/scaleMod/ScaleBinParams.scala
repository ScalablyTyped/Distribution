package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleBinParams extends _ScaleBins {
  
  /**
    * The starting (lowest-valued) bin boundary.
    *
    * __Default value:__ The lowest value of the scale domain will be used.
    */
  var start: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * The step size defining the bin interval width.
    */
  var step: Double | SignalRef = js.native
  
  /**
    * The stopping (highest-valued) bin boundary.
    *
    * __Default value:__ The highest value of the scale domain will be used.
    *
    */
  var stop: js.UndefOr[Double | SignalRef] = js.native
}
object ScaleBinParams {
  
  @scala.inline
  def apply(step: Double | SignalRef): ScaleBinParams = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleBinParams]
  }
  
  @scala.inline
  implicit class ScaleBinParamsMutableBuilder[Self <: ScaleBinParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStart(value: Double | SignalRef): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStep(value: Double | SignalRef): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: Double | SignalRef): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
