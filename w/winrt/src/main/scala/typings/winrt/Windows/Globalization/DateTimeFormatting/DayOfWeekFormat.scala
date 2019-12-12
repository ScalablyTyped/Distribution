package typings.winrt.Windows.Globalization.DateTimeFormatting

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.abbreviated
import typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.default
import typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.full
import typings.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeekFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.DayOfWeekFormat")
@js.native
object DayOfWeekFormat extends js.Object {
  @js.native
  sealed trait abbreviated extends DayOfWeekFormat
  
  @js.native
  sealed trait default extends DayOfWeekFormat
  
  @js.native
  sealed trait full extends DayOfWeekFormat
  
  @js.native
  sealed trait none extends DayOfWeekFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DayOfWeekFormat with Double] = js.native
  /* 2 */ @js.native
  object abbreviated extends TopLevel[abbreviated with Double]
  
  /* 1 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 3 */ @js.native
  object full extends TopLevel[full with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

