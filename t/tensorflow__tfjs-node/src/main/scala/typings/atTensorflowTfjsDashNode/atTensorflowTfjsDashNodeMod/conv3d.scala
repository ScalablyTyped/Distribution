package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor5D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R4
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R5
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NCDHW
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NDHWC
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.same
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "conv3d")
@js.native
object conv3d extends js.Object {
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: valid
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: valid
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
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
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: js.Tuple3[Double, Double, Double], pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: js.Tuple3[Double, Double, Double], pad: valid): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: Double, pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: js.Tuple3[Double, Double, Double], pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: js.Tuple3[Double, Double, Double], pad: valid): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: Double, pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: Double, pad: valid): T = js.native
}

