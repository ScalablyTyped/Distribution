package typings.xstate.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullEvent extends js.Object {
  var `type`: typings.xstate.libTypesMod.ActionTypes.NullEvent
}

object NullEvent {
  @scala.inline
  def apply(`type`: typings.xstate.libTypesMod.ActionTypes.NullEvent): NullEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullEvent]
  }
}

