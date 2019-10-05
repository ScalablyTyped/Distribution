package typings.synaptic.synapticMod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingScheduleOptions extends js.Object {
  var every: Double
  def `do`(data: TrainingScheduleDoData): Boolean | Unit
}

object TrainingScheduleOptions {
  @scala.inline
  def apply(`do`: TrainingScheduleDoData => Boolean | Unit, every: Double): TrainingScheduleOptions = {
    val __obj = js.Dynamic.literal(every = every)
    __obj.updateDynamic("do")(js.Any.fromFunction1(`do`))
    __obj.asInstanceOf[TrainingScheduleOptions]
  }
}

