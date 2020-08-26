package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoUpgradeError extends js.Object {
  var autoUpgradeError: scala.Double = js.native
  var builtIn: scala.Double = js.native
  var disabled: scala.Double = js.native
  var error: scala.Double = js.native
  var multiVersion: scala.Double = js.native
  var needsReauthorization: scala.Double = js.native
  var none: scala.Double = js.native
  var trusted: scala.Double = js.native
  var unInstalled: scala.Double = js.native
  var versionCheckError: scala.Double = js.native
  var warning: scala.Double = js.native
}

object AutoUpgradeError {
  @scala.inline
  def apply(
    autoUpgradeError: scala.Double,
    builtIn: scala.Double,
    disabled: scala.Double,
    error: scala.Double,
    multiVersion: scala.Double,
    needsReauthorization: scala.Double,
    none: scala.Double,
    trusted: scala.Double,
    unInstalled: scala.Double,
    versionCheckError: scala.Double,
    warning: scala.Double
  ): AutoUpgradeError = {
    val __obj = js.Dynamic.literal(autoUpgradeError = autoUpgradeError.asInstanceOf[js.Any], builtIn = builtIn.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], multiVersion = multiVersion.asInstanceOf[js.Any], needsReauthorization = needsReauthorization.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], unInstalled = unInstalled.asInstanceOf[js.Any], versionCheckError = versionCheckError.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoUpgradeError]
  }
  @scala.inline
  implicit class AutoUpgradeErrorOps[Self <: AutoUpgradeError] (val x: Self) extends AnyVal {
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
    def setAutoUpgradeError(value: scala.Double): Self = this.set("autoUpgradeError", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuiltIn(value: scala.Double): Self = this.set("builtIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: scala.Double): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: scala.Double): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiVersion(value: scala.Double): Self = this.set("multiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeedsReauthorization(value: scala.Double): Self = this.set("needsReauthorization", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrusted(value: scala.Double): Self = this.set("trusted", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnInstalled(value: scala.Double): Self = this.set("unInstalled", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionCheckError(value: scala.Double): Self = this.set("versionCheckError", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: scala.Double): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
  
}

