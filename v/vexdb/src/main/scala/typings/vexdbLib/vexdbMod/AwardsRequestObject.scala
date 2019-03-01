package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwardsRequestObject extends RequestObject {
  var limit_number: js.UndefOr[scala.Double] = js.undefined
  var limit_start: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[StringRequest] = js.undefined
  var order: js.UndefOr[NumberRequest] = js.undefined
  var season: js.UndefOr[StringRequest] = js.undefined
  var sku: js.UndefOr[StringRequest] = js.undefined
  var team: js.UndefOr[StringRequest] = js.undefined
}

object AwardsRequestObject {
  @scala.inline
  def apply(
    limit_number: scala.Int | scala.Double = null,
    limit_start: scala.Int | scala.Double = null,
    name: StringRequest = null,
    order: NumberRequest = null,
    season: StringRequest = null,
    sku: StringRequest = null,
    team: StringRequest = null
  ): AwardsRequestObject = {
    val __obj = js.Dynamic.literal()
    if (limit_number != null) __obj.updateDynamic("limit_number")(limit_number.asInstanceOf[js.Any])
    if (limit_start != null) __obj.updateDynamic("limit_start")(limit_start.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwardsRequestObject]
  }
}

