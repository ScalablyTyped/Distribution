package typings.tensorflowTfjsLayers.trainingMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", "checkArrayLengths")
@js.native
object checkArrayLengths extends js.Object {
  
  def apply(inputs: js.Array[Tensor[Rank]], targets: js.Array[Tensor[Rank]]): Unit = js.native
  def apply(inputs: js.Array[Tensor[Rank]], targets: js.Array[Tensor[Rank]], weights: js.Array[Tensor[Rank]]): Unit = js.native
}
