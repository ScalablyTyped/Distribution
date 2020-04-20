package typings.tslint.testMod

import typings.tslint.tslintBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkippedTest extends js.Object {
  var requirement: String
  var skipped: `true`
}

object SkippedTest {
  @scala.inline
  def apply(requirement: String, skipped: `true`): SkippedTest = {
    val __obj = js.Dynamic.literal(requirement = requirement.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkippedTest]
  }
}

