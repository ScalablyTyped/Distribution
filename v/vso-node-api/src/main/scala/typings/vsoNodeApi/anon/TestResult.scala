package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var all: scala.Double
  var none: scala.Double
  var system: scala.Double
  var testResult: scala.Double
  var testRun: scala.Double
}

object TestResult {
  @scala.inline
  def apply(
    all: scala.Double,
    none: scala.Double,
    system: scala.Double,
    testResult: scala.Double,
    testRun: scala.Double
  ): TestResult = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], testResult = testResult.asInstanceOf[js.Any], testRun = testRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
}

