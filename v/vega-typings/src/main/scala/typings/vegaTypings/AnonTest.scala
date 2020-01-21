package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTest extends js.Object {
  var test: js.UndefOr[String] = js.undefined
}

object AnonTest {
  @scala.inline
  def apply(test: String = null): AnonTest = {
    val __obj = js.Dynamic.literal()
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTest]
  }
}

