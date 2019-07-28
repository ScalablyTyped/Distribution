package typings.atTensorflowTfjsDashCore.distIoTypesMod

import typings.atTensorflowTfjsDashCore.Anon_Dtype
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.bool
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.float32
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.int32
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightsManifestEntry extends js.Object {
  /**
    * Data type of the weight.
    */
  var dtype: float32 | int32 | bool | string
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
  var name: String
  /**
    * Information for dequantization of the weight.
    */
  var quantization: js.UndefOr[Anon_Dtype] = js.undefined
  /**
    * Shape of the weight.
    */
  var shape: js.Array[Double]
}

object WeightsManifestEntry {
  @scala.inline
  def apply(
    dtype: float32 | int32 | bool | string,
    name: String,
    shape: js.Array[Double],
    group: WeightGroup = null,
    quantization: Anon_Dtype = null
  ): WeightsManifestEntry = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name, shape = shape)
    if (group != null) __obj.updateDynamic("group")(group)
    if (quantization != null) __obj.updateDynamic("quantization")(quantization)
    __obj.asInstanceOf[WeightsManifestEntry]
  }
}

