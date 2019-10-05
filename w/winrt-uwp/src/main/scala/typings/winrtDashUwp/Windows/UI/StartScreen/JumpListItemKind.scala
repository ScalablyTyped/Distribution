package typings.winrtDashUwp.Windows.UI.StartScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JumpListItemKind extends js.Object

/** Specifies the kind of jump list item. */
@JSGlobal("Windows.UI.StartScreen.JumpListItemKind")
@js.native
object JumpListItemKind extends js.Object {
  /** Indicates a jump list item that includes arguments. */
  @js.native
  sealed trait arguments extends JumpListItemKind
  
  /** Indicates a jump list item that is an inert separator within a custom jump list item group. */
  @js.native
  sealed trait separator extends JumpListItemKind
  
  /* 0 */ val arguments: typings.winrtDashUwp.Windows.UI.StartScreen.JumpListItemKind.arguments with Double = js.native
  /* 1 */ val separator: typings.winrtDashUwp.Windows.UI.StartScreen.JumpListItemKind.separator with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JumpListItemKind with Double] = js.native
}

