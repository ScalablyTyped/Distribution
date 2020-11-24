package typings.tensorflowTfjs.mod

import typings.tensorflowTfjs.tensorflowTfjsStrings.same
import typings.tensorflowTfjs.tensorflowTfjsStrings.valid
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTensorMod.Tensor5D
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.Rank.R5
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "conv3dTranspose")
@js.native
object conv3dTranspose extends js.Object {
  
  def apply(
    x: Tensor[R4 | R5],
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same
  ): Tensor[R4] = js.native
  def apply(
    x: Tensor[R4 | R5],
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid
  ): Tensor[R4] = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid
  ): T = js.native
}
