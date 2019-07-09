package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "localResponseNormalization")
@js.native
object localResponseNormalization extends js.Object {
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    depthRadius: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    depthRadius: scala.Double,
    bias: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    depthRadius: scala.Double,
    bias: scala.Double,
    alpha: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    depthRadius: scala.Double,
    bias: scala.Double,
    alpha: scala.Double,
    beta: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, depthRadius: scala.Double): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    depthRadius: scala.Double,
    bias: scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    depthRadius: scala.Double,
    bias: scala.Double,
    alpha: scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    depthRadius: scala.Double,
    bias: scala.Double,
    alpha: scala.Double,
    beta: scala.Double
  ): T = js.native
}

