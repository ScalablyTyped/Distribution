package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Warning extends js.Object {
  var error: scala.Double = js.native
  var warning: scala.Double = js.native
}

object Warning {
  @scala.inline
  def apply(error: scala.Double, warning: scala.Double): Warning = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  @scala.inline
  implicit class WarningOps[Self <: Warning] (val x: Self) extends AnyVal {
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
    def setError(value: scala.Double): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: scala.Double): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
  
}

