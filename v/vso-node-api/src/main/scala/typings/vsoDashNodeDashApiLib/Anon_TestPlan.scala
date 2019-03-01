package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TestPlan extends js.Object {
  var testPlan: scala.Double
  var testSuite: scala.Double
}

object Anon_TestPlan {
  @scala.inline
  def apply(testPlan: scala.Double, testSuite: scala.Double): Anon_TestPlan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("testPlan")(testPlan)
    __obj.updateDynamic("testSuite")(testSuite)
    __obj.asInstanceOf[Anon_TestPlan]
  }
}

