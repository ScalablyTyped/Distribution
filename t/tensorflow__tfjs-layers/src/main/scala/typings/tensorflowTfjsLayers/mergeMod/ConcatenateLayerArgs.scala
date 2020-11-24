package typings.tensorflowTfjsLayers.mergeMod

import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcatenateLayerArgs extends LayerArgs {
  
  /**
    * Axis along which to concatenate.
    */
  var axis: js.UndefOr[Double] = js.native
}
object ConcatenateLayerArgs {
  
  @scala.inline
  def apply(): ConcatenateLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcatenateLayerArgs]
  }
  
  @scala.inline
  implicit class ConcatenateLayerArgsOps[Self <: ConcatenateLayerArgs] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: Double): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
  }
}
