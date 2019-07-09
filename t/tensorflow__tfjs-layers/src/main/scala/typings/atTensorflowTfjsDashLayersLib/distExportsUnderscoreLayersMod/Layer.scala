package typings
package atTensorflowTfjsDashLayersLib.distExportsUnderscoreLayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "Layer")
@js.native
abstract class Layer protected ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  def this(args: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "Layer")
@js.native
object Layer extends js.Object {
  /**
    * Converts a layer and its index to a unique (immutable type) name.
    * This function is used internally with `this.containerNodes`.
    * @param layer The layer.
    * @param nodeIndex The layer's position (e.g. via enumerate) in a list of
    *   nodes.
    *
    * @returns The unique name.
    */
  /* protected */ def nodeKey(layer: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer, nodeIndex: scala.Double): java.lang.String = js.native
}

