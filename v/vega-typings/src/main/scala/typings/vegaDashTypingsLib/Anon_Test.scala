package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Test extends js.Object {
  var test: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Test {
  @scala.inline
  def apply(test: java.lang.String = null): Anon_Test = {
    val __obj = js.Dynamic.literal()
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[Anon_Test]
  }
}

