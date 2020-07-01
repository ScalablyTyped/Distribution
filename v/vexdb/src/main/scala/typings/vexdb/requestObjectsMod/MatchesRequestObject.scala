package typings.vexdb.requestObjectsMod

import typings.vexdb.responseObjectsMod.MatchesResponseObject
import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`16`
import typings.vexdb.vexdbNumbers.`1`
import typings.vexdb.vexdbNumbers.`2`
import typings.vexdb.vexdbNumbers.`3`
import typings.vexdb.vexdbNumbers.`4`
import typings.vexdb.vexdbNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchesRequestObject extends RequestObject {
  var blue1: js.UndefOr[StringRequest[MatchesResponseObject, String]] = js.undefined
  var blue2: js.UndefOr[StringRequest[MatchesResponseObject, String]] = js.undefined
  var blue3: js.UndefOr[StringRequest[MatchesResponseObject, String]] = js.undefined
  var bluescore: js.UndefOr[NumberRequest[MatchesResponseObject, Double]] = js.undefined
  var bluesit: js.UndefOr[StringRequest[MatchesResponseObject, String]] = js.undefined
  var division: js.UndefOr[StringRequest[MatchesResponseObject, String]] = js.undefined
  var field: js.UndefOr[StringRequest[MatchesResponseObject, String]] = js.undefined
  var instance: js.UndefOr[NumberRequest[MatchesResponseObject, Double]] = js.undefined
  var limit_number: js.UndefOr[Double] = js.undefined
  var limit_start: js.UndefOr[Double] = js.undefined
  var matchnum: js.UndefOr[NumberRequest[MatchesResponseObject, Double]] = js.undefined
  var red1: js.UndefOr[StringRequest[MatchesResponseObject, String]] = js.undefined
  var red2: js.UndefOr[StringRequest[MatchesResponseObject, String]] = js.undefined
  var red3: js.UndefOr[StringRequest[MatchesResponseObject, String]] = js.undefined
  var redscore: js.UndefOr[NumberRequest[MatchesResponseObject, Double]] = js.undefined
  var redsit: js.UndefOr[StringRequest[MatchesResponseObject, String]] = js.undefined
  var round: js.UndefOr[NumberRequest[MatchesResponseObject, `1` | `2` | `3` | `4` | `5` | `16`]] = js.undefined
  var scheduled: js.UndefOr[NumberRequest[MatchesResponseObject, Double]] = js.undefined
  var scored: js.UndefOr[NumberRequest[MatchesResponseObject, `0` | `1`]] = js.undefined
  var season: js.UndefOr[StringRequest[MatchesResponseObject, Seasons]] = js.undefined
  var sku: js.UndefOr[StringRequest[MatchesResponseObject, String]] = js.undefined
  var team: js.UndefOr[StringRequest[MatchesResponseObject, String]] = js.undefined
}

object MatchesRequestObject {
  @scala.inline
  def apply(
    blue1: StringRequest[MatchesResponseObject, String] = null,
    blue2: StringRequest[MatchesResponseObject, String] = null,
    blue3: StringRequest[MatchesResponseObject, String] = null,
    bluescore: NumberRequest[MatchesResponseObject, Double] = null,
    bluesit: StringRequest[MatchesResponseObject, String] = null,
    division: StringRequest[MatchesResponseObject, String] = null,
    field: StringRequest[MatchesResponseObject, String] = null,
    instance: NumberRequest[MatchesResponseObject, Double] = null,
    limit_number: js.UndefOr[Double] = js.undefined,
    limit_start: js.UndefOr[Double] = js.undefined,
    matchnum: NumberRequest[MatchesResponseObject, Double] = null,
    red1: StringRequest[MatchesResponseObject, String] = null,
    red2: StringRequest[MatchesResponseObject, String] = null,
    red3: StringRequest[MatchesResponseObject, String] = null,
    redscore: NumberRequest[MatchesResponseObject, Double] = null,
    redsit: StringRequest[MatchesResponseObject, String] = null,
    round: NumberRequest[MatchesResponseObject, `1` | `2` | `3` | `4` | `5` | `16`] = null,
    scheduled: NumberRequest[MatchesResponseObject, Double] = null,
    scored: NumberRequest[MatchesResponseObject, `0` | `1`] = null,
    season: StringRequest[MatchesResponseObject, Seasons] = null,
    sku: StringRequest[MatchesResponseObject, String] = null,
    team: StringRequest[MatchesResponseObject, String] = null
  ): MatchesRequestObject = {
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
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchesRequestObject]
  }
}

