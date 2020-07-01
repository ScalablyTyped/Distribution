package typings.vexdb.requestObjectsMod

import typings.vexdb.responseObjectsMod.SeasonRankingsResponseObject
import typings.vexdb.vexdbStrings.VEXU
import typings.vexdb.vexdbStrings.VRC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeasonRankingsRequestObject extends RequestObject {
  var limit_number: js.UndefOr[Double] = js.undefined
  var limit_start: js.UndefOr[Double] = js.undefined
  var program: js.UndefOr[StringRequest[SeasonRankingsResponseObject, VRC | VEXU]] = js.undefined
  var season: js.UndefOr[StringRequest[SeasonRankingsResponseObject, Seasons]] = js.undefined
  var team: js.UndefOr[StringRequest[SeasonRankingsResponseObject, String]] = js.undefined
  var vrating: js.UndefOr[NumberRequest[SeasonRankingsResponseObject, Double]] = js.undefined
  var vrating_rank: js.UndefOr[NumberRequest[SeasonRankingsResponseObject, Double]] = js.undefined
}

object SeasonRankingsRequestObject {
  @scala.inline
  def apply(
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    program: StringRequest[SeasonRankingsResponseObject, VRC | VEXU] = null,
    season: StringRequest[SeasonRankingsResponseObject, Seasons] = null,
    team: StringRequest[SeasonRankingsResponseObject, String] = null,
    vrating: NumberRequest[SeasonRankingsResponseObject, Double] = null,
    vrating_rank: NumberRequest[SeasonRankingsResponseObject, Double] = null
  ): SeasonRankingsRequestObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit_number)) __obj.updateDynamic("limit_number")(limit_number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_start)) __obj.updateDynamic("limit_start")(limit_start.get.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (vrating != null) __obj.updateDynamic("vrating")(vrating.asInstanceOf[js.Any])
    if (vrating_rank != null) __obj.updateDynamic("vrating_rank")(vrating_rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeasonRankingsRequestObject]
  }
}

