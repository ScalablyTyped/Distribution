package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RankingsResponseObject extends ResponseObject {
  var ap: scala.Double
  var ccwm: scala.Double
  var division: java.lang.String
  var dpr: scala.Double
  var losses: scala.Double
  var max_score: scala.Double
  var opr: scala.Double
  var rank: scala.Double
  var sku: java.lang.String
  var sp: scala.Double
  var team: java.lang.String
  var ties: scala.Double
  var trsp: scala.Double
  var wins: scala.Double
  var wp: scala.Double
}

object RankingsResponseObject {
  @scala.inline
  def apply(
    ap: scala.Double,
    ccwm: scala.Double,
    division: java.lang.String,
    dpr: scala.Double,
    losses: scala.Double,
    max_score: scala.Double,
    opr: scala.Double,
    rank: scala.Double,
    sku: java.lang.String,
    sp: scala.Double,
    team: java.lang.String,
    ties: scala.Double,
    trsp: scala.Double,
    wins: scala.Double,
    wp: scala.Double
  ): RankingsResponseObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("ccwm")(ccwm)
    __obj.updateDynamic("division")(division)
    __obj.updateDynamic("dpr")(dpr)
    __obj.updateDynamic("losses")(losses)
    __obj.updateDynamic("max_score")(max_score)
    __obj.updateDynamic("opr")(opr)
    __obj.updateDynamic("rank")(rank)
    __obj.updateDynamic("sku")(sku)
    __obj.updateDynamic("sp")(sp)
    __obj.updateDynamic("team")(team)
    __obj.updateDynamic("ties")(ties)
    __obj.updateDynamic("trsp")(trsp)
    __obj.updateDynamic("wins")(wins)
    __obj.updateDynamic("wp")(wp)
    __obj.asInstanceOf[RankingsResponseObject]
  }
}

