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

object TestSessionExploredWorkItemReference {
  @scala.inline
  def apply(
    associatedWorkItems: js.Array[TestSessionWorkItemReference],
    endTime: stdLib.Date,
    id: scala.Double,
    startTime: stdLib.Date,
    `type`: java.lang.String
  ): TestSessionExploredWorkItemReference = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("associatedWorkItems")(associatedWorkItems)
    __obj.updateDynamic("endTime")(endTime)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[TestSessionExploredWorkItemReference]
  }
}

