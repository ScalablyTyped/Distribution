package typings.tensorflowTfjsLayers.trainingTensorsMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "sliceArrays")
@js.native
object sliceArrays extends js.Object {
  
  def apply(arrays: js.Array[Tensor[Rank]], start: Double, stop: Double): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def apply(arrays: Tensor[Rank], start: Double, stop: Double): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
}
