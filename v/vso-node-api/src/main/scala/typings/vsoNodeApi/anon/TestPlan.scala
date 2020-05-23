package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPlan extends js.Object {
  var testPlan: scala.Double
  var testSuite: scala.Double
}

object TestPlan {
  @scala.inline
  def apply(testPlan: scala.Double, testSuite: scala.Double): TestPlan = {
    val __obj = js.Dynamic.literal(testPlan = testPlan.asInstanceOf[js.Any], testSuite = testSuite.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlan]
  }
}

