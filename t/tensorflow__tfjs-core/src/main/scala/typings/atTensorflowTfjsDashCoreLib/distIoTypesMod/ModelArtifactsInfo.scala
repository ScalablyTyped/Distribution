package typings
package atTensorflowTfjsDashCoreLib.distIoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelArtifactsInfo extends js.Object {
  /**
    * Timestamp for when the model is saved.
    */
  var dateSaved: stdLib.Date
  /**
    * Size of model topology (Keras JSON or GraphDef), in bytes.
    */
  var modelTopologyBytes: js.UndefOr[scala.Double] = js.undefined
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
  var modelTopologyType: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.JSON | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.GraphDef
  /**
    * Size of weight value data, in bytes.
    */
  var weightDataBytes: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of weight specification or manifest, in bytes.
    */
  var weightSpecsBytes: js.UndefOr[scala.Double] = js.undefined
}

object ModelArtifactsInfo {
  @scala.inline
  def apply(
    dateSaved: stdLib.Date,
    modelTopologyType: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.JSON | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.GraphDef,
    modelTopologyBytes: scala.Int | scala.Double = null,
    weightDataBytes: scala.Int | scala.Double = null,
    weightSpecsBytes: scala.Int | scala.Double = null
  ): ModelArtifactsInfo = {
    val __obj = js.Dynamic.literal(dateSaved = dateSaved, modelTopologyType = modelTopologyType.asInstanceOf[js.Any])
    if (modelTopologyBytes != null) __obj.updateDynamic("modelTopologyBytes")(modelTopologyBytes.asInstanceOf[js.Any])
    if (weightDataBytes != null) __obj.updateDynamic("weightDataBytes")(weightDataBytes.asInstanceOf[js.Any])
    if (weightSpecsBytes != null) __obj.updateDynamic("weightSpecsBytes")(weightSpecsBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelArtifactsInfo]
  }
}

