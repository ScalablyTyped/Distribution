package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunCoverage extends js.Object {
  var lastError: String
  var modules: js.Array[ModuleCoverage]
  var state: String
  var testRun: ShallowReference
}

object TestRunCoverage {
  @scala.inline
  def apply(lastError: String, modules: js.Array[ModuleCoverage], state: String, testRun: ShallowReference): TestRunCoverage = {
    val __obj = js.Dynamic.literal(lastError = lastError.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testRun = testRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunCoverage]
  }
}

