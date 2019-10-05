package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.rankings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "live")
@js.native
object live_rankings extends js.Object {
  def apply(endpoint: rankings, params: LiveRequestObject[RankingsRequestObject]): LiveEventEmitter[RankingsRequestObject, RankingsResponseObject] = js.native
}

