package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InlineCompletionTriggerKind extends StObject
@JSImport("vscode", "InlineCompletionTriggerKind")
@js.native
object InlineCompletionTriggerKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InlineCompletionTriggerKind & Double] = js.native
  
  /**
    * Completion was triggered automatically while editing.
    * It is sufficient to return a single completion item in this case.
    */
  @js.native
  sealed trait Automatic
    extends StObject
       with InlineCompletionTriggerKind
  /* 1 */ val Automatic: typings.vscode.mod.InlineCompletionTriggerKind.Automatic & Double = js.native
  
  /**
    * Completion was triggered explicitly by a user gesture.
    * Return multiple completion items to enable cycling through them.
    */
  @js.native
  sealed trait Invoke
    extends StObject
       with InlineCompletionTriggerKind
  /* 0 */ val Invoke: typings.vscode.mod.InlineCompletionTriggerKind.Invoke & Double = js.native
}
