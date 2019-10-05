package typings.typescriptDashServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionEntryDetails extends js.Object {
  var docComment: String
  var fullSymbolName: String
  var kind: String
  var kindModifiers: String
  var name: String
  var `type`: String
}

object CompletionEntryDetails {
  @scala.inline
  def apply(
    docComment: String,
    fullSymbolName: String,
    kind: String,
    kindModifiers: String,
    name: String,
    `type`: String
  ): CompletionEntryDetails = {
    val __obj = js.Dynamic.literal(docComment = docComment, fullSymbolName = fullSymbolName, kind = kind, kindModifiers = kindModifiers, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CompletionEntryDetails]
  }
}

