package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.fusedTypesMod.Activation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusedUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused_util", "applyActivation")
  @js.native
  def applyActivation(x: Tensor[Rank], activation: Activation): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused_util", "applyActivation")
  @js.native
  def applyActivation(x: Tensor[Rank], activation: Activation, preluActivationWeights: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused_util", "getFusedBiasGradient")
  @js.native
  def getFusedBiasGradient(bias: Tensor[Rank], dyActivation: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused_util", "getFusedDyActivation")
  @js.native
  def getFusedDyActivation(dy: Tensor[Rank], y: Tensor[Rank], activation: Activation): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused_util", "shouldFuse")
  @js.native
  def shouldFuse(gradientDepth: Double, activation: Activation): Boolean = js.native
}
