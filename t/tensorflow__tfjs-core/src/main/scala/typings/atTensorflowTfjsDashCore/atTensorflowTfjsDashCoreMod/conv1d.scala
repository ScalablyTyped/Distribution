package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCW
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NWC
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply[T /* <: Tensor2D | Tensor3D */](x: T | TensorLike, filter: Tensor3D | TensorLike, stride: Double, pad: valid | same | Double): T = js.native
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
    dimRoundingMode: floor | round | ceil
  ): T = js.native
}

