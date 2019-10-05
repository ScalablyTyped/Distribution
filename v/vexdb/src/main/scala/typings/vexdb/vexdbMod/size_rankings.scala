package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.rankings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "size")
@js.native
object size_rankings extends js.Object {
  def apply(endpoint: rankings, params: RankingsRequestObject): js.Promise[Double] = js.native
}

