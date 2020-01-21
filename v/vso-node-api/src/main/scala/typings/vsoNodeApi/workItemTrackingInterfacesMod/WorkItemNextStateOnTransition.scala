package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemNextStateOnTransition extends js.Object {
  /**
    * Error code if there is no next state transition possible.
    */
  var errorCode: String
  /**
    * Work item ID.
    */
  var id: Double
  /**
    * Error message if there is no next state transition possible.
    */
  var message: String
  /**
    * Name of the next state on transition.
    */
  var stateOnTransition: String
}

object WorkItemNextStateOnTransition {
  @scala.inline
  def apply(errorCode: String, id: Double, message: String, stateOnTransition: String): WorkItemNextStateOnTransition = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stateOnTransition = stateOnTransition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemNextStateOnTransition]
  }
}

