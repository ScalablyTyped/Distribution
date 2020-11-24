package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.fusedTypesMod.Activation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/fused_util", JSImport.Namespace)
@js.native
object fusedUtilMod extends js.Object {
  
  def applyActivation(x: Tensor[Rank], activation: Activation): Tensor[Rank] = js.native
  def applyActivation(x: Tensor[Rank], activation: Activation, preluActivationWeights: Tensor[Rank]): Tensor[Rank] = js.native
  
  def getFusedBiasGradient(bias: Tensor[Rank], dyActivation: Tensor[Rank]): Tensor[Rank] = js.native
  
  def getFusedDyActivation(dy: Tensor[Rank], y: Tensor[Rank], activation: Activation): Tensor[Rank] = js.native
  
  def shouldFuse(gradientDepth: Double, activation: Activation): Boolean = js.native
}
