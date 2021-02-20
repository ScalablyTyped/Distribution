package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logSoftmaxMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/log_softmax", "logSoftmax")
  @js.native
  def logSoftmax[T /* <: Tensor[Rank] */](logits: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/log_softmax", "logSoftmax")
  @js.native
  def logSoftmax[T /* <: Tensor[Rank] */](logits: T, axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/log_softmax", "logSoftmax")
  @js.native
  def logSoftmax[T /* <: Tensor[Rank] */](logits: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/log_softmax", "logSoftmax")
  @js.native
  def logSoftmax[T /* <: Tensor[Rank] */](logits: TensorLike, axis: Double): T = js.native
}
