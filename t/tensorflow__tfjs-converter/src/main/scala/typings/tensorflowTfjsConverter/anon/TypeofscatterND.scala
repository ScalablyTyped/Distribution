package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofscatterND extends StObject {
  
  def apply[R /* <: Rank */](
    indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    updates: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    updates: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    indices: TensorLike,
    updates: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](
    indices: TensorLike,
    updates: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
}
