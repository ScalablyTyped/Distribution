package typings.vexdb.responseObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RankingsResponseObject extends ResponseObject {
  var ap: Double = js.native
  var ccwm: Double = js.native
  var division: String = js.native
  var dpr: Double = js.native
  var losses: Double = js.native
  var max_score: Double = js.native
  var opr: Double = js.native
  var rank: Double = js.native
  var sku: String = js.native
  var sp: Double = js.native
  var team: String = js.native
  var ties: Double = js.native
  var trsp: Double = js.native
  var wins: Double = js.native
  var wp: Double = js.native
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
    val __obj = js.Dynamic.literal(ap = ap.asInstanceOf[js.Any], ccwm = ccwm.asInstanceOf[js.Any], division = division.asInstanceOf[js.Any], dpr = dpr.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], max_score = max_score.asInstanceOf[js.Any], opr = opr.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], ties = ties.asInstanceOf[js.Any], trsp = trsp.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any], wp = wp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankingsResponseObject]
  }
  @scala.inline
  implicit class RankingsResponseObjectOps[Self <: RankingsResponseObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAp(value: Double): Self = this.set("ap", value.asInstanceOf[js.Any])
    @scala.inline
    def setCcwm(value: Double): Self = this.set("ccwm", value.asInstanceOf[js.Any])
    @scala.inline
    def setDivision(value: String): Self = this.set("division", value.asInstanceOf[js.Any])
    @scala.inline
    def setDpr(value: Double): Self = this.set("dpr", value.asInstanceOf[js.Any])
    @scala.inline
    def setLosses(value: Double): Self = this.set("losses", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_score(value: Double): Self = this.set("max_score", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpr(value: Double): Self = this.set("opr", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
    @scala.inline
    def setSp(value: Double): Self = this.set("sp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
    @scala.inline
    def setTies(value: Double): Self = this.set("ties", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrsp(value: Double): Self = this.set("trsp", value.asInstanceOf[js.Any])
    @scala.inline
    def setWins(value: Double): Self = this.set("wins", value.asInstanceOf[js.Any])
    @scala.inline
    def setWp(value: Double): Self = this.set("wp", value.asInstanceOf[js.Any])
  }
  
}

