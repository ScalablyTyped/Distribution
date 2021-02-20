package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionKind extends StObject
@JSImport("vscode", "ExtensionKind")
@js.native
object ExtensionKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionKind with Double] = js.native
  
  /**
    * Extension runs where the UI runs.
    */
  @js.native
  sealed trait UI extends ExtensionKind
  /* 1 */ val UI: typings.vscode.mod.ExtensionKind.UI with Double = js.native
  
  /**
    * Extension runs where the remote extension host runs.
    */
  @js.native
  sealed trait Workspace extends ExtensionKind
  /* 2 */ val Workspace: typings.vscode.mod.ExtensionKind.Workspace with Double = js.native
}
