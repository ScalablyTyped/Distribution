package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lessEqualMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/less_equal", "lessEqual")
  @js.native
  def lessEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/less_equal", "lessEqual")
  @js.native
  def lessEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/less_equal", "lessEqual")
  @js.native
  def lessEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/less_equal", "lessEqual")
  @js.native
  def lessEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
}
