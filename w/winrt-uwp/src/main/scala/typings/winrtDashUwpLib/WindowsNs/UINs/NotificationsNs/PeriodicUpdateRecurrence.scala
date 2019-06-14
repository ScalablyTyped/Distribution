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
  
  /* 4 */ val daily: daily with scala.Double = js.native
  /* 0 */ val halfHour: halfHour with scala.Double = js.native
  /* 1 */ val hour: hour with scala.Double = js.native
  /* 2 */ val sixHours: sixHours with scala.Double = js.native
  /* 3 */ val twelveHours: twelveHours with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence with scala.Double
  ] = js.native
}

