package typings.winrtUwp.Windows.Globalization.DateTimeFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MonthFormat extends js.Object

/** Specifies the intended format for the month in a DateTimeFormatter object. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.MonthFormat")
@js.native
object MonthFormat extends js.Object {
  /** Display an abbreviated version of the month (for example, "Sep" for September). */
  @js.native
  sealed trait abbreviated extends MonthFormat
  
  /** Display the month in the most natural way. It may be abbreviated, full, or numeric depending on the context, such as the language or calendar that is being used. */
  @js.native
  sealed trait default extends MonthFormat
  
  /** Display the month in its entirety (for example, "September"). */
  @js.native
  sealed trait full extends MonthFormat
  
  /** Do not display the month. */
  @js.native
  sealed trait none extends MonthFormat
  
  /** Display the month as a number (for example, "9" for September). */
  @js.native
  sealed trait numeric extends MonthFormat
  
}

