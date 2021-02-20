package typings.winrtUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PeriodicUpdateRecurrence extends StObject
/** Specifies the time period for subsequent polls of the tile or badge data source for new content. Used by BadgeUpdater.StartPeriodicUpdate , TileUpdater.StartPeriodicUpdate , and TileUpdater.StartPeriodicUpdateBatch . */
@JSGlobal("Windows.UI.Notifications.PeriodicUpdateRecurrence")
@js.native
object PeriodicUpdateRecurrence extends StObject {
  
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
}
