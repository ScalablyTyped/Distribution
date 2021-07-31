package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/slice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: js.Array[Double], size: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: js.Array[Double], size: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: Double, size: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: Double, size: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
}
