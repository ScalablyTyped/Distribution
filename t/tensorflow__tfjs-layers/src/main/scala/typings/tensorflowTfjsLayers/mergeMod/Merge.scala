package typings.tensorflowTfjsLayers.mergeMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.topologyMod.Layer
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Merge")
@js.native
abstract class Merge () extends Layer {
  def this(args: LayerArgs) = this()
  
  /**
    * Computes the shape of the result of an elementwise operation.
    *
    * @param shape1: Shape of the first tensor.
    * @param shape2: Shape of the second tensor.
    * @returns Expected output shape when an elementwise operation is carried
    *   out on 2 tensors with shapes `shape1` and `shape2`.
    * @throws ValueError: If `shape1` and `shape2` are not compatible for
    *   element-wise operations.
    */
  var computeElementwiseOpOutputShape: js.Any = js.native
  
  /**
    * Logic for merging multiple tensors, to be overridden by subclasses.
    * @param inputs
    */
  /* protected */ def mergeFunction(inputs: js.Array[Tensor[Rank]]): Tensor[Rank] = js.native
  
  var reshapeRequired: Boolean = js.native
}
