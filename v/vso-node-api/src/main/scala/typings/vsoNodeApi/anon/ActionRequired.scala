package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionRequired extends js.Object {
  var actionRequired: scala.Double
  var actionResolved: scala.Double
  var disabled: scala.Double
  var enabled: scala.Double
  var installed: scala.Double
  var uninstalled: scala.Double
  var versionUpdated: scala.Double
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
}

