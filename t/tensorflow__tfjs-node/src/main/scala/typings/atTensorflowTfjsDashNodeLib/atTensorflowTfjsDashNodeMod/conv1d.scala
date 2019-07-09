package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3
    ],
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    stride: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3
    ],
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    stride: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3
    ],
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    stride: scala.Double,
    pad: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3
    ],
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3
    ],
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3
    ],
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R2] = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NWC | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NCW
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NWC | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NCW,
    dilation: scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NWC | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NCW,
    dilation: scala.Double,
    dimRoundingMode: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.floor | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.round | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.ceil
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    stride: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D,
    stride: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid
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
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    stride: scala.Double,
    pad: scala.Double
  ): T = js.native
}

