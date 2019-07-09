package typings
package atTensorflowTfjsDashLayersLib.distEngineTopologyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSpecArgs extends js.Object {
  /** Dictionary mapping integer axes to a specific dimension value. */
  var axes: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[scala.Double]] = js.undefined
  /** Expected datatype of the input. */
  var dtype: js.UndefOr[atTensorflowTfjsDashCoreLib.distTypesMod.DataType] = js.undefined
  /** Maximum rank of the input. */
  var maxNDim: js.UndefOr[scala.Double] = js.undefined
  /** Minimum rank of the input. */
  var minNDim: js.UndefOr[scala.Double] = js.undefined
  /** Expected rank of the input. */
  var ndim: js.UndefOr[scala.Double] = js.undefined
  /** Expected shape of the input (may include null for unchecked axes). */
  var shape: js.UndefOr[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape] = js.undefined
}

object InputSpecArgs {
  @scala.inline
  def apply(
    axes: org.scalablytyped.runtime.NumberDictionary[scala.Double] = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    maxNDim: scala.Int | scala.Double = null,
    minNDim: scala.Int | scala.Double = null,
    ndim: scala.Int | scala.Double = null,
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null
  ): InputSpecArgs = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (maxNDim != null) __obj.updateDynamic("maxNDim")(maxNDim.asInstanceOf[js.Any])
    if (minNDim != null) __obj.updateDynamic("minNDim")(minNDim.asInstanceOf[js.Any])
    if (ndim != null) __obj.updateDynamic("ndim")(ndim.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[InputSpecArgs]
  }
}

