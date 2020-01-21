package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.Rank.R5
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorMod.Tensor5D
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NCDHW
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NDHWC
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.same
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "conv3d")
@js.native
object conv3d extends js.Object {
  def apply(x: Tensor[R4 | R5], filter: TensorLike, strides: js.Tuple3[Double, Double, Double], pad: same): Tensor[R4] = js.native
  def apply(x: Tensor[R4 | R5], filter: TensorLike, strides: js.Tuple3[Double, Double, Double], pad: valid): Tensor[R4] = js.native
  def apply(x: Tensor[R4 | R5], filter: TensorLike, strides: Double, pad: same): Tensor[R4] = js.native
  def apply(x: Tensor[R4 | R5], filter: TensorLike, strides: Double, pad: valid): Tensor[R4] = js.native
  def apply(x: Tensor[R4 | R5], filter: Tensor5D, strides: js.Tuple3[Double, Double, Double], pad: same): Tensor[R4] = js.native
  def apply(x: Tensor[R4 | R5], filter: Tensor5D, strides: js.Tuple3[Double, Double, Double], pad: valid): Tensor[R4] = js.native
  def apply(x: Tensor[R4 | R5], filter: Tensor5D, strides: Double, pad: same): Tensor[R4] = js.native
  def apply(x: Tensor[R4 | R5], filter: Tensor5D, strides: Double, pad: valid): Tensor[R4] = js.native
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

