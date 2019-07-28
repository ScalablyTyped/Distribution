package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

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
    val __obj = js.Dynamic.literal(errorCode = errorCode, id = id, message = message, stateOnTransition = stateOnTransition)
  
    __obj.asInstanceOf[WorkItemNextStateOnTransition]
  }
}

