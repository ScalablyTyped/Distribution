package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argMaxMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/arg_max", "argMax")
  @js.native
  def argMax[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/arg_max", "argMax")
  @js.native
  def argMax[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/arg_max", "argMax")
  @js.native
  def argMax[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/arg_max", "argMax")
  @js.native
  def argMax[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
}
