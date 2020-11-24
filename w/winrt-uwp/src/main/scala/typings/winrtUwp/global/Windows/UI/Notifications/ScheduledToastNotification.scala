package typings.winrtUwp.global.Windows.UI.Notifications

import typings.std.Date
import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the XML that defines the toast notification that will display at the scheduled time. */
@JSGlobal("Windows.UI.Notifications.ScheduledToastNotification")
@js.native
class ScheduledToastNotification protected ()
  extends typings.winrtUwp.Windows.UI.Notifications.ScheduledToastNotification {
  /**
    * Creates and initializes a new instance of a ScheduledToastNotification that will be displayed only once.
    * @param content The XML that defines the toast notification content.
    * @param deliveryTime The date and time that Windows should display the toast notification. You must call AddToSchedule before this time.
    */
  def this(content: XmlDocument, deliveryTime: Date) = this()
  /**
    * Creates and initializes a new instance of a recurring ScheduledToastNotification .
    * @param content The XML that defines the toast notification content.
    * @param deliveryTime The date and time that Windows should first display the toast notification. You must call AddToSchedule before this time.
    * @param snoozeInterval The amount of time between occurrences of the notification. To be valid, this value must be no less than 60 seconds and no more than 60 minutes.
    * @param maximumSnoozeCount The maximum number of times to display this notification. Valid values range from 1 to 5.
    */
  def this(content: XmlDocument, deliveryTime: Date, snoozeInterval: Double, maximumSnoozeCount: Double) = this()
}
