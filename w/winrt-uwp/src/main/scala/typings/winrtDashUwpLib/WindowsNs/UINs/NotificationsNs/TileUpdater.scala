package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Changes the content of the specific tile that the updater is bound to. */
@JSGlobal("Windows.UI.Notifications.TileUpdater")
@js.native
abstract class TileUpdater () extends js.Object {
  /** Gets a value that specifies whether a tile can be updated through notifications. */
  var setting: NotificationSetting = js.native
  /**
    * Adds a ScheduledTileNotification to the schedule.
    * @param scheduledTile The scheduled tile update object.
    */
  def addToSchedule(scheduledTile: ScheduledTileNotification): scala.Unit = js.native
  /** Removes all updates and causes the tile to display its default content as declared in the app's manifest. */
  def clear(): scala.Unit = js.native
  /**
    * Enables the tile to queue up to five notifications. This enables the notification queue on all tile sizes.
    * @param enable True to enable queuing; otherwise false.
    */
  def enableNotificationQueue(enable: scala.Boolean): scala.Unit = js.native
  /**
    * Enables the tile to queue up to five notifications on the medium tile.
    * @param enable True to enable queuing on this tile size; otherwise false.
    */
  def enableNotificationQueueForSquare150x150(enable: scala.Boolean): scala.Unit = js.native
  /**
    * Enables the tile to queue up to five notifications on the large tile.
    * @param enable True to enable queuing on this tile size; otherwise false.
    */
  def enableNotificationQueueForSquare310x310(enable: scala.Boolean): scala.Unit = js.native
  /**
    * Enables the tile to queue up to five notifications on the wide tile.
    * @param enable True to enable queuing on this tile size; otherwise false.
    */
  def enableNotificationQueueForWide310x150(enable: scala.Boolean): scala.Unit = js.native
  /**
    * Retrieves a list of scheduled updates to the tile.
    * @return The collection of scheduled updates for this tile.
    */
  def getScheduledTileNotifications(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ScheduledTileNotification] = js.native
  /**
    * Removes an upcoming tile update from the schedule.
    * @param scheduledTile The notification to remove from the schedule.
    */
  def removeFromSchedule(scheduledTile: ScheduledTileNotification): scala.Unit = js.native
  /**
    * Begins a series of timed content changes for the tile that the updater is bound to, beginning immediately.
    * @param tileContent The URI from which the XML content of the tile update will be retrieved.
    * @param requestedInterval The frequency with which the URI is polled for new tile content, following the initial update at startTime.
    */
  def startPeriodicUpdate(
    tileContent: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    requestedInterval: PeriodicUpdateRecurrence
  ): scala.Unit = js.native
  /**
    * Begins a series of timed updates for the tile that the updater is bound to. Update content is retrieved from a specified Uniform Resource Identifier (URI). Updates begin at a specified time.
    * @param tileContent The URI from which the XML content of the tile update will be retrieved.
    * @param startTime The time at which the URI should first be polled for new tile content.
    * @param requestedInterval The frequency with which the URI is polled for new tile content, following the initial update at startTime.
    */
  def startPeriodicUpdate(
    tileContent: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    startTime: stdLib.Date,
    requestedInterval: PeriodicUpdateRecurrence
  ): scala.Unit = js.native
  /**
    * Begins a series of timed updates that cycle on the tile that the updater is bound to. Update content is retrieved from an array of specified Uniform Resource Identifiers (URIs), the first update happening immediately and subsequent updates occurring at the periodic interval thereafter.
    * @param tileContents An array of up to five URIs from which the XML content of the cycling tile updates will be retrieved. If the array contains more than five URIs, the method will fail.
    * @param requestedInterval The frequency with which the URI is polled for new tile content, following the initial update at startTime.
    */
  def startPeriodicUpdateBatch(
    tileContents: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.FoundationNs.Uri],
    requestedInterval: PeriodicUpdateRecurrence
  ): scala.Unit = js.native
  /**
    * Begins a series of timed updates that cycle on the tile that the updater is bound to. Update content is retrieved from an array of specified Uniform Resource Identifiers (URIs) with updates beginning at a specified time and subsequent updates occurring at the periodic interval thereafter.
    * @param tileContents An array of up to five URIs from which the XML content of the cycling tile updates will be retrieved. If the array contains more than five URIs, the method will fail.
    * @param startTime The time at which the initial URI should first be polled for new content.
    * @param requestedInterval The frequency with which the URI is polled for new tile content, following the initial update at startTime.
    */
  def startPeriodicUpdateBatch(
    tileContents: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.FoundationNs.Uri],
    startTime: stdLib.Date,
    requestedInterval: PeriodicUpdateRecurrence
  ): scala.Unit = js.native
  /** Cancels the current series of timed updates for the tile that the updater is bound to. */
  def stopPeriodicUpdate(): scala.Unit = js.native
  /**
    * Applies a change in content or appearance to the tile.
    * @param notification The object that supplies the new XML definition for the tile's content.
    */
  def update(notification: TileNotification): scala.Unit = js.native
}

