package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PreserveFocus extends js.Object {
  var preserveFocus: js.UndefOr[scala.Boolean] = js.undefined
  var viewColumn: vscodeLib.vscodeMod.ViewColumn
}

object Anon_PreserveFocus {
  @scala.inline
  def apply(
    viewColumn: vscodeLib.vscodeMod.ViewColumn,
    preserveFocus: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_PreserveFocus = {
    val __obj = js.Dynamic.literal(viewColumn = viewColumn)
    if (!js.isUndefined(preserveFocus)) __obj.updateDynamic("preserveFocus")(preserveFocus)
    __obj.asInstanceOf[Anon_PreserveFocus]
  }
}

