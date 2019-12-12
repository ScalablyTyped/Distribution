package typings.winrt.Windows.Globalization.DateTimeFormatting

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.abbreviated
import typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.default
import typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.full
import typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.none
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[YearFormat with Double] = js.native
  /* 2 */ @js.native
  object abbreviated extends TopLevel[abbreviated with Double]
  
  /* 1 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 3 */ @js.native
  object full extends TopLevel[full with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

