package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R2
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R3
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NCW
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NWC
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.same
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2 | R3],
    filter: Tensor3D,
    stride: Double,
    pad: Double
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2 | R3],
    filter: Tensor3D,
    stride: Double,
    pad: same
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2 | R3],
    filter: Tensor3D,
    stride: Double,
    pad: valid
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2 | R3],
    filter: TensorLike,
    stride: Double,
    pad: Double
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2 | R3],
    filter: TensorLike,
    stride: Double,
    pad: same
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2 | R3],
    filter: TensorLike,
    stride: Double,
    pad: valid
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid | same | Double,
    dataFormat: NWC | NCW
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid | same | Double,
    dataFormat: NWC | NCW,
    dilation: Double
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid | same | Double,
    dataFormat: NWC | NCW,
    dilation: Double,
    dimRoundingMode: typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.floor | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.round | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.ceil
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: valid): T = js.native
}

