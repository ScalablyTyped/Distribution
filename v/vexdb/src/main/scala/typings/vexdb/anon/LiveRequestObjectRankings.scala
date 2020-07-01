package typings.vexdb.anon

import typings.vexdb.requestObjectsMod.NumberRequest
import typings.vexdb.requestObjectsMod.Seasons
import typings.vexdb.requestObjectsMod.StringRequest
import typings.vexdb.responseObjectsMod.RankingsResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vexdb.vexdb/out/methods/live.LiveRequestObject<vexdb.vexdb/out/constants/RequestObjects.RankingsRequestObject> */
trait LiveRequestObjectRankings extends js.Object {
  var ap: js.UndefOr[NumberRequest[RankingsResponseObject, Double]] = js.undefined
  var ccwm: js.UndefOr[NumberRequest[RankingsResponseObject, Double]] = js.undefined
  var division: js.UndefOr[StringRequest[RankingsResponseObject, String]] = js.undefined
  var dpr: js.UndefOr[NumberRequest[RankingsResponseObject, Double]] = js.undefined
  var limit_number: js.UndefOr[Double] = js.undefined
  var limit_start: js.UndefOr[Double] = js.undefined
  var losses: js.UndefOr[NumberRequest[RankingsResponseObject, Double]] = js.undefined
  var max_score: js.UndefOr[NumberRequest[RankingsResponseObject, Double]] = js.undefined
  var opr: js.UndefOr[NumberRequest[RankingsResponseObject, Double]] = js.undefined
  var prefetch: js.UndefOr[Boolean] = js.undefined
  var rank: js.UndefOr[StringRequest[RankingsResponseObject, String]] = js.undefined
  var season: js.UndefOr[StringRequest[RankingsResponseObject, Seasons]] = js.undefined
  var sku: js.UndefOr[StringRequest[RankingsResponseObject, String]] = js.undefined
  var sp: js.UndefOr[NumberRequest[RankingsResponseObject, Double]] = js.undefined
  var team: js.UndefOr[StringRequest[RankingsResponseObject, String]] = js.undefined
  var ties: js.UndefOr[NumberRequest[RankingsResponseObject, Double]] = js.undefined
  var trsp: js.UndefOr[NumberRequest[RankingsResponseObject, Double]] = js.undefined
  var wins: js.UndefOr[NumberRequest[RankingsResponseObject, Double]] = js.undefined
  var wp: js.UndefOr[NumberRequest[RankingsResponseObject, Double]] = js.undefined
}

object LiveRequestObjectRankings {
  @scala.inline
  def apply(
    ap: NumberRequest[RankingsResponseObject, Double] = null,
    ccwm: NumberRequest[RankingsResponseObject, Double] = null,
    division: StringRequest[RankingsResponseObject, String] = null,
    dpr: NumberRequest[RankingsResponseObject, Double] = null,
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    losses: NumberRequest[RankingsResponseObject, Double] = null,
    max_score: NumberRequest[RankingsResponseObject, Double] = null,
    opr: NumberRequest[RankingsResponseObject, Double] = null,
    prefetch: js.UndefOr[Boolean] = js.undefined,
    rank: StringRequest[RankingsResponseObject, String] = null,
    season: StringRequest[RankingsResponseObject, Seasons] = null,
    sku: StringRequest[RankingsResponseObject, String] = null,
    sp: NumberRequest[RankingsResponseObject, Double] = null,
    team: StringRequest[RankingsResponseObject, String] = null,
    ties: NumberRequest[RankingsResponseObject, Double] = null,
    trsp: NumberRequest[RankingsResponseObject, Double] = null,
    wins: NumberRequest[RankingsResponseObject, Double] = null,
    wp: NumberRequest[RankingsResponseObject, Double] = null
  ): LiveRequestObjectRankings = {
    val __obj = js.Dynamic.literal()
    if (ap != null) __obj.updateDynamic("ap")(ap.asInstanceOf[js.Any])
    if (ccwm != null) __obj.updateDynamic("ccwm")(ccwm.asInstanceOf[js.Any])
    if (division != null) __obj.updateDynamic("division")(division.asInstanceOf[js.Any])
    if (dpr != null) __obj.updateDynamic("dpr")(dpr.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_number)) __obj.updateDynamic("limit_number")(limit_number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_start)) __obj.updateDynamic("limit_start")(limit_start.get.asInstanceOf[js.Any])
    if (losses != null) __obj.updateDynamic("losses")(losses.asInstanceOf[js.Any])
    if (max_score != null) __obj.updateDynamic("max_score")(max_score.asInstanceOf[js.Any])
    if (opr != null) __obj.updateDynamic("opr")(opr.asInstanceOf[js.Any])
    if (!js.isUndefined(prefetch)) __obj.updateDynamic("prefetch")(prefetch.get.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (sp != null) __obj.updateDynamic("sp")(sp.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (ties != null) __obj.updateDynamic("ties")(ties.asInstanceOf[js.Any])
    if (trsp != null) __obj.updateDynamic("trsp")(trsp.asInstanceOf[js.Any])
    if (wins != null) __obj.updateDynamic("wins")(wins.asInstanceOf[js.Any])
    if (wp != null) __obj.updateDynamic("wp")(wp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveRequestObjectRankings]
  }
}

