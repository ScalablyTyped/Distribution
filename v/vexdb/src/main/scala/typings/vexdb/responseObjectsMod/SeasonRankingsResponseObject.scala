package typings.vexdb.responseObjectsMod

import typings.vexdb.requestObjectsMod.Programs
import typings.vexdb.requestObjectsMod.Seasons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeasonRankingsResponseObject extends ResponseObject {
  var program: Programs = js.native
  var season: Seasons = js.native
  var team: String = js.native
  var vrating: Double = js.native
  var vrating_rank: Double = js.native
}

object SeasonRankingsResponseObject {
  @scala.inline
  def apply(program: Programs, season: Seasons, team: String, vrating: Double, vrating_rank: Double): SeasonRankingsResponseObject = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], vrating = vrating.asInstanceOf[js.Any], vrating_rank = vrating_rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeasonRankingsResponseObject]
  }
  @scala.inline
  implicit class SeasonRankingsResponseObjectOps[Self <: SeasonRankingsResponseObject] (val x: Self) extends AnyVal {
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
    def setProgram(value: Programs): Self = this.set("program", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeason(value: Seasons): Self = this.set("season", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
    @scala.inline
    def setVrating(value: Double): Self = this.set("vrating", value.asInstanceOf[js.Any])
    @scala.inline
    def setVrating_rank(value: Double): Self = this.set("vrating_rank", value.asInstanceOf[js.Any])
  }
  
}

