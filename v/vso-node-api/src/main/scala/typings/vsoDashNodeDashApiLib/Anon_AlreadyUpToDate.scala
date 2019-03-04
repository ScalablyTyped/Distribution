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
    val __obj = js.Dynamic.literal(alreadyUpToDate = alreadyUpToDate, inlineUpdateReceived = inlineUpdateReceived, installed = installed, preinstalled = preinstalled, receivedInstallOrUpdate = receivedInstallOrUpdate, receivedUninstall = receivedUninstall, requestedUpdate = requestedUpdate, uninstalled = uninstalled, updated = updated)
  
    __obj.asInstanceOf[Anon_AlreadyUpToDate]
  }
}

