package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NCW
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NWC
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.same
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.valid
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: Tensor3D, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: Tensor3D, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: Tensor3D, stride: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: TensorLike, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: TensorLike, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: TensorLike, stride: Double, pad: valid): T = js.native
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
    dimRoundingMode: typings.atTensorflowTfjs.atTensorflowTfjsStrings.floor | typings.atTensorflowTfjs.atTensorflowTfjsStrings.round | typings.atTensorflowTfjs.atTensorflowTfjsStrings.ceil
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: valid): T = js.native
}

