package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBadgeUpdater extends js.Object {
  def clear(): scala.Unit = js.native
  def startPeriodicUpdate(badgeContent: winrtLib.WindowsNs.FoundationNs.Uri, requestedInterval: PeriodicUpdateRecurrence): scala.Unit = js.native
  def startPeriodicUpdate(
    badgeContent: winrtLib.WindowsNs.FoundationNs.Uri,
    startTime: stdLib.Date,
    requestedInterval: PeriodicUpdateRecurrence
  ): scala.Unit = js.native
  def stopPeriodicUpdate(): scala.Unit = js.native
  def update(notification: BadgeNotification): scala.Unit = js.native
}

