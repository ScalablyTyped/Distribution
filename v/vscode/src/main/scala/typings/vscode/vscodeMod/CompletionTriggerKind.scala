package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionTriggerKind with Double] = js.native
  /* 0 */ @js.native
  object Invoke extends TopLevel[Invoke with Double]
  
  /* 1 */ @js.native
  object TriggerCharacter extends TopLevel[TriggerCharacter with Double]
  
  /* 2 */ @js.native
  object TriggerForIncompleteCompletions extends TopLevel[TriggerForIncompleteCompletions with Double]
  
}

