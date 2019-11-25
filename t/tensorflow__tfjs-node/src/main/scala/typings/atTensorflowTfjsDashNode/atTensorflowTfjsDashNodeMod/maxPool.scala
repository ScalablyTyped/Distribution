package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.same
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "maxPool")
@js.native
object maxPool extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.floor | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.round | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.ceil
  ): T = js.native
}

