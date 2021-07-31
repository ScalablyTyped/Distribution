package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object squaredDifferenceMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/squared_difference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def squaredDifference[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def squaredDifference[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def squaredDifference[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def squaredDifference[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
}
