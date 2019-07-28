package typings.atTensorflowTfjsDashLayers.distLayersCoreMod

import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Reshape")
@js.native
class Reshape protected () extends Layer {
  def this(args: ReshapeLayerArgs) = this()
  /**
    * Finds and replaces a missing dimension in output shape.
    *
    * This is a near direct port of the internal Numpy function
    * `_fix_unknown_dimension` in `numpy/core/src/multiarray/shape.c`.
    *
    * @param inputShape: Original shape of array begin reshape.
    * @param outputShape: Target shape of the array, with at most a single
    * `null` or negative number, which indicates an underdetermined dimension
    * that should be derived from `inputShape` and the known dimensions of
    *   `outputShape`.
    * @returns: The output shape with `null` replaced with its computed value.
    * @throws: ValueError: If `inputShape` and `outputShape` do not match.
    */
  var fixUnknownDimension: js.Any = js.native
  var isUnknown: js.Any = js.native
  var targetShape: js.Any = js.native
  def computeOutputShape(inputShape: Shape): Shape = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Reshape")
@js.native
object Reshape extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

