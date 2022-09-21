package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object denseBincountMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/dense_bincount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def denseBincount[T /* <: Tensor1D | Tensor2D */](x: T | TensorLike, weights: T | TensorLike, size: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("denseBincount")(x.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def denseBincount[T /* <: Tensor1D | Tensor2D */](x: T | TensorLike, weights: T | TensorLike, size: Double, binaryOutput: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("denseBincount")(x.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], size.asInstanceOf[js.Any], binaryOutput.asInstanceOf[js.Any])).asInstanceOf[T]
}
