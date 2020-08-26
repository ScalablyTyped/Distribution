package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskingArgs extends LayerArgs {
  /**
    * Masking Value. Defaults to `0.0`.
    */
  var maskValue: js.UndefOr[Double] = js.native
}

object MaskingArgs {
  @scala.inline
  def apply(): MaskingArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskingArgs]
  }
  @scala.inline
  implicit class MaskingArgsOps[Self <: MaskingArgs] (val x: Self) extends AnyVal {
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
    def setMaskValue(value: Double): Self = this.set("maskValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskValue: Self = this.set("maskValue", js.undefined)
  }
  
}

