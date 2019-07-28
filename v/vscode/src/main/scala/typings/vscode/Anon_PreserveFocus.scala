package typings.vscode

import typings.vscode.vscodeMod.ViewColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PreserveFocus extends js.Object {
  var preserveFocus: js.UndefOr[Boolean] = js.undefined
  var viewColumn: ViewColumn
}

object Anon_PreserveFocus {
  @scala.inline
  def apply(viewColumn: ViewColumn, preserveFocus: js.UndefOr[Boolean] = js.undefined): Anon_PreserveFocus = {
    val __obj = js.Dynamic.literal(viewColumn = viewColumn)
    if (!js.isUndefined(preserveFocus)) __obj.updateDynamic("preserveFocus")(preserveFocus)
    __obj.asInstanceOf[Anon_PreserveFocus]
  }
}

