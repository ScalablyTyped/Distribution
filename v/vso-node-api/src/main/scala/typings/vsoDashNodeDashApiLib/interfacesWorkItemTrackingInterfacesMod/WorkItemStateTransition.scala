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

