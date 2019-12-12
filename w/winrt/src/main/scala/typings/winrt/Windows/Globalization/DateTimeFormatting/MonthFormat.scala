package typings.winrt.Windows.Globalization.DateTimeFormatting

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.abbreviated
import typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.default
import typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.full
import typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.none
import typings.winrt.Windows.Globalization.DateTimeFormatting.MonthFormat.numeric
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MonthFormat with Double] = js.native
  /* 2 */ @js.native
  object abbreviated extends TopLevel[abbreviated with Double]
  
  /* 1 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 3 */ @js.native
  object full extends TopLevel[full with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 4 */ @js.native
  object numeric extends TopLevel[numeric with Double]
  
}

