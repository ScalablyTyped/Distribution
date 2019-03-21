package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleTesterTest extends js.Object {
  var code: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
}

object RuleTesterTest {
  @scala.inline
  def apply(code: java.lang.String, description: java.lang.String = null): RuleTesterTest = {
    val __obj = js.Dynamic.literal(code = code)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[RuleTesterTest]
  }
}

