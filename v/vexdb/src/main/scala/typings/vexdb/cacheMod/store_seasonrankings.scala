package typings.vexdb.cacheMod

import typings.vexdb.requestObjectsMod.SeasonRankingsRequestObject
import typings.vexdb.responseObjectsMod.SeasonRankingsResponseObject
import typings.vexdb.vexdbStrings.season_rankings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/cache", "store")
@js.native
object store_seasonrankings extends js.Object {
  def apply(
    endpoint: season_rankings,
    params: SeasonRankingsRequestObject,
    data: APIResponse[SeasonRankingsResponseObject]
  ): js.Promise[Boolean] = js.native
}

