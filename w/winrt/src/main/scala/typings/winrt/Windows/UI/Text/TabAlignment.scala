package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Text.TabAlignment.bar
import typings.winrt.Windows.UI.Text.TabAlignment.center
import typings.winrt.Windows.UI.Text.TabAlignment.decimal
import typings.winrt.Windows.UI.Text.TabAlignment.left
import typings.winrt.Windows.UI.Text.TabAlignment.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabAlignment extends js.Object

@JSGlobal("Windows.UI.Text.TabAlignment")
@js.native
object TabAlignment extends js.Object {
  @js.native
  sealed trait bar extends TabAlignment
  
  @js.native
  sealed trait center extends TabAlignment
  
  @js.native
  sealed trait decimal extends TabAlignment
  
  @js.native
  sealed trait left extends TabAlignment
  
  @js.native
  sealed trait right extends TabAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TabAlignment with Double] = js.native
  /* 4 */ @js.native
  object bar extends TopLevel[bar with Double]
  
  /* 1 */ @js.native
  object center extends TopLevel[center with Double]
  
  /* 3 */ @js.native
  object decimal extends TopLevel[decimal with Double]
  
  /* 0 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* 2 */ @js.native
  object right extends TopLevel[right with Double]
  
}

