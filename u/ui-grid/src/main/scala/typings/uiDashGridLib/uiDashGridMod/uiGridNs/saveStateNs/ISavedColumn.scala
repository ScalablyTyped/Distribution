package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.saveStateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISavedColumn extends js.Object {
  var filters: js.UndefOr[js.Array[uiDashGridLib.uiDashGridMod.uiGridNs.IFilterOptions]] = js.undefined
  var name: java.lang.String
  var pinned: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[uiDashGridLib.uiDashGridMod.uiGridNs.ISortInfo] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ISavedColumn {
  @scala.inline
  def apply(
    name: java.lang.String,
    filters: js.Array[uiDashGridLib.uiDashGridMod.uiGridNs.IFilterOptions] = null,
    pinned: java.lang.String = null,
    sort: uiDashGridLib.uiDashGridMod.uiGridNs.ISortInfo = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): ISavedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (pinned != null) __obj.updateDynamic("pinned")(pinned)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISavedColumn]
  }
}

