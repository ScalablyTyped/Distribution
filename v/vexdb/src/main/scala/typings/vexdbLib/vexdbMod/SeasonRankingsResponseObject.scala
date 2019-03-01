package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeasonRankingsResponseObject extends ResponseObject {
  var program: java.lang.String
  var season: java.lang.String
  var team: java.lang.String
  var vrating: scala.Double
  var vrating_rank: scala.Double
}

object SeasonRankingsResponseObject {
  @scala.inline
  def apply(
    program: java.lang.String,
    season: java.lang.String,
    team: java.lang.String,
    vrating: scala.Double,
    vrating_rank: scala.Double
  ): SeasonRankingsResponseObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("program")(program)
    __obj.updateDynamic("season")(season)
    __obj.updateDynamic("team")(team)
    __obj.updateDynamic("vrating")(vrating)
    __obj.updateDynamic("vrating_rank")(vrating_rank)
    __obj.asInstanceOf[SeasonRankingsResponseObject]
  }
}

