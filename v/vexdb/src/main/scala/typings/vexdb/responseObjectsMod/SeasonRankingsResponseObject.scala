package typings.vexdb.responseObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeasonRankingsResponseObject extends ResponseObject {
  var program: String
  var season: String
  var team: String
  var vrating: Double
  var vrating_rank: Double
}

object SeasonRankingsResponseObject {
  @scala.inline
  def apply(program: String, season: String, team: String, vrating: Double, vrating_rank: Double): SeasonRankingsResponseObject = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], vrating = vrating.asInstanceOf[js.Any], vrating_rank = vrating_rank.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SeasonRankingsResponseObject]
  }
}

