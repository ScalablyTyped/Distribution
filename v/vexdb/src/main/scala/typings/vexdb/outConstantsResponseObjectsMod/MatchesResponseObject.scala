package typings.vexdb.outConstantsResponseObjectsMod

import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`16`
import typings.vexdb.vexdbNumbers.`1`
import typings.vexdb.vexdbNumbers.`2`
import typings.vexdb.vexdbNumbers.`3`
import typings.vexdb.vexdbNumbers.`4`
import typings.vexdb.vexdbNumbers.`5`
import typings.vexdb.vexdbNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchesResponseObject extends ResponseObject {
  var blue1: String
  var blue2: String
  var blue3: String
  var bluescore: Double
  var bluesit: String
  var division: String
  var field: String
  var instance: Double
  var matchnum: Double
  var red1: String
  var red2: String
  var red3: String
  var redscore: Double
  var redsit: String
  var round: `1` | `2` | `3` | `4` | `5` | `6` | `16`
  var scheduled: String
  var scored: `0` | `1`
  var sku: String
}

object MatchesResponseObject {
  @scala.inline
  def apply(
    blue1: String,
    blue2: String,
    blue3: String,
    bluescore: Double,
    bluesit: String,
    division: String,
    field: String,
    instance: Double,
    matchnum: Double,
    red1: String,
    red2: String,
    red3: String,
    redscore: Double,
    redsit: String,
    round: `1` | `2` | `3` | `4` | `5` | `6` | `16`,
    scheduled: String,
    scored: `0` | `1`,
    sku: String
  ): MatchesResponseObject = {
    val __obj = js.Dynamic.literal(blue1 = blue1, blue2 = blue2, blue3 = blue3, bluescore = bluescore, bluesit = bluesit, division = division, field = field, instance = instance, matchnum = matchnum, red1 = red1, red2 = red2, red3 = red3, redscore = redscore, redsit = redsit, round = round.asInstanceOf[js.Any], scheduled = scheduled, scored = scored.asInstanceOf[js.Any], sku = sku)
  
    __obj.asInstanceOf[MatchesResponseObject]
  }
}

