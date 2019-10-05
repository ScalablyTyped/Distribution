package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.teams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "live")
@js.native
object live_teams extends js.Object {
  def apply(endpoint: teams, params: LiveRequestObject[TeamsRequestObject]): LiveEventEmitter[TeamsRequestObject, TeamsResponseObject] = js.native
}

