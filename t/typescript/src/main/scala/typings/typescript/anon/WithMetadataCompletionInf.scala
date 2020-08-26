package typings.typescript.anon

import typings.typescript.mod.CompletionEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined typescript.typescript.WithMetadata<typescript.typescript.CompletionInfo> */
@js.native
trait WithMetadataCompletionInf extends js.Object {
  var entries: js.Array[CompletionEntry] = js.native
  /** Not true for all global completions. This will be true if the enclosing scope matches a few syntax kinds. See `isSnippetScope`. */
  var isGlobalCompletion: Boolean = js.native
  var isMemberCompletion: Boolean = js.native
  /**
    * true when the current location also allows for a new identifier
    */
  var isNewIdentifierLocation: Boolean = js.native
  var metadata: js.UndefOr[js.Any] = js.native
}

object WithMetadataCompletionInf {
  @scala.inline
  def apply(
    entries: js.Array[CompletionEntry],
    isGlobalCompletion: Boolean,
    isMemberCompletion: Boolean,
    isNewIdentifierLocation: Boolean
  ): WithMetadataCompletionInf = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], isGlobalCompletion = isGlobalCompletion.asInstanceOf[js.Any], isMemberCompletion = isMemberCompletion.asInstanceOf[js.Any], isNewIdentifierLocation = isNewIdentifierLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithMetadataCompletionInf]
  }
  @scala.inline
  implicit class WithMetadataCompletionInfOps[Self <: WithMetadataCompletionInf] (val x: Self) extends AnyVal {
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
    def setIsGlobalCompletion(value: Boolean): Self = this.set("isGlobalCompletion", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMemberCompletion(value: Boolean): Self = this.set("isMemberCompletion", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNewIdentifierLocation(value: Boolean): Self = this.set("isNewIdentifierLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

