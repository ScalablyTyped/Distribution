package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the XML that defines the toast notification that will display at the scheduled time. */
@JSGlobal("Windows.UI.Notifications.ScheduledToastNotification")
@js.native
class ScheduledToastNotification protected () extends js.Object {
  /**
    * Creates and initializes a new instance of a ScheduledToastNotification that will be displayed only once.
    * @param content The XML that defines the toast notification content.
    * @param deliveryTime The date and time that Windows should display the toast notification. You must call AddToSchedule before this time.
    */
  def this(content: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, deliveryTime: stdLib.Date) = this()
  /**
    * Creates and initializes a new instance of a recurring ScheduledToastNotification .
    * @param content The XML that defines the toast notification content.
    * @param deliveryTime The date and time that Windows should first display the toast notification. You must call AddToSchedule before this time.
    * @param snoozeInterval The amount of time between occurrences of the notification. To be valid, this value must be no less than 60 seconds and no more than 60 minutes.
    * @param maximumSnoozeCount The maximum number of times to display this notification. Valid values range from 1 to 5.
    */
  def this(content: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, deliveryTime: stdLib.Date, snoozeInterval: scala.Double, maximumSnoozeCount: scala.Double) = this()
  /** Gets the XML that defines this scheduled toast notification. */
  var content: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
  /** Gets the time that this toast notification is scheduled to be displayed. */
  var deliveryTime: stdLib.Date = js.native
  /** Gets or sets the group identifier for the notification. */
  var group: java.lang.String = js.native
  /** Gets a developer-specified value used to identify a specific scheduled toast. */
  var id: java.lang.String = js.native
  /** Gets the maximum number of times to display this notification. */
  var maximumSnoozeCount: scala.Double = js.native
  /** Gets the amount of time between occurrences of the notification. */
  var snoozeInterval: scala.Double = js.native
  /** Gets or sets whether a toast's pop-up UI is displayed on the Windows Phone 8.1 screen. */
  var suppressPopup: scala.Boolean = js.native
  /** Gets or sets a string that uniquely identifies a toast notification inside a Group . */
  var tag: java.lang.String = js.native
}

