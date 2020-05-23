package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlreadyUpToDate extends js.Object {
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

object AlreadyUpToDate {
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
  ): AlreadyUpToDate = {
    val __obj = js.Dynamic.literal(alreadyUpToDate = alreadyUpToDate.asInstanceOf[js.Any], inlineUpdateReceived = inlineUpdateReceived.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], preinstalled = preinstalled.asInstanceOf[js.Any], receivedInstallOrUpdate = receivedInstallOrUpdate.asInstanceOf[js.Any], receivedUninstall = receivedUninstall.asInstanceOf[js.Any], requestedUpdate = requestedUpdate.asInstanceOf[js.Any], uninstalled = uninstalled.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlreadyUpToDate]
  }
}

