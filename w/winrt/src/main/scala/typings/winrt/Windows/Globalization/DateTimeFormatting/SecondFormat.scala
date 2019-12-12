package typings.winrt.Windows.Globalization.DateTimeFormatting

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat.default
import typings.winrt.Windows.Globalization.DateTimeFormatting.SecondFormat.none
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SecondFormat with Double] = js.native
  /* 1 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

