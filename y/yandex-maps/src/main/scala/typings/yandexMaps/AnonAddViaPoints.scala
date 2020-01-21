package typings.yandexMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddViaPoints extends js.Object {
  var addViaPoints: js.UndefOr[Boolean] = js.undefined
  var addWayPoints: js.UndefOr[Boolean] = js.undefined
  var editViaPoints: js.UndefOr[Boolean] = js.undefined
  var editWayPoints: js.UndefOr[Boolean] = js.undefined
  var removeViaPoints: js.UndefOr[Boolean] = js.undefined
  var removeWayPoints: js.UndefOr[Boolean] = js.undefined
}

object AnonAddViaPoints {
  @scala.inline
  def apply(
    addViaPoints: js.UndefOr[Boolean] = js.undefined,
    addWayPoints: js.UndefOr[Boolean] = js.undefined,
    editViaPoints: js.UndefOr[Boolean] = js.undefined,
    editWayPoints: js.UndefOr[Boolean] = js.undefined,
    removeViaPoints: js.UndefOr[Boolean] = js.undefined,
    removeWayPoints: js.UndefOr[Boolean] = js.undefined
  ): AnonAddViaPoints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addViaPoints)) __obj.updateDynamic("addViaPoints")(addViaPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(addWayPoints)) __obj.updateDynamic("addWayPoints")(addWayPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(editViaPoints)) __obj.updateDynamic("editViaPoints")(editViaPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(editWayPoints)) __obj.updateDynamic("editWayPoints")(editWayPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(removeViaPoints)) __obj.updateDynamic("removeViaPoints")(removeViaPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(removeWayPoints)) __obj.updateDynamic("removeWayPoints")(removeWayPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddViaPoints]
  }
}

