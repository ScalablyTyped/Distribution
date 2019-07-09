package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "maxPool")
@js.native
object maxPool extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil
  ): T = js.native
}

