package typings.tensorflowTfjs.indexWithPolyfillsMod.backendUtil

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "backend_util.prepareSplitSize")
@js.native
object prepareSplitSize extends js.Object {
  
  def apply(x: Tensor[Rank], numOrSizeSplits: js.Array[Double]): js.Array[Double] = js.native
  def apply(x: Tensor[Rank], numOrSizeSplits: js.Array[Double], axis: Double): js.Array[Double] = js.native
  def apply(x: Tensor[Rank], numOrSizeSplits: Double): js.Array[Double] = js.native
  def apply(x: Tensor[Rank], numOrSizeSplits: Double, axis: Double): js.Array[Double] = js.native
  def apply(x: TensorInfo, numOrSizeSplits: js.Array[Double]): js.Array[Double] = js.native
  def apply(x: TensorInfo, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[Double] = js.native
  def apply(x: TensorInfo, numOrSizeSplits: Double): js.Array[Double] = js.native
  def apply(x: TensorInfo, numOrSizeSplits: Double, axis: Double): js.Array[Double] = js.native
}
