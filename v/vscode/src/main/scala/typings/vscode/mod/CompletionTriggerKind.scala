package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionTriggerKind extends StObject
@JSImport("vscode", "CompletionTriggerKind")
@js.native
object CompletionTriggerKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionTriggerKind with Double] = js.native
  
  /**
    * Completion was triggered normally.
    */
  @js.native
  sealed trait Invoke extends CompletionTriggerKind
  /* 0 */ val Invoke: typings.vscode.mod.CompletionTriggerKind.Invoke with Double = js.native
  
  /**
    * Completion was triggered by a trigger character.
    */
  @js.native
  sealed trait TriggerCharacter extends CompletionTriggerKind
  /* 1 */ val TriggerCharacter: typings.vscode.mod.CompletionTriggerKind.TriggerCharacter with Double = js.native
  
  /**
    * Completion was re-triggered as current completion list is incomplete
    */
  @js.native
  sealed trait TriggerForIncompleteCompletions extends CompletionTriggerKind
  /* 2 */ val TriggerForIncompleteCompletions: typings.vscode.mod.CompletionTriggerKind.TriggerForIncompleteCompletions with Double = js.native
}
