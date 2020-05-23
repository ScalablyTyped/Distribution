package typings.vexdb.requestObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vexdb.requestObjectsMod.TeamsRequestObject
  - typings.vexdb.requestObjectsMod.EventsRequestObject
  - typings.vexdb.requestObjectsMod.MatchesRequestObject
  - typings.vexdb.requestObjectsMod.RankingsRequestObject
  - typings.vexdb.requestObjectsMod.SeasonRankingsRequestObject
  - typings.vexdb.requestObjectsMod.AwardsRequestObject
  - typings.vexdb.requestObjectsMod.SkillsRequestObject
*/
trait RequestObject extends js.Object

object RequestObject {
  @scala.inline
  def TeamsRequestObject(
    city: StringRequest = null,
    country: StringRequest = null,
    grade: StringRequest = null,
    is_registered: NumberRequest = null,
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    number: StringRequest = null,
    organisation: StringRequest = null,
    program: StringRequest = null,
    region: StringRequest = null,
    robot_name: StringRequest = null,
    single: js.UndefOr[Boolean] = js.undefined,
    sku: StringRequest = null,
    team: StringRequest = null,
    team_name: StringRequest = null
  ): RequestObject = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (grade != null) __obj.updateDynamic("grade")(grade.asInstanceOf[js.Any])
    if (is_registered != null) __obj.updateDynamic("is_registered")(is_registered.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_number)) __obj.updateDynamic("limit_number")(limit_number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_start)) __obj.updateDynamic("limit_start")(limit_start.get.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (organisation != null) __obj.updateDynamic("organisation")(organisation.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (robot_name != null) __obj.updateDynamic("robot_name")(robot_name.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.get.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (team_name != null) __obj.updateDynamic("team_name")(team_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestObject]
  }
  @scala.inline
  def RankingsRequestObject(
    ap: NumberRequest = null,
    ccwm: NumberRequest = null,
    division: StringRequest = null,
    dpr: NumberRequest = null,
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    losses: NumberRequest = null,
    max_score: NumberRequest = null,
    opr: NumberRequest = null,
    rank: StringRequest = null,
    season: StringRequest = null,
    single: js.UndefOr[Boolean] = js.undefined,
    sku: StringRequest = null,
    sp: NumberRequest = null,
    team: StringRequest = null,
    ties: NumberRequest = null,
    trsp: NumberRequest = null,
    wins: NumberRequest = null,
    wp: NumberRequest = null
  ): RequestObject = {
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
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.get.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (sp != null) __obj.updateDynamic("sp")(sp.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (ties != null) __obj.updateDynamic("ties")(ties.asInstanceOf[js.Any])
    if (trsp != null) __obj.updateDynamic("trsp")(trsp.asInstanceOf[js.Any])
    if (wins != null) __obj.updateDynamic("wins")(wins.asInstanceOf[js.Any])
    if (wp != null) __obj.updateDynamic("wp")(wp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestObject]
  }
  @scala.inline
  def MatchesRequestObject(
    blue1: StringRequest = null,
    blue2: StringRequest = null,
    blue3: StringRequest = null,
    bluescore: NumberRequest = null,
    bluesit: StringRequest = null,
    division: StringRequest = null,
    field: StringRequest = null,
    instance: NumberRequest = null,
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    matchnum: NumberRequest = null,
    red1: StringRequest = null,
    red2: StringRequest = null,
    red3: StringRequest = null,
    redscore: NumberRequest = null,
    redsit: StringRequest = null,
    round: NumberRequest = null,
    scheduled: NumberRequest = null,
    scored: NumberRequest = null,
    season: StringRequest = null,
    single: js.UndefOr[Boolean] = js.undefined,
    sku: StringRequest = null,
    team: StringRequest = null
  ): RequestObject = {
    val __obj = js.Dynamic.literal()
    if (blue1 != null) __obj.updateDynamic("blue1")(blue1.asInstanceOf[js.Any])
    if (blue2 != null) __obj.updateDynamic("blue2")(blue2.asInstanceOf[js.Any])
    if (blue3 != null) __obj.updateDynamic("blue3")(blue3.asInstanceOf[js.Any])
    if (bluescore != null) __obj.updateDynamic("bluescore")(bluescore.asInstanceOf[js.Any])
    if (bluesit != null) __obj.updateDynamic("bluesit")(bluesit.asInstanceOf[js.Any])
    if (division != null) __obj.updateDynamic("division")(division.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_number)) __obj.updateDynamic("limit_number")(limit_number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_start)) __obj.updateDynamic("limit_start")(limit_start.get.asInstanceOf[js.Any])
    if (matchnum != null) __obj.updateDynamic("matchnum")(matchnum.asInstanceOf[js.Any])
    if (red1 != null) __obj.updateDynamic("red1")(red1.asInstanceOf[js.Any])
    if (red2 != null) __obj.updateDynamic("red2")(red2.asInstanceOf[js.Any])
    if (red3 != null) __obj.updateDynamic("red3")(red3.asInstanceOf[js.Any])
    if (redscore != null) __obj.updateDynamic("redscore")(redscore.asInstanceOf[js.Any])
    if (redsit != null) __obj.updateDynamic("redsit")(redsit.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (scheduled != null) __obj.updateDynamic("scheduled")(scheduled.asInstanceOf[js.Any])
    if (scored != null) __obj.updateDynamic("scored")(scored.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.get.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestObject]
  }
  @scala.inline
  def SkillsRequestObject(
    attempts: NumberRequest = null,
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    program: StringRequest = null,
    rank: NumberRequest = null,
    score: NumberRequest = null,
    season: StringRequest = null,
    season_rank: NumberRequest = null,
    single: js.UndefOr[Boolean] = js.undefined,
    sku: StringRequest = null,
    team: StringRequest = null,
    `type`: NumberRequest = null
  ): RequestObject = {
    val __obj = js.Dynamic.literal()
    if (attempts != null) __obj.updateDynamic("attempts")(attempts.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_number)) __obj.updateDynamic("limit_number")(limit_number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_start)) __obj.updateDynamic("limit_start")(limit_start.get.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (season_rank != null) __obj.updateDynamic("season_rank")(season_rank.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.get.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestObject]
  }
  @scala.inline
  def AwardsRequestObject(
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    name: StringRequest = null,
    order: NumberRequest = null,
    season: StringRequest = null,
    single: js.UndefOr[Boolean] = js.undefined,
    sku: StringRequest = null,
    team: StringRequest = null
  ): RequestObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit_number)) __obj.updateDynamic("limit_number")(limit_number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_start)) __obj.updateDynamic("limit_start")(limit_start.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.get.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestObject]
  }
  @scala.inline
  def EventsRequestObject(
    city: StringRequest = null,
    country: StringRequest = null,
    date: StringRequest = null,
    end: StringRequest = null,
    key: StringRequest = null,
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    loc_address1: StringRequest = null,
    loc_address2: StringRequest = null,
    loc_city: StringRequest = null,
    loc_country: StringRequest = null,
    loc_postcode: StringRequest = null,
    loc_region: StringRequest = null,
    loc_venue: StringRequest = null,
    name: StringRequest = null,
    program: StringRequest = null,
    region: StringRequest = null,
    season: StringRequest = null,
    single: js.UndefOr[Boolean] = js.undefined,
    sku: StringRequest = null,
    start: StringRequest = null,
    status: StringRequest = null,
    team: String = null
  ): RequestObject = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_number)) __obj.updateDynamic("limit_number")(limit_number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_start)) __obj.updateDynamic("limit_start")(limit_start.get.asInstanceOf[js.Any])
    if (loc_address1 != null) __obj.updateDynamic("loc_address1")(loc_address1.asInstanceOf[js.Any])
    if (loc_address2 != null) __obj.updateDynamic("loc_address2")(loc_address2.asInstanceOf[js.Any])
    if (loc_city != null) __obj.updateDynamic("loc_city")(loc_city.asInstanceOf[js.Any])
    if (loc_country != null) __obj.updateDynamic("loc_country")(loc_country.asInstanceOf[js.Any])
    if (loc_postcode != null) __obj.updateDynamic("loc_postcode")(loc_postcode.asInstanceOf[js.Any])
    if (loc_region != null) __obj.updateDynamic("loc_region")(loc_region.asInstanceOf[js.Any])
    if (loc_venue != null) __obj.updateDynamic("loc_venue")(loc_venue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.get.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestObject]
  }
  @scala.inline
  def SeasonRankingsRequestObject(
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    program: StringRequest = null,
    season: StringRequest = null,
    single: js.UndefOr[Boolean] = js.undefined,
    team: StringRequest = null,
    vrating: NumberRequest = null,
    vrating_rank: NumberRequest = null
  ): RequestObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit_number)) __obj.updateDynamic("limit_number")(limit_number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_start)) __obj.updateDynamic("limit_start")(limit_start.get.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.get.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (vrating != null) __obj.updateDynamic("vrating")(vrating.asInstanceOf[js.Any])
    if (vrating_rank != null) __obj.updateDynamic("vrating_rank")(vrating_rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestObject]
  }
}

