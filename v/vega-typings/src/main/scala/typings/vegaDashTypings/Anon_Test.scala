package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Test extends js.Object {
  var test: js.UndefOr[String] = js.undefined
}

object Anon_Test {
  @scala.inline
  def apply(test: String = null): Anon_Test = {
    val __obj = js.Dynamic.literal()
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Test]
  }
}

