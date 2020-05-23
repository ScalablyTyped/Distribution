package typings.vegaTypings.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Test extends js.Object {
  var test: js.UndefOr[String] = js.undefined
}

object Test {
  @scala.inline
  def apply(test: String = null): Test = {
    val __obj = js.Dynamic.literal()
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
}

