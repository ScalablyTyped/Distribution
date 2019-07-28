package typings.vscode

import typings.vscode.vscodeMod.Range
import typings.vscode.vscodeMod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Document extends js.Object {
  var document: TextDocument
  var range: Range
}

object Anon_Document {
  @scala.inline
  def apply(document: TextDocument, range: Range): Anon_Document = {
    val __obj = js.Dynamic.literal(document = document, range = range)
  
    __obj.asInstanceOf[Anon_Document]
  }
}

