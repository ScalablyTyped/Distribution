package typings.tensorflowTfjsLayers.topologyConfigMod

import typings.tensorflowTfjsLayers.nodeConfigMod.NodeConfig
import typings.tensorflowTfjsLayers.typesMod.BaseSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLayerSerialization[N /* <: String */, C /* <: LayerConfig */] extends BaseSerialization[N, JsonLayer[C]] {
  var inbound_nodes: js.UndefOr[js.Array[NodeConfig]] = js.undefined
  var name: String
}

object BaseLayerSerialization {
  @scala.inline
  def apply[N, C](class_name: N, config: JsonLayer[C], name: String, inbound_nodes: js.Array[NodeConfig] = null): BaseLayerSerialization[N, C] = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (inbound_nodes != null) __obj.updateDynamic("inbound_nodes")(inbound_nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayerSerialization[N, C]]
  }
}

