package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerAlignment with Double] = js.native
  /* 2 */ @js.native
  object center extends TopLevel[center with Double]
  
  /* 1 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* 3 */ @js.native
  object right extends TopLevel[right with Double]
  
  /* 0 */ @js.native
  object undefined extends TopLevel[undefined with Double]
  
}

