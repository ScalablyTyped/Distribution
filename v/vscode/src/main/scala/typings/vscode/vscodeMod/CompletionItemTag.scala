package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompletionItemTag extends js.Object

@JSImport("vscode", "CompletionItemTag")
@js.native
object CompletionItemTag extends js.Object {
  /**
  		 * Render a completion as obsolete, usually using a strike-out.
  		 */
  @js.native
  sealed trait Deprecated extends CompletionItemTag
  
  /* 1 */ val Deprecated: typings.vscode.vscodeMod.CompletionItemTag.Deprecated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionItemTag with Double] = js.native
}

