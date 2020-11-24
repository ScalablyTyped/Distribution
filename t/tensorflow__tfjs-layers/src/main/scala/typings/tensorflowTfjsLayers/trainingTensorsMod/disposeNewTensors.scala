package typings.tensorflowTfjsLayers.trainingTensorsMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "disposeNewTensors")
@js.native
object disposeNewTensors extends js.Object {
  
  def apply(tensors: js.Array[Tensor[Rank]], refTensors: js.Array[Tensor[Rank]]): Unit = js.native
  def apply(tensors: js.Array[Tensor[Rank]], refTensors: StringDictionary[Tensor[Rank]]): Unit = js.native
  def apply(tensors: js.Array[Tensor[Rank]], refTensors: Tensor[Rank]): Unit = js.native
  def apply(tensors: StringDictionary[Tensor[Rank]], refTensors: js.Array[Tensor[Rank]]): Unit = js.native
  def apply(tensors: StringDictionary[Tensor[Rank]], refTensors: StringDictionary[Tensor[Rank]]): Unit = js.native
  def apply(tensors: StringDictionary[Tensor[Rank]], refTensors: Tensor[Rank]): Unit = js.native
  def apply(tensors: Tensor[Rank], refTensors: js.Array[Tensor[Rank]]): Unit = js.native
  def apply(tensors: Tensor[Rank], refTensors: StringDictionary[Tensor[Rank]]): Unit = js.native
  def apply(tensors: Tensor[Rank], refTensors: Tensor[Rank]): Unit = js.native
}
