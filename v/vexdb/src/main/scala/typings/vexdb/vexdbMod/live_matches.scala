package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.matches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "live")
@js.native
object live_matches extends js.Object {
  def apply(endpoint: matches, params: LiveRequestObject[MatchesRequestObject]): LiveEventEmitter[MatchesRequestObject, MatchesResponseObject] = js.native
}

