package typings
package winrtDashUwpLib.WindowsNs.UINs.StartScreenNs

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
  sealed trait arguments
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.JumpListItemKind
  
  /** Indicates a jump list item that is an inert separator within a custom jump list item group. */
  @js.native
  sealed trait separator
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.JumpListItemKind
  
  val arguments: arguments with java.lang.String = js.native
  val separator: separator with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.JumpListItemKind with java.lang.String
  ] = js.native
}

