package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionRequired extends js.Object {
  var actionRequired: Double
  var actionResolved: Double
  var disabled: Double
  var enabled: Double
  var installed: Double
  var uninstalled: Double
  var versionUpdated: Double
}

object Anon_ActionRequired {
  @scala.inline
  def apply(
    actionRequired: Double,
    actionResolved: Double,
    disabled: Double,
    enabled: Double,
    installed: Double,
    uninstalled: Double,
    versionUpdated: Double
  ): Anon_ActionRequired = {
    val __obj = js.Dynamic.literal(actionRequired = actionRequired.asInstanceOf[js.Any], actionResolved = actionResolved.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], uninstalled = uninstalled.asInstanceOf[js.Any], versionUpdated = versionUpdated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionRequired]
  }
}

