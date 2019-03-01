package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiGridCellNavConstants extends js.Object {
  var CELL_NAV_EVENT: java.lang.String
  var EVENT_TYPE: uiDashGridLib.Anon_CLEAR
  var FEATURE_NAME: java.lang.String
  var direction: uiDashGridLib.Anon_DOWNLEFT
}

object IUiGridCellNavConstants {
  @scala.inline
  def apply(
    CELL_NAV_EVENT: java.lang.String,
    EVENT_TYPE: uiDashGridLib.Anon_CLEAR,
    FEATURE_NAME: java.lang.String,
    direction: uiDashGridLib.Anon_DOWNLEFT
  ): IUiGridCellNavConstants = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CELL_NAV_EVENT")(CELL_NAV_EVENT)
    __obj.updateDynamic("EVENT_TYPE")(EVENT_TYPE)
    __obj.updateDynamic("FEATURE_NAME")(FEATURE_NAME)
    __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[IUiGridCellNavConstants]
  }
}

