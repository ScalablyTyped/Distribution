package typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MinuteFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.MinuteFormat")
@js.native
object MinuteFormat extends js.Object {
  @js.native
  sealed trait default extends MinuteFormat
  
  @js.native
  sealed trait none extends MinuteFormat
  
  /* 1 */ val default: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MinuteFormat.default with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MinuteFormat.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MinuteFormat with Double] = js.native
}

