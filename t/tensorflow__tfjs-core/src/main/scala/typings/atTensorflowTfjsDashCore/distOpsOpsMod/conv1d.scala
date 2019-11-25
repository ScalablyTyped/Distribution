package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCW
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NWC
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same_
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid_
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply[T /* <: Tensor2D | Tensor3D */](x: T | TensorLike, filter: Tensor3D | TensorLike, stride: Double, pad: valid_ | same_ | Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid_ | same_ | Double,
    dataFormat: NWC | NCW
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid_ | same_ | Double,
    dataFormat: NWC | NCW,
    dilation: Double
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid_ | same_ | Double,
    dataFormat: NWC | NCW,
    dilation: Double,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
  ): T = js.native
}

