package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.season_rankings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "get")
@js.native
object get_seasonrankings extends js.Object {
  def apply(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[js.Array[SeasonRankingsResponseObject]] = js.native
}

