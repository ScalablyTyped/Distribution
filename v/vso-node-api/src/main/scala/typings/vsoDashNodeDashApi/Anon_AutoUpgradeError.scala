package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoUpgradeError extends js.Object {
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

object Anon_AutoUpgradeError {
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
  ): Anon_AutoUpgradeError = {
    val __obj = js.Dynamic.literal(autoUpgradeError = autoUpgradeError, builtIn = builtIn, disabled = disabled, error = error, multiVersion = multiVersion, needsReauthorization = needsReauthorization, none = none, trusted = trusted, unInstalled = unInstalled, versionCheckError = versionCheckError, warning = warning)
  
    __obj.asInstanceOf[Anon_AutoUpgradeError]
  }
}

