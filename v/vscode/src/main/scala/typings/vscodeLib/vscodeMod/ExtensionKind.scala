package typings
package vscodeLib.vscodeMod

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
  sealed trait UI
    extends vscodeLib.vscodeMod.ExtensionKind
  
  /**
  		 * Extension runs where the remote extension host runs.
  		 */
  @js.native
  sealed trait Workspace
    extends vscodeLib.vscodeMod.ExtensionKind
  
  /* 1 */ val UI: UI with scala.Double = js.native
  /* 2 */ val Workspace: Workspace with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.ExtensionKind with scala.Double] = js.native
}

