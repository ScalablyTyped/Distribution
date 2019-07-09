package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "conv2dTranspose")
@js.native
object conv2dTranspose extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    outputShape: (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]),
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    outputShape: (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]),
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil
  ): T = js.native
}

