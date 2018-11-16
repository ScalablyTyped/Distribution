package typings
package winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HourFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.HourFormat")
@js.native
object HourFormat extends js.Object {
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.HourFormat
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.HourFormat
  
  val default: default with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.HourFormat with java.lang.String
  ] = js.native
}

