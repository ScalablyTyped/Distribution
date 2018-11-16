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
  
  val abbreviated: abbreviated with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val full: full with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.YearFormat with java.lang.String
  ] = js.native
}

