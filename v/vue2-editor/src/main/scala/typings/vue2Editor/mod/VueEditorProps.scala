package typings.vue2Editor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueEditorProps extends js.Object {
  var disabled: Boolean = js.native
  var editorOptions: js.Any = js.native
  var editorToolbar: js.Array[_] = js.native
  var id: String = js.native
  var placeholder: String = js.native
  var useCustomImageHandler: js.Any = js.native
  var useMarkdownShortcuts: Boolean = js.native
  var value: String = js.native
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
  @scala.inline
  implicit class VueEditorPropsOps[Self <: VueEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditorOptions(value: js.Any): Self = this.set("editorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditorToolbarVarargs(value: js.Any*): Self = this.set("editorToolbar", js.Array(value :_*))
    @scala.inline
    def setEditorToolbar(value: js.Array[_]): Self = this.set("editorToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseCustomImageHandler(value: js.Any): Self = this.set("useCustomImageHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseMarkdownShortcuts(value: Boolean): Self = this.set("useMarkdownShortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

