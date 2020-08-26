package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.IdentiferNameHashTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionSession extends js.Object {
  var entries: IdentiferNameHashTable[CachedCompletionEntryDetails] = js.native
  var fileName: String = js.native
  var position: Double = js.native
}

object CompletionSession {
  @scala.inline
  def apply(entries: IdentiferNameHashTable[CachedCompletionEntryDetails], fileName: String, position: Double): CompletionSession = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionSession]
  }
  @scala.inline
  implicit class CompletionSessionOps[Self <: CompletionSession] (val x: Self) extends AnyVal {
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
    def setEntries(value: IdentiferNameHashTable[CachedCompletionEntryDetails]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

