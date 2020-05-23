package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerAlignment extends js.Object

@JSGlobal("Windows.UI.Text.MarkerAlignment")
@js.native
object MarkerAlignment extends js.Object {
  @js.native
  sealed trait center extends MarkerAlignment
  
  @js.native
  sealed trait left extends MarkerAlignment
  
  @js.native
  sealed trait right extends MarkerAlignment
  
  @js.native
  sealed trait undefined extends MarkerAlignment
  
}

