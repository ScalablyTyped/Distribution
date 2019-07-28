package typings.atTensorflowTfjsDashLayers.distLayersMergeMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var reshapeRequired: Boolean = js.native
  /**
    * Logic for merging multiple tensors, to be overridden by subclasses.
    * @param inputs
    */
  /* protected */ def mergeFunction(inputs: js.Array[Tensor[Rank]]): Tensor[Rank] = js.native
}

