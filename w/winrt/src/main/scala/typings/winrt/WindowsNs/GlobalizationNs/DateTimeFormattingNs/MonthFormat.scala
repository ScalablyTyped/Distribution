package typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MonthFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.MonthFormat")
@js.native
object MonthFormat extends js.Object {
  @js.native
  sealed trait abbreviated extends MonthFormat
  
  @js.native
  sealed trait default extends MonthFormat
  
  @js.native
  sealed trait full extends MonthFormat
  
  @js.native
  sealed trait none extends MonthFormat
  
  @js.native
  sealed trait numeric extends MonthFormat
  
  /* 2 */ val abbreviated: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat.abbreviated with Double = js.native
  /* 1 */ val default: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat.default with Double = js.native
  /* 3 */ val full: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat.full with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat.none with Double = js.native
  /* 4 */ val numeric: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MonthFormat.numeric with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MonthFormat with Double] = js.native
}

