package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "batchToSpaceND")
@js.native
object batchToSpaceND extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, blockShape: js.Array[scala.Double], crops: js.Array[js.Array[scala.Double]]): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    blockShape: js.Array[scala.Double],
    crops: js.Array[js.Array[scala.Double]]
  ): T = js.native
}

