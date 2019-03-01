package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlreadyUpToDate extends js.Object {
  var alreadyUpToDate: scala.Double
  var inlineUpdateReceived: scala.Double
  var installed: scala.Double
  var preinstalled: scala.Double
  var receivedInstallOrUpdate: scala.Double
  var receivedUninstall: scala.Double
  var requestedUpdate: scala.Double
  var uninstalled: scala.Double
  var updated: scala.Double
}

object Anon_AlreadyUpToDate {
  @scala.inline
  def apply(
    alreadyUpToDate: scala.Double,
    inlineUpdateReceived: scala.Double,
    installed: scala.Double,
    preinstalled: scala.Double,
    receivedInstallOrUpdate: scala.Double,
    receivedUninstall: scala.Double,
    requestedUpdate: scala.Double,
    uninstalled: scala.Double,
    updated: scala.Double
  ): Anon_AlreadyUpToDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alreadyUpToDate")(alreadyUpToDate)
    __obj.updateDynamic("inlineUpdateReceived")(inlineUpdateReceived)
    __obj.updateDynamic("installed")(installed)
    __obj.updateDynamic("preinstalled")(preinstalled)
    __obj.updateDynamic("receivedInstallOrUpdate")(receivedInstallOrUpdate)
    __obj.updateDynamic("receivedUninstall")(receivedUninstall)
    __obj.updateDynamic("requestedUpdate")(requestedUpdate)
    __obj.updateDynamic("uninstalled")(uninstalled)
    __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Anon_AlreadyUpToDate]
  }
}

