package typings.stylelint.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleTesterTest extends js.Object {
  var code: String
  var description: js.UndefOr[String] = js.undefined
}

object RuleTesterTest {
  @scala.inline
  def apply(code: String, description: String = null): RuleTesterTest = {
    val __obj = js.Dynamic.literal(code = code)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[RuleTesterTest]
  }
}

