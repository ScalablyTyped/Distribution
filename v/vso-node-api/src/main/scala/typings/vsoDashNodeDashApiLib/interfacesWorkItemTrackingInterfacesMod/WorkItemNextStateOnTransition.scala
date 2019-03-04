package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemNextStateOnTransition extends js.Object {
  /**
    * Error code if there is no next state transition possible.
    */
  var errorCode: java.lang.String
  /**
    * Work item ID.
    */
  var id: scala.Double
  /**
    * Error message if there is no next state transition possible.
    */
  var message: java.lang.String
  /**
    * Name of the next state on transition.
    */
  var stateOnTransition: java.lang.String
}

object WorkItemNextStateOnTransition {
  @scala.inline
  def apply(
    errorCode: java.lang.String,
    id: scala.Double,
    message: java.lang.String,
    stateOnTransition: java.lang.String
  ): WorkItemNextStateOnTransition = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, id = id, message = message, stateOnTransition = stateOnTransition)
  
    __obj.asInstanceOf[WorkItemNextStateOnTransition]
  }
}

