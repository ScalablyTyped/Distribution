package typings.vscode.anon

import typings.vscode.mod.ViewColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreserveFocus extends js.Object {
  var preserveFocus: js.UndefOr[Boolean] = js.undefined
  var viewColumn: ViewColumn
}

object PreserveFocus {
  @scala.inline
  def apply(viewColumn: ViewColumn, preserveFocus: js.UndefOr[Boolean] = js.undefined): PreserveFocus = {
    val __obj = js.Dynamic.literal(viewColumn = viewColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFocus)) __obj.updateDynamic("preserveFocus")(preserveFocus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveFocus]
  }
}

