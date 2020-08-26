package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjs.tensorflowTfjsStrings.same
import typings.tensorflowTfjs.tensorflowTfjsStrings.valid
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "avgPool")
@js.native
object avgPool extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: js.UndefOr[
      typings.tensorflowTfjs.tensorflowTfjsStrings.floor | typings.tensorflowTfjs.tensorflowTfjsStrings.round | typings.tensorflowTfjs.tensorflowTfjsStrings.ceil
    ]
  ): T = js.native
}

