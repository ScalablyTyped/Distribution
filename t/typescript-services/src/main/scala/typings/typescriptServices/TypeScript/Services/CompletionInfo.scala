package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionInfo extends js.Object {
  var entries: js.Array[CompletionEntry] = js.native
  var isMemberCompletion: Boolean = js.native
  var maybeInaccurate: Boolean = js.native
}

object CompletionInfo {
  @scala.inline
  def apply(entries: js.Array[CompletionEntry], isMemberCompletion: Boolean, maybeInaccurate: Boolean): CompletionInfo = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], isMemberCompletion = isMemberCompletion.asInstanceOf[js.Any], maybeInaccurate = maybeInaccurate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionInfo]
  }
  @scala.inline
  implicit class CompletionInfoOps[Self <: CompletionInfo] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: CompletionEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[CompletionEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMemberCompletion(value: Boolean): Self = this.set("isMemberCompletion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaybeInaccurate(value: Boolean): Self = this.set("maybeInaccurate", value.asInstanceOf[js.Any])
  }
  
}

