package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def equalStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("equalStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def greaterEqualStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterEqualStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def greaterStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def lessEqualStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("lessEqualStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def lessStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("lessStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def notEqualStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
}
