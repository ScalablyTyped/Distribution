package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inTopKMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/in_top_k", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: U): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/in_top_k", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: U, k: Double): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/in_top_k", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: TensorLike): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/in_top_k", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: TensorLike, k: Double): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/in_top_k", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: U): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/in_top_k", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: U, k: Double): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/in_top_k", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: TensorLike): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/in_top_k", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: TensorLike, k: Double): js.Promise[U] = js.native
}
