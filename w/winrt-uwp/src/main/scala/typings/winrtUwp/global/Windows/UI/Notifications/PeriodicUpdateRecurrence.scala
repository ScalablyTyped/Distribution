package typings.winrtUwp.global.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the time period for subsequent polls of the tile or badge data source for new content. Used by BadgeUpdater.StartPeriodicUpdate , TileUpdater.StartPeriodicUpdate , and TileUpdater.StartPeriodicUpdateBatch . */
@JSGlobal("Windows.UI.Notifications.PeriodicUpdateRecurrence")
@js.native
object PeriodicUpdateRecurrence extends js.Object {
  /* 4 */ val daily: typings.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.daily with Double = js.native
  /* 0 */ val halfHour: typings.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.halfHour with Double = js.native
  /* 1 */ val hour: typings.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.hour with Double = js.native
  /* 2 */ val sixHours: typings.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.sixHours with Double = js.native
  /* 3 */ val twelveHours: typings.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.twelveHours with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence with Double] = js.native
}

