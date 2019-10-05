package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.matches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "get")
@js.native
object get_matches extends js.Object {
  def apply(endpoint: matches, params: MatchesRequestObject): js.Promise[js.Array[MatchesResponseObject]] = js.native
}

