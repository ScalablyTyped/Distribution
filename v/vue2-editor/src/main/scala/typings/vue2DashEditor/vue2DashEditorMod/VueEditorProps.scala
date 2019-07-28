package typings.vue2DashEditor.vue2DashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueEditorProps extends js.Object {
  var disabled: Boolean
  var editorOptions: js.Any
  var editorToolbar: js.Array[_]
  var id: String
  var placeholder: String
  var useCustomImageHandler: js.Any
  var useMarkdownShortcuts: Boolean
  var value: String
}

object VueEditorProps {
  @scala.inline
  def apply(
    disabled: Boolean,
    editorOptions: js.Any,
    editorToolbar: js.Array[_],
    id: String,
    placeholder: String,
    useCustomImageHandler: js.Any,
    useMarkdownShortcuts: Boolean,
    value: String
  ): VueEditorProps = {
    val __obj = js.Dynamic.literal(disabled = disabled, editorOptions = editorOptions, editorToolbar = editorToolbar, id = id, placeholder = placeholder, useCustomImageHandler = useCustomImageHandler, useMarkdownShortcuts = useMarkdownShortcuts, value = value)
  
    __obj.asInstanceOf[VueEditorProps]
  }
}

