package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentHighlightKind extends js.Object

@JSImport("vscode", "DocumentHighlightKind")
@js.native
object DocumentHighlightKind extends js.Object {
  /**
  		 * Read-access of a symbol, like reading a variable.
  		 */
  @js.native
  sealed trait Read extends DocumentHighlightKind
  
  /**
  		 * A textual occurrence.
  		 */
  @js.native
  sealed trait Text extends DocumentHighlightKind
  
  /**
  		 * Write-access of a symbol, like writing to a variable.
  		 */
  @js.native
  sealed trait Write extends DocumentHighlightKind
  
  /* 1 */ val Read: typings.vscode.vscodeMod.DocumentHighlightKind.Read with Double = js.native
  /* 0 */ val Text: typings.vscode.vscodeMod.DocumentHighlightKind.Text with Double = js.native
  /* 2 */ val Write: typings.vscode.vscodeMod.DocumentHighlightKind.Write with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentHighlightKind with Double] = js.native
}

