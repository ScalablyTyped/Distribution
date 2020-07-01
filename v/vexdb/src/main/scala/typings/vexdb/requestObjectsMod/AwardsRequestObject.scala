package typings.vexdb.requestObjectsMod

import typings.vexdb.responseObjectsMod.AwardsResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwardsRequestObject extends RequestObject {
  var limit_number: js.UndefOr[Double] = js.undefined
  var limit_start: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[StringRequest[AwardsResponseObject, String]] = js.undefined
  var order: js.UndefOr[NumberRequest[AwardsResponseObject, Double]] = js.undefined
  var season: js.UndefOr[StringRequest[AwardsResponseObject, Seasons]] = js.undefined
  var sku: js.UndefOr[StringRequest[AwardsResponseObject, String]] = js.undefined
  var team: js.UndefOr[StringRequest[AwardsResponseObject, String]] = js.undefined
}

object AwardsRequestObject {
  @scala.inline
  def apply(
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    name: StringRequest[AwardsResponseObject, String] = null,
    order: NumberRequest[AwardsResponseObject, Double] = null,
    season: StringRequest[AwardsResponseObject, Seasons] = null,
    sku: StringRequest[AwardsResponseObject, String] = null,
    team: StringRequest[AwardsResponseObject, String] = null
  ): AwardsRequestObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit_number)) __obj.updateDynamic("limit_number")(limit_number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_start)) __obj.updateDynamic("limit_start")(limit_start.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwardsRequestObject]
  }
}

