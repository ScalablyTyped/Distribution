package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPlansWithSelection extends js.Object {
  var lastSelectedPlan: scala.Double
  var lastSelectedSuite: scala.Double
  var plans: js.Array[TestPlan]
}

object TestPlansWithSelection {
  @scala.inline
  def apply(lastSelectedPlan: scala.Double, lastSelectedSuite: scala.Double, plans: js.Array[TestPlan]): TestPlansWithSelection = {
    val __obj = js.Dynamic.literal(lastSelectedPlan = lastSelectedPlan, lastSelectedSuite = lastSelectedSuite, plans = plans)
  
    __obj.asInstanceOf[TestPlansWithSelection]
  }
}

