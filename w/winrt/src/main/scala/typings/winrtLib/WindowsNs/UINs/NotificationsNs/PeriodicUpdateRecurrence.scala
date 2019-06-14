package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PeriodicUpdateRecurrence extends js.Object

@JSGlobal("Windows.UI.Notifications.PeriodicUpdateRecurrence")
@js.native
object PeriodicUpdateRecurrence extends js.Object {
  @js.native
  sealed trait daily
    extends winrtLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence
  
  @js.native
  sealed trait halfHour
    extends winrtLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence
  
  @js.native
  sealed trait hour
    extends winrtLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence
  
  @js.native
  sealed trait sixHours
    extends winrtLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence
  
  @js.native
  sealed trait twelveHours
    extends winrtLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence
  
  /* 4 */ val daily: daily with scala.Double = js.native
  /* 0 */ val halfHour: halfHour with scala.Double = js.native
  /* 1 */ val hour: hour with scala.Double = js.native
  /* 2 */ val sixHours: sixHours with scala.Double = js.native
  /* 3 */ val twelveHours: twelveHours with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence with scala.Double
  ] = js.native
}

