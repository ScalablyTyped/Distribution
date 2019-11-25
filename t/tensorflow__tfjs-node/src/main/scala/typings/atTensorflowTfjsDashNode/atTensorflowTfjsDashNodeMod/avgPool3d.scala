package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor5D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NCDHW
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NDHWC
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.same
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "avgPool3d")
@js.native
object avgPool3d extends js.Object {
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.floor | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.round | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.ceil
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.floor | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.round | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.ceil,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.floor | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.round | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.ceil,
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double
  ): T = js.native
}

