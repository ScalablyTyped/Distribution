package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjs.tensorflowTfjsStrings.NCDHW
import typings.tensorflowTfjs.tensorflowTfjsStrings.NDHWC
import typings.tensorflowTfjs.tensorflowTfjsStrings.same
import typings.tensorflowTfjs.tensorflowTfjsStrings.valid
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorMod.Tensor5D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "maxPool3d")
@js.native
object maxPool3d extends js.Object {
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: js.UndefOr[
      typings.tensorflowTfjs.tensorflowTfjsStrings.floor | typings.tensorflowTfjs.tensorflowTfjsStrings.round | typings.tensorflowTfjs.tensorflowTfjsStrings.ceil
    ],
    dataFormat: js.UndefOr[NDHWC | NCDHW],
    dilations: js.UndefOr[(js.Tuple3[Double, Double, Double]) | Double]
  ): T = js.native
}

