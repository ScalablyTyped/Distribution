package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionEntryDetails extends js.Object {
  var docComment: String = js.native
  var fullSymbolName: String = js.native
  var kind: String = js.native
  var kindModifiers: String = js.native
  var name: String = js.native
  var `type`: String = js.native
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
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], fullSymbolName = fullSymbolName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionEntryDetails]
  }
  @scala.inline
  implicit class CompletionEntryDetailsOps[Self <: CompletionEntryDetails] (val x: Self) extends AnyVal {
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
    def setDocComment(value: String): Self = this.set("docComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullSymbolName(value: String): Self = this.set("fullSymbolName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setKindModifiers(value: String): Self = this.set("kindModifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

