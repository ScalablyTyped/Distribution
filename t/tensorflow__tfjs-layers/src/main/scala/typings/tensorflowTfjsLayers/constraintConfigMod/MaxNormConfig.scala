package typings.tensorflowTfjsLayers.constraintConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxNormConfig extends js.Object {
  var axis: js.UndefOr[Double] = js.native
  var max_value: js.UndefOr[Double] = js.native
}

object MaxNormConfig {
  @scala.inline
  def apply(): MaxNormConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxNormConfig]
  }
  @scala.inline
  implicit class MaxNormConfigOps[Self <: MaxNormConfig] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setMax_value(value: Double): Self = this.set("max_value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_value: Self = this.set("max_value", js.undefined)
  }
  
}

