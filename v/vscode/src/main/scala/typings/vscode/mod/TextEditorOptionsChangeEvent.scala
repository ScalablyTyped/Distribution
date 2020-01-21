package typings.vscode.mod

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
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], textEditor = textEditor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextEditorOptionsChangeEvent]
  }
}

