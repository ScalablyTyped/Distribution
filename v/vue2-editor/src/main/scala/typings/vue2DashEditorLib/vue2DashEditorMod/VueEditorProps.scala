package typings
package vue2DashEditorLib.vue2DashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueEditorProps extends js.Object {
  var disabled: scala.Boolean
  var editorOptions: js.Any
  var editorToolbar: js.Array[_]
  var id: java.lang.String
  var placeholder: java.lang.String
  var useCustomImageHandler: js.Any
  var useMarkdownShortcuts: scala.Boolean
  var value: java.lang.String
}

object VueEditorProps {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    editorOptions: js.Any,
    editorToolbar: js.Array[_],
    id: java.lang.String,
    placeholder: java.lang.String,
    useCustomImageHandler: js.Any,
    useMarkdownShortcuts: scala.Boolean,
    value: java.lang.String
  ): VueEditorProps = {
    val __obj = js.Dynamic.literal(disabled = disabled, editorOptions = editorOptions, editorToolbar = editorToolbar, id = id, placeholder = placeholder, useCustomImageHandler = useCustomImageHandler, useMarkdownShortcuts = useMarkdownShortcuts, value = value)
  
    __obj.asInstanceOf[VueEditorProps]
  }
}

