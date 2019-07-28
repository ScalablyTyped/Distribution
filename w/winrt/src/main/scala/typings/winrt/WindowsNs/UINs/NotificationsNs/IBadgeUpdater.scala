package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.std.Date
import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBadgeUpdater extends js.Object {
  def clear(): Unit = js.native
  def startPeriodicUpdate(badgeContent: Uri, requestedInterval: PeriodicUpdateRecurrence): Unit = js.native
  def startPeriodicUpdate(badgeContent: Uri, startTime: Date, requestedInterval: PeriodicUpdateRecurrence): Unit = js.native
  def stopPeriodicUpdate(): Unit = js.native
  def update(notification: BadgeNotification): Unit = js.native
}

