package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FindOptions extends js.Object

@JSGlobal("Windows.UI.Text.FindOptions")
@js.native
object FindOptions extends js.Object {
  @js.native
  sealed trait case_ extends FindOptions
  
  @js.native
  sealed trait none extends FindOptions
  
  @js.native
  sealed trait word extends FindOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FindOptions with Double] = js.native
  /* 2 */ @js.native
  object case_ extends TopLevel[case_ with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object word extends TopLevel[word with Double]
  
}

