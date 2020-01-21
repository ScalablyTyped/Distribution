package typings.winrtUwp.Windows.Globalization.DateTimeFormatting

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MonthFormat with Double] = js.native
  /* 2 */ @js.native
  object abbreviated extends TopLevel[abbreviated with Double]
  
  /* 1 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 3 */ @js.native
  object full extends TopLevel[full with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 4 */ @js.native
  object numeric extends TopLevel[numeric with Double]
  
}

