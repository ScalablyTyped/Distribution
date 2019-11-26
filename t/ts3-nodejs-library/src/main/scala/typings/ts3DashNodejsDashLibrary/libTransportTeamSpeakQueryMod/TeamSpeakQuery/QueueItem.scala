package typings.ts3DashNodejsDashLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery

import typings.ts3DashNodejsDashLibrary.libTransportCommandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueItem extends js.Object {
  var cmd: Command
  var fulfill: js.Function
  var priority: Boolean
  var reject: js.Function
}

object QueueItem {
  @scala.inline
  def apply(cmd: Command, fulfill: js.Function, priority: Boolean, reject: js.Function): QueueItem = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], fulfill = fulfill.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], reject = reject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueueItem]
  }
}

