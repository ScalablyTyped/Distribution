package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorOptionsChangeEvent extends js.Object {
  /**
  		 * The new value for the [text editor's options](#TextEditor.options).
  		 */
  val options: TextEditorOptions
  /**
  		 * The [text editor](#TextEditor) for which the options have changed.
  		 */
  val textEditor: TextEditor
}

object TextEditorOptionsChangeEvent {
  @scala.inline
  def apply(options: TextEditorOptions, textEditor: TextEditor): TextEditorOptionsChangeEvent = {
    val __obj = js.Dynamic.literal(options = options, textEditor = textEditor)
  
    __obj.asInstanceOf[TextEditorOptionsChangeEvent]
  }
}

