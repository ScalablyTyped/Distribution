package typings.winrtDashUwp.Windows.Globalization.DateTimeFormatting

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Globalization.DateTimeFormatting.DayFormat.default
import typings.winrtDashUwp.Windows.Globalization.DateTimeFormatting.DayFormat.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayFormat extends js.Object

/** Specifies the intended format for the day in a DateTimeFormatter object. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.DayFormat")
@js.native
object DayFormat extends js.Object {
  /** Display the day in the most natural way. This will depend on the context, such as the language or calendar (for example, for the Hebrew calendar and Hebrew language, use the Hebrew numbering system). */
  @js.native
  sealed trait default extends DayFormat
  
  /** Do not display the day. */
  @js.native
  sealed trait none extends DayFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DayFormat with Double] = js.native
  /* 1 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

