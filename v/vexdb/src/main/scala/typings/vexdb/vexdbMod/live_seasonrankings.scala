package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.season_rankings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "live")
@js.native
object live_seasonrankings extends js.Object {
  def apply(endpoint: season_rankings, params: LiveRequestObject[SeasonRankingsRequestObject]): LiveEventEmitter[SeasonRankingsRequestObject, SeasonRankingsResponseObject] = js.native
}

