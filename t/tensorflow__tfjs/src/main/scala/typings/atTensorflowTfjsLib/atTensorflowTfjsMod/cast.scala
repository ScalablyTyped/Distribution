package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "cast")
@js.native
object cast extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): T = js.native
}

