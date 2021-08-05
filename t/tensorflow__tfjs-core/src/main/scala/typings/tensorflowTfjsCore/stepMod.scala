package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/step", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def step[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("step")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def step[T /* <: Tensor[Rank] */](x: T | TensorLike, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("step")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
}
