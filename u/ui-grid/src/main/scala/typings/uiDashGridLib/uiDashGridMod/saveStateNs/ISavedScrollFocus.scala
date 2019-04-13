package typings
package uiDashGridLib.uiDashGridMod.saveStateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISavedScrollFocus extends js.Object {
  var colName: js.UndefOr[java.lang.String] = js.undefined
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var rowVal: js.UndefOr[IRowVal] = js.undefined
}

object ISavedScrollFocus {
  @scala.inline
  def apply(
    colName: java.lang.String = null,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    rowVal: IRowVal = null
  ): ISavedScrollFocus = {
    val __obj = js.Dynamic.literal()
    if (colName != null) __obj.updateDynamic("colName")(colName)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (rowVal != null) __obj.updateDynamic("rowVal")(rowVal)
    __obj.asInstanceOf[ISavedScrollFocus]
  }
}

