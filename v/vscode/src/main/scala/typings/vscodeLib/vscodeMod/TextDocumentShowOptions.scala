package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentShowOptions extends js.Object {
  /**
  		 * An optional flag that when `true` will stop the [editor](#TextEditor) from taking focus.
  		 */
  var preserveFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * An optional flag that controls if an [editor](#TextEditor)-tab will be replaced
  		 * with the next editor or if it will be kept.
  		 */
  var preview: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * An optional selection to apply for the document in the [editor](#TextEditor).
  		 */
  var selection: js.UndefOr[Range] = js.undefined
  /**
  		 * An optional view column in which the [editor](#TextEditor) should be shown.
  		 * The default is the [one](#ViewColumn.One), other values are adjusted to
  		 * be __Min(column, columnCount + 1)__.
  		 */
  var viewColumn: js.UndefOr[ViewColumn] = js.undefined
}

object TextDocumentShowOptions {
  @scala.inline
  def apply(
    preserveFocus: js.UndefOr[scala.Boolean] = js.undefined,
    preview: js.UndefOr[scala.Boolean] = js.undefined,
    selection: Range = null,
    viewColumn: ViewColumn = null
  ): TextDocumentShowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveFocus)) __obj.updateDynamic("preserveFocus")(preserveFocus)
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (viewColumn != null) __obj.updateDynamic("viewColumn")(viewColumn)
    __obj.asInstanceOf[TextDocumentShowOptions]
  }
}

