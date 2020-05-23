package typings.vscode.anon

import typings.vscode.mod.Range
import typings.vscode.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var document: TextDocument
  var range: Range
}

object Document {
  @scala.inline
  def apply(document: TextDocument, range: Range): Document = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

