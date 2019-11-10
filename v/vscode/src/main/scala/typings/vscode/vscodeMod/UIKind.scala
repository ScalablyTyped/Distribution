package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UIKind extends js.Object

@JSImport("vscode", "UIKind")
@js.native
object UIKind extends js.Object {
  /**
  		 * Extensions are accessed from a desktop application.
  		 */
  @js.native
  sealed trait Desktop extends UIKind
  
  /**
  		 * Extensions are accessed from a web browser.
  		 */
  @js.native
  sealed trait Web extends UIKind
  
  /* 1 */ val Desktop: typings.vscode.vscodeMod.UIKind.Desktop with Double = js.native
  /* 2 */ val Web: typings.vscode.vscodeMod.UIKind.Web with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UIKind with Double] = js.native
}

