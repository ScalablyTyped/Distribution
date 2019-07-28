package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompletionTriggerKind extends js.Object

@JSImport("vscode", "CompletionTriggerKind")
@js.native
object CompletionTriggerKind extends js.Object {
  /**
  		 * Completion was triggered normally.
  		 */
  @js.native
  sealed trait Invoke extends CompletionTriggerKind
  
  /**
  		 * Completion was triggered by a trigger character.
  		 */
  @js.native
  sealed trait TriggerCharacter extends CompletionTriggerKind
  
  /**
  		 * Completion was re-triggered as current completion list is incomplete
  		 */
  @js.native
  sealed trait TriggerForIncompleteCompletions extends CompletionTriggerKind
  
  /* 0 */ val Invoke: typings.vscode.vscodeMod.CompletionTriggerKind.Invoke with Double = js.native
  /* 1 */ val TriggerCharacter: typings.vscode.vscodeMod.CompletionTriggerKind.TriggerCharacter with Double = js.native
  /* 2 */ val TriggerForIncompleteCompletions: typings.vscode.vscodeMod.CompletionTriggerKind.TriggerForIncompleteCompletions with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionTriggerKind with Double] = js.native
}

