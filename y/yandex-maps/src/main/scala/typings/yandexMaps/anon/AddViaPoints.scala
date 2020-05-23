package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddViaPoints extends js.Object {
  var addViaPoints: js.UndefOr[Boolean] = js.undefined
  var addWayPoints: js.UndefOr[Boolean] = js.undefined
  var editViaPoints: js.UndefOr[Boolean] = js.undefined
  var editWayPoints: js.UndefOr[Boolean] = js.undefined
  var removeViaPoints: js.UndefOr[Boolean] = js.undefined
  var removeWayPoints: js.UndefOr[Boolean] = js.undefined
}

object AddViaPoints {
  @scala.inline
  def apply(
    addViaPoints: js.UndefOr[Boolean] = js.undefined,
    addWayPoints: js.UndefOr[Boolean] = js.undefined,
    editViaPoints: js.UndefOr[Boolean] = js.undefined,
    editWayPoints: js.UndefOr[Boolean] = js.undefined,
    removeViaPoints: js.UndefOr[Boolean] = js.undefined,
    removeWayPoints: js.UndefOr[Boolean] = js.undefined
  ): AddViaPoints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addViaPoints)) __obj.updateDynamic("addViaPoints")(addViaPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addWayPoints)) __obj.updateDynamic("addWayPoints")(addWayPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(editViaPoints)) __obj.updateDynamic("editViaPoints")(editViaPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(editWayPoints)) __obj.updateDynamic("editWayPoints")(editWayPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeViaPoints)) __obj.updateDynamic("removeViaPoints")(removeViaPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeWayPoints)) __obj.updateDynamic("removeWayPoints")(removeWayPoints.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddViaPoints]
  }
}

