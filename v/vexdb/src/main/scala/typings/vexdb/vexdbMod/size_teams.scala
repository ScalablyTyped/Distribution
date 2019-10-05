package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.teams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "size")
@js.native
object size_teams extends js.Object {
  def apply(endpoint: teams, params: TeamsRequestObject): js.Promise[Double] = js.native
}

