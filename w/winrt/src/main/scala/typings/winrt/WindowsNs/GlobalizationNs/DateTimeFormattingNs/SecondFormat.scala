package typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SecondFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.SecondFormat")
@js.native
object SecondFormat extends js.Object {
  @js.native
  sealed trait default extends SecondFormat
  
  @js.native
  sealed trait none extends SecondFormat
  
  /* 1 */ val default: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.SecondFormat.default with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs.SecondFormat.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SecondFormat with Double] = js.native
}

