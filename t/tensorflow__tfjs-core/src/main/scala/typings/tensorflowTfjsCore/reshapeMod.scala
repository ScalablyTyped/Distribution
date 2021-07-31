package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reshapeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/reshape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def reshape[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def reshape[R /* <: Rank */](
    x: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}
