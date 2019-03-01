package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionContext extends js.Object {
  /**
    * The trigger character (a single character) that has trigger code complete.
    * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
    */
  var triggerCharacter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How the completion was triggered.
    */
  var triggerKind: CompletionTriggerKind
}

object CompletionContext {
  @scala.inline
  def apply(triggerKind: CompletionTriggerKind, triggerCharacter: java.lang.String = null): CompletionContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("triggerKind")(triggerKind)
    if (triggerCharacter != null) __obj.updateDynamic("triggerCharacter")(triggerCharacter)
    __obj.asInstanceOf[CompletionContext]
  }
}

