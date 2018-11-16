package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITileUpdater extends js.Object {
  var setting: NotificationSetting = js.native
  def addToSchedule(scheduledTile: ScheduledTileNotification): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def enableNotificationQueue(enable: scala.Boolean): scala.Unit = js.native
  def getScheduledTileNotifications(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ScheduledTileNotification] = js.native
  def removeFromSchedule(scheduledTile: ScheduledTileNotification): scala.Unit = js.native
  def startPeriodicUpdate(tileContent: winrtLib.WindowsNs.FoundationNs.Uri, requestedInterval: PeriodicUpdateRecurrence): scala.Unit = js.native
  def startPeriodicUpdate(
    tileContent: winrtLib.WindowsNs.FoundationNs.Uri,
    startTime: stdLib.Date,
    requestedInterval: PeriodicUpdateRecurrence
  ): scala.Unit = js.native
  def startPeriodicUpdateBatch(
    tileContents: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Uri],
    requestedInterval: PeriodicUpdateRecurrence
  ): scala.Unit = js.native
  def startPeriodicUpdateBatch(
    tileContents: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Uri],
    startTime: stdLib.Date,
    requestedInterval: PeriodicUpdateRecurrence
  ): scala.Unit = js.native
  def stopPeriodicUpdate(): scala.Unit = js.native
  def update(notification: TileNotification): scala.Unit = js.native
}

