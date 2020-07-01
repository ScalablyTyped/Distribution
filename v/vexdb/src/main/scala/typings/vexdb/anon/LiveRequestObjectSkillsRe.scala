package typings.vexdb.anon

import typings.vexdb.requestObjectsMod.NumberRequest
import typings.vexdb.requestObjectsMod.Seasons
import typings.vexdb.requestObjectsMod.StringRequest
import typings.vexdb.responseObjectsMod.SkillsResponseObject
import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`1`
import typings.vexdb.vexdbNumbers.`2`
import typings.vexdb.vexdbStrings.VEXU
import typings.vexdb.vexdbStrings.VRC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vexdb.vexdb/out/methods/live.LiveRequestObject<vexdb.vexdb/out/constants/RequestObjects.SkillsRequestObject> */
trait LiveRequestObjectSkillsRe extends js.Object {
  var attempts: js.UndefOr[NumberRequest[SkillsResponseObject, Double]] = js.undefined
  var limit_number: js.UndefOr[Double] = js.undefined
  var limit_start: js.UndefOr[Double] = js.undefined
  var prefetch: js.UndefOr[Boolean] = js.undefined
  var program: js.UndefOr[StringRequest[SkillsResponseObject, VRC | VEXU]] = js.undefined
  var rank: js.UndefOr[NumberRequest[SkillsResponseObject, Double]] = js.undefined
  var score: js.UndefOr[NumberRequest[SkillsResponseObject, Double]] = js.undefined
  var season: js.UndefOr[StringRequest[SkillsResponseObject, Seasons]] = js.undefined
  var season_rank: js.UndefOr[NumberRequest[SkillsResponseObject, Double]] = js.undefined
  var sku: js.UndefOr[StringRequest[SkillsResponseObject, String]] = js.undefined
  var team: js.UndefOr[StringRequest[SkillsResponseObject, String]] = js.undefined
  var `type`: js.UndefOr[NumberRequest[SkillsResponseObject, `0` | `1` | `2`]] = js.undefined
}

object LiveRequestObjectSkillsRe {
  @scala.inline
  def apply(
    attempts: NumberRequest[SkillsResponseObject, Double] = null,
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    prefetch: js.UndefOr[Boolean] = js.undefined,
    program: StringRequest[SkillsResponseObject, VRC | VEXU] = null,
    rank: NumberRequest[SkillsResponseObject, Double] = null,
    score: NumberRequest[SkillsResponseObject, Double] = null,
    season: StringRequest[SkillsResponseObject, Seasons] = null,
    season_rank: NumberRequest[SkillsResponseObject, Double] = null,
    sku: StringRequest[SkillsResponseObject, String] = null,
    team: StringRequest[SkillsResponseObject, String] = null,
    `type`: NumberRequest[SkillsResponseObject, `0` | `1` | `2`] = null
  ): LiveRequestObjectSkillsRe = {
    val __obj = js.Dynamic.literal()
    if (attempts != null) __obj.updateDynamic("attempts")(attempts.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_number)) __obj.updateDynamic("limit_number")(limit_number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_start)) __obj.updateDynamic("limit_start")(limit_start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prefetch)) __obj.updateDynamic("prefetch")(prefetch.get.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (season_rank != null) __obj.updateDynamic("season_rank")(season_rank.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveRequestObjectSkillsRe]
  }
}

