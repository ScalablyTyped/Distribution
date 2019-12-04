package typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatModelUnderscoreSerializationMod

import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Model
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.BaseSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelSerialization extends BaseSerialization[Model, ModelConfig] {
  var backend: js.UndefOr[String] = js.undefined
  var keras_version: js.UndefOr[String] = js.undefined
}

object ModelSerialization {
  @scala.inline
  def apply(class_name: Model, config: ModelConfig, backend: String = null, keras_version: String = null): ModelSerialization = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    if (backend != null) __obj.updateDynamic("backend")(backend.asInstanceOf[js.Any])
    if (keras_version != null) __obj.updateDynamic("keras_version")(keras_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelSerialization]
  }
}

