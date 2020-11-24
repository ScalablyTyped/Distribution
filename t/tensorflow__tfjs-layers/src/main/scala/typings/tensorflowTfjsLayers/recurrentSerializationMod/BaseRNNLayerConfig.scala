package typings.tensorflowTfjsLayers.recurrentSerializationMod

import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseRNNLayerConfig extends LayerConfig {
  
  var cell: js.UndefOr[RNNCellSerialization | js.Array[RNNCellSerialization]] = js.native
  
  var go_backwards: js.UndefOr[Boolean] = js.native
  
  var input_dim: js.UndefOr[Double] = js.native
  
  var input_length: js.UndefOr[Double] = js.native
  
  var return_sequences: js.UndefOr[Boolean] = js.native
  
  var return_state: js.UndefOr[Boolean] = js.native
  
  var stateful: js.UndefOr[Boolean] = js.native
  
  var unroll: js.UndefOr[Boolean] = js.native
}
object BaseRNNLayerConfig {
  
  @scala.inline
  def apply(): BaseRNNLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRNNLayerConfig]
  }
  
  @scala.inline
  implicit class BaseRNNLayerConfigOps[Self <: BaseRNNLayerConfig] (val x: Self) extends AnyVal {
    
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
    def setCellVarargs(value: RNNCellSerialization*): Self = this.set("cell", js.Array(value :_*))
    
    @scala.inline
    def setCell(value: RNNCellSerialization | js.Array[RNNCellSerialization]): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    
    @scala.inline
    def setGo_backwards(value: Boolean): Self = this.set("go_backwards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGo_backwards: Self = this.set("go_backwards", js.undefined)
    
    @scala.inline
    def setInput_dim(value: Double): Self = this.set("input_dim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput_dim: Self = this.set("input_dim", js.undefined)
    
    @scala.inline
    def setInput_length(value: Double): Self = this.set("input_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput_length: Self = this.set("input_length", js.undefined)
    
    @scala.inline
    def setReturn_sequences(value: Boolean): Self = this.set("return_sequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_sequences: Self = this.set("return_sequences", js.undefined)
    
    @scala.inline
    def setReturn_state(value: Boolean): Self = this.set("return_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_state: Self = this.set("return_state", js.undefined)
    
    @scala.inline
    def setStateful(value: Boolean): Self = this.set("stateful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateful: Self = this.set("stateful", js.undefined)
    
    @scala.inline
    def setUnroll(value: Boolean): Self = this.set("unroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnroll: Self = this.set("unroll", js.undefined)
  }
}
