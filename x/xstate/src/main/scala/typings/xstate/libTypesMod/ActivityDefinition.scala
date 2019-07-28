package typings.xstate.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityDefinition[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var id: String
}

object ActivityDefinition {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](id: String, `type`: String, exec: ActionFunction[TContext, TEvent] = null): ActivityDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (exec != null) __obj.updateDynamic("exec")(exec)
    __obj.asInstanceOf[ActivityDefinition[TContext, TEvent]]
  }
}

