package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionKind with Double] = js.native
  /* 1 */ @js.native
  object UI extends TopLevel[UI with Double]
  
  /* 2 */ @js.native
  object Workspace extends TopLevel[Workspace with Double]
  
}

