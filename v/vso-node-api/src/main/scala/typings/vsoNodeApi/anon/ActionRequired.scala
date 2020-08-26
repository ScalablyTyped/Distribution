package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionRequired extends js.Object {
  var actionRequired: scala.Double = js.native
  var actionResolved: scala.Double = js.native
  var disabled: scala.Double = js.native
  var enabled: scala.Double = js.native
  var installed: scala.Double = js.native
  var uninstalled: scala.Double = js.native
  var versionUpdated: scala.Double = js.native
}

object ActionRequired {
  @scala.inline
  def apply(
    actionRequired: scala.Double,
    actionResolved: scala.Double,
    disabled: scala.Double,
    enabled: scala.Double,
    installed: scala.Double,
    uninstalled: scala.Double,
    versionUpdated: scala.Double
  ): ActionRequired = {
    val __obj = js.Dynamic.literal(actionRequired = actionRequired.asInstanceOf[js.Any], actionResolved = actionResolved.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], uninstalled = uninstalled.asInstanceOf[js.Any], versionUpdated = versionUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionRequired]
  }
  @scala.inline
  implicit class ActionRequiredOps[Self <: ActionRequired] (val x: Self) extends AnyVal {
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
    def setActionRequired(value: scala.Double): Self = this.set("actionRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionResolved(value: scala.Double): Self = this.set("actionResolved", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: scala.Double): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: scala.Double): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstalled(value: scala.Double): Self = this.set("installed", value.asInstanceOf[js.Any])
    @scala.inline
    def setUninstalled(value: scala.Double): Self = this.set("uninstalled", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionUpdated(value: scala.Double): Self = this.set("versionUpdated", value.asInstanceOf[js.Any])
  }
  
}

