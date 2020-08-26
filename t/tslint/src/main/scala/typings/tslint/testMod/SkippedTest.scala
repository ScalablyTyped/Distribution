package typings.tslint.testMod

import typings.tslint.tslintBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkippedTest extends js.Object {
  var requirement: String = js.native
  var skipped: `true` = js.native
}

object SkippedTest {
  @scala.inline
  def apply(requirement: String, skipped: `true`): SkippedTest = {
    val __obj = js.Dynamic.literal(requirement = requirement.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkippedTest]
  }
  @scala.inline
  implicit class SkippedTestOps[Self <: SkippedTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequirement(value: String): Self = this.set("requirement", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipped(value: `true`): Self = this.set("skipped", value.asInstanceOf[js.Any])
  }
  
}

