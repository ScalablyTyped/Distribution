package typings.vexdb.anon

import typings.vexdb.requestObjectsMod.Filter
import typings.vexdb.requestObjectsMod.Programs
import typings.vexdb.requestObjectsMod.Seasons
import typings.vexdb.responseObjectsMod.SeasonRankingsResponseObject
import typings.vexdb.vexdbStrings.program
import typings.vexdb.vexdbStrings.season
import typings.vexdb.vexdbStrings.team
import typings.vexdb.vexdbStrings.vrating
import typings.vexdb.vexdbStrings.vrating_rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vexdb.vexdb/out/methods/live.LiveRequestObject<vexdb.vexdb/out/constants/RequestObjects.SeasonRankingsRequestObject> */
@js.native
trait LiveRequestObjectSeasonRa extends js.Object {
  var limit_number: js.UndefOr[Double] = js.native
  var limit_start: js.UndefOr[Double] = js.native
  var prefetch: js.UndefOr[Boolean] = js.native
  var program: js.UndefOr[
    Filter[SeasonRankingsResponseObject, typings.vexdb.vexdbStrings.program, Programs]
  ] = js.native
  var season: js.UndefOr[Filter[SeasonRankingsResponseObject, typings.vexdb.vexdbStrings.season, Seasons]] = js.native
  var team: js.UndefOr[Filter[SeasonRankingsResponseObject, typings.vexdb.vexdbStrings.team, String]] = js.native
  var vrating: js.UndefOr[Filter[SeasonRankingsResponseObject, typings.vexdb.vexdbStrings.vrating, Double]] = js.native
  var vrating_rank: js.UndefOr[
    Filter[SeasonRankingsResponseObject, typings.vexdb.vexdbStrings.vrating_rank, Double]
  ] = js.native
}

object LiveRequestObjectSeasonRa {
  @scala.inline
  def apply(): LiveRequestObjectSeasonRa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveRequestObjectSeasonRa]
  }
  @scala.inline
  implicit class LiveRequestObjectSeasonRaOps[Self <: LiveRequestObjectSeasonRa] (val x: Self) extends AnyVal {
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
    def setLimit_number(value: Double): Self = this.set("limit_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit_number: Self = this.set("limit_number", js.undefined)
    @scala.inline
    def setLimit_start(value: Double): Self = this.set("limit_start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit_start: Self = this.set("limit_start", js.undefined)
    @scala.inline
    def setPrefetch(value: Boolean): Self = this.set("prefetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefetch: Self = this.set("prefetch", js.undefined)
    @scala.inline
    def setProgramFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SeasonRankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("program", js.Any.fromFunction2(value))
    @scala.inline
    def setProgram(value: Filter[SeasonRankingsResponseObject, program, Programs]): Self = this.set("program", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    @scala.inline
    def setSeasonFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SeasonRankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("season", js.Any.fromFunction2(value))
    @scala.inline
    def setSeason(value: Filter[SeasonRankingsResponseObject, season, Seasons]): Self = this.set("season", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeason: Self = this.set("season", js.undefined)
    @scala.inline
    def setTeamFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SeasonRankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("team", js.Any.fromFunction2(value))
    @scala.inline
    def setTeam(value: Filter[SeasonRankingsResponseObject, team, String]): Self = this.set("team", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeam: Self = this.set("team", js.undefined)
    @scala.inline
    def setVratingFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SeasonRankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("vrating", js.Any.fromFunction2(value))
    @scala.inline
    def setVrating(value: Filter[SeasonRankingsResponseObject, vrating, Double]): Self = this.set("vrating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVrating: Self = this.set("vrating", js.undefined)
    @scala.inline
    def setVrating_rankFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SeasonRankingsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("vrating_rank", js.Any.fromFunction2(value))
    @scala.inline
    def setVrating_rank(value: Filter[SeasonRankingsResponseObject, vrating_rank, Double]): Self = this.set("vrating_rank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVrating_rank: Self = this.set("vrating_rank", js.undefined)
  }
  
}

