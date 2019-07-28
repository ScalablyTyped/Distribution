package typings.atTensorflowTfjsDashLayers.distEngineTopologyMod

import org.scalablytyped.runtime.NumberDictionary
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/topology", "InputSpec")
@js.native
class InputSpec protected () extends js.Object {
  def this(args: InputSpecArgs) = this()
  /** Dictionary mapping integer axes to a specific dimension value. */
  var axes: js.UndefOr[NumberDictionary[Double]] = js.native
  /** Expected datatype of the input. */
  var dtype: js.UndefOr[DataType] = js.native
  /** Maximum rank of the input. */
  var maxNDim: js.UndefOr[Double] = js.native
  /** Minimum rank of the input. */
  var minNDim: js.UndefOr[Double] = js.native
  /** Expected rank of the input. */
  var ndim: js.UndefOr[Double] = js.native
  /** Expected shape of the input (may include null for unchecked axes). */
  var shape: js.UndefOr[Shape] = js.native
}

