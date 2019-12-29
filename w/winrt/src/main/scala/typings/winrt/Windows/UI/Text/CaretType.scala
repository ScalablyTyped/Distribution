package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CaretType extends js.Object

@JSGlobal("Windows.UI.Text.CaretType")
@js.native
object CaretType extends js.Object {
  @js.native
  sealed trait normal extends CaretType
  
  @js.native
  sealed trait null_ extends CaretType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CaretType with Double] = js.native
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 1 */ @js.native
  object null_ extends TopLevel[null_ with Double]
  
}

