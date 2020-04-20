package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTestPlan extends js.Object {
  var testPlan: Double
  var testSuite: Double
}

object AnonTestPlan {
  @scala.inline
  def apply(testPlan: Double, testSuite: Double): AnonTestPlan = {
    val __obj = js.Dynamic.literal(testPlan = testPlan.asInstanceOf[js.Any], testSuite = testSuite.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTestPlan]
  }
}

