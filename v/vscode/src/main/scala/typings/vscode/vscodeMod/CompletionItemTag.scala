package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
import typings.vscode.vscodeMod.CompletionItemTag.Deprecated
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionItemTag with Double] = js.native
  /* 1 */ @js.native
  object Deprecated extends TopLevel[Deprecated with Double]
  
}

