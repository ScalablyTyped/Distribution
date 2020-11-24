package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingScheduleDoData extends js.Object {
  
  var error: js.Any = js.native
  
  var iterations: js.Any = js.native
  
  /**
    * The current learning rate.
    */
  var rate: js.Any = js.native
}
object TrainingScheduleDoData {
  
  @scala.inline
  def apply(error: js.Any, iterations: js.Any, rate: js.Any): TrainingScheduleDoData = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingScheduleDoData]
  }
  
  @scala.inline
  implicit class TrainingScheduleDoDataOps[Self <: TrainingScheduleDoData] (val x: Self) extends AnyVal {
    
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
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: js.Any): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRate(value: js.Any): Self = this.set("rate", value.asInstanceOf[js.Any])
  }
}
