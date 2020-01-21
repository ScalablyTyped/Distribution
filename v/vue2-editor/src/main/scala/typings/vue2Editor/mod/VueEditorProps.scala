package typings.vue2Editor.mod

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
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], editorOptions = editorOptions.asInstanceOf[js.Any], editorToolbar = editorToolbar.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], useCustomImageHandler = useCustomImageHandler.asInstanceOf[js.Any], useMarkdownShortcuts = useMarkdownShortcuts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VueEditorProps]
  }
}

