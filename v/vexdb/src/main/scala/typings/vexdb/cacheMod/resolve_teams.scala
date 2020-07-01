package typings.vexdb.cacheMod

import typings.vexdb.requestObjectsMod.TeamsRequestObject
import typings.vexdb.vexdbStrings.teams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/cache", "resolve")
@js.native
object resolve_teams extends js.Object {
  def apply(endpoint: teams, params: TeamsRequestObject): js.Promise[APIResponse[TeamsRequestObject]] = js.native
}

