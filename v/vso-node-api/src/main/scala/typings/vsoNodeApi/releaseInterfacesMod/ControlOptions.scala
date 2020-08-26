package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlOptions extends js.Object {
  var alwaysRun: Boolean = js.native
  var continueOnError: Boolean = js.native
  var enabled: Boolean = js.native
}

object ControlOptions {
  @scala.inline
  def apply(alwaysRun: Boolean, continueOnError: Boolean, enabled: Boolean): ControlOptions = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlOptions]
  }
  @scala.inline
  implicit class ControlOptionsOps[Self <: ControlOptions] (val x: Self) extends AnyVal {
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
    def setAlwaysRun(value: Boolean): Self = this.set("alwaysRun", value.asInstanceOf[js.Any])
    @scala.inline
    def setContinueOnError(value: Boolean): Self = this.set("continueOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
  
}

