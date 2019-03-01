package typings
package tslintLib.libTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var directory: java.lang.String
  var results: org.scalablytyped.runtime.StringDictionary[TestOutput | SkippedTest]
}

object TestResult {
  @scala.inline
  def apply(
    directory: java.lang.String,
    results: org.scalablytyped.runtime.StringDictionary[TestOutput | SkippedTest]
  ): TestResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directory")(directory)
    __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[TestResult]
  }
}

