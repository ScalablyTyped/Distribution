package typings.vexdb.anon

import typings.vexdb.requestObjectsMod.NumberRequest
import typings.vexdb.requestObjectsMod.StringRequest
import typings.vexdb.responseObjectsMod.TeamsResponseObject
import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`1`
import typings.vexdb.vexdbStrings.College
import typings.vexdb.vexdbStrings.VEXU
import typings.vexdb.vexdbStrings.VRC
import typings.vexdb.vexdbStrings.`High School`
import typings.vexdb.vexdbStrings.`Middle School`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vexdb.vexdb/out/methods/live.LiveRequestObject<vexdb.vexdb/out/constants/RequestObjects.TeamsRequestObject> */
trait LiveRequestObjectTeamsReq extends js.Object {
  var city: js.UndefOr[StringRequest[TeamsResponseObject, String]] = js.undefined
  var country: js.UndefOr[StringRequest[TeamsResponseObject, String]] = js.undefined
  var grade: js.UndefOr[
    StringRequest[TeamsResponseObject, College | (`High School`) | (`Middle School`)]
  ] = js.undefined
  var is_registered: js.UndefOr[NumberRequest[TeamsResponseObject, `0` | `1`]] = js.undefined
  var limit_number: js.UndefOr[Double] = js.undefined
  var limit_start: js.UndefOr[Double] = js.undefined
  var number: js.UndefOr[StringRequest[TeamsResponseObject, String]] = js.undefined
  var organisation: js.UndefOr[StringRequest[TeamsResponseObject, String]] = js.undefined
  var prefetch: js.UndefOr[Boolean] = js.undefined
  var program: js.UndefOr[StringRequest[TeamsResponseObject, VRC | VEXU]] = js.undefined
  var region: js.UndefOr[StringRequest[TeamsResponseObject, String]] = js.undefined
  var robot_name: js.UndefOr[StringRequest[TeamsResponseObject, String]] = js.undefined
  var sku: js.UndefOr[StringRequest[TeamsResponseObject, String]] = js.undefined
  var team: js.UndefOr[StringRequest[TeamsResponseObject, String]] = js.undefined
  var team_name: js.UndefOr[StringRequest[TeamsResponseObject, String]] = js.undefined
}

object LiveRequestObjectTeamsReq {
  @scala.inline
  def apply(
    city: StringRequest[TeamsResponseObject, String] = null,
    country: StringRequest[TeamsResponseObject, String] = null,
    grade: StringRequest[TeamsResponseObject, College | (`High School`) | (`Middle School`)] = null,
    is_registered: NumberRequest[TeamsResponseObject, `0` | `1`] = null,
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    number: StringRequest[TeamsResponseObject, String] = null,
    organisation: StringRequest[TeamsResponseObject, String] = null,
    prefetch: js.UndefOr[Boolean] = js.undefined,
    program: StringRequest[TeamsResponseObject, VRC | VEXU] = null,
    region: StringRequest[TeamsResponseObject, String] = null,
    robot_name: StringRequest[TeamsResponseObject, String] = null,
    sku: StringRequest[TeamsResponseObject, String] = null,
    team: StringRequest[TeamsResponseObject, String] = null,
    team_name: StringRequest[TeamsResponseObject, String] = null
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
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (team_name != null) __obj.updateDynamic("team_name")(team_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveRequestObjectTeamsReq]
  }
}

