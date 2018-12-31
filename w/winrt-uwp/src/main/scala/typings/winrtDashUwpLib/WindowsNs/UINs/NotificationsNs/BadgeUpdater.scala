package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Updates a badge overlay on the specific tile that the updater is bound to. */
@JSGlobal("Windows.UI.Notifications.BadgeUpdater")
@js.native
abstract class BadgeUpdater () extends js.Object {
  /** Removes the badge from the tile that the updater is bound to. */
  def clear(): scala.Unit = js.native
  /**
    * Begins a series of timed updates for the badge from a web resource that the updater is bound to, beginning immediately. Note that only web resources (http/https) are allowed in a periodic update.
    * @param badgeContent The URI from which the XML content of the badge update will be retrieved.
    * @param requestedInterval The frequency with which the URI is polled for new badge content.
    */
  def startPeriodicUpdate(
    badgeContent: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    requestedInterval: PeriodicUpdateRecurrence
  ): scala.Unit = js.native
  /**
    * Begins a series of timed updates for the badge from a web resource that the updater is bound to. Updates begin at a specified time. Note that only web resources (http/https) are allowed in a periodic update.
    * @param badgeContent The URI from which the XML content of the badge update will be retrieved.
    * @param startTime The time at which the URI should first be polled for new badge content.
    * @param requestedInterval The frequency with which the URI is polled for new badge content, following the initial update at startTime.
    */
  def startPeriodicUpdate(
    badgeContent: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    startTime: stdLib.Date,
    requestedInterval: PeriodicUpdateRecurrence
  ): scala.Unit = js.native
  /** Cancels the current series of timed updates for the badge that the updater is bound to. */
  def stopPeriodicUpdate(): scala.Unit = js.native
  /**
    * Applies a change to the badge's glyph or number.
    * @param notification The object that supplies the new XML definition for the badge.
    */
  def update(notification: BadgeNotification): scala.Unit = js.native
}

