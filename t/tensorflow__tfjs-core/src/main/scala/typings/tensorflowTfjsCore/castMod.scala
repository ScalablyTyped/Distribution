package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object castMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/cast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cast[T /* <: Tensor[Rank] */](x: T | TensorLike, dtype: DataType): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[T]
}
