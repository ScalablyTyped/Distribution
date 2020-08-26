package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enabled extends js.Object {
  var disabled: scala.Double = js.native
  var enabled: scala.Double = js.native
  var undefined: scala.Double = js.native
}

object Enabled {
  @scala.inline
  def apply(disabled: scala.Double, enabled: scala.Double, undefined: scala.Double): Enabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  @scala.inline
  implicit class EnabledOps[Self <: Enabled] (val x: Self) extends AnyVal {
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
    def setDisabled(value: scala.Double): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: scala.Double): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setUndefined(value: scala.Double): Self = this.set("undefined", value.asInstanceOf[js.Any])
  }
  
}

