package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachedCompletionEntryDetails extends CompletionEntryDetails {
  def isResolved(): Boolean = js.native
}

object CachedCompletionEntryDetails {
  @scala.inline
  def apply(
    docComment: String,
    fullSymbolName: String,
    isResolved: () => Boolean,
    kind: String,
    kindModifiers: String,
    name: String,
    `type`: String
  ): CachedCompletionEntryDetails = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], fullSymbolName = fullSymbolName.asInstanceOf[js.Any], isResolved = js.Any.fromFunction0(isResolved), kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedCompletionEntryDetails]
  }
  @scala.inline
  implicit class CachedCompletionEntryDetailsOps[Self <: CachedCompletionEntryDetails] (val x: Self) extends AnyVal {
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
    def setIsResolved(value: () => Boolean): Self = this.set("isResolved", js.Any.fromFunction0(value))
  }
  
}

