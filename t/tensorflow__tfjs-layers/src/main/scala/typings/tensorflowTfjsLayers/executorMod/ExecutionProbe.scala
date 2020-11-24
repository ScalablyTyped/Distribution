package typings.tensorflowTfjsLayers.executorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionProbe extends js.Object {
  
  /**
    * Maximum number of tensors that exist during all steps of the
    * execution. Tensor counts are measured at the beginning of every
    * step.
    */
  var maxNumTensors: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of tensors that exist during all steps of the
    * execution. Tensor counts are measured at the beginning of every
    * step.
    */
  var minNumTensors: js.UndefOr[Double] = js.native
}
object ExecutionProbe {
  
  @scala.inline
  def apply(): ExecutionProbe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionProbe]
  }
  
  @scala.inline
  implicit class ExecutionProbeOps[Self <: ExecutionProbe] (val x: Self) extends AnyVal {
    
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
    def setMaxNumTensors(value: Double): Self = this.set("maxNumTensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNumTensors: Self = this.set("maxNumTensors", js.undefined)
    
    @scala.inline
    def setMinNumTensors(value: Double): Self = this.set("minNumTensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinNumTensors: Self = this.set("minNumTensors", js.undefined)
  }
}
