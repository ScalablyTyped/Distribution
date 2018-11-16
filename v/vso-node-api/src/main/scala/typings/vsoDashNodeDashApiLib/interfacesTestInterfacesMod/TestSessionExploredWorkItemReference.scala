package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestSessionExploredWorkItemReference extends TestSessionWorkItemReference {
  /**
       * Workitem references of workitems filed as a part of the current workitem exploration.
       */
  var associatedWorkItems: js.Array[TestSessionWorkItemReference]
  /**
       * Time when exploration of workitem ended.
       */
  var endTime: stdLib.Date
  /**
       * Time when explore of workitem was started.
       */
  var startTime: stdLib.Date
}

