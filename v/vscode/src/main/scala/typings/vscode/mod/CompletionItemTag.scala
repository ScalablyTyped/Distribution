package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionItemTag extends js.Object
@JSImport("vscode", "CompletionItemTag")
@js.native
object CompletionItemTag extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionItemTag with Double] = js.native
  
  /**
    * Render a completion as obsolete, usually using a strike-out.
    */
  @js.native
  sealed trait Deprecated extends CompletionItemTag
  /* 1 */ @js.native
  object Deprecated extends TopLevel[Deprecated with Double]
}
