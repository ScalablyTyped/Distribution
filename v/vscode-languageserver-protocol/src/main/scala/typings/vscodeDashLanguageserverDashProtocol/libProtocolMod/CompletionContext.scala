package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionContext extends js.Object {
  /**
    * The trigger character (a single character) that has trigger code complete.
    * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
    */
  var triggerCharacter: js.UndefOr[String] = js.undefined
  /**
    * How the completion was triggered.
    */
  var triggerKind: CompletionTriggerKind
}

object CompletionContext {
  @scala.inline
  def apply(triggerKind: CompletionTriggerKind, triggerCharacter: String = null): CompletionContext = {
    val __obj = js.Dynamic.literal(triggerKind = triggerKind.asInstanceOf[js.Any])
    if (triggerCharacter != null) __obj.updateDynamic("triggerCharacter")(triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionContext]
  }
}

