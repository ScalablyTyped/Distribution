package typings
package vscodeLib.vscodeMod

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
  sealed trait Invoke
    extends vscodeLib.vscodeMod.CompletionTriggerKind
  
  /**
  		 * Completion was triggered by a trigger character.
  		 */
  @js.native
  sealed trait TriggerCharacter
    extends vscodeLib.vscodeMod.CompletionTriggerKind
  
  /**
  		 * Completion was re-triggered as current completion list is incomplete
  		 */
  @js.native
  sealed trait TriggerForIncompleteCompletions
    extends vscodeLib.vscodeMod.CompletionTriggerKind
  
  /* 0 */ val Invoke: Invoke with scala.Double = js.native
  /* 1 */ val TriggerCharacter: TriggerCharacter with scala.Double = js.native
  /* 2 */ val TriggerForIncompleteCompletions: TriggerForIncompleteCompletions with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.CompletionTriggerKind with scala.Double] = js.native
}

