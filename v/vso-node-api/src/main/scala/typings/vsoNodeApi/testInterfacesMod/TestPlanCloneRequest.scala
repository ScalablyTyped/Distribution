package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPlanCloneRequest extends js.Object {
  var destinationTestPlan: TestPlan
  var options: CloneOptions
  var suiteIds: js.Array[Double]
}

object TestPlanCloneRequest {
  @scala.inline
  def apply(destinationTestPlan: TestPlan, options: CloneOptions, suiteIds: js.Array[Double]): TestPlanCloneRequest = {
    val __obj = js.Dynamic.literal(destinationTestPlan = destinationTestPlan.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], suiteIds = suiteIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestPlanCloneRequest]
  }
}

