package typings.winrt.Windows.Globalization.DateTimeFormatting

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat.default
import typings.winrt.Windows.Globalization.DateTimeFormatting.DayFormat.none
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DayFormat with Double] = js.native
  /* 1 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

