package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionKind extends js.Object

@JSImport("vscode", "ExtensionKind")
@js.native
object ExtensionKind extends js.Object {
  /**
  		 * Extension runs where the UI runs.
  		 */
  @js.native
  sealed trait UI extends ExtensionKind
  
  /**
  		 * Extension runs where the remote extension host runs.
  		 */
  @js.native
  sealed trait Workspace extends ExtensionKind
  
  /* 1 */ val UI: typings.vscode.vscodeMod.ExtensionKind.UI with Double = js.native
  /* 2 */ val Workspace: typings.vscode.vscodeMod.ExtensionKind.Workspace with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionKind with Double] = js.native
}

