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

