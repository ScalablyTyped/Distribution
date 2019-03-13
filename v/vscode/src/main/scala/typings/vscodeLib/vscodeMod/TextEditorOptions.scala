package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorOptions extends js.Object {
  /**
  		 * The rendering style of the cursor in this editor.
  		 * When getting a text editor's options, this property will always be present.
  		 * When setting a text editor's options, this property is optional.
  		 */
  var cursorStyle: js.UndefOr[TextEditorCursorStyle] = js.undefined
  /**
  		 * When pressing Tab insert [n](#TextEditorOptions.tabSize) spaces.
  		 * When getting a text editor's options, this property will always be a boolean (resolved).
  		 * When setting a text editor's options, this property is optional and it can be a boolean or `"auto"`.
  		 */
  var insertSpaces: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
  		 * Render relative line numbers w.r.t. the current line number.
  		 * When getting a text editor's options, this property will always be present.
  		 * When setting a text editor's options, this property is optional.
  		 */
  var lineNumbers: js.UndefOr[TextEditorLineNumbersStyle] = js.undefined
  /**
  		 * The size in spaces a tab takes. This is used for two purposes:
  		 *  - the rendering width of a tab character;
  		 *  - the number of spaces to insert when [insertSpaces](#TextEditorOptions.insertSpaces) is true.
  		 *
  		 * When getting a text editor's options, this property will always be a number (resolved).
  		 * When setting a text editor's options, this property is optional and it can be a number or `"auto"`.
  		 */
  var tabSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object TextEditorOptions {
  @scala.inline
  def apply(
    cursorStyle: TextEditorCursorStyle = null,
    insertSpaces: scala.Boolean | java.lang.String = null,
    lineNumbers: TextEditorLineNumbersStyle = null,
    tabSize: scala.Double | java.lang.String = null
  ): TextEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle)
    if (insertSpaces != null) __obj.updateDynamic("insertSpaces")(insertSpaces.asInstanceOf[js.Any])
    if (lineNumbers != null) __obj.updateDynamic("lineNumbers")(lineNumbers)
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorOptions]
  }
}

