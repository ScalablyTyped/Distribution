package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPlansWithSelection extends js.Object {
  var lastSelectedPlan: Double
  var lastSelectedSuite: Double
  var plans: js.Array[TestPlan]
}

object TestPlansWithSelection {
  @scala.inline
  def apply(lastSelectedPlan: Double, lastSelectedSuite: Double, plans: js.Array[TestPlan]): TestPlansWithSelection = {
    val __obj = js.Dynamic.literal(lastSelectedPlan = lastSelectedPlan.asInstanceOf[js.Any], lastSelectedSuite = lastSelectedSuite.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestPlansWithSelection]
  }
}

