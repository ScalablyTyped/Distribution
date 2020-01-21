package typings.winrtUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PeriodicUpdateRecurrence with Double] = js.native
  /* 4 */ @js.native
  object daily extends TopLevel[daily with Double]
  
  /* 0 */ @js.native
  object halfHour extends TopLevel[halfHour with Double]
  
  /* 1 */ @js.native
  object hour extends TopLevel[hour with Double]
  
  /* 2 */ @js.native
  object sixHours extends TopLevel[sixHours with Double]
  
  /* 3 */ @js.native
  object twelveHours extends TopLevel[twelveHours with Double]
  
}

