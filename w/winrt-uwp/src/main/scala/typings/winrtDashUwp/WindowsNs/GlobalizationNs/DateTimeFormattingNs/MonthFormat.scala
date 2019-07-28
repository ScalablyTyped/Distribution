package typings.winrtDashUwp.WindowsNs.GlobalizationNs.DateTimeFormattingNs

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
  
  /* 2 */ val abbreviated: typings.winrtDashUwp.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat.abbreviated with Double = js.native
  /* 1 */ val default: typings.winrtDashUwp.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat.default with Double = js.native
  /* 3 */ val full: typings.winrtDashUwp.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat.full with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat.none with Double = js.native
  /* 4 */ val numeric: typings.winrtDashUwp.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat.numeric with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MonthFormat with Double] = js.native
}

