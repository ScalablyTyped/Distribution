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
  
  val daily: daily with java.lang.String = js.native
  val halfHour: halfHour with java.lang.String = js.native
  val hour: hour with java.lang.String = js.native
  val sixHours: sixHours with java.lang.String = js.native
  val twelveHours: twelveHours with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.UINs.NotificationsNs.PeriodicUpdateRecurrence with java.lang.String
  ] = js.native
}

