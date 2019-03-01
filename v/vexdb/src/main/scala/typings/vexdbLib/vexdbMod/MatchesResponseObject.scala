package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchesResponseObject extends ResponseObject {
  var blue1: java.lang.String
  var blue2: java.lang.String
  var blue3: java.lang.String
  var bluescore: scala.Double
  var bluesit: java.lang.String
  var division: java.lang.String
  var field: java.lang.String
  var instance: scala.Double
  var matchnum: scala.Double
  var red1: java.lang.String
  var red2: java.lang.String
  var red3: java.lang.String
  var redscore: scala.Double
  var redsit: java.lang.String
  var round: vexdbLib.vexdbLibNumbers.`1` | vexdbLib.vexdbLibNumbers.`2` | vexdbLib.vexdbLibNumbers.`3` | vexdbLib.vexdbLibNumbers.`4` | vexdbLib.vexdbLibNumbers.`5` | vexdbLib.vexdbLibNumbers.`6` | vexdbLib.vexdbLibNumbers.`16`
  var scheduled: java.lang.String
  var scored: vexdbLib.vexdbLibNumbers.`0` | vexdbLib.vexdbLibNumbers.`1`
  var sku: java.lang.String
}

object MatchesResponseObject {
  @scala.inline
  def apply(
    blue1: java.lang.String,
    blue2: java.lang.String,
    blue3: java.lang.String,
    bluescore: scala.Double,
    bluesit: java.lang.String,
    division: java.lang.String,
    field: java.lang.String,
    instance: scala.Double,
    matchnum: scala.Double,
    red1: java.lang.String,
    red2: java.lang.String,
    red3: java.lang.String,
    redscore: scala.Double,
    redsit: java.lang.String,
    round: vexdbLib.vexdbLibNumbers.`1` | vexdbLib.vexdbLibNumbers.`2` | vexdbLib.vexdbLibNumbers.`3` | vexdbLib.vexdbLibNumbers.`4` | vexdbLib.vexdbLibNumbers.`5` | vexdbLib.vexdbLibNumbers.`6` | vexdbLib.vexdbLibNumbers.`16`,
    scheduled: java.lang.String,
    scored: vexdbLib.vexdbLibNumbers.`0` | vexdbLib.vexdbLibNumbers.`1`,
    sku: java.lang.String
  ): MatchesResponseObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blue1")(blue1)
    __obj.updateDynamic("blue2")(blue2)
    __obj.updateDynamic("blue3")(blue3)
    __obj.updateDynamic("bluescore")(bluescore)
    __obj.updateDynamic("bluesit")(bluesit)
    __obj.updateDynamic("division")(division)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("matchnum")(matchnum)
    __obj.updateDynamic("red1")(red1)
    __obj.updateDynamic("red2")(red2)
    __obj.updateDynamic("red3")(red3)
    __obj.updateDynamic("redscore")(redscore)
    __obj.updateDynamic("redsit")(redsit)
    __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    __obj.updateDynamic("scheduled")(scheduled)
    __obj.updateDynamic("scored")(scored.asInstanceOf[js.Any])
    __obj.updateDynamic("sku")(sku)
    __obj.asInstanceOf[MatchesResponseObject]
  }
}

