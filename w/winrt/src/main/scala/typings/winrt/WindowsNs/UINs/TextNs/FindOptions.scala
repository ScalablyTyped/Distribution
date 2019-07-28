package typings.winrt.WindowsNs.UINs.TextNs

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
  
  /* 2 */ val case_ : typings.winrt.WindowsNs.UINs.TextNs.FindOptions.case_ with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.UINs.TextNs.FindOptions.none with Double = js.native
  /* 1 */ val word: typings.winrt.WindowsNs.UINs.TextNs.FindOptions.word with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FindOptions with Double] = js.native
}

