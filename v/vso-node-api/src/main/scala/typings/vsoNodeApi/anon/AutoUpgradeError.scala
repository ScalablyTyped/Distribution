package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoUpgradeError extends js.Object {
  var autoUpgradeError: scala.Double
  var builtIn: scala.Double
  var disabled: scala.Double
  var error: scala.Double
  var multiVersion: scala.Double
  var needsReauthorization: scala.Double
  var none: scala.Double
  var trusted: scala.Double
  var unInstalled: scala.Double
  var versionCheckError: scala.Double
  var warning: scala.Double
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
}

