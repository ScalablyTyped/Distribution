package typings.vexdb.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RankingsResponseObject extends ResponseObject {
  var ap: Double
  var ccwm: Double
  var division: String
  var dpr: Double
  var losses: Double
  var max_score: Double
  var opr: Double
  var rank: Double
  var sku: String
  var sp: Double
  var team: String
  var ties: Double
  var trsp: Double
  var wins: Double
  var wp: Double
}

object RankingsResponseObject {
  @scala.inline
  def apply(
    ap: Double,
    ccwm: Double,
    division: String,
    dpr: Double,
    losses: Double,
    max_score: Double,
    opr: Double,
    rank: Double,
    sku: String,
    sp: Double,
    team: String,
    ties: Double,
    trsp: Double,
    wins: Double,
    wp: Double
  ): RankingsResponseObject = {
    val __obj = js.Dynamic.literal(ap = ap, ccwm = ccwm, division = division, dpr = dpr, losses = losses, max_score = max_score, opr = opr, rank = rank, sku = sku, sp = sp, team = team, ties = ties, trsp = trsp, wins = wins, wp = wp)
  
    __obj.asInstanceOf[RankingsResponseObject]
  }
}

