package typings.winrt.Windows.UI.Text

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
  
  /* 0 */ val normal: typings.winrt.Windows.UI.Text.CaretType.normal with Double = js.native
  /* 1 */ val null_ : typings.winrt.Windows.UI.Text.CaretType.null_ with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CaretType with Double] = js.native
}

