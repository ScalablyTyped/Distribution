package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalCharacterAlignment extends js.Object

@JSGlobal("Windows.UI.Text.VerticalCharacterAlignment")
@js.native
object VerticalCharacterAlignment extends js.Object {
  @js.native
  sealed trait baseline extends VerticalCharacterAlignment
  
  @js.native
  sealed trait bottom extends VerticalCharacterAlignment
  
  @js.native
  sealed trait top extends VerticalCharacterAlignment
  
}

