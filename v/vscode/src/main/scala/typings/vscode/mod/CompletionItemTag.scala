package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionItemTag extends StObject
@JSImport("vscode", "CompletionItemTag")
@js.native
object CompletionItemTag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionItemTag with Double] = js.native
  
  /**
    * Render a completion as obsolete, usually using a strike-out.
    */
  @js.native
  sealed trait Deprecated extends CompletionItemTag
  /* 1 */ val Deprecated: typings.vscode.mod.CompletionItemTag.Deprecated with Double = js.native
}
