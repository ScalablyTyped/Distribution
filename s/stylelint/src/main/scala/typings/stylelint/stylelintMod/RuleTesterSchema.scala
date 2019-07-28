package typings.stylelint.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleTesterSchema extends js.Object {
  var accept: js.UndefOr[js.Array[RuleTesterTest]] = js.undefined
  var config: js.UndefOr[js.Any] = js.undefined
  var reject: js.UndefOr[js.Array[RuleTesterTestRejected]] = js.undefined
  var ruleName: String
  var syntax: js.UndefOr[SyntaxType] = js.undefined
}

object RuleTesterSchema {
  @scala.inline
  def apply(
    ruleName: String,
    accept: js.Array[RuleTesterTest] = null,
    config: js.Any = null,
    reject: js.Array[RuleTesterTestRejected] = null,
    syntax: SyntaxType = null
  ): RuleTesterSchema = {
    val __obj = js.Dynamic.literal(ruleName = ruleName)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (config != null) __obj.updateDynamic("config")(config)
    if (reject != null) __obj.updateDynamic("reject")(reject)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    __obj.asInstanceOf[RuleTesterSchema]
  }
}

