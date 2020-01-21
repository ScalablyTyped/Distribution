package typings.tensorflowTfjsLayers.modelSerializationMod

import typings.tensorflowTfjsLayers.trainingConfigMod.TrainingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KerasFileSerialization extends js.Object {
  var model_config: ModelSerialization | SequentialSerialization | LegacySequentialSerialization
  var training_config: TrainingConfig
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
}

