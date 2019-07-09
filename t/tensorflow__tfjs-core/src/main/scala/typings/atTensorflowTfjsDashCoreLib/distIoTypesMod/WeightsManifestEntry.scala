package typings
package atTensorflowTfjsDashCoreLib.distIoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightsManifestEntry extends js.Object {
  /**
    * Data type of the weight.
    */
  var dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32 | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32 | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string
  /**
    * Type of the weight.
    *
    * Optional.
    *
    * The value 'optimizer' indicates the weight belongs to an optimizer
    * (i.e., used only during model training and not during inference).
    */
  var group: js.UndefOr[WeightGroup] = js.undefined
  /**
    * Name of the weight, e.g., 'Dense_1/bias'
    */
  var name: java.lang.String
  /**
    * Information for dequantization of the weight.
    */
  var quantization: js.UndefOr[atTensorflowTfjsDashCoreLib.Anon_Dtype] = js.undefined
  /**
    * Shape of the weight.
    */
  var shape: js.Array[scala.Double]
}

object WeightsManifestEntry {
  @scala.inline
  def apply(
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32 | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32 | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string,
    name: java.lang.String,
    shape: js.Array[scala.Double],
    group: WeightGroup = null,
    quantization: atTensorflowTfjsDashCoreLib.Anon_Dtype = null
  ): WeightsManifestEntry = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name, shape = shape)
    if (group != null) __obj.updateDynamic("group")(group)
    if (quantization != null) __obj.updateDynamic("quantization")(quantization)
    __obj.asInstanceOf[WeightsManifestEntry]
  }
}

