package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "truncatedNormal")
@js.native
object truncatedNormal extends js.Object {
  def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: scala.Double,
    stdDev: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: scala.Double,
    stdDev: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: scala.Double,
    stdDev: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32,
    seed: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: scala.Double,
    stdDev: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: scala.Double,
    stdDev: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32,
    seed: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
}

