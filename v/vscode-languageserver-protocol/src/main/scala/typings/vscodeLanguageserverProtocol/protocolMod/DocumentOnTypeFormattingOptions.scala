package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentOnTypeFormattingOptions extends js.Object {
  /**
    * A character on which formatting should be triggered, like `}`.
    */
  var firstTriggerCharacter: String = js.native
  /**
    * More trigger characters.
    */
  var moreTriggerCharacter: js.UndefOr[js.Array[String]] = js.native
}

object DocumentOnTypeFormattingOptions {
  @scala.inline
  def apply(firstTriggerCharacter: String): DocumentOnTypeFormattingOptions = {
    val __obj = js.Dynamic.literal(firstTriggerCharacter = firstTriggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOnTypeFormattingOptions]
  }
  @scala.inline
  implicit class DocumentOnTypeFormattingOptionsOps[Self <: DocumentOnTypeFormattingOptions] (val x: Self) extends AnyVal {
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
    def setFirstTriggerCharacter(value: String): Self = this.set("firstTriggerCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoreTriggerCharacterVarargs(value: String*): Self = this.set("moreTriggerCharacter", js.Array(value :_*))
    @scala.inline
    def setMoreTriggerCharacter(value: js.Array[String]): Self = this.set("moreTriggerCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoreTriggerCharacter: Self = this.set("moreTriggerCharacter", js.undefined)
  }
  
}

