package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCW
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCW,
    dilation: scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCW,
    dilation: scala.Double,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
  ): T = js.native
}

