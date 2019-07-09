package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "conv3d")
@js.native
object conv3d extends js.Object {
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R5
    ],
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R5
    ],
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R5
    ],
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    strides: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R5
    ],
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    strides: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R5
    ],
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R5
    ],
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R5
    ],
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R5
    ],
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4] = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple3[scala.Double, scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same,
    dataFormat: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NDHWC | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NCDHW
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple3[scala.Double, scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same,
    dataFormat: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NDHWC | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NCDHW,
    dilations: (js.Tuple3[scala.Double, scala.Double, scala.Double]) | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    strides: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D,
    strides: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid
  ): T = js.native
}

