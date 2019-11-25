package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NCDHW
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NDHWC
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.same
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.valid
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor5D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "avgPool3d")
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
    dimRoundingMode: typings.atTensorflowTfjs.atTensorflowTfjsStrings.floor | typings.atTensorflowTfjs.atTensorflowTfjsStrings.round | typings.atTensorflowTfjs.atTensorflowTfjsStrings.ceil
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typings.atTensorflowTfjs.atTensorflowTfjsStrings.floor | typings.atTensorflowTfjs.atTensorflowTfjsStrings.round | typings.atTensorflowTfjs.atTensorflowTfjsStrings.ceil,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typings.atTensorflowTfjs.atTensorflowTfjsStrings.floor | typings.atTensorflowTfjs.atTensorflowTfjsStrings.round | typings.atTensorflowTfjs.atTensorflowTfjsStrings.ceil,
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double
  ): T = js.native
}

