package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEdit extends js.Object {
  /**
    * The string to be inserted. For delete operations use an
    * empty string.
    */
  var newText: String
  /**
    * The range of the text document to be manipulated. To insert
    * text into a document create a range where start === end.
    */
  var range: Range
}

@JSImport("vscode-languageserver-types", "TextEdit")
@js.native
object TextEdit extends js.Object {
  /**
    * Creates a delete text edit.
    * @param range The range of text to be deleted.
    */
  def del(range: Range): TextEdit = js.native
  /**
    * Creates a insert text edit.
    * @param position The position to insert the text at.
    * @param newText The text to be inserted.
    */
  def insert(position: Position, newText: String): TextEdit = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextEdit */ Boolean = js.native
  /**
    * Creates a replace text edit.
    * @param range The range of text to be replaced.
    * @param newText The new text.
    */
  def replace(range: Range, newText: String): TextEdit = js.native
}

