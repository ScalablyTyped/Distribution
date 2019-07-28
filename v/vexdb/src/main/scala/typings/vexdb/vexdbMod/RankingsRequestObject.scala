package typings.vexdb.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RankingsRequestObject extends RequestObject {
  var ap: js.UndefOr[NumberRequest] = js.undefined
  var ccwm: js.UndefOr[NumberRequest] = js.undefined
  var division: js.UndefOr[StringRequest] = js.undefined
  var dpr: js.UndefOr[NumberRequest] = js.undefined
  var limit_number: js.UndefOr[Double] = js.undefined
  var limit_start: js.UndefOr[Double] = js.undefined
  var losses: js.UndefOr[NumberRequest] = js.undefined
  var max_score: js.UndefOr[NumberRequest] = js.undefined
  var opr: js.UndefOr[NumberRequest] = js.undefined
  var rank: js.UndefOr[StringRequest] = js.undefined
  var season: js.UndefOr[StringRequest] = js.undefined
  var sku: js.UndefOr[StringRequest] = js.undefined
  var sp: js.UndefOr[NumberRequest] = js.undefined
  var team: js.UndefOr[StringRequest] = js.undefined
  var ties: js.UndefOr[NumberRequest] = js.undefined
  var trsp: js.UndefOr[NumberRequest] = js.undefined
  var wins: js.UndefOr[NumberRequest] = js.undefined
  var wp: js.UndefOr[NumberRequest] = js.undefined
}

object RankingsRequestObject {
  @scala.inline
  def apply(
    ap: NumberRequest = null,
    ccwm: NumberRequest = null,
    division: StringRequest = null,
    dpr: NumberRequest = null,
    limit_number: Int | Double = null,
    limit_start: Int | Double = null,
    losses: NumberRequest = null,
    max_score: NumberRequest = null,
    opr: NumberRequest = null,
    rank: StringRequest = null,
    season: StringRequest = null,
    sku: StringRequest = null,
    sp: NumberRequest = null,
    team: StringRequest = null,
    ties: NumberRequest = null,
    trsp: NumberRequest = null,
    wins: NumberRequest = null,
    wp: NumberRequest = null
  ): RankingsRequestObject = {
    val __obj = js.Dynamic.literal()
    if (ap != null) __obj.updateDynamic("ap")(ap.asInstanceOf[js.Any])
    if (ccwm != null) __obj.updateDynamic("ccwm")(ccwm.asInstanceOf[js.Any])
    if (division != null) __obj.updateDynamic("division")(division.asInstanceOf[js.Any])
    if (dpr != null) __obj.updateDynamic("dpr")(dpr.asInstanceOf[js.Any])
    if (limit_number != null) __obj.updateDynamic("limit_number")(limit_number.asInstanceOf[js.Any])
    if (limit_start != null) __obj.updateDynamic("limit_start")(limit_start.asInstanceOf[js.Any])
    if (losses != null) __obj.updateDynamic("losses")(losses.asInstanceOf[js.Any])
    if (max_score != null) __obj.updateDynamic("max_score")(max_score.asInstanceOf[js.Any])
    if (opr != null) __obj.updateDynamic("opr")(opr.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (sp != null) __obj.updateDynamic("sp")(sp.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (ties != null) __obj.updateDynamic("ties")(ties.asInstanceOf[js.Any])
    if (trsp != null) __obj.updateDynamic("trsp")(trsp.asInstanceOf[js.Any])
    if (wins != null) __obj.updateDynamic("wins")(wins.asInstanceOf[js.Any])
    if (wp != null) __obj.updateDynamic("wp")(wp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankingsRequestObject]
  }
}

