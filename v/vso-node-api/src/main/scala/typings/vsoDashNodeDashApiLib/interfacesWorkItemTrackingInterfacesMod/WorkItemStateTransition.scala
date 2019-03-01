package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemStateTransition extends js.Object {
  /**
    * Gets a list of actions needed to transition to that state.
    */
  var actions: js.Array[java.lang.String]
  /**
    * Name of the next state.
    */
  var to: java.lang.String
}

object WorkItemStateTransition {
  @scala.inline
  def apply(actions: js.Array[java.lang.String], to: java.lang.String): WorkItemStateTransition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actions")(actions)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[WorkItemStateTransition]
  }
}

