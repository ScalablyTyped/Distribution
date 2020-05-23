package typings.winrtUwp.Windows.Globalization.DateTimeFormatting

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
  
}

