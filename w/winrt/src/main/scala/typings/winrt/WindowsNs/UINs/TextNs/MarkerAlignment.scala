package typings.winrt.WindowsNs.UINs.TextNs

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
  
  /* 2 */ val center: typings.winrt.WindowsNs.UINs.TextNs.MarkerAlignment.center with Double = js.native
  /* 1 */ val left: typings.winrt.WindowsNs.UINs.TextNs.MarkerAlignment.left with Double = js.native
  /* 3 */ val right: typings.winrt.WindowsNs.UINs.TextNs.MarkerAlignment.right with Double = js.native
  /* 0 */ val undefined: typings.winrt.WindowsNs.UINs.TextNs.MarkerAlignment.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerAlignment with Double] = js.native
}

