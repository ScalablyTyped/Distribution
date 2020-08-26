package typings.tensorflowTfjsLayers.modelSerializationMod

import typings.tensorflowTfjsLayers.trainingConfigMod.TrainingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KerasFileSerialization extends js.Object {
  var model_config: ModelSerialization | SequentialSerialization | LegacySequentialSerialization = js.native
  var training_config: TrainingConfig = js.native
}

object KerasFileSerialization {
  @scala.inline
  def apply(
    model_config: ModelSerialization | SequentialSerialization | LegacySequentialSerialization,
    training_config: TrainingConfig
  ): KerasFileSerialization = {
    val __obj = js.Dynamic.literal(model_config = model_config.asInstanceOf[js.Any], training_config = training_config.asInstanceOf[js.Any])
    __obj.asInstanceOf[KerasFileSerialization]
  }
  @scala.inline
  implicit class KerasFileSerializationOps[Self <: KerasFileSerialization] (val x: Self) extends AnyVal {
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
    def setModel_config(value: ModelSerialization | SequentialSerialization | LegacySequentialSerialization): Self = this.set("model_config", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraining_config(value: TrainingConfig): Self = this.set("training_config", value.asInstanceOf[js.Any])
  }
  
}

