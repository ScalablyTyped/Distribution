package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.A
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matMulMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused/mat_mul", "matMul")
  @js.native
  val matMul: js.Function1[
    /* hasABTransposeATransposeBBiasActivationPreluActivationWeightsLeakyreluAlpha */ A, 
    Tensor[Rank]
  ] = js.native
}
