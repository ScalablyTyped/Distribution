package typings.winrt.Windows.UI.Notifications

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.daily
import typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.halfHour
import typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.hour
import typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.sixHours
import typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.twelveHours
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

