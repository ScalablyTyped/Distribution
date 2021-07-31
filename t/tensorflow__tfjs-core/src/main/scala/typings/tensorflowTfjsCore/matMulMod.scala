package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.A
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matMulMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused/mat_mul", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](hasABTransposeATransposeBBiasActivationPreluActivationWeights: A[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(hasABTransposeATransposeBBiasActivationPreluActivationWeights.asInstanceOf[js.Any]).asInstanceOf[T]
}
