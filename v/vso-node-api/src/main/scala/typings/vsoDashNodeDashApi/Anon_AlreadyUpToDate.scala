package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlreadyUpToDate extends js.Object {
  var alreadyUpToDate: Double
  var inlineUpdateReceived: Double
  var installed: Double
  var preinstalled: Double
  var receivedInstallOrUpdate: Double
  var receivedUninstall: Double
  var requestedUpdate: Double
  var uninstalled: Double
  var updated: Double
}

object Anon_AlreadyUpToDate {
  @scala.inline
  def apply(
    alreadyUpToDate: Double,
    inlineUpdateReceived: Double,
    installed: Double,
    preinstalled: Double,
    receivedInstallOrUpdate: Double,
    receivedUninstall: Double,
    requestedUpdate: Double,
    uninstalled: Double,
    updated: Double
  ): Anon_AlreadyUpToDate = {
    val __obj = js.Dynamic.literal(alreadyUpToDate = alreadyUpToDate, inlineUpdateReceived = inlineUpdateReceived, installed = installed, preinstalled = preinstalled, receivedInstallOrUpdate = receivedInstallOrUpdate, receivedUninstall = receivedUninstall, requestedUpdate = requestedUpdate, uninstalled = uninstalled, updated = updated)
  
    __obj.asInstanceOf[Anon_AlreadyUpToDate]
  }
}

