package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.matches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "size")
@js.native
object size_matches extends js.Object {
  def apply(endpoint: matches, params: MatchesRequestObject): js.Promise[Double] = js.native
}

