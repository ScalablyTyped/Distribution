package typings.vexdb.outConstantsRequestObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeasonRankingsRequestObject extends RequestObject {
  var limit_number: js.UndefOr[Double] = js.undefined
  var limit_start: js.UndefOr[Double] = js.undefined
  var program: js.UndefOr[StringRequest] = js.undefined
  var season: js.UndefOr[StringRequest] = js.undefined
  var single: js.UndefOr[Boolean] = js.undefined
  var team: js.UndefOr[StringRequest] = js.undefined
  var vrating: js.UndefOr[NumberRequest] = js.undefined
  var vrating_rank: js.UndefOr[NumberRequest] = js.undefined
}

object SeasonRankingsRequestObject {
  @scala.inline
  def apply(
    limit_number: Int | Double = null,
    limit_start: Int | Double = null,
    program: StringRequest = null,
    season: StringRequest = null,
    single: js.UndefOr[Boolean] = js.undefined,
    team: StringRequest = null,
    vrating: NumberRequest = null,
    vrating_rank: NumberRequest = null
  ): SeasonRankingsRequestObject = {
    val __obj = js.Dynamic.literal()
    if (limit_number != null) __obj.updateDynamic("limit_number")(limit_number.asInstanceOf[js.Any])
    if (limit_start != null) __obj.updateDynamic("limit_start")(limit_start.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (vrating != null) __obj.updateDynamic("vrating")(vrating.asInstanceOf[js.Any])
    if (vrating_rank != null) __obj.updateDynamic("vrating_rank")(vrating_rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeasonRankingsRequestObject]
  }
}

