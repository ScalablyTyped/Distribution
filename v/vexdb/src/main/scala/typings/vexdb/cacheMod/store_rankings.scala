package typings.vexdb.cacheMod

import typings.vexdb.requestObjectsMod.RankingsRequestObject
import typings.vexdb.responseObjectsMod.RankingsResponseObject
import typings.vexdb.vexdbStrings.rankings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexdb/out/methods/cache", "store")
@js.native
object store_rankings extends js.Object {
  
  def apply(endpoint: rankings, params: RankingsRequestObject, data: APIResponse[RankingsResponseObject]): js.Promise[Boolean] = js.native
}
