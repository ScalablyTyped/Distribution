package typings.vscode

import typings.vscode.mod.ViewColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreserveFocus extends js.Object {
  var preserveFocus: js.UndefOr[Boolean] = js.undefined
  var viewColumn: ViewColumn
}

object AnonPreserveFocus {
  @scala.inline
  def apply(viewColumn: ViewColumn, preserveFocus: js.UndefOr[Boolean] = js.undefined): AnonPreserveFocus = {
    val __obj = js.Dynamic.literal(viewColumn = viewColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFocus)) __obj.updateDynamic("preserveFocus")(preserveFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreserveFocus]
  }
}

