package typings.tensorflowTfjsLayers.advancedActivationsMod

import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftmaxLayerArgs extends LayerArgs {
  /**
    * Integer, axis along which the softmax normalization is applied.
    * Defaults to `-1` (i.e., the last axis).
    */
  var axis: js.UndefOr[Double] = js.native
}

object SoftmaxLayerArgs {
  @scala.inline
  def apply(): SoftmaxLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftmaxLayerArgs]
  }
  @scala.inline
  implicit class SoftmaxLayerArgsOps[Self <: SoftmaxLayerArgs] (val x: Self) extends AnyVal {
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

