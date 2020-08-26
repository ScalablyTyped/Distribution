package typings.tensorflowTfjsCore.typesMod

import typings.std.Date
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GraphDef
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelArtifactsInfo extends js.Object {
  /**
    * Timestamp for when the model is saved.
    */
  var dateSaved: Date = js.native
  /**
    * Size of model topology (Keras JSON or GraphDef), in bytes.
    */
  var modelTopologyBytes: js.UndefOr[Double] = js.native
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
  var modelTopologyType: JSON | GraphDef = js.native
  /**
    * Size of weight value data, in bytes.
    */
  var weightDataBytes: js.UndefOr[Double] = js.native
  /**
    * Size of weight specification or manifest, in bytes.
    */
  var weightSpecsBytes: js.UndefOr[Double] = js.native
}

object ModelArtifactsInfo {
  @scala.inline
  def apply(dateSaved: Date, modelTopologyType: JSON | GraphDef): ModelArtifactsInfo = {
    val __obj = js.Dynamic.literal(dateSaved = dateSaved.asInstanceOf[js.Any], modelTopologyType = modelTopologyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelArtifactsInfo]
  }
  @scala.inline
  implicit class ModelArtifactsInfoOps[Self <: ModelArtifactsInfo] (val x: Self) extends AnyVal {
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
    def setDateSaved(value: Date): Self = this.set("dateSaved", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelTopologyType(value: JSON | GraphDef): Self = this.set("modelTopologyType", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelTopologyBytes(value: Double): Self = this.set("modelTopologyBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelTopologyBytes: Self = this.set("modelTopologyBytes", js.undefined)
    @scala.inline
    def setWeightDataBytes(value: Double): Self = this.set("weightDataBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightDataBytes: Self = this.set("weightDataBytes", js.undefined)
    @scala.inline
    def setWeightSpecsBytes(value: Double): Self = this.set("weightSpecsBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightSpecsBytes: Self = this.set("weightSpecsBytes", js.undefined)
  }
  
}

