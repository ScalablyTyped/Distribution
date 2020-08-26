package typings.tablesorter.testableOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestableOptions extends js.Object {
  /**
    * A value indicating whether tests should be skipped.
    */
  var skipTest: js.UndefOr[Boolean] = js.native
}

object TestableOptions {
  @scala.inline
  def apply(): TestableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestableOptions]
  }
  @scala.inline
  implicit class TestableOptionsOps[Self <: TestableOptions] (val x: Self) extends AnyVal {
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
    def setSkipTest(value: Boolean): Self = this.set("skipTest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipTest: Self = this.set("skipTest", js.undefined)
  }
  
}

