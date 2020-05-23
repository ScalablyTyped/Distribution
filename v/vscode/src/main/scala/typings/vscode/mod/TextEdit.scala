package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "TextEdit")
@js.native
class TextEdit protected () extends js.Object {
  /**
    * Create a new TextEdit.
    *
    * @param range A range.
    * @param newText A string.
    */
  def this(range: Range, newText: String) = this()
  /**
    * The eol-sequence used in the document.
    *
    * *Note* that the eol-sequence will be applied to the
    * whole document.
    */
  var newEol: js.UndefOr[EndOfLine] = js.native
  /**
    * The string this edit will insert.
    */
  var newText: String = js.native
  /**
    * The range this edit applies to.
    */
  var range: Range = js.native
}

/* static members */
@JSImport("vscode", "TextEdit")
@js.native
object TextEdit extends js.Object {
  /**
    * Utility to create a delete edit.
    *
    * @param range A range.
    * @return A new text edit object.
    */
  def delete(range: Range): TextEdit = js.native
  /**
    * Utility to create an insert edit.
    *
    * @param position A position, will become an empty range.
    * @param newText A string.
    * @return A new text edit object.
    */
  def insert(position: Position, newText: String): TextEdit = js.native
  /**
    * Utility to create a replace edit.
    *
    * @param range A range.
    * @param newText A string.
    * @return A new text edit object.
    */
  def replace(range: Range, newText: String): TextEdit = js.native
  /**
    * Utility to create an eol-edit.
    *
    * @param eol An eol-sequence
    * @return A new text edit object.
    */
  def setEndOfLine(eol: EndOfLine): TextEdit = js.native
}

