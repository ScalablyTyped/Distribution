package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoUpgradeError extends js.Object {
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

object Anon_AutoUpgradeError {
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
  ): Anon_AutoUpgradeError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoUpgradeError")(autoUpgradeError)
    __obj.updateDynamic("builtIn")(builtIn)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("multiVersion")(multiVersion)
    __obj.updateDynamic("needsReauthorization")(needsReauthorization)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("trusted")(trusted)
    __obj.updateDynamic("unInstalled")(unInstalled)
    __obj.updateDynamic("versionCheckError")(versionCheckError)
    __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Anon_AutoUpgradeError]
  }
}

