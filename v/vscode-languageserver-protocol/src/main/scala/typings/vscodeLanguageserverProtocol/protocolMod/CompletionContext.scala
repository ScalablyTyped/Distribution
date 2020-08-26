package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionContext extends js.Object {
  /**
    * The trigger character (a single character) that has trigger code complete.
    * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
    */
  var triggerCharacter: js.UndefOr[String] = js.native
  /**
    * How the completion was triggered.
    */
  var triggerKind: CompletionTriggerKind = js.native
}

object CompletionContext {
  @scala.inline
  def apply(triggerKind: CompletionTriggerKind): CompletionContext = {
    val __obj = js.Dynamic.literal(triggerKind = triggerKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionContext]
  }
  @scala.inline
  implicit class CompletionContextOps[Self <: CompletionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTriggerKind(value: CompletionTriggerKind): Self = this.set("triggerKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerCharacter(value: String): Self = this.set("triggerCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerCharacter: Self = this.set("triggerCharacter", js.undefined)
  }
  
}

