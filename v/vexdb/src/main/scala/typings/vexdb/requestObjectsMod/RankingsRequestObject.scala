package typings.vexdb.requestObjectsMod

import typings.vexdb.responseObjectsMod.RankingsResponseObject
import typings.vexdb.vexdbStrings.ap
import typings.vexdb.vexdbStrings.ccwm
import typings.vexdb.vexdbStrings.division
import typings.vexdb.vexdbStrings.dpr
import typings.vexdb.vexdbStrings.losses
import typings.vexdb.vexdbStrings.max_score
import typings.vexdb.vexdbStrings.opr
import typings.vexdb.vexdbStrings.rank
import typings.vexdb.vexdbStrings.sku
import typings.vexdb.vexdbStrings.sp
import typings.vexdb.vexdbStrings.team
import typings.vexdb.vexdbStrings.ties
import typings.vexdb.vexdbStrings.trsp
import typings.vexdb.vexdbStrings.wins
import typings.vexdb.vexdbStrings.wp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RankingsRequestObject extends RequestObject {
  var ap: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.ap, Double]] = js.native
  var ccwm: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.ccwm, Double]] = js.native
  var division: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.division, String]] = js.native
  var dpr: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.dpr, Double]] = js.native
  var limit_number: js.UndefOr[Double] = js.native
  var limit_start: js.UndefOr[Double] = js.native
  var losses: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.losses, Double]] = js.native
  var max_score: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.max_score, Double]] = js.native
  var opr: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.opr, Double]] = js.native
  var rank: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.rank, Double]] = js.native
  var season: js.UndefOr[Seasons] = js.native
  var sku: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.sku, String]] = js.native
  var sp: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.sp, Double]] = js.native
  var team: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.team, String]] = js.native
  var ties: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.ties, Double]] = js.native
  var trsp: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.trsp, Double]] = js.native
  var wins: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.wins, Double]] = js.native
  var wp: js.UndefOr[Filter[RankingsResponseObject, typings.vexdb.vexdbStrings.wp, Double]] = js.native
}

object RankingsRequestObject {
  @scala.inline
  def apply(): RankingsRequestObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RankingsRequestObject]
  }
  @scala.inline
  implicit class RankingsRequestObjectOps[Self <: RankingsRequestObject] (val x: Self) extends AnyVal {
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
    def setApFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("ap", js.Any.fromFunction2(value))
    @scala.inline
    def setAp(value: Filter[RankingsResponseObject, ap, Double]): Self = this.set("ap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAp: Self = this.set("ap", js.undefined)
    @scala.inline
    def setCcwmFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("ccwm", js.Any.fromFunction2(value))
    @scala.inline
    def setCcwm(value: Filter[RankingsResponseObject, ccwm, Double]): Self = this.set("ccwm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCcwm: Self = this.set("ccwm", js.undefined)
    @scala.inline
    def setDivisionFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("division", js.Any.fromFunction2(value))
    @scala.inline
    def setDivision(value: Filter[RankingsResponseObject, division, String]): Self = this.set("division", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivision: Self = this.set("division", js.undefined)
    @scala.inline
    def setDprFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("dpr", js.Any.fromFunction2(value))
    @scala.inline
    def setDpr(value: Filter[RankingsResponseObject, dpr, Double]): Self = this.set("dpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDpr: Self = this.set("dpr", js.undefined)
    @scala.inline
    def setLimit_number(value: Double): Self = this.set("limit_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit_number: Self = this.set("limit_number", js.undefined)
    @scala.inline
    def setLimit_start(value: Double): Self = this.set("limit_start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit_start: Self = this.set("limit_start", js.undefined)
    @scala.inline
    def setLossesFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("losses", js.Any.fromFunction2(value))
    @scala.inline
    def setLosses(value: Filter[RankingsResponseObject, losses, Double]): Self = this.set("losses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLosses: Self = this.set("losses", js.undefined)
    @scala.inline
    def setMax_scoreFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("max_score", js.Any.fromFunction2(value))
    @scala.inline
    def setMax_score(value: Filter[RankingsResponseObject, max_score, Double]): Self = this.set("max_score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_score: Self = this.set("max_score", js.undefined)
    @scala.inline
    def setOprFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("opr", js.Any.fromFunction2(value))
    @scala.inline
    def setOpr(value: Filter[RankingsResponseObject, opr, Double]): Self = this.set("opr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpr: Self = this.set("opr", js.undefined)
    @scala.inline
    def setRankFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("rank", js.Any.fromFunction2(value))
    @scala.inline
    def setRank(value: Filter[RankingsResponseObject, rank, Double]): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    @scala.inline
    def setSeason(value: Seasons): Self = this.set("season", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeason: Self = this.set("season", js.undefined)
    @scala.inline
    def setSkuFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("sku", js.Any.fromFunction2(value))
    @scala.inline
    def setSku(value: Filter[RankingsResponseObject, sku, String]): Self = this.set("sku", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSku: Self = this.set("sku", js.undefined)
    @scala.inline
    def setSpFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("sp", js.Any.fromFunction2(value))
    @scala.inline
    def setSp(value: Filter[RankingsResponseObject, sp, Double]): Self = this.set("sp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSp: Self = this.set("sp", js.undefined)
    @scala.inline
    def setTeamFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("team", js.Any.fromFunction2(value))
    @scala.inline
    def setTeam(value: Filter[RankingsResponseObject, team, String]): Self = this.set("team", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeam: Self = this.set("team", js.undefined)
    @scala.inline
    def setTiesFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("ties", js.Any.fromFunction2(value))
    @scala.inline
    def setTies(value: Filter[RankingsResponseObject, ties, Double]): Self = this.set("ties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTies: Self = this.set("ties", js.undefined)
    @scala.inline
    def setTrspFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("trsp", js.Any.fromFunction2(value))
    @scala.inline
    def setTrsp(value: Filter[RankingsResponseObject, trsp, Double]): Self = this.set("trsp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrsp: Self = this.set("trsp", js.undefined)
    @scala.inline
    def setWinsFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("wins", js.Any.fromFunction2(value))
    @scala.inline
    def setWins(value: Filter[RankingsResponseObject, wins, Double]): Self = this.set("wins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWins: Self = this.set("wins", js.undefined)
    @scala.inline
    def setWpFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, RankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("wp", js.Any.fromFunction2(value))
    @scala.inline
    def setWp(value: Filter[RankingsResponseObject, wp, Double]): Self = this.set("wp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWp: Self = this.set("wp", js.undefined)
  }
  
}

