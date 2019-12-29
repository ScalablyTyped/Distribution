package typings.winrtDashUwp.Windows.UI.StartScreen

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JumpListItemKind with Double] = js.native
  /* 0 */ @js.native
  object arguments extends TopLevel[arguments with Double]
  
  /* 1 */ @js.native
  object separator extends TopLevel[separator with Double]
  
}

