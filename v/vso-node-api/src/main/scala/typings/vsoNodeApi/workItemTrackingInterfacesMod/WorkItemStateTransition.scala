package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemStateTransition extends js.Object {
  /**
    * Gets a list of actions needed to transition to that state.
    */
  var actions: js.Array[String]
  /**
    * Name of the next state.
    */
  var to: String
}

object WorkItemStateTransition {
  @scala.inline
  def apply(actions: js.Array[String], to: String): WorkItemStateTransition = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemStateTransition]
  }
}

