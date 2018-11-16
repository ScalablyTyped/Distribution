package typings
package winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeekFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.DayOfWeekFormat")
@js.native
object DayOfWeekFormat extends js.Object {
  @js.native
  sealed trait abbreviated
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat
  
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat
  
  @js.native
  sealed trait full
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat
  
  val abbreviated: abbreviated with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val full: full with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayOfWeekFormat with java.lang.String
  ] = js.native
}

