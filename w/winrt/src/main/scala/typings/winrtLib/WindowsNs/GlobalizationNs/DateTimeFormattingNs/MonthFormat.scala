package typings
package winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MonthFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.MonthFormat")
@js.native
object MonthFormat extends js.Object {
  @js.native
  sealed trait abbreviated
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat
  
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat
  
  @js.native
  sealed trait full
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat
  
  @js.native
  sealed trait numeric
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat
  
  val abbreviated: abbreviated with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val full: full with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val numeric: numeric with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat with java.lang.String
  ] = js.native
}

