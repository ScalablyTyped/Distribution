package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "pad")
@js.native
object pad extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, paddings: js.Array[js.Tuple2[scala.Double, scala.Double]]): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, paddings: js.Array[js.Tuple2[scala.Double, scala.Double]], constantValue: scala.Double): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    paddings: js.Array[js.Tuple2[scala.Double, scala.Double]]
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    paddings: js.Array[js.Tuple2[scala.Double, scala.Double]],
    constantValue: scala.Double
  ): T = js.native
}

