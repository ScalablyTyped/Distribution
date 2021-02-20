package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object softmaxMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/softmax", "softmax")
  @js.native
  def softmax[T /* <: Tensor[Rank] */](logits: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/softmax", "softmax")
  @js.native
  def softmax[T /* <: Tensor[Rank] */](logits: T, dim: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/softmax", "softmax")
  @js.native
  def softmax[T /* <: Tensor[Rank] */](logits: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/softmax", "softmax")
  @js.native
  def softmax[T /* <: Tensor[Rank] */](logits: TensorLike, dim: Double): T = js.native
}
