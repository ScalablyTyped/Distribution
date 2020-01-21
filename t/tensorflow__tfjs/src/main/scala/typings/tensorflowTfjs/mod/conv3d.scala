package typings.tensorflowTfjs.mod

import typings.tensorflowTfjs.tensorflowTfjsStrings.NCDHW
import typings.tensorflowTfjs.tensorflowTfjsStrings.NDHWC
import typings.tensorflowTfjs.tensorflowTfjsStrings.same
import typings.tensorflowTfjs.tensorflowTfjsStrings.valid
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorMod.Tensor5D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "conv3d")
@js.native
object conv3d extends js.Object {
  def apply[T /* <: Tensor4D | Tensor5D */](x: T, filter: TensorLike, strides: js.Tuple3[Double, Double, Double], pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: T, filter: TensorLike, strides: js.Tuple3[Double, Double, Double], pad: valid): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: T, filter: TensorLike, strides: Double, pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: T, filter: TensorLike, strides: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: T, filter: Tensor5D, strides: js.Tuple3[Double, Double, Double], pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: T, filter: Tensor5D, strides: js.Tuple3[Double, Double, Double], pad: valid): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: T, filter: Tensor5D, strides: Double, pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: T, filter: Tensor5D, strides: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: js.Tuple3[Double, Double, Double], pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: js.Tuple3[Double, Double, Double], pad: valid): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: Double, pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: js.Tuple3[Double, Double, Double], pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: js.Tuple3[Double, Double, Double], pad: valid): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: Double, pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: Double, pad: valid): T = js.native
}

