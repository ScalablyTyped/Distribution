package typings.tensorflowTfjsCore.typesMod

import typings.std.Date
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GraphDef
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelArtifactsInfo extends js.Object {
  /**
    * Timestamp for when the model is saved.
    */
  var dateSaved: Date
  /**
    * Size of model topology (Keras JSON or GraphDef), in bytes.
    */
  var modelTopologyBytes: js.UndefOr[Double] = js.undefined
  /**
    * TODO (cais,yassogba) consider removing GraphDef as GraphDefs now
    * come in a JSON format and none of our IOHandlers support a non json
    * format. We could conder replacing this with 'Binary' if we want to
    * allow future handlers to save to non json formats (though they will
    * probably want more information than 'Binary').
    * Type of the model topology
    *
    * Type of the model topology
    *
    * Possible values:
    *   - JSON: JSON config (human-readable, e.g., Keras JSON).
    *   - GraphDef: TensorFlow
    *     [GraphDef](https://www.tensorflow.org/extend/tool_developers/#graphdef)
    *     protocol buffer (binary).
    */
  var modelTopologyType: JSON | GraphDef
  /**
    * Size of weight value data, in bytes.
    */
  var weightDataBytes: js.UndefOr[Double] = js.undefined
  /**
    * Size of weight specification or manifest, in bytes.
    */
  var weightSpecsBytes: js.UndefOr[Double] = js.undefined
}

object ModelArtifactsInfo {
  @scala.inline
  def apply(
    dateSaved: Date,
    modelTopologyType: JSON | GraphDef,
    modelTopologyBytes: js.UndefOr[Double] = js.undefined,
    weightDataBytes: js.UndefOr[Double] = js.undefined,
    weightSpecsBytes: js.UndefOr[Double] = js.undefined
  ): ModelArtifactsInfo = {
    val __obj = js.Dynamic.literal(dateSaved = dateSaved.asInstanceOf[js.Any], modelTopologyType = modelTopologyType.asInstanceOf[js.Any])
    if (!js.isUndefined(modelTopologyBytes)) __obj.updateDynamic("modelTopologyBytes")(modelTopologyBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weightDataBytes)) __obj.updateDynamic("weightDataBytes")(weightDataBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weightSpecsBytes)) __obj.updateDynamic("weightSpecsBytes")(weightSpecsBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelArtifactsInfo]
  }
}

