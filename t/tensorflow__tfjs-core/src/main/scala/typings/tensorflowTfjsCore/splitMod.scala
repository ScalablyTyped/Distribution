package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/split", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double, axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double, axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
