package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFolderPickOptions extends js.Object {
  /**
  		 * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
  		 */
  var ignoreFocusOut: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * An optional string to show as place holder in the input box to guide the user what to pick on.
  		 */
  var placeHolder: js.UndefOr[java.lang.String] = js.undefined
}

object WorkspaceFolderPickOptions {
  @scala.inline
  def apply(ignoreFocusOut: js.UndefOr[scala.Boolean] = js.undefined, placeHolder: java.lang.String = null): WorkspaceFolderPickOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreFocusOut)) __obj.updateDynamic("ignoreFocusOut")(ignoreFocusOut)
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder)
    __obj.asInstanceOf[WorkspaceFolderPickOptions]
  }
}

