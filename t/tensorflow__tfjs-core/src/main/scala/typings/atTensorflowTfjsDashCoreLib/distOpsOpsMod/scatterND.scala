package typings
package atTensorflowTfjsDashCoreLib.distOpsOpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "scatterND")
@js.native
object scatterND extends js.Object {
  def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    indices: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    updates: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    indices: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    updates: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    indices: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    updates: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    indices: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    updates: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
}

