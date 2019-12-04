package typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatModelUnderscoreSerializationMod

import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Sequential
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatLayersLayerUnderscoreSerializationMod.LayerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacySequentialSerialization extends js.Object {
  var backend: js.UndefOr[String] = js.undefined
  var class_name: Sequential
  var config: js.Array[LayerSerialization]
  var keras_version: js.UndefOr[String] = js.undefined
}

object LegacySequentialSerialization {
  @scala.inline
  def apply(
    class_name: Sequential,
    config: js.Array[LayerSerialization],
    backend: String = null,
    keras_version: String = null
  ): LegacySequentialSerialization = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    if (backend != null) __obj.updateDynamic("backend")(backend.asInstanceOf[js.Any])
    if (keras_version != null) __obj.updateDynamic("keras_version")(keras_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacySequentialSerialization]
  }
}

