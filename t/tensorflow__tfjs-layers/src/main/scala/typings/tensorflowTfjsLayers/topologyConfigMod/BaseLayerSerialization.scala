package typings.tensorflowTfjsLayers.topologyConfigMod

import typings.tensorflowTfjsLayers.nodeConfigMod.NodeConfig
import typings.tensorflowTfjsLayers.typesMod.BaseSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseLayerSerialization[N /* <: String */, C /* <: LayerConfig */] extends BaseSerialization[N, JsonLayer[C]] {
  
  var inbound_nodes: js.UndefOr[js.Array[NodeConfig]] = js.native
  
  var name: String = js.native
}
object BaseLayerSerialization {
  
  @scala.inline
  def apply[N /* <: String */, C /* <: LayerConfig */](class_name: N, config: JsonLayer[C], name: String): BaseLayerSerialization[N, C] = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayerSerialization[N, C]]
  }
  
  @scala.inline
  implicit class BaseLayerSerializationOps[Self <: BaseLayerSerialization[_, _], N /* <: String */, C /* <: LayerConfig */] (val x: Self with (BaseLayerSerialization[N, C])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInbound_nodesVarargs(value: NodeConfig*): Self = this.set("inbound_nodes", js.Array(value :_*))
    
    @scala.inline
    def setInbound_nodes(value: js.Array[NodeConfig]): Self = this.set("inbound_nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInbound_nodes: Self = this.set("inbound_nodes", js.undefined)
  }
}
