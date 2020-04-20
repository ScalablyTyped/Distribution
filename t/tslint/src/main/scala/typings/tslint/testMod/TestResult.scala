package typings.tslint.testMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var directory: String
  var results: StringDictionary[TestOutput | SkippedTest]
}

object TestResult {
  @scala.inline
  def apply(directory: String, results: StringDictionary[TestOutput | SkippedTest]): TestResult = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
}

