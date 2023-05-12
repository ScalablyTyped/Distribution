package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionKind extends StObject
@JSImport("vscode", "ExtensionKind")
@js.native
object ExtensionKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionKind & Double] = js.native
  
  /**
  		 * Extension runs where the UI runs.
  		 */
  @js.native
  sealed trait UI
    extends StObject
       with ExtensionKind
  /* 1 */ val UI: typings.vscode.mod.ExtensionKind.UI & Double = js.native
  
  /**
  		 * Extension runs where the remote extension host runs.
  		 */
  @js.native
  sealed trait Workspace
    extends StObject
       with ExtensionKind
  /* 2 */ val Workspace: typings.vscode.mod.ExtensionKind.Workspace & Double = js.native
}
