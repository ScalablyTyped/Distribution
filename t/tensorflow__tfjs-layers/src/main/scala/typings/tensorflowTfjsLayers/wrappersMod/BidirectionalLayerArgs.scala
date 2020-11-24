package typings.tensorflowTfjsLayers.wrappersMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.BidirectionalMergeMode
import typings.tensorflowTfjsLayers.recurrentMod.RNN_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BidirectionalLayerArgs extends WrapperLayerArgs {
  
  /**
    * The instance of an `RNN` layer to be wrapped.
    */
  @JSName("layer")
  var layer_BidirectionalLayerArgs: RNN_ = js.native
  
  /**
    * Mode by which outputs of the forward and backward RNNs are
    * combined. If `null` or `undefined`, the output will not be
    * combined, they will be returned as an `Array`.
    *
    * If `undefined` (i.e., not provided), defaults to `'concat'`.
    */
  var mergeMode: js.UndefOr[BidirectionalMergeMode] = js.native
}
object BidirectionalLayerArgs {
  
  @scala.inline
  def apply(layer: RNN_): BidirectionalLayerArgs = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BidirectionalLayerArgs]
  }
  
  @scala.inline
  implicit class BidirectionalLayerArgsOps[Self <: BidirectionalLayerArgs] (val x: Self) extends AnyVal {
    
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
    def setLayer(value: RNN_): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeMode(value: BidirectionalMergeMode): Self = this.set("mergeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeMode: Self = this.set("mergeMode", js.undefined)
  }
}
