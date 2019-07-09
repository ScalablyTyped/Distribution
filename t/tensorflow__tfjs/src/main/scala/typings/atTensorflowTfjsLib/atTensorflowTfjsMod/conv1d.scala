package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    stride: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    stride: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    stride: scala.Double,
    pad: scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T,
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T,
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T,
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.NWC | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.NCW
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.NWC | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.NCW,
    dilation: scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.NWC | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.NCW,
    dilation: scala.Double,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    stride: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    stride: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    stride: scala.Double,
    pad: scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: scala.Double
  ): T = js.native
}

