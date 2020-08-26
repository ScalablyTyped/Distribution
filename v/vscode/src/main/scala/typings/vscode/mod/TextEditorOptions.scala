package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditorOptions extends js.Object {
  /**
    * The rendering style of the cursor in this editor.
    * When getting a text editor's options, this property will always be present.
    * When setting a text editor's options, this property is optional.
    */
  var cursorStyle: js.UndefOr[TextEditorCursorStyle] = js.native
  /**
    * When pressing Tab insert [n](#TextEditorOptions.tabSize) spaces.
    * When getting a text editor's options, this property will always be a boolean (resolved).
    * When setting a text editor's options, this property is optional and it can be a boolean or `"auto"`.
    */
  var insertSpaces: js.UndefOr[Boolean | String] = js.native
  /**
    * Render relative line numbers w.r.t. the current line number.
    * When getting a text editor's options, this property will always be present.
    * When setting a text editor's options, this property is optional.
    */
  var lineNumbers: js.UndefOr[TextEditorLineNumbersStyle] = js.native
  /**
    * The size in spaces a tab takes. This is used for two purposes:
    *  - the rendering width of a tab character;
    *  - the number of spaces to insert when [insertSpaces](#TextEditorOptions.insertSpaces) is true.
    *
    * When getting a text editor's options, this property will always be a number (resolved).
    * When setting a text editor's options, this property is optional and it can be a number or `"auto"`.
    */
  var tabSize: js.UndefOr[Double | String] = js.native
}

object TextEditorOptions {
  @scala.inline
  def apply(): TextEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEditorOptions]
  }
  @scala.inline
  implicit class TextEditorOptionsOps[Self <: TextEditorOptions] (val x: Self) extends AnyVal {
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
    def setCursorStyle(value: TextEditorCursorStyle): Self = this.set("cursorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorStyle: Self = this.set("cursorStyle", js.undefined)
    @scala.inline
    def setInsertSpaces(value: Boolean | String): Self = this.set("insertSpaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertSpaces: Self = this.set("insertSpaces", js.undefined)
    @scala.inline
    def setLineNumbers(value: TextEditorLineNumbersStyle): Self = this.set("lineNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumbers: Self = this.set("lineNumbers", js.undefined)
    @scala.inline
    def setTabSize(value: Double | String): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
  }
  
}

