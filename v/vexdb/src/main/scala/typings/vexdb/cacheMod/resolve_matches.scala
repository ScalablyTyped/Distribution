package typings.vexdb.cacheMod

import typings.vexdb.requestObjectsMod.MatchesRequestObject
import typings.vexdb.vexdbStrings.matches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexdb/out/methods/cache", "resolve")
@js.native
object resolve_matches extends js.Object {
  
  def apply(endpoint: matches, params: MatchesRequestObject): js.Promise[APIResponse[MatchesRequestObject]] = js.native
}
