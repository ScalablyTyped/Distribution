package typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HourFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.HourFormat")
@js.native
object HourFormat extends js.Object {
  @js.native
  sealed trait default extends HourFormat
  
  @js.native
  sealed trait none extends HourFormat
  
  /* 1 */ val default: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.HourFormat.default with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.HourFormat.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HourFormat with Double] = js.native
}

