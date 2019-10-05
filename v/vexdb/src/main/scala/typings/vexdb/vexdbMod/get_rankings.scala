package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.rankings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "get")
@js.native
object get_rankings extends js.Object {
  def apply(endpoint: rankings, params: RankingsRequestObject): js.Promise[js.Array[RankingsResponseObject]] = js.native
}

