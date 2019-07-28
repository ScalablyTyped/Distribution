package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NCHW
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NHWC
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.same
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.valid
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "separableConv2d")
@js.native
object separableConv2d extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    depthwiseFilter: Tensor4D | TensorLike,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    depthwiseFilter: Tensor4D | TensorLike,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same,
    dilation: (js.Tuple2[Double, Double]) | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    depthwiseFilter: Tensor4D | TensorLike,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same,
    dilation: (js.Tuple2[Double, Double]) | Double,
    dataFormat: NHWC | NCHW
  ): T = js.native
}

