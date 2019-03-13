package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickPickOptions extends js.Object {
  /**
  		 * An optional flag to make the picker accept multiple selections, if true the result is an array of picks.
  		 */
  var canPickMany: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
  		 */
  var ignoreFocusOut: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * An optional flag to include the description when filtering the picks.
  		 */
  var matchOnDescription: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * An optional flag to include the detail when filtering the picks.
  		 */
  var matchOnDetail: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * An optional function that is invoked whenever an item is selected.
  		 */
  var onDidSelectItem: js.UndefOr[js.Function1[/* item */ QuickPickItem | java.lang.String, _]] = js.undefined
  /**
  		 * An optional string to show as place holder in the input box to guide the user what to pick on.
  		 */
  var placeHolder: js.UndefOr[java.lang.String] = js.undefined
}

object QuickPickOptions {
  @scala.inline
  def apply(
    canPickMany: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreFocusOut: js.UndefOr[scala.Boolean] = js.undefined,
    matchOnDescription: js.UndefOr[scala.Boolean] = js.undefined,
    matchOnDetail: js.UndefOr[scala.Boolean] = js.undefined,
    onDidSelectItem: /* item */ QuickPickItem | java.lang.String => _ = null,
    placeHolder: java.lang.String = null
  ): QuickPickOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canPickMany)) __obj.updateDynamic("canPickMany")(canPickMany)
    if (!js.isUndefined(ignoreFocusOut)) __obj.updateDynamic("ignoreFocusOut")(ignoreFocusOut)
    if (!js.isUndefined(matchOnDescription)) __obj.updateDynamic("matchOnDescription")(matchOnDescription)
    if (!js.isUndefined(matchOnDetail)) __obj.updateDynamic("matchOnDetail")(matchOnDetail)
    if (onDidSelectItem != null) __obj.updateDynamic("onDidSelectItem")(js.Any.fromFunction1(onDidSelectItem))
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder)
    __obj.asInstanceOf[QuickPickOptions]
  }
}

