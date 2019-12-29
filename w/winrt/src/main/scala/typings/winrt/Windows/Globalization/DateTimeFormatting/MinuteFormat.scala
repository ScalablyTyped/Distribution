package typings.winrt.Windows.Globalization.DateTimeFormatting

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MinuteFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.MinuteFormat")
@js.native
object MinuteFormat extends js.Object {
  @js.native
  sealed trait default extends MinuteFormat
  
  @js.native
  sealed trait none extends MinuteFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MinuteFormat with Double] = js.native
  /* 1 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

