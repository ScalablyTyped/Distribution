package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureHelpOptions extends WorkDoneProgressOptions {
  /**
    * List of characters that re-trigger signature help.
    *
    * These trigger characters are only active when signature help is already showing. All trigger characters
    * are also counted as re-trigger characters.
    *
    * @since 3.15.0
    */
  var retriggerCharacters: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of characters that trigger signature help.
    */
  var triggerCharacters: js.UndefOr[js.Array[String]] = js.native
}

object SignatureHelpOptions {
  @scala.inline
  def apply(): SignatureHelpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureHelpOptions]
  }
  @scala.inline
  implicit class SignatureHelpOptionsOps[Self <: SignatureHelpOptions] (val x: Self) extends AnyVal {
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
    def setRetriggerCharactersVarargs(value: String*): Self = this.set("retriggerCharacters", js.Array(value :_*))
    @scala.inline
    def setRetriggerCharacters(value: js.Array[String]): Self = this.set("retriggerCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetriggerCharacters: Self = this.set("retriggerCharacters", js.undefined)
    @scala.inline
    def setTriggerCharactersVarargs(value: String*): Self = this.set("triggerCharacters", js.Array(value :_*))
    @scala.inline
    def setTriggerCharacters(value: js.Array[String]): Self = this.set("triggerCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerCharacters: Self = this.set("triggerCharacters", js.undefined)
  }
  
}

