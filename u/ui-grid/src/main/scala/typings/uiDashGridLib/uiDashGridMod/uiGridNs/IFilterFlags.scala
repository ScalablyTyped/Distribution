package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterFlags extends js.Object {
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
}

object IFilterFlags {
  @scala.inline
  def apply(caseSensitive: js.UndefOr[scala.Boolean] = js.undefined): IFilterFlags = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    __obj.asInstanceOf[IFilterFlags]
  }
}

