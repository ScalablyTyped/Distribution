package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoUpgradeError extends js.Object {
  var autoUpgradeError: Double
  var builtIn: Double
  var disabled: Double
  var error: Double
  var multiVersion: Double
  var needsReauthorization: Double
  var none: Double
  var trusted: Double
  var unInstalled: Double
  var versionCheckError: Double
  var warning: Double
}

object AnonAutoUpgradeError {
  @scala.inline
  def apply(
    autoUpgradeError: Double,
    builtIn: Double,
    disabled: Double,
    error: Double,
    multiVersion: Double,
    needsReauthorization: Double,
    none: Double,
    trusted: Double,
    unInstalled: Double,
    versionCheckError: Double,
    warning: Double
  ): AnonAutoUpgradeError = {
    val __obj = js.Dynamic.literal(autoUpgradeError = autoUpgradeError.asInstanceOf[js.Any], builtIn = builtIn.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], multiVersion = multiVersion.asInstanceOf[js.Any], needsReauthorization = needsReauthorization.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], unInstalled = unInstalled.asInstanceOf[js.Any], versionCheckError = versionCheckError.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoUpgradeError]
  }
}

