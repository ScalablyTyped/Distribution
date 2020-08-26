package typings.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrthogonalConfig extends js.Object {
  var gain: js.UndefOr[Double] = js.native
  var seed: js.UndefOr[Double] = js.native
}

object OrthogonalConfig {
  @scala.inline
  def apply(): OrthogonalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrthogonalConfig]
  }
  @scala.inline
  implicit class OrthogonalConfigOps[Self <: OrthogonalConfig] (val x: Self) extends AnyVal {
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
    def setGain(value: Double): Self = this.set("gain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGain: Self = this.set("gain", js.undefined)
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
  
}

