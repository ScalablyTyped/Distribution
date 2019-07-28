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
    val __obj = js.Dynamic.literal(actionRequired = actionRequired, actionResolved = actionResolved, disabled = disabled, enabled = enabled, installed = installed, uninstalled = uninstalled, versionUpdated = versionUpdated)
  
    __obj.asInstanceOf[Anon_ActionRequired]
  }
}

