package typings.winrt.Windows.Globalization.DateTimeFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.DayFormat")
@js.native
object DayFormat extends js.Object {
  @js.native
  sealed trait default extends DayFormat
  
  @js.native
  sealed trait none extends DayFormat
  
  /* 1 */ val default: typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat.default with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DayFormat with Double] = js.native
}

