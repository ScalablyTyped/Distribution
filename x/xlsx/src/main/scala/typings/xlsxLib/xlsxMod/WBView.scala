package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WBView extends js.Object {
  /** Right-to-left mode */
  var RTL: js.UndefOr[scala.Boolean] = js.undefined
}

object WBView {
  @scala.inline
  def apply(RTL: js.UndefOr[scala.Boolean] = js.undefined): WBView = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(RTL)) __obj.updateDynamic("RTL")(RTL)
    __obj.asInstanceOf[WBView]
  }
}

