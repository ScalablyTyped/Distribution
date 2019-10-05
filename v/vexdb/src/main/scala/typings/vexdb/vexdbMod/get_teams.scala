package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.teams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "get")
@js.native
object get_teams extends js.Object {
  def apply(endpoint: teams, params: TeamsRequestObject): js.Promise[js.Array[TeamsResponseObject]] = js.native
}

