package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.float32
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.int32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "truncatedNormal")
@js.native
object truncatedNormal extends js.Object {
  def apply[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32,
    seed: Double
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: int32
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: int32,
    seed: Double
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
}

