package typings.tensorflowTfjsLayers.topologyMod

import org.scalablytyped.runtime.NumberDictionary
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSpecArgs extends js.Object {
  /** Dictionary mapping integer axes to a specific dimension value. */
  var axes: js.UndefOr[NumberDictionary[Double]] = js.undefined
  /** Expected datatype of the input. */
  var dtype: js.UndefOr[DataType] = js.undefined
  /** Maximum rank of the input. */
  var maxNDim: js.UndefOr[Double] = js.undefined
  /** Minimum rank of the input. */
  var minNDim: js.UndefOr[Double] = js.undefined
  /** Expected rank of the input. */
  var ndim: js.UndefOr[Double] = js.undefined
  /** Expected shape of the input (may include null for unchecked axes). */
  var shape: js.UndefOr[Shape] = js.undefined
}

object InputSpecArgs {
  @scala.inline
  def apply(
    axes: NumberDictionary[Double] = null,
    dtype: DataType = null,
    maxNDim: Int | Double = null,
    minNDim: Int | Double = null,
    ndim: Int | Double = null,
    shape: Shape = null
  ): InputSpecArgs = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (maxNDim != null) __obj.updateDynamic("maxNDim")(maxNDim.asInstanceOf[js.Any])
    if (minNDim != null) __obj.updateDynamic("minNDim")(minNDim.asInstanceOf[js.Any])
    if (ndim != null) __obj.updateDynamic("ndim")(ndim.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSpecArgs]
  }
}

