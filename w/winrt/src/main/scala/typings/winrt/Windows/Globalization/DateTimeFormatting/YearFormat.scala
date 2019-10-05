package typings.winrt.Windows.Globalization.DateTimeFormatting

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
  
  /* 2 */ val abbreviated: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.abbreviated with Double = js.native
  /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.default with Double = js.native
  /* 3 */ val full: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.full with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.YearFormat.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[YearFormat with Double] = js.native
}

