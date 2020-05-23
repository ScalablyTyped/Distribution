package typings.vexdb.anon

import typings.vexdb.requestObjectsMod.NumberRequest
import typings.vexdb.requestObjectsMod.StringRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vexdb.vexdb/out/methods/live.LiveRequestObject<vexdb.vexdb/out/constants/RequestObjects.TeamsRequestObject> */
trait LiveRequestObjectTeamsReq extends js.Object {
  var city: js.UndefOr[StringRequest] = js.undefined
  var country: js.UndefOr[StringRequest] = js.undefined
  var grade: js.UndefOr[StringRequest] = js.undefined
  var is_registered: js.UndefOr[NumberRequest] = js.undefined
  var limit_number: js.UndefOr[Double] = js.undefined
  var limit_start: js.UndefOr[Double] = js.undefined
  var number: js.UndefOr[StringRequest] = js.undefined
  var organisation: js.UndefOr[StringRequest] = js.undefined
  var prefetch: js.UndefOr[Boolean] = js.undefined
  var program: js.UndefOr[StringRequest] = js.undefined
  var region: js.UndefOr[StringRequest] = js.undefined
  var robot_name: js.UndefOr[StringRequest] = js.undefined
  var single: js.UndefOr[Boolean] = js.undefined
  var sku: js.UndefOr[StringRequest] = js.undefined
  var team: js.UndefOr[StringRequest] = js.undefined
  var team_name: js.UndefOr[StringRequest] = js.undefined
}

object LiveRequestObjectTeamsReq {
  @scala.inline
  def apply(
    city: StringRequest = null,
    country: StringRequest = null,
    grade: StringRequest = null,
    is_registered: NumberRequest = null,
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    number: StringRequest = null,
    organisation: StringRequest = null,
    prefetch: js.UndefOr[Boolean] = js.undefined,
    program: StringRequest = null,
    region: StringRequest = null,
    robot_name: StringRequest = null,
    single: js.UndefOr[Boolean] = js.undefined,
    sku: StringRequest = null,
    team: StringRequest = null,
    team_name: StringRequest = null
  ): LiveRequestObjectTeamsReq = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (grade != null) __obj.updateDynamic("grade")(grade.asInstanceOf[js.Any])
    if (is_registered != null) __obj.updateDynamic("is_registered")(is_registered.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_number)) __obj.updateDynamic("limit_number")(limit_number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_start)) __obj.updateDynamic("limit_start")(limit_start.get.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (organisation != null) __obj.updateDynamic("organisation")(organisation.asInstanceOf[js.Any])
    if (!js.isUndefined(prefetch)) __obj.updateDynamic("prefetch")(prefetch.get.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (robot_name != null) __obj.updateDynamic("robot_name")(robot_name.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.get.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (team_name != null) __obj.updateDynamic("team_name")(team_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveRequestObjectTeamsReq]
  }
}

