package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "avgPool")
@js.native
object avgPool extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same | scala.Double,
    dimRoundingMode: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.floor | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.round | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.ceil
  ): T = js.native
}

