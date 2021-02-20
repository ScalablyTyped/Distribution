package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/concat", "concat")
  @js.native
  def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/concat", "concat")
  @js.native
  def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): T = js.native
}
