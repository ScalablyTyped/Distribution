package typings
package vscodeLib.vscodeMod

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
  sealed trait Read
    extends vscodeLib.vscodeMod.DocumentHighlightKind
  
  /**
  		 * A textual occurrence.
  		 */
  @js.native
  sealed trait Text
    extends vscodeLib.vscodeMod.DocumentHighlightKind
  
  /**
  		 * Write-access of a symbol, like writing to a variable.
  		 */
  @js.native
  sealed trait Write
    extends vscodeLib.vscodeMod.DocumentHighlightKind
  
  /* 1 */ val Read: Read with scala.Double = js.native
  /* 0 */ val Text: Text with scala.Double = js.native
  /* 2 */ val Write: Write with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.DocumentHighlightKind with scala.Double] = js.native
}

