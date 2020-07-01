package typings.vexdb.cacheMod

import typings.vexdb.requestObjectsMod.SeasonRankingsRequestObject
import typings.vexdb.vexdbStrings.season_rankings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/cache", "resolve")
@js.native
object resolve_seasonrankings extends js.Object {
  def apply(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[APIResponse[SeasonRankingsRequestObject]] = js.native
}

