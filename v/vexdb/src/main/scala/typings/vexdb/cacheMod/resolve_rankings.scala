package typings.vexdb.cacheMod

import typings.vexdb.requestObjectsMod.RankingsRequestObject
import typings.vexdb.vexdbStrings.rankings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexdb/out/methods/cache", "resolve")
@js.native
object resolve_rankings extends js.Object {
  
  def apply(endpoint: rankings, params: RankingsRequestObject): js.Promise[APIResponse[RankingsRequestObject]] = js.native
}
