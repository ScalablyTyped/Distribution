package typings.winrt.Windows.UI.Popups

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Placement extends js.Object

@JSGlobal("Windows.UI.Popups.Placement")
@js.native
object Placement extends js.Object {
  @js.native
  sealed trait above extends Placement
  
  @js.native
  sealed trait below extends Placement
  
  @js.native
  sealed trait default extends Placement
  
  @js.native
  sealed trait left extends Placement
  
  @js.native
  sealed trait right extends Placement
  
  /* 1 */ val above: typings.winrt.Windows.UI.Popups.Placement.above with Double = js.native
  /* 2 */ val below: typings.winrt.Windows.UI.Popups.Placement.below with Double = js.native
  /* 0 */ val default: typings.winrt.Windows.UI.Popups.Placement.default with Double = js.native
  /* 3 */ val left: typings.winrt.Windows.UI.Popups.Placement.left with Double = js.native
  /* 4 */ val right: typings.winrt.Windows.UI.Popups.Placement.right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Placement with Double] = js.native
}

