package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReshapeLayerArgs extends LayerArgs {
  /** The target shape. Does not include the batch axis. */
  var targetShape: Shape = js.native
}

object ReshapeLayerArgs {
  @scala.inline
  def apply(targetShape: Shape): ReshapeLayerArgs = {
    val __obj = js.Dynamic.literal(targetShape = targetShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeLayerArgs]
  }
  @scala.inline
  implicit class ReshapeLayerArgsOps[Self <: ReshapeLayerArgs] (val x: Self) extends AnyVal {
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
    def setTargetShapeVarargs(value: (Null | Double)*): Self = this.set("targetShape", js.Array(value :_*))
    @scala.inline
    def setTargetShape(value: Shape): Self = this.set("targetShape", value.asInstanceOf[js.Any])
  }
  
}

