package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
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
  implicit class ScaleBinParamsOps[Self <: ScaleBinParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStep(value: Double | SignalRef): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double | SignalRef): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStop(value: Double | SignalRef): Self = this.set("stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
}
