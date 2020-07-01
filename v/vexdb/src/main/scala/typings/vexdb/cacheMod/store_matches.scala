package typings.vexdb.cacheMod

import typings.vexdb.requestObjectsMod.MatchesRequestObject
import typings.vexdb.responseObjectsMod.MatchesResponseObject
import typings.vexdb.vexdbStrings.matches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/cache", "store")
@js.native
object store_matches extends js.Object {
  def apply(endpoint: matches, params: MatchesRequestObject, data: APIResponse[MatchesResponseObject]): js.Promise[Boolean] = js.native
}

