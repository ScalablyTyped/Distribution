package typings.winrtDashUwp.Windows.Globalization.DateTimeFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeekFormat extends js.Object

/** Specifies the intended format for the day of the week in a DateTimeFormatter object. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.DayOfWeekFormat")
@js.native
object DayOfWeekFormat extends js.Object {
  /** Display an abbreviated version of the day of the week (for example, "Thur" for Thursday). */
  @js.native
  sealed trait abbreviated extends DayOfWeekFormat
  
  /** Display the day of the week in the most natural way. It may be abbreviated or full depending on the context, such as the language or calendar that is being used. */
  @js.native
  sealed trait default extends DayOfWeekFormat
  
  /** Display the day of the week in its entirety (for example, "Thursday"). */
  @js.native
  sealed trait full extends DayOfWeekFormat
  
  /** Do not display the day of the week. */
  @js.native
  sealed trait none extends DayOfWeekFormat
  
  /* 2 */ val abbreviated: typings.winrtDashUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.abbreviated with Double = js.native
  /* 1 */ val default: typings.winrtDashUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.default with Double = js.native
  /* 3 */ val full: typings.winrtDashUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.full with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DayOfWeekFormat with Double] = js.native
}

