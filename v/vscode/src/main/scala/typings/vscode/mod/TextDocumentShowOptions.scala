package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentShowOptions extends js.Object {
  /**
  		 * An optional flag that when `true` will stop the [editor](#TextEditor) from taking focus.
  		 */
  var preserveFocus: js.UndefOr[Boolean] = js.undefined
  /**
  		 * An optional flag that controls if an [editor](#TextEditor)-tab will be replaced
  		 * with the next editor or if it will be kept.
  		 */
  var preview: js.UndefOr[Boolean] = js.undefined
  /**
  		 * An optional selection to apply for the document in the [editor](#TextEditor).
  		 */
  var selection: js.UndefOr[Range] = js.undefined
  /**
  		 * An optional view column in which the [editor](#TextEditor) should be shown.
  		 * The default is the [active](#ViewColumn.Active), other values are adjusted to
  		 * be `Min(column, columnCount + 1)`, the [active](#ViewColumn.Active)-column is
  		 * not adjusted. Use [`ViewColumn.Beside`](#ViewColumn.Beside) to open the
  		 * editor to the side of the currently active one.
  		 */
  var viewColumn: js.UndefOr[ViewColumn] = js.undefined
}

object TextDocumentShowOptions {
  @scala.inline
  def apply(
    preserveFocus: js.UndefOr[Boolean] = js.undefined,
    preview: js.UndefOr[Boolean] = js.undefined,
    selection: Range = null,
    viewColumn: ViewColumn = null
  ): TextDocumentShowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveFocus)) __obj.updateDynamic("preserveFocus")(preserveFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (viewColumn != null) __obj.updateDynamic("viewColumn")(viewColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentShowOptions]
  }
}

