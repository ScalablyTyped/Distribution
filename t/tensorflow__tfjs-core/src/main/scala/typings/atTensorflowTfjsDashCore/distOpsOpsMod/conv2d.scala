package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCHW
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NHWC
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "conv2d")
@js.native
object conv2d extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double,
    dataFormat: NHWC | NCHW
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double,
    dataFormat: NHWC | NCHW,
    dilations: (js.Tuple2[Double, Double]) | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double,
    dataFormat: NHWC | NCHW,
    dilations: (js.Tuple2[Double, Double]) | Double,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
}

