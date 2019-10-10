package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolTag extends js.Object

@JSImport("vscode", "SymbolTag")
@js.native
object SymbolTag extends js.Object {
  /**
  		 * Render a symbol as obsolete, usually using a strike-out.
  		 */
  @js.native
  sealed trait Deprecated extends SymbolTag
  
  /* 1 */ val Deprecated: typings.vscode.vscodeMod.SymbolTag.Deprecated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolTag with Double] = js.native
}

