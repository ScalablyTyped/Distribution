package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.NumericDataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topkImplMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/topk_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def topkImpl[T /* <: Tensor[Rank] */](x: TypedArray, xShape: js.Array[Double], xDtype: NumericDataType, k: Double, sorted: Boolean): js.Tuple2[T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("topkImpl")(x.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], xDtype.asInstanceOf[js.Any], k.asInstanceOf[js.Any], sorted.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, T]]
}
