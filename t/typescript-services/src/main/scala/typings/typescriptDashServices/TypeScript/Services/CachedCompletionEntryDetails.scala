package typings.typescriptDashServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachedCompletionEntryDetails extends CompletionEntryDetails {
  def isResolved(): Boolean
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
    val __obj = js.Dynamic.literal(docComment = docComment, fullSymbolName = fullSymbolName, isResolved = js.Any.fromFunction0(isResolved), kind = kind, kindModifiers = kindModifiers, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CachedCompletionEntryDetails]
  }
}

