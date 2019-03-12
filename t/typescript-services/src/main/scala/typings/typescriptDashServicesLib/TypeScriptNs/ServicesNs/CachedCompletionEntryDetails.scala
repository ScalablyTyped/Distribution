package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachedCompletionEntryDetails extends CompletionEntryDetails {
  def isResolved(): scala.Boolean
}

object CachedCompletionEntryDetails {
  @scala.inline
  def apply(
    docComment: java.lang.String,
    fullSymbolName: java.lang.String,
    isResolved: () => scala.Boolean,
    kind: java.lang.String,
    kindModifiers: java.lang.String,
    name: java.lang.String,
    `type`: java.lang.String
  ): CachedCompletionEntryDetails = {
    val __obj = js.Dynamic.literal(docComment = docComment, fullSymbolName = fullSymbolName, isResolved = js.Any.fromFunction0(isResolved), kind = kind, kindModifiers = kindModifiers, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CachedCompletionEntryDetails]
  }
}

