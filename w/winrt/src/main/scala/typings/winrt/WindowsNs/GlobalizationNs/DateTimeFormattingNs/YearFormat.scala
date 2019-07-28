package typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait YearFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.YearFormat")
@js.native
object YearFormat extends js.Object {
  @js.native
  sealed trait abbreviated extends YearFormat
  
  @js.native
  sealed trait default extends YearFormat
  
  @js.native
  sealed trait full extends YearFormat
  
  @js.native
  sealed trait none extends YearFormat
  
  /* 2 */ val abbreviated: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.YearFormat.abbreviated with Double = js.native
  /* 1 */ val default: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.YearFormat.default with Double = js.native
  /* 3 */ val full: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.YearFormat.full with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.YearFormat.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[YearFormat with Double] = js.native
}

