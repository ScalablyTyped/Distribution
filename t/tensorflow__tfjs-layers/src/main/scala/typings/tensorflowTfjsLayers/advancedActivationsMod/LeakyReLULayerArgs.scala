package typings.tensorflowTfjsLayers.advancedActivationsMod

import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeakyReLULayerArgs extends LayerArgs {
  
  /**
    * Float `>= 0`. Negative slope coefficient. Defaults to `0.3`.
    */
  var alpha: js.UndefOr[Double] = js.native
}
object LeakyReLULayerArgs {
  
  @scala.inline
  def apply(): LeakyReLULayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeakyReLULayerArgs]
  }
  
  @scala.inline
  implicit class LeakyReLULayerArgsOps[Self <: LeakyReLULayerArgs] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
  }
}
