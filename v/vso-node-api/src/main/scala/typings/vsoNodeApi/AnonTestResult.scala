package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTestResult extends js.Object {
  var all: Double
  var none: Double
  var system: Double
  var testResult: Double
  var testRun: Double
}

object AnonTestResult {
  @scala.inline
  def apply(all: Double, none: Double, system: Double, testResult: Double, testRun: Double): AnonTestResult = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], testResult = testResult.asInstanceOf[js.Any], testRun = testRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTestResult]
  }
}

