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
    val __obj = js.Dynamic.literal(ap = ap, ccwm = ccwm, division = division, dpr = dpr, losses = losses, max_score = max_score, opr = opr, rank = rank, sku = sku, sp = sp, team = team, ties = ties, trsp = trsp, wins = wins, wp = wp)
  
    __obj.asInstanceOf[RankingsResponseObject]
  }
}

