package typings.vexdb.vexdbMod

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
    val __obj = js.Dynamic.literal(program = program, season = season, team = team, vrating = vrating, vrating_rank = vrating_rank)
  
    __obj.asInstanceOf[SeasonRankingsResponseObject]
  }
}

