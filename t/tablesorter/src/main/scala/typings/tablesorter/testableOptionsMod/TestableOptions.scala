package typings.tablesorter.testableOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestableOptions extends js.Object {
  /**
    * A value indicating whether tests should be skipped.
    */
  var skipTest: js.UndefOr[Boolean] = js.undefined
}

object TestableOptions {
  @scala.inline
  def apply(skipTest: js.UndefOr[Boolean] = js.undefined): TestableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipTest)) __obj.updateDynamic("skipTest")(skipTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestableOptions]
  }
}

