package typings.winrt.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PeriodicUpdateRecurrence extends js.Object

@JSGlobal("Windows.UI.Notifications.PeriodicUpdateRecurrence")
@js.native
object PeriodicUpdateRecurrence extends js.Object {
  @js.native
  sealed trait daily extends PeriodicUpdateRecurrence
  
  @js.native
  sealed trait halfHour extends PeriodicUpdateRecurrence
  
  @js.native
  sealed trait hour extends PeriodicUpdateRecurrence
  
  @js.native
  sealed trait sixHours extends PeriodicUpdateRecurrence
  
  @js.native
  sealed trait twelveHours extends PeriodicUpdateRecurrence
  
  /* 4 */ val daily: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.daily with Double = js.native
  /* 0 */ val halfHour: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.halfHour with Double = js.native
  /* 1 */ val hour: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.hour with Double = js.native
  /* 2 */ val sixHours: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.sixHours with Double = js.native
  /* 3 */ val twelveHours: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.twelveHours with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PeriodicUpdateRecurrence with Double] = js.native
}

