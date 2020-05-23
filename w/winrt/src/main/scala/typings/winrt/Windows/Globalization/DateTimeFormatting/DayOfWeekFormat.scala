package typings.winrt.Windows.Globalization.DateTimeFormatting

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
  
}

