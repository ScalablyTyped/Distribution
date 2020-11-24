package typings.tensorflowTfjsLayers.poolingMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pooling1DLayerArgs extends LayerArgs {
  
  /** How to fill in data that's not an integer multiple of poolSize. */
  var padding: js.UndefOr[PaddingMode] = js.native
  
  /**
    * Size of the window to pool over, should be an integer.
    */
  var poolSize: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * Period at which to sample the pooled values.
    *
    * If `null`, defaults to `poolSize`.
    */
  var strides: js.UndefOr[Double | js.Array[Double]] = js.native
}
object Pooling1DLayerArgs {
  
  @scala.inline
  def apply(): Pooling1DLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pooling1DLayerArgs]
  }
  
  @scala.inline
  implicit class Pooling1DLayerArgsOps[Self <: Pooling1DLayerArgs] (val x: Self) extends AnyVal {
    
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
    def setPadding(value: PaddingMode): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPoolSizeVarargs(value: Double*): Self = this.set("poolSize", js.Array(value :_*))
    
    @scala.inline
    def setPoolSize(value: Double | js.Array[Double]): Self = this.set("poolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolSize: Self = this.set("poolSize", js.undefined)
    
    @scala.inline
    def setStridesVarargs(value: Double*): Self = this.set("strides", js.Array(value :_*))
    
    @scala.inline
    def setStrides(value: Double | js.Array[Double]): Self = this.set("strides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrides: Self = this.set("strides", js.undefined)
  }
}
