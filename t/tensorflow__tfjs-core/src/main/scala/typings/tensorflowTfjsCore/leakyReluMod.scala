package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object leakyReluMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/leaky_relu", "leakyRelu")
  @js.native
  def leakyRelu[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/leaky_relu", "leakyRelu")
  @js.native
  def leakyRelu[T /* <: Tensor[Rank] */](x: T, alpha: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/leaky_relu", "leakyRelu")
  @js.native
  def leakyRelu[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/leaky_relu", "leakyRelu")
  @js.native
  def leakyRelu[T /* <: Tensor[Rank] */](x: TensorLike, alpha: Double): T = js.native
}
