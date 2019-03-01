package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkillsRequestObject extends RequestObject {
  var attempts: js.UndefOr[NumberRequest] = js.undefined
  var limit_number: js.UndefOr[scala.Double] = js.undefined
  var limit_start: js.UndefOr[scala.Double] = js.undefined
  var program: js.UndefOr[StringRequest] = js.undefined
  var rank: js.UndefOr[NumberRequest] = js.undefined
  var score: js.UndefOr[NumberRequest] = js.undefined
  var season: js.UndefOr[StringRequest] = js.undefined
  var season_rank: js.UndefOr[NumberRequest] = js.undefined
  var sku: js.UndefOr[StringRequest] = js.undefined
  var team: js.UndefOr[StringRequest] = js.undefined
  var `type`: js.UndefOr[NumberRequest] = js.undefined
}

object SkillsRequestObject {
  @scala.inline
  def apply(
    attempts: NumberRequest = null,
    limit_number: scala.Int | scala.Double = null,
    limit_start: scala.Int | scala.Double = null,
    program: StringRequest = null,
    rank: NumberRequest = null,
    score: NumberRequest = null,
    season: StringRequest = null,
    season_rank: NumberRequest = null,
    sku: StringRequest = null,
    team: StringRequest = null,
    `type`: NumberRequest = null
  ): SkillsRequestObject = {
    val __obj = js.Dynamic.literal()
    if (attempts != null) __obj.updateDynamic("attempts")(attempts.asInstanceOf[js.Any])
    if (limit_number != null) __obj.updateDynamic("limit_number")(limit_number.asInstanceOf[js.Any])
    if (limit_start != null) __obj.updateDynamic("limit_start")(limit_start.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (season_rank != null) __obj.updateDynamic("season_rank")(season_rank.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkillsRequestObject]
  }
}

