package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "reshape")
@js.native
object reshape extends js.Object {
  def apply[R2 /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R2] = js.native
  def apply[R2 /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R2] = js.native
}

