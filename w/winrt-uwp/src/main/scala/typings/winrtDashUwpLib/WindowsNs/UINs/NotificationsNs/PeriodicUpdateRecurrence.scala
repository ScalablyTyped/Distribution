package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PeriodicUpdateRecurrence extends js.Object

/** Specifies the time period for subsequent polls of the tile or badge data source for new content. Used by BadgeUpdater.StartPeriodicUpdate , TileUpdater.StartPeriodicUpdate , and TileUpdater.StartPeriodicUpdateBatch . */
@JSGlobal("Windows.UI.Notifications.PeriodicUpdateRecurrence")
@js.native
object PeriodicUpdateRecurrence extends js.Object {
  /** Poll once a day. */
  @js.native
  sealed trait daily
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence
  
  /** Poll every half an hour. */
  @js.native
  sealed trait halfHour
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence
  
  /** Poll every hour. */
  @js.native
  sealed trait hour
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence
  
  /** Poll every 6 hours. */
  @js.native
  sealed trait sixHours
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence
  
  /** Poll every 12 hours. */
  @js.native
  sealed trait twelveHours
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence
  
  val daily: daily with java.lang.String = js.native
  val halfHour: halfHour with java.lang.String = js.native
  val hour: hour with java.lang.String = js.native
  val sixHours: sixHours with java.lang.String = js.native
  val twelveHours: twelveHours with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence with java.lang.String
  ] = js.native
}

