package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingScheduleOptions extends js.Object {
  
  def `do`(data: TrainingScheduleDoData): Boolean | Unit = js.native
  
  var every: Double = js.native
}
object TrainingScheduleOptions {
  
  @scala.inline
  def apply(`do`: TrainingScheduleDoData => Boolean | Unit, every: Double): TrainingScheduleOptions = {
    val __obj = js.Dynamic.literal(every = every.asInstanceOf[js.Any])
    __obj.updateDynamic("do")(js.Any.fromFunction1(`do`))
    __obj.asInstanceOf[TrainingScheduleOptions]
  }
  
  @scala.inline
  implicit class TrainingScheduleOptionsOps[Self <: TrainingScheduleOptions] (val x: Self) extends AnyVal {
    
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
    def setDo(value: TrainingScheduleDoData => Boolean | Unit): Self = this.set("do", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvery(value: Double): Self = this.set("every", value.asInstanceOf[js.Any])
  }
}
