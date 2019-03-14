package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorViewColumnChangeEvent extends js.Object {
  /**
  		 * The [text editor](#TextEditor) for which the options have changed.
  		 */
  var textEditor: TextEditor
  /**
  		 * The new value for the [text editor's view column](#TextEditor.viewColumn).
  		 */
  var viewColumn: ViewColumn
}

object TextEditorViewColumnChangeEvent {
  @scala.inline
  def apply(textEditor: TextEditor, viewColumn: ViewColumn): TextEditorViewColumnChangeEvent = {
    val __obj = js.Dynamic.literal(textEditor = textEditor, viewColumn = viewColumn)
  
    __obj.asInstanceOf[TextEditorViewColumnChangeEvent]
  }
}

