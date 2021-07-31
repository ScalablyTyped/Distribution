package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/split_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def prepareSplitSize(x: Tensor[Rank], numOrSizeSplits: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(x: Tensor[Rank], numOrSizeSplits: js.Array[Double], axis: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(x: Tensor[Rank], numOrSizeSplits: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(x: Tensor[Rank], numOrSizeSplits: Double, axis: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: Double, axis: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSplitSize")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
