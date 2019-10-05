package typings.winrtDashUwp.Windows.UI.Notifications

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
  sealed trait daily extends PeriodicUpdateRecurrence
  
  /** Poll every half an hour. */
  @js.native
  sealed trait halfHour extends PeriodicUpdateRecurrence
  
  /** Poll every hour. */
  @js.native
  sealed trait hour extends PeriodicUpdateRecurrence
  
  /** Poll every 6 hours. */
  @js.native
  sealed trait sixHours extends PeriodicUpdateRecurrence
  
  /** Poll every 12 hours. */
  @js.native
  sealed trait twelveHours extends PeriodicUpdateRecurrence
  
  /* 4 */ val daily: typings.winrtDashUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.daily with Double = js.native
  /* 0 */ val halfHour: typings.winrtDashUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.halfHour with Double = js.native
  /* 1 */ val hour: typings.winrtDashUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.hour with Double = js.native
  /* 2 */ val sixHours: typings.winrtDashUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.sixHours with Double = js.native
  /* 3 */ val twelveHours: typings.winrtDashUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.twelveHours with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PeriodicUpdateRecurrence with Double] = js.native
}

