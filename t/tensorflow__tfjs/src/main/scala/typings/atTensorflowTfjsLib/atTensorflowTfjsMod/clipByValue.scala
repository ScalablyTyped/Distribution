package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "clipByValue")
@js.native
object clipByValue extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, clipValueMin: scala.Double, clipValueMax: scala.Double): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    clipValueMin: scala.Double,
    clipValueMax: scala.Double
  ): T = js.native
}

