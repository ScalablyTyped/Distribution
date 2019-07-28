package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
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
  var endTime: Date
  /**
    * Time when explore of workitem was started.
    */
  var startTime: Date
}

object TestSessionExploredWorkItemReference {
  @scala.inline
  def apply(
    associatedWorkItems: js.Array[TestSessionWorkItemReference],
    endTime: Date,
    id: Double,
    startTime: Date,
    `type`: String
  ): TestSessionExploredWorkItemReference = {
    val __obj = js.Dynamic.literal(associatedWorkItems = associatedWorkItems, endTime = endTime, id = id, startTime = startTime)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TestSessionExploredWorkItemReference]
  }
}

