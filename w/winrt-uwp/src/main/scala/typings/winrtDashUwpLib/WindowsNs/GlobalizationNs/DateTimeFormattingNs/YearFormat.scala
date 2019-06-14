package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait YearFormat extends js.Object

/** Specifies the intended format for the year in a DateTimeFormatter object. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.YearFormat")
@js.native
object YearFormat extends js.Object {
  /** Display an abbreviated version of the year (for example, "11" for Gregorian 2011). */
  @js.native
  sealed trait abbreviated
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.YearFormat
  
  /** Display the year in the most natural way. It may be abbreviated or full depending on the context, such as the language or calendar that is being used. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.YearFormat
  
  /** Display the year in its entirety (for example, "2011" for Gregorian 2011). */
  @js.native
  sealed trait full
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.YearFormat
  
  /** Do not display the year. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.YearFormat
  
  /* 2 */ val abbreviated: abbreviated with scala.Double = js.native
  /* 1 */ val default: default with scala.Double = js.native
  /* 3 */ val full: full with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.YearFormat with scala.Double
  ] = js.native
}

