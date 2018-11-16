package typings
package winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.DayFormat")
@js.native
object DayFormat extends js.Object {
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayFormat
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayFormat
  
  val default: default with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DayFormat with java.lang.String
  ] = js.native
}

